package lista_02;

import java.util.Scanner;

public class Q_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("M - Matutino\nV - Vespertino\nN - Noturno");
        System.out.print("Informe o turno em que você estuda: ");
        char turno = input.next().charAt(0);
        if (turno == 'M') {
            System.out.println("Bom dia!");
        } else if (turno == 'V') {
            System.out.println("Boa tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }

}
