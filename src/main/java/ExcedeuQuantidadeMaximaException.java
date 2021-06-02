public class ExcedeuQuantidadeMaximaException extends Throwable {

    public ExcedeuQuantidadeMaximaException() {
        super("A quantidade máxima de livros foi excedida!!");
    }

    public ExcedeuQuantidadeMaximaException(int qtdInformada, int qtdMaxima) {
        super(String.format("A quantidade máxima de livros foi excedida!!\n" +
                "Quantidade %d onde limite é %d!!", qtdInformada, qtdMaxima));
    }
}
