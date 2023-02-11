package br.com.dbc.servicos;

import br.com.dbc.modelos.Comprador;
import br.com.dbc.modelos.Contato;
import br.com.dbc.modelos.Endereco;
import br.com.dbc.repositorios.ICrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompradorService implements ICrud {

    static Scanner scanner = new Scanner(System.in);
    private List<Comprador> compradores;
    private List<Contato> contatos = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();

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
        //    public Contato(String descricao, String telefone, int tipo)
        System.out.println("Digite a descrição do contato: ");
        String descricao = scanner.nextLine();
        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o tipo do contato: ");
        int tipo = scanner.nextInt();
        contatos.add(new Contato(descricao, telefone, tipo));
        scanner.nextLine();
        //    public Endereco(int tipo, String logradouro, int numero, String complemento, String cep, String cidade, String estado, String pais)
        System.out.println("Digite o tipo do endereço: ");
        int tipoEndereco = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o logradouro do endereço: ");
        String logradouro = scanner.nextLine();
        System.out.println("Digite o numero do endereço: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o complemento do endereço: ");
        String complemento = scanner.nextLine();
        System.out.println("Digite o cep do endereço: ");
        String cep = scanner.nextLine();
        System.out.println("Digite a cidade do endereço: ");
        String cidade = scanner.nextLine();
        System.out.println("Digite o estado do endereço: ");
        String estado = scanner.nextLine();
        System.out.println("Digite o pais do endereço: ");
        String pais = scanner.nextLine();
        enderecos.add(new Endereco(tipoEndereco, logradouro, numero, complemento, cep, cidade, estado, pais));
        compradores.add(new Comprador(nome, cpf, usuario, senha, email, contatos, enderecos));
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