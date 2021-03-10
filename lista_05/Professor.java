package lista_05;

public class Professor extends Curso{ //Q_05

    private String nome_prof, departamento, email;

    public Professor(String nome_prof, String departamento, String email, String nome_curso, String horario) {
        super(nome_curso,horario);
        this.nome_prof = nome_prof;
        this.departamento = departamento;
        this.email = email;
    }

    public String getNomeProf() {
        return nome_prof;
    }

    public void setNomeProf(String nome_prof) {
        this.nome_prof = nome_prof;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
