// Classe para planos de hospedagem
public class PlanoHospedagem implements Vendavel {
    private String nome;
    private double preco;

    public PlanoHospedagem(String nome, double preco) {
        this.setNome(nome);
        this.preco = preco;
    }

    // Implementação do método getPreco da interface Vendavel
    public double getPreco() {
        return preco;
    }

    @Override
    public void cadastrar() {
        Sistema.addVendavel(this);
    }

    @Override
    public Vendavel consultar() {
        return null;
    }

    @Override
    public void alterar() {

    }

    @Override
    public void deletar() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}