import java.util.ArrayList;

public class Livros {
    protected Long isbn;
    protected String autor;
    protected String titulo;
    protected String editora;


    public Livros(long isbn, String autor, String titulo, String editora) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
    }


    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "isbn=" + isbn +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
