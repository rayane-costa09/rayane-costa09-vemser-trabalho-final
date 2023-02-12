// Classe para vendas
public class Venda {
    private Comprador comprador;
    private PlanoHospedagem plano;
    private String dominio;

    public Venda(Comprador comprador, PlanoHospedagem plano, String dominio) {
        this.comprador = comprador;
        this.plano = plano;
        this.dominio = dominio;
    }

    // Getters e Setters
    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public PlanoHospedagem getPlano() {
        return plano;
    }

    public void setPlano(PlanoHospedagem plano) {
        this.plano = plano;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public double getValorTotal() {
        return plano.getPreco();
    }

    public void vender(){
        Sistema.addVenda(this);
    }
}