package lista_02;

import java.util.Scanner;

public class Q_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salario, salario_antigo, taxa;
        System.out.print("Informe o valor do salário: ");
        salario_antigo = salario = input.nextDouble();
        if (salario <= 280) {
            taxa = 0.2;
        } else if (salario < 700) {
            taxa = 0.15;
        } else if (salario < 1500) {
            taxa = 0.1;
        } else {
            taxa = 0.05;
        }

        salario *= (1 + taxa);
        System.out.println("Salário antigo: " + salario_antigo + "\n"
                + "Percentual de aumento aplicado: " + taxa + "\n"
                + "Valor do aumento: " + salario_antigo * taxa + "\n"
                + "Novo salário: " + salario);
    }

}
