package lista_04;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class LivroDeBiblioteca extends Livro { //Q_12

    private String codigo, nome, data;
    private int estoque;

    public LivroDeBiblioteca(String titulo, String autor, String editora, int paginas, int capitulos, int estoque, String data, String codigo, String nome) {
        super(titulo, autor, editora, paginas, capitulos);
        this.estoque = estoque;
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getData() {
        return data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void guardar() { //função para armazenar uma quantidade de livros no estoque
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade para armazenar no estoque: ");
        int qnt = input.nextInt();
        setEstoque(getEstoque() + qnt);
        System.out.println("Estoque: " + getEstoque());
    }

    public void emprestimo() { /*função para realizar o empréstimo de um livro;
        a quantidade no estoque é verificada para ver se é possível fazer o empréstimo*/
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade: ");
        int qnt = input.nextInt();
        if (qnt > getEstoque()-1) { //para ficar pelo menos 1 livro na biblioteca
            System.out.println("Quantidade insuficiente no estoque");
        } else {
            setEstoque(getEstoque() - qnt);
        }
        System.out.println("Estoque: " + getEstoque());
    }
    
    public void devolucao(){ //definir data de devolução a partir do prazo de empréstimo
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o prazo de empréstimo em dias: ");
        int dias = input.nextInt();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        Calendar c = Calendar.getInstance();
        c.add((GregorianCalendar.DAY_OF_MONTH),dias);
        data = df.format(c.getTime());
    }
}
