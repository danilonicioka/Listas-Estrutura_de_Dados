package lista_08_Q1;

public class Consultorio {

    private int CodPaciente;
    private String nmPaciente;
    
    public Consultorio(int CodPaciente, String nmPaciente){
        this.CodPaciente = CodPaciente;
        this.nmPaciente = nmPaciente;
    }
    
    public Consultorio(){}

    @Override
    public String toString() {
        return "Paciente:\nNome: " + nmPaciente + " - Código: " + CodPaciente;
    }
    
}
