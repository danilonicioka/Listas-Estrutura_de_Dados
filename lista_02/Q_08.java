package lista_02;

import java.util.Scanner;

public class Q_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cheapest, num[] = new double[3];
        int posicao = 0; 

        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe o preço do %dº produto: ",(i+1));
            num[i] = input.nextDouble();
        }
        cheapest = num[0];

        for (int i = 0; i < 3; i++) {
            if (cheapest > num[i]) {
                cheapest = num[i];
                posicao = i; //guarda o indice da posicao do menor valor entre os 3 do vetor
            }
        }
        System.out.printf("Você deve comprar o %dº produto de R$ %.2f\n", posicao + 1, cheapest);
    }

}
