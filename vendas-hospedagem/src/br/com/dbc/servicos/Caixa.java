package br.com.dbc.servicos;

public class Caixa {

    // inicializa o valor em caixa com 20 R$
    private static Double valorEmCaixa = 20d; // qualquer coisa mudamos a visibilidade para public
    public Caixa() {}
    public Caixa(Double novoValor) {  this.valorEmCaixa = novoValor; }
    public static Double getValorEmCaixa() { return valorEmCaixa; }
    public void setValorEmCaixa(Double valorEmCaixa) { this.valorEmCaixa = valorEmCaixa; }
}