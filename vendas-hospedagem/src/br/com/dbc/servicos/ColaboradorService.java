package br.com.dbc.servicos;

import br.com.dbc.modelos.Colaborador;
import br.com.dbc.repositorios.ICrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColaboradorService implements ICrud {

    static Scanner scanner = new Scanner(System.in);

    private List<Colaborador> colaboradores;

    public ColaboradorService() {
        colaboradores = new ArrayList<>();
    }

    @Override
    public void create() {
        System.out.println("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o cpf do colaborador: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o usuario do colaborador: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha do colaborador: ");
        String senha = scanner.nextLine();
        colaboradores.add(new Colaborador(nome, cpf, usuario, senha));
        System.out.println("Colaborador " + nome + " cadastrado com sucesso!");
    }

    @Override
    public void read() {
        if (colaboradores.isEmpty()) {
            System.out.println("Lista Vazia -- Não há colaboradores cadastrados!");
        } else {
            for (Colaborador colaborador : colaboradores) {
                System.out.println(colaborador);
            }
        }
    }

    @Override
    public void update() {
        System.out.println("Atualizando colaborador por nome...");
        System.out.println("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();
        for (Colaborador colaborador : colaboradores ) {
            if (colaborador.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Digite o nome do colaborador: ");
                String novoNome = scanner.nextLine();
                System.out.println("Digite o cpf do colaborador: ");
                String cpf = scanner.nextLine();
                System.out.println("Digite o usuario do colaborador: ");
                String usuario = scanner.nextLine();
                System.out.println("Digite a senha do colaborador: ");
                String senha = scanner.nextLine();
                colaborador.setNome(novoNome);
                colaborador.setCpf(cpf);
                colaborador.setUsuario(usuario);
                colaborador.setSenha(senha);
                System.out.println("Colaborador " + nome + " atualizado com sucesso!");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Deletando colaborador por nome...");
        System.out.println("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();
        for (Colaborador colaborador : colaboradores ) {
            if (colaborador.getNome().equalsIgnoreCase(nome)) {
                colaboradores.remove(colaborador);
                System.out.println("Colaborador " + nome + " deletado com sucesso!");
            }
        }
    }
}