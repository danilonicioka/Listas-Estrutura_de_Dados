package lista_04;

import java.util.Scanner;

public class Aluno { //Q_16

    private String nome, matricula, curso;
    private String disciplinas[] = new String[3];
    private double notas[] = new double[3];

    public Aluno(String nome, String matricula, String curso, String disciplinas[], double notas[]) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void verificar() { //função para verificar a situação do aluno em uma disciplina específica
        Scanner input = new Scanner(System.in);
        System.out.println("1 - " + disciplinas[0] + "\n"
                + "2 - " + disciplinas[1] + "\n"
                + "3 - " + disciplinas[2]);
        System.out.print("Selecione a disciplina que deseja verificar: ");
        int sel = input.nextInt();
        switch (sel) {
            case 1:
                System.out.print(disciplinas[0] + ": ");
                if (notas[0] >= 7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
                break;
            case 2:
                System.out.print(disciplinas[1] + ": ");
                if (notas[1] >= 7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
                break;
            case 3:
                System.out.print(disciplinas[2] + ": ");
                if (notas[2] >= 7) {
                    System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                }
                break;
            default:
                System.out.println("Disciplina Inválida");
        }
    }

}
