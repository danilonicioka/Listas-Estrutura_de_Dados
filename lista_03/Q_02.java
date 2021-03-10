package lista_03;

import java.util.Scanner;

public class Q_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome = "a", senha = "b";

        do {
            if (nome.equals(senha)) {
                System.out.println("A senha não pode ser igual ao nome de usuário");
            }
            System.out.print("Digite um nome de usuário: ");
            nome = input.nextLine();
            System.out.print("Digite uma senha: ");
            senha = input.nextLine();
        } while (nome.equals(senha));
    }

}
