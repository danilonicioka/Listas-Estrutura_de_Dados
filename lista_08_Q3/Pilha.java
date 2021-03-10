package lista_08_Q3;

public class Pilha<T> extends EstruturaEstatica<T> {

    private Pilha auxiliar;
    private T tipo;

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        this.adiciona(elemento);
        //é um método que adiciona no final, único jeito para adicionar elementos numa pilha
    }

    public T topo() {
        //vai retornar o elemento no topo da pilha, q vai ser do tipo T
        if (this.vazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha() {
        if (this.vazia()) {
            return null;
        }
        return this.elementos[--tamanho];
        //retorna o elemento retirado e tb decrementa o tamanho
    }

    public boolean inserir(int posicao, T elemento) { //método para inserir um elemento em qualquer lugar da pilha(*C*RUD)
        if ((posicao < 0 || posicao > tamanho)) { //verifica se a posição indicada é válida
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = posicao; i<this.getTamanho(); i++) { 
        /*
            passa por cada elemento da pilha principal desde a posição em que deseja inserir um novo elemento
            até o último elemento dessa pilha e os coloca na pilha auxiliar
        */
            this.auxiliar.empilha(this.desempilha());  
        }
        this.empilha(elemento);//coloca elemento na pilha principal, pois a posição desejada ficou livre
        for(int i = this.auxiliar.getTamanho();i>0;i--){ 
        /*
            coloca os elementos da pilha principal de volta, os quais estavam guardados na pilha auxiliar
            como o primeiro elemento colocado na pilha auxiliar foi o último elemento retirado da pilha principal,
            ao desempilhar os elementos da pilha auxiliar e empilhar na pilha principal, a ordem dos elementos da
            pilha principal será igual à ordem original, mas ,agora, com um novo elemento na posição especificada
        */
            this.empilha((T) this.auxiliar.desempilha());
        }
        return true;
    }
    
    //método para ler um elemento em uma posição especifica(retorna o elemento da posição especificada
    public T ler(int posicao){
        if ((posicao < 0 || posicao > tamanho)) { //verifica se a posição indicada é válida
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        for (int i = posicao+1; i<this.getTamanho(); i++) { //passar os elementos acima da posição indicada
            this.auxiliar.empilha(this.desempilha());
        }
        return this.topo(); //a posição que foi indicada estará no topo
    }
    
    public void atualizar(int posicao, T elemento){
        if ((posicao < 0 || posicao > tamanho)) { //verifica se a posição indicada é válida
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        for (int i = posicao+1; i<this.getTamanho(); i++) { //passar os elementos acima da posição indicada
            this.auxiliar.empilha(this.desempilha());
        }
        this.desempilha(); //retira elemento da posição
        this.empilha(elemento); //coloca elemento novo na posição
    }
    
    public void excluir(int posicao){
        if ((posicao < 0 || posicao > tamanho)) { //verifica se a posição indicada é válida
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        for (int i = posicao+1; i<this.getTamanho(); i++) { //passar os elementos acima da posição indicada
            this.auxiliar.empilha(this.desempilha());
        }
        this.desempilha(); //retira elemento da posição
    }

}
