package lista_05;

import java.util.Scanner;

public class Q_04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        System.out.println("A soma de 1 a "+num+" é: "+somatorio(num));
    }
    
    public static int somatorio(int num){
        int soma;
        if(num<=1){
            return num;
        } else
            soma = num+somatorio(num-1);
        return soma;
    }
    
}
