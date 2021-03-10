package lista_04;

import java.util.Scanner;

public class Q_04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int A[] = new int[15];
        double B[] = new double[15];
        
        for(int i = 0; i<15;i++){
            System.out.printf("Informe o valor do %dº elemento: ",i+1);
            A[i] = input.nextInt();
        }
        
        for(int i = 0;i<15;i++){
            B[i] = Math.sqrt(A[i]); //sqrt produz resultado em double, logo B[] deve ser um vetor de valores double
        }
        
        System.out.println("\nA = ("+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+", "+A[5]+", "+A[6]+", "+A[7]+", "+A[8]+", "+A[9]+", "+A[10]+", "+A[11]+", "+A[12]+", "+A[13]+", "+A[14]+")");
        System.out.println("B = ("+B[0]+", "+B[1]+", "+B[2]+", "+B[3]+", "+B[4]+", "+B[5]+", "+B[6]+", "+B[7]+", "+B[8]+", "+B[9]+", "+B[10]+", "+B[11]+", "+B[12]+", "+B[13]+", "+B[14]+")");
    }
    
}