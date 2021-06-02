public interface Biblioteca {

    void realizarEmprestimo(Pessoa pessoa, Livros[] livros);

    void devolver(Pessoa pessoa, Livros[] livros);
}
