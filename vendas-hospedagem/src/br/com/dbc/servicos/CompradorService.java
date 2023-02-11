package br.com.dbc.servicos;

import br.com.dbc.modelos.Comprador;
import br.com.dbc.repositorios.ICrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompradorService implements ICrud {

    static Scanner scanner = new Scanner(System.in);
    private List<Comprador> compradores;

    public CompradorService() {
        compradores = new ArrayList<>();
    }

    @Override
    public void create() {
        System.out.println("Digite o nome do comprador: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o cpf do comprador: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o usuario do comprador: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha do comprador: ");
        String senha = scanner.nextLine();
        System.out.println("Digite o email do comprador: ");
        String email = scanner.nextLine();
        compradores.add(new Comprador(nome, cpf, usuario, senha, email));
        System.out.println("Comprador " + nome + " cadastrado com sucesso!");
    }

    @Override
    public void read() {
        if (compradores.isEmpty()) {
            System.out.println("Lista Vazia -- Não há compradores cadastrados!");
        } else {
            for (Comprador comprador : compradores) {
                System.out.println("ID: " + comprador.getId() + " Nome: " + comprador.getNome() +
                        " CPF: " + comprador.getCpf() + " Email: " + comprador.getEmail()
                        + " Usuario: " + comprador.getUsuario() + "\n");
            }
        }
    }

    @Override
    public void update() {
        if (compradores.isEmpty()) {
            System.out.println("Lista Vazia -- Não há compradores cadastrados!");
        } else {
            System.out.println("Atualizando comprador por nome...");
            System.out.println("Digite o nome do comprador: ");
            String nome = scanner.nextLine();
            for (Comprador comprador : compradores) {
                if (comprador.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Digite o nome do comprador: ");
                    String novoNome = scanner.nextLine();
                    System.out.println("Digite o cpf do comprador: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o usuario do comprador: ");
                    String usuario = scanner.nextLine();
                    System.out.println("Digite a senha do comprador: ");
                    String senha = scanner.nextLine();
                    System.out.println("Digite o email do comprador: ");
                    String email = scanner.nextLine();
                    comprador.setNome(novoNome);
                    comprador.setCpf(cpf);
                    comprador.setUsuario(usuario);
                    comprador.setSenha(senha);
                    comprador.setEmail(email);
                    System.out.println("Comprador " + nome + " atualizado com sucesso!");
                }
            }
        }
    }

    @Override
    public void delete() {
        if (compradores.isEmpty()) {
            System.out.println("Lista Vazia -- Não há compradores cadastrados!");
        } else {
            System.out.println("Deletando comprador por nome...");
            System.out.println("Digite o nome do comprador: ");
            String nome = scanner.nextLine();
            for (Comprador comprador : compradores) {
                if (comprador.getNome().equalsIgnoreCase(nome)) {
                    compradores.remove(comprador);
                    System.out.println("Comprador " + nome + " deletado com sucesso!");
                }
            }
        }
    }
}