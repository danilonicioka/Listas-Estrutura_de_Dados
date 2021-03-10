package lista_01;

import java.util.Scanner;

public class Q_02 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); //atribuir valor obtido pelo scanner no objeto num
        System.out.print("Digite um numero: "); //exibe texto para pedir um numero para o usuario
        System.out.println("O numero informado foi: " + num.nextDouble()); //exibe texto com o número que usuario digitou
    }

}
