package lista_03;

import java.util.Scanner;

public class Q_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade de turmas: ");
        int turmas = input.nextInt();
        int alunos [] = new int[turmas];
        int media = 0;
        
        for(int i=0;i<turmas;i++){
            System.out.print("Informe a quantidade de alunos na Turma "+(i+1)+": ");
            alunos[i] = input.nextInt();
            if(alunos[i]>40){
                System.out.println("O número máximo de alunos por turma é 40");
                i--;
            } else
                media +=alunos[i];
        }
        System.out.println("Número médio de alunos por turma: "+media/turmas);
    }
}