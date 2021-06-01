import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 2;
        CadastroLivros livros = new CadastroLivros();

        for(int i = 0; i < n; i++) {
            livros.cadastrar(input);
        }
    }
}
