package lista_02;

import java.util.Scanner;

public class Q_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite um número: ");
        num1 = input.nextDouble();
        System.out.print("Digite outro número: ");
        num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número digitado foi: " + num1);
        } else {
            System.out.println("O maior número digitado foi: " + num2);
        }

    }

}
