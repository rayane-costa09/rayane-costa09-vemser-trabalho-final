package br.com.dbc;

import br.com.dbc.servicos.Caixa;
import br.com.dbc.servicos.ColaboradorService;
import br.com.dbc.servicos.CompradorService;

public class Main {
    public static void main(String[] args) {

        System.out.println("JAVAI?JAVOU!");
        ColaboradorService colaboradorService = new ColaboradorService();
        CompradorService compradorService = new CompradorService();
        System.out.printf("Valor em Caixa ------ R$ %.2f%n", Caixa.getValorEmCaixa());
        colaboradorService.create();
        System.out.println("---------------------");
        colaboradorService.read();
        System.out.println("---------------------");
        compradorService.create();
        System.out.println("---------------------");
        compradorService.read();
    }
}