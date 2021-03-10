package lista_04;

import java.util.Scanner;

public class LivroDeLivraria1Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int paginas, capitulos;
        paginas = capitulos = 0;
        /*não solicitei a entrada dos números de páginas e de capítulos,
         pois, acredito que não são necessários para a venda de um livro
         e para diminuir o número de entradas, mas caso seja necessário,
         pode-se atribuir/pegar pelas funções get e set posteriormente
         */

        System.out.print("Informe o título do livro: ");
        String titulo = input.nextLine();

        System.out.print("Informe o nome do autor: ");
        String autor = input.nextLine();

        System.out.print("Informe a editora: ");
        String editora = input.nextLine();

        System.out.print("Informe o preço do livro: ");
        double preco = input.nextDouble();

        System.out.print("Informe a quantidade desse livro em estoque: ");
        int estoque = input.nextInt();

        System.out.print("Escolha um código de identificação do livro: ");
        String codigo = input.next();

        LivroDeLivraria livrodelivraria1 = new LivroDeLivraria(titulo, autor, editora, paginas, capitulos, preco, estoque, codigo);
        System.out.println("\nInformações do livro:\n"
                + "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Editora: " + editora + "\n"
                + "Preço: " + preco + "\n"
                + "Estoque: " + estoque + "\n"
                + "Código: " + codigo);

        int op;
        do {
            System.out.println("\nOperações:\n1 - Armazenar no estoque\n2 - Vender\n0 - Encerrar operação");
            System.out.print("\nInforme a operação desejada: ");
            op = input.nextInt();
            if (op != 0) {

                switch (op) {
                    case 1:
                        livrodelivraria1.guardar();
                        break;
                    case 2:
                        livrodelivraria1.vender();
                        break;
                    default:
                        System.out.println("Operação Inválida");
                }
            }
        } while (op != 0);

    }

}
