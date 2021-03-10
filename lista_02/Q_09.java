package lista_02;

import java.util.Scanner;

public class Q_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double aux, num[] = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº numero: ", (i + 1));
            num[i] = input.nextDouble();
        }
        aux = num[0]; //variavel auxiliar para alterar ordem dos valores no vetor

        for (int i = 0; i < 3; i++) { 
            if (aux > num[i]) {
                aux = num[i];
                num[i] = num[0];
                num[0] = aux;
            }
        }
        //troca posições entre menor valor e o da posição 0 caso o valor em 0 não seja o menor
        
        if (num[1] > num[2]) {
            aux = num[1];
            num[1] = num[2];
            num[2] = aux;
        }
        //coloca maior valor na última posição caso não esteja

        System.out.print("Número digitados em ordem crescente: " + num[0] + ", " + num[1] + ", " + num[2] + "\n");
    }
}
