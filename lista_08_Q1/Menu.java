package lista_08_Q1;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Metodo<Consultorio> fila_atendimento = new Metodo<>();
        int op, codpaciente;
        String nmpaciente;

        do {
            System.out.println("\n1 - Inserir um paciente na fila de espera\n"
                    + "2 - Chamar um paciente para ser atendido\n"
                    + "3 - Verificar se a fila está cheia ou vazia\n"
                    + "4 - Verificar o próximo paciente a ser atendido\n"
                    + "5 - Verificar quantos pacientes existem na fila de espera\n"
                    + "Informe qual operação deseja realizar: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\nInforme o nome do paciente: ");
                    nmpaciente = input.next();
                    System.out.print("Informe o código do paciente: ");
                    codpaciente = input.nextInt();
                    fila_atendimento.enfileira(new Consultorio(codpaciente, nmpaciente));
                    System.out.println("\nPaciente inserido na fila de espera");
                    break;
                case 2:
                    if (!fila_atendimento.vazia()) {
                        System.out.println("\nChamando:\n" + fila_atendimento.desenfileira());
                    } else {
                        System.out.println("\nNão há paciente para ser chamado");
                    }
                    break;
                case 3:
                    if (fila_atendimento.vazia()) {
                        System.out.println("\nA fila está vazia");
                    } else if(!fila_atendimento.cheia()){
                        System.out.println("\nA fila não está cheia\n"
                                + "Pacientes na fila: "+fila_atendimento.getTamanho()+"\n"
                                + "Capacidade da fila: "+fila_atendimento.capacidade());
                    } else{
                        System.out.println("\nA fila está cheia");
                    }
                    break;
                case 4:
                    if (!fila_atendimento.vazia()) {
                        System.out.println("\nPróximo paciente a ser chamado:\n" + fila_atendimento.primeiro());
                    } else {
                        System.out.println("\nNão há paciente para ser chamado");
                    }
                    break;
                case 5:
                    System.out.println("\nPacientes na fila de espera: "+fila_atendimento.getTamanho());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOperação Inválida");
            }
        } while (op != 0);
    }

}
