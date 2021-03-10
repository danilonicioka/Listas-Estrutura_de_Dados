package lista_08_Q1;

public class Metodo<T> extends EstruturaEstatica<T> {

    public Metodo(){
        super();
    }
    
    public Metodo(int capacidade){
        super(capacidade);
    }
    
    public void enfileira(T elemento){
        this.adiciona(elemento);
    }
    
    public T desenfileira(){
        
        final int pos = 0;
        //só pode remover o primeiro elemento da fila
        
        if(this.vazia()){
            return null;
        }
        
        T remove_elemento = this.elementos[pos];
        
        this.remove(pos);
        
        return remove_elemento;
    }
    
    public T primeiro(){
        if(this.vazia()){
            return null;
        }
        return this.elementos[0];
    }
    
    public boolean cheia(){
        return this.getTamanho() == 0;
    }
    
    public int capacidade(){
        return this.elementos.length;
    }
    
}
