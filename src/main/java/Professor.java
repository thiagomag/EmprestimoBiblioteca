public class Professor extends Pessoa {

    public static final int QTD_LIVROS = 5;
    private static final int TEMPO_EMPRESTIMO_DIAS = 20;

    public Professor(String nome, long matricula, String email) {
        super(nome, matricula, email);
    }

    public Professor() {
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
