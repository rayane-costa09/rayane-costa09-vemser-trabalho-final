// Interface para classes que podem ser vendidas
public interface Vendavel {
    double getPreco();

    void cadastrar();

    Vendavel consultar();

    void alterar();

    void deletar();
}