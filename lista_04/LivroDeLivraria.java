package lista_04;

import java.util.Scanner;

public class LivroDeLivraria extends Livro { //Q_11

    private double preco;
    private int estoque;
    private String codigo;

    public LivroDeLivraria(String titulo, String autor, String editora, int paginas, int capitulos, double preco, int estoque, String codigo) {
        super(titulo, autor, editora, paginas, capitulos);
        this.preco = preco;
        this.estoque = estoque;
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void guardar() { //função para armazenar uma quantidade de livros no estoque
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade para armazenar no estoque: ");
        int qnt = input.nextInt();
        setEstoque(getEstoque() + qnt);
        System.out.println("Estoque: " + getEstoque());
    }

    public void vender() { /*função para a venda de um livro;
        a quantidade no estoque é verificada para ver se a venda é possível*/
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade a ser vendida: ");
        int qnt = input.nextInt();
        if (qnt > getEstoque()) {
            System.out.println("Quantidade insuficiente no estoque");
        } else {
            System.out.println("Total a pagar: R$" + qnt * getPreco());
            setEstoque(getEstoque() - qnt);
        }
        System.out.println("Estoque: " + getEstoque());
    }
}
