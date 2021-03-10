package lista_04;

import java.util.Scanner;

public class ContaCorrente2 { //Q_15

    private String num;
    private double saldo, limite;
    private boolean especial;
    
    public ContaCorrente2(String num,double saldo, double limite, boolean especial){
        this.num = num;
        this.saldo = saldo;
        this.limite = limite;
        this.especial = especial;
    }

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    public void deposito(){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor de depósito: ");
        double deposito = input.nextDouble();
        //setSaldo(getSaldo()+deposito);
        saldo +=deposito;
        System.out.println("Saldo: R$ "+saldo);
    }
    
    public void saque(){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor de saque: ");
        double saque = input.nextDouble();
        if(saque>saldo+limite){
            System.out.println("Saque Inválido: valor excede limite da sua conta");
        } else if(saque<=saldo){
            saldo -=saque;
            System.out.println("Saldo restante: R$ "+saldo);
        } else if(saque-saldo<=limite){
            saque -=saldo;
            saldo = -saque;
            System.out.println("Saldo restante: R$ 0,00\n"
                    + "Valor excedente: R$ "+saque);
        }
    }
    
    public void verificar(){ //função para verificar se o cliente usa ou não cheque especial a partir de um estado(especial)
        if(especial == true){
            System.out.println("O cliente usa cheque especial");
        } else
            System.out.println("O cliente não usa cheque especial");
    }
}
