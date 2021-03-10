package lista_05;

import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int op;
        do {
            Calculadora.menu();
            op = input.nextInt();
            if (op != 0) {
                switch (op) {
                    case 1:
                        Calculadora.soma();
                        break;
                    case 2:
                        Calculadora.subtrair();
                        break;
                    case 3:
                        Calculadora.multiplicar();
                        break;
                    case 4:
                        Calculadora.dividir();
                        break;
                    case 5:
                        Calculadora.potencia();
                        break;
                    case 6:
                        Calculadora.fatorial();
                }
            }
        } while (op != 0);
    }

}
