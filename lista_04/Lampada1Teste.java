package lista_04;

import java.util.Scanner;

public class Lampada1Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a marca da lâmpada: ");
        String marca = input.nextLine();

        System.out.print("Informe o tipo de lâmpada: ");
        String tipo = input.nextLine();

        System.out.print("Informe a potência da lâmpada: ");
        double potencia = input.nextDouble();

        System.out.print("Informe o preço da lâmpada: ");
        double preco = input.nextDouble();

        System.out.print("Informe a quantidade de lâmpadas em estoque: ");
        int estoque = input.nextInt();

        System.out.print("Escolha um código de identificação do produto: ");
        String codigo = input.next();

        Lampada lampada1 = new Lampada(marca, tipo, potencia, preco, estoque, codigo);
        System.out.println("\nInformações da Lâmpada 1:\n"
                + "Marca: " + marca + "\n"
                + "Tipo: " + tipo + "\n"
                + "Potência: " + potencia + " W\n"
                + "Preço: R$ " + preco + "\n"
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
                        lampada1.guardar();
                        break;
                    case 2:
                        lampada1.vender();
                        break;
                    default:
                        System.out.println("Operação Inválida");
                }
            }
        } while (op != 0);

    }
}
