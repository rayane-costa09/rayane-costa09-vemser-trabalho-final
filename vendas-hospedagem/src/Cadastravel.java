// Interface para classes que podem ser cadastradas
public interface Cadastravel {
    public void cadastrar();

    public Cadastravel consultar(String nome);

    public void alterar(Cadastravel cadastravel);

    public void deletar(Cadastravel cadastravel);
}