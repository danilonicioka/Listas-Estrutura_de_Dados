package lista_05;

public class Aluno extends Curso { //Q_05

    private String nome_aluno, matricula;
    private double notas[] = new double[4];

    public Aluno(String nome_aluno, String matricula, double notas[], String nome_curso, String horario) {
        super(nome_curso,horario);
        this.nome_aluno = nome_aluno;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double media(double notas[]){ //função para calcular media do aluno
        double media = 0;
        for(int i=0;i<4;i++){
            media +=notas[i]; 
        }
        return media/4;
    }
    
    public void aprov(double notas[]){ //função para verificar se aluno passou de acordo com a media
        if(media(notas)>=7){ //chama a função media para calcular a media e ver se passou
            System.out.println("Aprovado");
        } else
            System.out.println("Reprovado");
    }
    
    public String getNomeAluno() {
        return nome_aluno;
    }

    public void setNomeAluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}
