package br.com.dbc.modelos;

public class Hospedagem {
    private int tipo;
    private String plano;
    private Double valor;
    private String descricao;

    public Hospedagem(int tipo, String plano, Double valor, String descricao) {
        this.tipo = tipo;
        this.plano = plano;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tipo = " + tipo +
                ", Plano = '" + plano + '\'' +
                ", Valor R$ '" + valor + '\'' +
                ", Descrição = '" + descricao + '\'';
    }
}