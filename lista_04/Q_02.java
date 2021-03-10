package lista_04;

import java.util.Scanner;

public class Q_02 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int A[] = new int[8];
        int B[] = new int[8];
        
        for(int i = 0; i<8;i++){
            System.out.printf("Informe o valor do %dº elemento: ",i+1);
            A[i] = input.nextInt();
        }
        
        for(int i = 0;i<8;i++){
            B[i] = 2*A[i];
        }
        
        System.out.println("\nA = ("+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+", "+A[5]+", "+A[6]+", "+A[7]+")");
        System.out.println("B = ("+B[0]+", "+B[1]+", "+B[2]+", "+B[3]+", "+B[4]+", "+B[5]+", "+B[6]+", "+B[7]+")");
    }
    
}