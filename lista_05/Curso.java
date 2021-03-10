package lista_05;


public class Curso { //Q_05

    private String nome_curso, horario;

    public Curso(String nome_curso, String horario) {
        this.nome_curso = nome_curso;
        this.horario = horario;
    }

    public String getNomeCurso() {
        return nome_curso;
    }

    public void setNomeCurso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
