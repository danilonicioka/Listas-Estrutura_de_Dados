package lista_05;

import java.util.Scanner;

public class Curso1Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome_curso, horario, nome_professor, departamento, email, nome_aluno, matricula;
        nome_curso = horario = nome_professor = departamento = email = nome_aluno = matricula = "A";
        //coloquei qualquer informação para outros parâmetros, pois na questão só é pedido as notas
        
        //inicialização dos vetores que guardam as notas
        double notas1[] = new double[4];
        double notas2[] = new double[4];
        double notas3[] = new double[4];
        double notas4[] = new double[4];
        double notas5[] = new double[4];
        Curso curso1 = new Curso(nome_curso, horario);
        Professor professor1 = new Professor(nome_professor, departamento, email, nome_curso, horario);

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota do Aluno 1: ");
            notas1[i] = input.nextDouble();
        }
        Aluno aluno1 = new Aluno(nome_aluno, matricula, notas1, nome_curso, horario);
        
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota do Aluno 2: ");
            notas2[i] = input.nextDouble();
        }
        Aluno aluno2 = new Aluno(nome_aluno, matricula, notas2, nome_curso, horario);
        
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota do Aluno 3: ");
            notas3[i] = input.nextDouble();
        }
        Aluno aluno3= new Aluno(nome_aluno, matricula, notas3, nome_curso, horario);
        
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota do Aluno 4: ");
            notas4[i] = input.nextDouble();
        }
        Aluno aluno4 = new Aluno(nome_aluno, matricula, notas4, nome_curso, horario);
        
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota do Aluno 5: ");
            notas5[i] = input.nextDouble();
        }
        Aluno aluno5 = new Aluno(nome_aluno, matricula, notas5, nome_curso, horario);
        
        System.out.println("\nAluno 1:\n"
                + "Média: "+aluno1.media(notas1));
        aluno1.aprov(notas1);
        
        System.out.println("\nAluno 2:\n"
                + "Média: "+aluno2.media(notas2));
        aluno2.aprov(notas2);
        
        System.out.println("\nAluno 3:\n"
                + "Média: "+aluno3.media(notas3));
        aluno3.aprov(notas3);
        
        System.out.println("\nAluno 4:\n"
                + "Média: "+aluno4.media(notas4));
        aluno4.aprov(notas4);
        
        System.out.println("\nAluno 5:\n"
                + "Média: "+aluno5.media(notas5));
        aluno5.aprov(notas5);
    }

}
