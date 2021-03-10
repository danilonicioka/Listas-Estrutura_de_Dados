package lista_02;

import java.util.Scanner;

public class Q_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double maior, menor, num[] = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº numero: ", (i + 1));
            num[i] = input.nextDouble();
        }
        maior = menor = num[0];

        for (int i = 0; i < 3; i++) {
            if (maior < num[i]) {
                maior = num[i];
            }
            if (menor > num[i]) {
                menor = num[i];
            }
        }
        System.out.println("O maior número digitado foi: " + maior + "\nO menor número digitado foi: " + menor);
    }

}
