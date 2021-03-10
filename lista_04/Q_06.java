package lista_04;

import java.util.Scanner;

public class Q_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Nota1[] = new double[10];
        double Nota2[] = new double[10];
        double Result[] = new double[10];

        System.out.println("Informe as notas bimestrais de cada aluno:");
        for (int i = 0; i < 10; i++) { //para inserir notas de cada aluno e calcular as médias
            System.out.print("\nAluno " + (i + 1) + ":\n1ª Nota: ");
            Nota1[i] = input.nextDouble();
            System.out.print("2ª Nota: ");
            Nota2[i] = input.nextDouble();
            Result[i] = (Nota1[i] + Nota2[i]) / 2;
        }

        System.out.println("\nResultados:");

        for (int i = 0; i < 10; i++) { //verificar média de cada aluno e imprimir se passou ou não
            System.out.println("\nAluno " + (i + 1) + ":\nMédia: " + Result[i]);
            if (Result[i] >= 7.5) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }

}
