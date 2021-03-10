package lista_01;

import java.util.Scanner;

public class Q_04 {

    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4;
        Scanner nota = new Scanner(System.in);
        System.out.print("Informe suas notas Bimestrais\nNota 1: ");
        nota1 = nota.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = nota.nextFloat();
        System.out.print("Nota 3: ");
        nota3 = nota.nextFloat();
        System.out.print("Nota 4: ");
        nota4 = nota.nextFloat();
        System.out.println("\nA sua Média Anual foi: " + (nota1 + nota2 + nota3 + nota4) / 4);
    }

}
