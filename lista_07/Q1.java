package lista_07;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o "+(i+1)+"º número: ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                pilha.empilha(num);
            } else if (pilha.desempilha() == null) {
                System.out.println("A pilha está vazia");
            }
        }

        if (!pilha.vazia()) {
            System.out.println("Desenpilhando a pilha: ");
            int tam = pilha.getTamanho();
            for (int i = 0; i < tam; i++) {
                System.out.println(pilha.desempilha());
            }
        }

    }
}
