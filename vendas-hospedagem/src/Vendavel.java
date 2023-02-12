// Interface para classes que podem ser vendidas
public interface Vendavel {
    public double getPreco();

    public void cadastrar();

    public Vendavel consultar();

    public void alterar();

    public void deletar();
}