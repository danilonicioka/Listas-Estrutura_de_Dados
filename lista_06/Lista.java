package lista_06;

// <> operador diamond: indica tipo da classe

public class Lista<T> {
    //na hora de instanciar, declara o tipo entre o operador diamond

    private T[] elementos; 
    private int tamanho; 

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; 
        /*solução do livro Effective Java - Joshua Bloch
          para criar um vetor de elementos do mesmo tipo definido ao instanciar*/
        this.tamanho = 0; 
    }
    
    public Lista(){
        this(10);
    }
    
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public boolean adiciona(int posicao, T elemento){
        if((posicao < 0 || posicao > tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        this.aumentaCapacidade();
        
        for(int i=this.tamanho-1;i>=posicao;i--){ 
        /*iterando o vetor de trás pra frente 
          para abrir espaço na posição que for passado 
          na var posicao ao aumentar o tamanho do vetor e 
          ao mover os elementos no vetor para o final
        */
            this.elementos[i+1]=this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }
    
    public void alterar(int posicao, T elemento){
        if((posicao < 0 || posicao > tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        this.elementos[posicao] = elemento;
    }
    
    public boolean remove(int posicao){
        if((posicao < 0 || posicao > tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao;i<this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
        return true;
    }
    
    public boolean contem(T elemento){
        for(int i=0; i<this.getTamanho();i++){ //percorre a lista e compara os elementos com o elemento indicado
            if(this.elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }
    
    public int ultimoIndice(T elemento){
        int ultimo = -1;
        for(int i=0; i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                ultimo = i;
            }
        }
        return ultimo;
    }
    
    public boolean remove(T elemento){
        int remove = -1;
        for(int i=0; i<this.getTamanho();i++){
            if(this.elementos[i].equals(elemento)){
                remove = i;
            }
        }
        if(remove != -1){
            for(int j=remove;j<this.getTamanho();j--){
                this.elementos[j]=this.elementos[j+1];
            }
            return true;
        }
        return false;
    }
    
    public T obtem(int posicao){
        if((posicao < 0 || posicao > tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }
    
    public void limpar(){
        for(int i=0; i<this.getTamanho();i++){
            this.elementos[i]=null;
        }
    }
        
    //private pois será usado só na classe vetor
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){ //sempre que o tamanho do vetor chegar na capacidade limite
             T[] elementosNovos = (T[]) new Object[this.elementos.length*2]; //cria um novo vetor com o dobro da capacidade
            for(int i=0;i<this.elementos.length;i++){
                elementosNovos[i]=this.elementos[i]; //repassa os elementos do vetor antigo para o novo
            }
            this.elementos = elementosNovos; //atribui o novo vetor ao vetor que estava trabalhando 
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void imprimir(){
        if(this.getTamanho()>0){
            for(int i = 0; i<this.getTamanho();i++){
                System.out.println((i+1)+" "+this.elementos[i]);
            }
        }
    }

}
