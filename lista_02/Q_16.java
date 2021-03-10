package lista_02;

import java.util.Scanner;

public class Q_16 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int saque, notas[] = new int[5];
        System.out.print("Informe o valor o saque: ");
        saque = input.nextInt();
        if(saque>10 && saque<600){
            notas[0] = saque/100;
            saque -=notas[0]*100;
            notas[1] = saque/50;
            saque -=notas[1]*50;
            notas[2] = saque/10;
            saque -=notas[2]*10;
            notas[3] = saque/5;
            saque -=notas[3]*5;
            notas[4] = saque/1;
        }
        System.out.println("Quantidade de notas que serão fornecidas:\n"
                + notas[0]+" de R$ 100,00\n"
                + notas[1]+" de R$ 50,00\n"
                + notas[2]+" de R$ 10,00\n"
                + notas[3]+" de R$ 5,00\n"
                + notas[4]+" de R$ 1,00");
    }
    
}
