import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLivros {
    private final ArrayList<Livros> livros = new ArrayList<>();

    public CadastroLivros() {
        super();
    }

    public void cadastrar(Scanner input) {
        System.out.println("Informe o isbn");
        long isbn = input.nextLong();
        System.out.println("Informe o autor");
        input.nextLine();
        String autor = input.nextLine();
        System.out.println("Informe o titulo");
        String titulo = input.nextLine();
        System.out.println("Informe a editora");
        String editora = input.nextLine();
        livros.add(new Livros(isbn, autor, titulo, editora));
    }

    public void buscarLivro() {
        for (Livros livro : livros) {
            System.out.printf("ISBN: %d, Autor: %s, Titulo: %s, Editora: %s\n"
                    , livro.getIsbn(), livro.getAutor(), livro.getTitulo(), livro.getEditora());
        }
    }
}
