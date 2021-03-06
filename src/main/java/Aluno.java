public class Aluno extends Pessoa {
    public static final int QTD_LIVROS = 3;
    private static final int TEMPO_EMPRESTIMO_DIAS = 10;

    public Aluno(String nome, long matricula, String email) {
        super(nome, matricula, email);
    }

    public Aluno() {
        super();
    }

    @Override
    public int getPrazoDevolucaoDias() {
        return TEMPO_EMPRESTIMO_DIAS;
    }

    @Override
    public long getMatricula() {
        return super.getMatricula();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setMatricula(long matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
}
