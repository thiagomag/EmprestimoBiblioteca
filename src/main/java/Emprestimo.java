import java.time.LocalDate;

public class Emprestimo implements Biblioteca{

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

    public static int getQtdMaximaLivros() {
        return QTD_MAXIMA_LIVROS;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Livros[] getLivros() {
        return livros;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void dataDevolucao(Pessoa pessoa) {
        boolean comecaDiaUtil = LocalDate.now().getDayOfWeek().getValue() < 6;
    }

    /**
     * Regra "dataInicio + prazo (Aluno/Professor)"
     *
     * @param pessoa A instância de Pessoa (ou subtipo) que está realizando o empréstimo.
     * @return a data estimada para devolução.
     */
    private LocalDate calcularDataDevolucao(Pessoa pessoa) {
        //FIXME Não está considerando os dias uteis --> procurar por java plusDays business days skip wekeends and holidays
        LocalDate diaDevolucaoCorrido = LocalDate.now().plusDays(pessoa.getPrazoDevolucaoDias());
        LocalDate diaDevolucaoUtil = null;
        if(diaDevolucaoCorrido.getDayOfWeek().getValue() == 6){
            diaDevolucaoUtil = diaDevolucaoCorrido.plusDays(2);
        } else if (diaDevolucaoCorrido.getDayOfWeek().getValue() == 7){
            diaDevolucaoUtil = diaDevolucaoCorrido.plusDays(1);
        }
        return diaDevolucaoUtil;
    }

    @Override
    public void realizarEmprestimo(Pessoa pessoa, Livros[] livros) {
    }

    @Override
    public void devolver(Pessoa pessoa, Livros[] livro) {
    }
}