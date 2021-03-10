package lista_02;

import java.util.Scanner;

public class Q_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contador = 0; //para verificar quantos "Sim" foram respondidos
        char resp;
        String classif;
        System.out.println("Responda apenas com \"s\"(sim) ou \"n\"(não)\n");

        for (int i = 0; i < 5; i++) { //para ser possível repetir perguntas
            switch (i) {
                case 0:
                    System.out.println("Telefonou para a vítima?");
                    resp = input.next().charAt(0);
                    if (resp == 's') {
                        contador++;
                    } else if (resp != 'n') { //caso qualquer outro digito seja inserido
                        System.out.println("Resposta inválida");
                        i--; //para repetir a mesma pergunta ao invés de ter que responder todas as perguntas de novo
                    }
                    break;
                case 1:
                    System.out.println("Esteve no local do crime?");
                    resp = input.next().charAt(0);
                    if (resp == 's') {
                        contador++;
                    } else if (resp != 'n') {
                        System.out.println("Resposta inválida");
                        i--;
                    }
                    break;
                case 2:
                    System.out.println("Mora perto da vítima?");
                    resp = input.next().charAt(0);
                    if (resp == 's') {
                        contador++;
                    } else if (resp != 'n') {
                        System.out.println("Resposta inválida");
                        i--;
                    }
                    break;
                case 3:
                    System.out.println("Devia para a vítima?");
                    resp = input.next().charAt(0);
                    if (resp == 's') {
                        contador++;
                    } else if (resp != 'n') {
                        System.out.println("Resposta inválida");
                        i--;
                    }
                    break;
                case 4:
                    System.out.println("Já trabalhou com a vítima?");
                    resp = input.next().charAt(0);
                    if (resp == 's') {
                        contador++;
                    } else if (resp != 'n') {
                        System.out.println("Resposta inválida");
                        i--;
                    }
                    break;
            }
        }
        
        if(contador<2){
            classif = "Inocente";
        } else if(contador==2){
            classif = "Suspeita";
        } else if(contador <=4){
            classif = "Cúmplice";
        } else
            classif = "Assassino";
        
        System.out.println("Classificação: "+classif);
    }

}
