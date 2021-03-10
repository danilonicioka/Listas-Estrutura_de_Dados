package lista_05;

import java.util.Scanner;

public class Calculadora { //Q_01

    public static void menu() { //função para exibir o menu da calculadora
        System.out.print("\nOperações:\n"
                + "1 - Soma\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão\n"
                + "5 - Potência\n"
                + "6 - Fatorial\n"
                + "0 - Encerrar programa\n"
                + "Selecione uma operação: ");
    }

    //funções de cada operação disponível na calculadora
    public static void soma() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInforme o valor do primeiro operando: ");
        double num1 = input.nextDouble();
        System.out.println("Informe o valor do segundo operando: ");
        double num2 = input.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtrair() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInforme o valor do primeiro operando: ");
        double num1 = input.nextDouble();
        System.out.println("Informe o valor do segundo operando: ");
        double num2 = input.nextDouble();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiplicar() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInforme o valor do primeiro operando: ");
        double num1 = input.nextDouble();
        System.out.println("Informe o valor do segundo operando: ");
        double num2 = input.nextDouble();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void dividir() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInforme o valor do numerador: ");
        double num = input.nextDouble();
        System.out.println("Informe o valor do denominador: ");
        double den = input.nextDouble();
        if (den != 0) { //verificar se divisão é possível
            System.out.println(num + " / " + den + " = " + (num / den));
        } else {
            System.out.println("Não é possível realizar divisão por zero");
        }
    }

    public static void potencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInforme o valor da base: ");
        double base = input.nextDouble();
        System.out.print("Informe o valor da potncia: ");
        double potencia = input.nextDouble();
        if (base == 0 && potencia == 0) {
            System.out.println("0^0 : Indeterminação");
        } else if (potencia == 0 || base == 1) {
            System.out.println(base + " ^ " + potencia + " = 1");
        } else if (base == 0) {
            System.out.println(base + " ^ " + potencia + " = 0");
        } else {
            System.out.println(base + " ^ " + potencia + " = " + (Math.pow(base, potencia)));
        }
    }

    public static void fatorial() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("\nInforme um número inteiro: ");
        int num1 = input.nextInt();
        for (int i = num1; i > 1; i--) {
            result *= i;
        }
        System.out.println(num1 + "! = " + result);
    }
}
