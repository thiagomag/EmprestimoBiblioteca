public abstract class Pessoa {
    protected String nome;
    protected Long matricula;
    protected String email;

    public Pessoa(String nome, long matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public Pessoa() {
        //construtor padrão
    }

    public abstract int getPrazoDevolucaoDias();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", email='" + email + '\'' +
                '}';
    }
}