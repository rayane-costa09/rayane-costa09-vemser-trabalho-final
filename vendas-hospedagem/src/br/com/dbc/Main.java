package br.com.dbc;

import br.com.dbc.servicos.Caixa;
import br.com.dbc.servicos.ColaboradorService;

public class Main {

        public static void main(String[] args) {

            System.out.println("JAVAI?JAVOU!");
            ColaboradorService colaboradorService = new ColaboradorService();

            colaboradorService.create();
            System.out.printf("Valor em Caixa ------ R$ %.2f%n",  Caixa.getValorEmCaixa());
        }
}