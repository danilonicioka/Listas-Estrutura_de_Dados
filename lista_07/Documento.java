package lista_07;

class Documento {

    private String nome;
    private int folhas;
    
    public Documento(String nome, int folhas){
        this.nome = nome;
        this.folhas = folhas;
    }

    @Override
    public String toString() {
        return "Documento{" + "nome=" + nome + ", folhas=" + folhas + '}';
    }
    
}
