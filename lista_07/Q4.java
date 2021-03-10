package lista_07;

public class Q4 {

    public static void main(String[] args) {

        Fila<Documento> filadoc = new Fila<>();

        filadoc.enfileira(new Documento("Doc1", 10));
        filadoc.enfileira(new Documento("Doc2", 15));
        filadoc.enfileira(new Documento("Doc3", 20));

        System.out.println("Imprimindo os documentos:");
        for (int i = filadoc.getTamanho(); i > 0; i--) {
            System.out.println(filadoc.desenfileira());
        }
    }

}
