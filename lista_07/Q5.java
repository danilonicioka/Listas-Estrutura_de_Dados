package lista_07;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int op, senha_n, senha_p, chamada; //a variável chamada indicará quantas vezes uma senha com prioridade foi chamada
        senha_n = senha_p = chamada = 1;
        Fila<Integer> senhas_normais = new Fila<>();
        Fila<Integer> senhas_prioridade = new Fila<>();
        
        do{
        System.out.print("\n1 - Tirar uma senha normal\n"
                + "2 - Tirar uma senha com prioridade\n"
                + "3 - Chamar um número\n"
                + "0 - Finalizar operação\n"
                + "Informe qual operação deseja realizar: ");
        op = input.nextInt();
        switch(op){
            case 1:
                senhas_normais.enfileira(senha_n);
                senha_n++;
                break;
            case 2:
                senhas_prioridade.enfileira(senha_p);
                senha_p++;
                break;
            case 3:
                if(chamada<4 && !senhas_prioridade.vazia()){
                    System.out.println("Senha Com Prioridade - Chamada: "+chamada+"\nNº: "+senhas_prioridade.desenfileira());
                    chamada++;
                } else if(!senhas_normais.vazia()){
                    System.out.println("Senha Normal\nNº: "+senhas_normais.desenfileira());
                    chamada = 1;
                } else{
                    System.out.println("Não há senhas para chamar");
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Operação Inválida");
        }
        } while(op != 0);
        
    }
    
}
