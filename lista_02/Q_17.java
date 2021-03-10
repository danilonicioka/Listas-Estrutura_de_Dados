package lista_02;

import java.util.Scanner;

public class Q_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2, result = 0;
        int op;
        char sinal = 0;

        System.out.print("Informe o primeiro operando: ");
        num1 = input.nextDouble();
        System.out.print("Informe o segundo operando: ");
        num2 = input.nextDouble();

        System.out.print("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nInforme a operação desejada(digito): ");
        op = input.nextInt();

        switch (op) {
            case 1:
                result = num1 + num2;
                sinal = '+';
                break;
            case 2:
                result = num1 - num2;
                sinal = '-';
                break;
            case 3:
                result = num1 * num2;
                sinal = '*';
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    sinal = '/';
                } else {
                    System.out.println("Não é possível dividir um número por zero");
                }
                break;
            default:
                System.out.println("Operação inválida");
                op = 0;
        }

        if (op != 0) { //para mostrar a conta apenas quando a operação for válida
            System.out.println(num1 + " " + sinal + " " + num2 + " = " + result);
        }
    }
}
