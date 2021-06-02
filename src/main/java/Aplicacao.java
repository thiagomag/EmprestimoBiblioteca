import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        try {
            Emprestimo emprestimo = new Emprestimo(new Aluno(), new Livros[10]);
        } catch (ExcedeuQuantidadeMaximaException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
