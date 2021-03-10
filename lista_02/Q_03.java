package lista_02;

import java.util.Scanner;

public class Q_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char s;
        System.out.print("Digite uma letra: ");
        s = input.next().charAt(0);
        if (s == 'F') {
            System.out.println("F - Feminino");
        } else if (s == 'M') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }

}
