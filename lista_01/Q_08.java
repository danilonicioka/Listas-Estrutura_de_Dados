package lista_01;

import java.util.Scanner;

public class Q_08 {

    public static void main(String[] args) {

        float ganho_hora;
        int horas_trab;
        Scanner dados = new Scanner(System.in);
        System.out.print("Informe a quantia ganha por hora: ");
        ganho_hora = dados.nextFloat();
        System.out.print("Informe a quantidade de horas trabalhadas por mês: ");
        horas_trab = dados.nextInt();
        System.out.printf("O seu salário mensal é de: R$ %.2f\n", ganho_hora * horas_trab);
    }

}
