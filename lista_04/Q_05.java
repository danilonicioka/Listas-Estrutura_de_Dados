package lista_04;

import java.util.Scanner;

public class Q_05 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        
        for(int i = 0; i<10;i++){
            System.out.printf("Informe o valor do %dº elemento: ",i+1);
            A[i] = input.nextInt();
        }
        
        for(int i = 0;i<10;i++){
            B[i] = A[i]*i;
        }
        
        System.out.println("\nA = ("+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+", "+A[5]+", "+A[6]+", "+A[7]+", "+A[8]+", "+A[9]+")");
        System.out.println("B = ("+B[0]+", "+B[1]+", "+B[2]+", "+B[3]+", "+B[4]+", "+B[5]+", "+B[6]+", "+B[7]+", "+B[8]+", "+B[9]+")");
    }
    
}