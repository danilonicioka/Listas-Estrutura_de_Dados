package lista_07;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = input.nextInt();
            if (num == 0) {
                if(par.desempilha()==null){
                    System.out.println("A pilha de números pares está vazia");
                }
                if(impar.desempilha()==null){
                    System.out.println("A pilha de números ímpares está vazia");
                }
            } else if (num % 2 == 0) {
                par.empilha(num);
            } else {
                impar.empilha(num);
            }
        }
        
        if (!par.vazia()) {
            System.out.println("Desenpilhando a pilha de números pares: ");
            int tam = par.getTamanho();
            for (int i = 0; i < tam; i++) {
                System.out.println(par.desempilha());
            }
        }
        
        if (!impar.vazia()) {
            System.out.println("Desenpilhando a pilha de números pares: ");
            int tam = impar.getTamanho();
            for (int i = 0; i < tam; i++) {
                System.out.println(impar.desempilha());
            }
        }
    }

}
