package br.com.dbc.servicos;

import br.com.dbc.modelos.Hospedagem;
import br.com.dbc.repositorios.IDashboard;

import java.util.ArrayList;
import java.util.List;

public class HospedagemService implements IDashboard {

    ColaboradorService colaboradorService = new ColaboradorService();
    CompradorService compradorService = new CompradorService();

    private List<Hospedagem> hospedagens = new ArrayList<>();

    public HospedagemService() {
        hospedagens.add(new Hospedagem(1, "Plano Bronze", 130.00, "Plano com Duração de 4 meses"));
        hospedagens.add(new Hospedagem(2, "Plano Prata", 240.00, "Plano com Duração de 8 meses"));
        hospedagens.add(new Hospedagem(3, "Plano Gold", 360.00, "Plano com Duração de 1 ano"));
        hospedagens.add(new Hospedagem(4, "Plano Platinum", 400.00, "Plano com Duração de 2 anos"));
    }
    @Override
    public void mostrarDados() {
        System.out.println("Mostrando dados da hospedagem");
        hospedagens.stream()
                .forEach(System.out::println);
    }
}
