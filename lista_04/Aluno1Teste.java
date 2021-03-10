package lista_04;

import java.util.Scanner;

public class Aluno1Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Informe a matrícula do aluno: ");
        String matricula = input.nextLine();

        System.out.print("Informe qual o curso que o aluno está matriculado: ");
        String curso = input.nextLine();

        String disciplinas[] = new String[3];
        System.out.println("Informe 3 disciplinas que o aluno está cursando:");
        for (int i = 0; i < 3; i++) {

            System.out.print((i + 1) + "ª disciplina:");
            disciplinas[i] = input.nextLine();
        }

        double notas[] = new double[3];
        System.out.println("Informe as notas nessas 3 disciplinas:");
        for (int i = 0; i < 3; i++) {

            System.out.print(disciplinas[i] + ": ");
            disciplinas[i] = input.nextLine();
        }

        Aluno aluno1 = new Aluno(nome, matricula, curso, disciplinas, notas);

        System.out.println("/nDisciplinas cursadas:");
        for (int i = 0; i < 3; i++) {
            System.out.println(disciplinas[i] + " - Nota: " + notas[i]);
            if (notas[i] >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }

}
