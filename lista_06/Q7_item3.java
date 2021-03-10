package lista_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7_item3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
        String nome, telefone, email;

        int op = -1;
        do {
            System.out.print("\n1 - Adicionar um contato na agenda\n"
                    + "2 - Remover um contato da agenda\n"
                    + "3 - Alterar um contato na agenda\n"
                    + "4 - Buscar um contato na agenda\n"
                    + "5 - Apagar todos os contatos da agenda\n"
                    + "0 - Finalizar operação\n"
                    + "Informe a operação que deseja realizar: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nInforme o nome que deseja colocar no contato: ");
                    nome = input.next();
                    System.out.print("Informe o telefone do contato: ");
                    telefone = input.next();
                    System.out.print("Informe o email do contato: ");
                    email = input.next();
                    lista.add(new Contato(nome, telefone, email));
                    break;
                case 2:
                    if (lista.size() > 0) {
                        System.out.println("\n=====Contatos na Agenda=====\n");
                        lista.toString();
                        System.out.print("\nInforme qual contato deseja apagar: ");
                        int apaga = (input.nextInt() - 1);
                        lista.remove(apaga);
                    } else {
                        System.out.println("\nNão há contatos registrados na agenda");
                    }
                    break;
                case 3:
                    if (lista.size() > 0) {
                        System.out.println("\n=====Contatos na Agenda=====");
                        lista.toString();
                        System.out.print("\nInforme qual contato deseja alterar: ");
                        int altera = (input.nextInt() - 1);
                        System.out.print("Informe o novo nome que deseja colocar no contato: ");
                        nome = input.next();
                        System.out.print("Informe o novo telefone do contato: ");
                        telefone = input.next();
                        System.out.print("Informe o novo email do contato: ");
                        email = input.next();
                        lista.set(altera, new Contato(nome, telefone, email));
                    } else {
                        System.out.println("\nNão há contatos registrados na agenda");
                    }
                    break;
                case 4:
                    if (lista.size() > 0) {
                        System.out.print("\nInforme o nome do contato que deseja procurar: ");
                        nome = input.next();
                        System.out.print("Informe o telefone do contato que deseja procurar: ");
                        telefone = input.next();
                        System.out.print("Informe o email do contato que deseja procurar: ");
                        email = input.next();
                        Contato busca = new Contato(nome, telefone, email);
                        if (lista.contains(busca)) {
                            System.out.println("\nO contato buscado está na posição: " + lista.lastIndexOf(busca) + "\n");
                        } else {
                            System.out.println("\nO contato buscado não foi encontrado na agenda");
                        }
                    } else {
                        System.out.println("\nNão há contatos registrados na agenda");
                    }
                    break;
                case 5:
                    lista.clear();
                case 0:
                    break;
                default:
                    System.out.println("\nOperação Inválida");
            }
        } while (op != 0);
    }

}
