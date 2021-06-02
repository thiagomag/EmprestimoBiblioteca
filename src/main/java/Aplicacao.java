import java.util.Arrays;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        try {
            Pessoa aluno = new Aluno("Thiago", 12345, "thiago@gmail.com");
            Livros livro1 = new Livros(12345, "adsad", "asfasfafs", "asgag");
            Livros[] livros = new Livros[3];
            livros[0] = livro1;
            Emprestimo emprestimo = new Emprestimo(aluno, livros);
            System.out.println(emprestimo.getDataDevolucao());
            System.out.println(emprestimo.getPessoa());
            System.out.println(Arrays.toString(emprestimo.getLivros()));
        } catch (ExcedeuQuantidadeMaximaException ex) {
            System.err.println(ex.getMessage());
        }



    }
}
