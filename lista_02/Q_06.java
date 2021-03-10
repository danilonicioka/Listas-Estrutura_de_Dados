package lista_02;

import java.util.Scanner;

public class Q_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num[] = new double[3]; 
        //vetor para comparar os 3 números mais facilmente com um for

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            num[i] = input.nextDouble();
            if (num[0] < num[i]) {
                num[0] = num[i];
            }
        }
        //coloca o maior valor entre os 3 na posição 0 do vetor
        
        System.out.println("O maior número digitado foi: " + num[0]);
    }

}
