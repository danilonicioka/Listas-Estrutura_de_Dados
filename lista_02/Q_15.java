package lista_02;

import java.util.Scanner;

public class Q_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c, delta;
        System.out.print("ax^2+bx+c\nInforme os valores dos coeficientes\na: ");
        a = input.nextDouble();
        if (a != 0) {
            System.out.print("b: ");
            b = input.nextDouble();
            System.out.print("c: ");
            c = input.nextDouble();
            delta = b * b - 4 * a * c;
            System.out.print("A equação  ");
            if (delta < 0) {
                System.out.println("não possui raízes reais");
            } else if (delta == 0) {
                System.out.println("possui uma raiz real x = " + (-b / (2 * a)));
            } else {
                System.out.println("possui duas raízes reais x\' = " + ((-b + Math.sqrt(delta)) / (2 * a)) + " e x\" = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }

}
