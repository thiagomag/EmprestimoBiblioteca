import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoas {
    private final ArrayList<Pessoa> pessoas = new ArrayList<>();

    public CadastroPessoas() {
        super();
    }

    public void cadastrar(Scanner input) {
        System.out.println("Informe o nome do usuário");
        String nome = input.nextLine();
        System.out.println("Informe o a matricula do usuário");
        long matricula = input.nextLong();
        System.out.println("Informe o email para contato");
        input.nextLine();
        String email = input.nextLine();
        System.out.println("O usuário é aluno ou professor?");
        String usr = input.nextLine();
        if(usr.equals("aluno")){
            pessoas.add(new Aluno(nome, matricula, email));
        } else if(usr.equals("professor")){
            pessoas.add(new Professor(nome, matricula, email));
        }
    }

    public void buscarPessoa() {
        for (Pessoa pessoa : pessoas) {
            System.out.printf("Nome: %s, Matricula: %d, Email: %s\n"
                    , pessoa.getNome(), pessoa.getMatricula(), pessoa.getEmail());
        }
    }

}
