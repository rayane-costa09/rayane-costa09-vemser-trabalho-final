import java.util.ArrayList;

// Classe para compradores
public class Comprador extends Usuario implements Cadastravel {
    private ArrayList<Venda> vendas;

    public Comprador(String nome, String email, String senha) {
        super(nome, email, senha);
        vendas = new ArrayList<Venda>();
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    // Implementação do método cadastrar da interface Cadastravel
    public void cadastrar() {
        // Adiciona o comprador à lista de compradores do sistema
        Sistema.addComprador(this);
    }

    //Implementação do método consultar que retorna um objecto Cadastravel
    public Cadastravel consultar(String nome) {
        return Sistema.getComprador(nome);
    }

    //Implementação altera um objeto Cadastravel
    public void alterar(Cadastravel comprador) {

    }

    //Método que deleta um objeto Cadastravel
    public void deletar(Cadastravel comprador) {
        Sistema.getCompradores().remove(comprador);
    }

}