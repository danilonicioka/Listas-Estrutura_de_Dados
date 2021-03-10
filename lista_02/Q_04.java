package lista_02;

import java.util.Scanner;

public class Q_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String entrada = input.nextLine().toUpperCase();
        /*pega o que foi digitado e coloca em maiusculo para verificar
        tanto as letras maiusculas quanto as minusculas*/
        char letra = entrada.charAt(0);
        //pega posição 0 da string digitada

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("A letra digitada é uma vogal");
        } else {
            System.out.println("A letra digitada é uma consoante");
        }
    }
}
