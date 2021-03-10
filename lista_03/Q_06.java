package lista_03;

import java.util.Scanner;

public class Q_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int codigo, itens[] = {0,0,0,0,0,0};
        double conta[] = new double[6];

        do {
            cardapio();
            System.out.print("Digite o código correspondente ao item desejado: ");
            codigo = input.nextInt();
            if (codigo != 0) {
                switch (codigo) {
                    case 100:
                        itens[0] += qnt();
                        conta[0] = itens[0] * 1.2;
                        break;
                    case 101:
                        itens[1] += qnt();
                        conta[1] = itens[1] * 1.3;
                        break;
                    case 102:
                        itens[2] += qnt();
                        conta[2] = itens[2] * 1.4;
                        break;
                    case 103:
                        itens[3] += qnt();
                        conta[3] = itens[3] * 1.5;
                        break;
                    case 104:
                        itens[4] += qnt();
                        conta[4] = itens[4] * 1.6;
                        break;
                    case 105:
                        itens[5] += qnt();
                        conta[5] = itens[5] * 2;
                        break;
                    default:
                        System.out.println("Código Inválido");
                        break;
                }

            }
        } while (codigo != 0);
        recibo(itens, conta);
    }

    static void cardapio() {

        System.out.println("=====Cardápio=====\n"
                + "100 - Cachorro Quente  R$ 1,20\n"
                + "101 - Bauru Simples    R$ 1,30\n"
                + "102 - Bauru com ovo    R$ 1,40\n"
                + "103 - Hambúrguer       R$ 1,50\n"
                + "104 - Cheeseburguer    R$ 1,60\n"
                + "105 - Refrigerante     R$ 2,00\n"
                + " 0  - Encerrar pedido\n");
    }

    static int qnt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade desejada: ");
        return input.nextInt();
    }

    public static void recibo(int itens[], double conta[]) {
        //um if para cada item apenas por questões estéticas
        System.out.println("=====Recibo=====\n");
        if (itens[0] != 0) {
            System.out.println(itens[0] + " Cachorro Quente  R$ " + conta[0]);
        }
        if (itens[1] != 0) {
            System.out.println(itens[1] + " Bauru Simples    R$ " + conta[1]);
        }
        if (itens[2] != 0) {
            System.out.println(itens[2] + " Bauru com ovo    R$ " + conta[2]);
        }
        if (itens[3] != 0) {
            System.out.println(itens[3] + " Hambúrguer       R$ " + conta[3]);
        }
        if (itens[4] != 0) {
            System.out.println(itens[4] + " Cheeseburguer    R$ " + conta[4]);
        }
        if (itens[5] != 0) {
            System.out.println(itens[5] + " Refrigerante     R$ " + conta[5]);
        }

        double total = 0;
        for (int i = 0; i < 6; i++) {
            total += conta[i];
        }
        System.out.println("Total              R$ " + total);
    }
}
