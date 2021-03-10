package lista_04;

import java.util.Scanner;

public class Q_01 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int A[] = new int[5];
        int B[] = new int[5];
        
        for(int i = 0; i<5;i++){ //atribuit valores ao vetor A
            System.out.printf("Informe o valor do %dº elemento: ",i+1);
            A[i] = input.nextInt();
        }
        
        for(int i = 0;i<5;i++){ //atribuir valores ao vetor B a partir de A
            B[i] = A[i];
        }
        
        //escolhi essa forma de exibição apenas para deixar semelhante à representação de um vetor
        System.out.println("\nA = ("+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+")");
        System.out.println("B = ("+B[0]+", "+B[1]+", "+B[2]+", "+B[3]+", "+B[4]+")");
    }
    
}
