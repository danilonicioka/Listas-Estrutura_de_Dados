package lista_04;

import java.util.Scanner;

public class Lampada { //Q_09

    private String marca, tipo, codigo;
    private double potencia, preco;
    private int estoque;

    public Lampada(String marca, String tipo, double potencia, double preco, int estoque, String codigo) {
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
        this.preco = preco;
        this.estoque = estoque;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void guardar() { //função para armazenar uma quantidade de lâmpadas no estoque
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade para armazenar no estoque: ");
        int qnt = input.nextInt();
        setEstoque(getEstoque() + qnt);
        System.out.println("Estoque: " + getEstoque());
    }

    public void vender() { /*função para calcular valor de venda de uma quantidade de lâmpadas;
        a quantidade de lâmpadas no estoque é verificada para ver se a venda é possível e reduzida caso seja
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade a ser vendida: ");
        int qnt = input.nextInt();
        if (qnt > getEstoque()) {
            System.out.println("Quantidade insuficiente no estoque");
        } else {
            System.out.println("Total a pagar: R$" + qnt * getPreco());
            setEstoque(getEstoque() - qnt);
        }
        System.out.println("Estoque: "+getEstoque());
    }

}
