// Classe para hospedagens
public class Hospedagem implements Vendavel {
    private Colaborador colaborador;

    private String endereco;
    private double preco;

    public Hospedagem(Colaborador colaborador, String endereco, double preco) {
        this.setColaborador(colaborador);
        this.setEndereco(endereco);
        this.setPreco(preco);
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
}