package lista_01;

import java.util.Scanner;

public class Q_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int horas_trab;
        double ganho_hora, salario;
        System.out.print("Informe a quantia ganha por hora: ");
        ganho_hora = input.nextFloat();
        System.out.print("Informe a quantidade de horas trabalhadas por mês: ");
        horas_trab = input.nextInt();
        salario = horas_trab * ganho_hora;
        System.out.printf("\nSeu salário bruto é de: R$ %.2f\nValor pago ao INSS: R$ %.2f\nValor pago ao sindicato: R$ %.2f\n", salario, 0.08 * salario, 0.05 * salario);
        System.out.printf("Seu salário líquido é de: R$ %.2f\n", 0.76 * salario);
    }

}
