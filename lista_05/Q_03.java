package lista_05;

import java.util.Scanner;

public class Q_03 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a posição da sequência de Fibonaccique deseja descobrir: ");
        int posicao = input.nextInt();
        System.out.println("O valor da posição "+posicao+" é o "+fibonacci(posicao));
        
    }
    
    public static int fibonacci(int posicao){
        if(posicao <= 1){
            return posicao;
        } else
            return fibonacci(posicao-1)+fibonacci(posicao-2);
    }
}
