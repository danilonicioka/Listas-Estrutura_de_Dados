package lista_04;

import java.util.Scanner;

public class Contato { //Q_14

    private String numero, nome;
    private boolean existencia;

    public Contato(String numero, String nome, boolean existencia) {
        this.numero = numero;
        this.nome = nome;
        this.existencia = existencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public void ligar() { //método representativo que verifica se é possível ligar para o contato verificando um estado(existencia)
        if (existencia == true) {
            System.out.println("Chamada efetuada");
        } else {
            System.out.println("Não foi possível efetuar a chamada");
        }
    }

    public String mensagem() { //método representativo para enviar uma mensagem para o contato; retorna o conteúdo da mensagem para ser armazenado em algum local
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a mensagem que deseja enviar:");
        String msg = input.nextLine();
        return msg;
    }

}
