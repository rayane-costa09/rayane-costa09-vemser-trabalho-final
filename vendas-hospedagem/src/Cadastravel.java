// Interface para classes que podem ser cadastradas
public interface Cadastravel {
    void cadastrar();

    Cadastravel consultar(String nome);

    void alterar(Cadastravel cadastravel, String nome);

    void deletar();
}