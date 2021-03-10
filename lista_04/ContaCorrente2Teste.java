package lista_04;

import java.util.Scanner;

public class ContaCorrente2Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        String num = input.nextLine();
        
        System.out.print("Informe o saldo da conta: ");
        double saldo = input.nextDouble();
        
        System.out.print("Informe o limite da conta: ");
        double limite = input.nextDouble();
        
        System.out.print("Digite \"s\" caso a conta seja especial e \"n\" caso não seja: ");
        boolean especial = input.next().charAt(0) == 's';
                
        ContaCorrente2 cc2 = new ContaCorrente2(num, saldo, limite, especial);
        System.out.println("\nInformações da conta: \n"
                + "Número da conta: "+num+"\n"
                + "Saldo: R$ "+saldo+"\n"
                + "Limite: R$ "+limite);
        cc2.verificar();
        
        int op;
        do {
            System.out.println("\nOperações:\n1 - Saque\n2 - Deposito\n0 - Encerrar operação");
            System.out.print("\nInforme a operação desejada: ");
            op = input.nextInt();
            if (op != 0) {

                switch (op) {
                    case 1:
                        cc2.saque();
                        break;
                    case 2:
                        cc2.deposito();
                        break;
                    default:
                        System.out.println("Operação Inválida");
                }
            }
        } while (op != 0);
    }
}
