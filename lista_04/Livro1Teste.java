package lista_04;

import java.util.Scanner;

public class Livro1Teste {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();
        
        System.out.print("Informe o nome do autor: ");
        String autor = input.nextLine();
        
        System.out.print("Informe a editora: ");
        String editora = input.nextLine();
        
        System.out.print("Informe o número de páginas no livro: ");
        int paginas = input.nextInt();
        
        System.out.print("Informe o número de capítulos no livro: ");
        int capitulos = input.nextInt();
        
        Livro livro1 = new Livro(titulo, autor, editora, paginas, capitulos);
        System.out.println("\nInformações do livro:\n"
                + "Título: "+titulo+"\n"
                + "Autor: "+autor+"\n"
                + "Editora: "+editora+"\n"
                + "Número de páginas: "+paginas+"\n"
                + "Número de capítulos: "+capitulos);
        
    }
    
}
