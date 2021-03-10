package lista_01;

import java.util.Scanner;

public class Q_11 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int int1, int2;
        float real;
        System.out.print("Digite um número inteiro: ");
        int1 = num.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int2 = num.nextInt();
        System.out.print("Por fim, digite um número real: ");
        real = num.nextFloat();
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + (int1 * int2));
        /*é o mesma coisa que calcular o produto do primeiro com o segundo, 
         pois os "2" que calculam o dobro e a metade se cancelam*/
        System.out.println("A soma do triplo do primeiro com o terceiro: " + (3 * int1 + real));
        System.out.println("O terceiro elevado ao cubo: " + (Math.pow(real, 3)));
    }

}
