package lista_04;

public class Livro { //Q_10

    private String titulo, autor, editora;
    private int paginas, capitulos;

    public Livro(String titulo, String autor, String editora, int paginas, int capitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
        this.capitulos = capitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
}
