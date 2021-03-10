package lista_02;

import java.util.Scanner;

public class Q_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num;
        System.out.print("Digite um número: ");
        num = input.nextDouble();
        if (num > 0) {
            System.out.println("O número digitado é positivo");
        } else {
            System.out.println("O número digitado é negativo");
        }
    }

}
