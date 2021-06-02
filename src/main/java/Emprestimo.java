import java.time.LocalDate;

public class Emprestimo {

    private static final int QTD_MAXIMA_LIVROS = 3;

    private Pessoa pessoa;
    private Livros[] livros;
    private final LocalDate dataInicio;
    private LocalDate dataDevolucao;


    public Emprestimo() {
        this.dataInicio = LocalDate.now();
    }

    public Emprestimo(Pessoa pessoa, Livros[] livros) throws ExcedeuQuantidadeMaximaException {
        this.pessoa = pessoa;
        //checar o tamanho do Array livro para não ultrapassar o tamanho máximo;
        this.livros = livros;
        this.dataInicio = LocalDate.now();

        this.dataDevolucao = calcularDataDevolucao(pessoa);

        if (livros.length > QTD_MAXIMA_LIVROS) {
            throw new ExcedeuQuantidadeMaximaException(livros.length, QTD_MAXIMA_LIVROS);
        }
    }

    /**
     * Regra "dataInicio + prazo (Aluno/Professor)"
     * @param pessoa A instância de Pessoa (ou subtipo) que está realizando o empréstimo.
     * @return a data estimada para devolução.
     */
    private LocalDate calcularDataDevolucao(Pessoa pessoa) {
        //FIXME Não está considerando os dias uteis --> procurar por java plusDays business days skip wekeends and holidays
        return LocalDate.now().plusDays(pessoa.getPrazoDevolucaoDias());
    }
}
