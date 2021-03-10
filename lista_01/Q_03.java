package lista_01;

import java.util.Scanner;

public class Q_03 {

    public static void main(String[] args) {
        double num1, num2, sum;
        Scanner num = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = num.nextDouble(); //atribuir valor digitado na variavel num1 
        System.out.print("Digite outro numero: ");
        num2 = num.nextDouble();
        sum = num1 + num2; //soma entre os valores nas variaveis(entre valores digitados)
        System.out.println("A soma entre os dois numeros digitados é: " + sum);
    }

}
