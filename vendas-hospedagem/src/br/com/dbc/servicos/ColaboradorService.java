package br.com.dbc.servicos;

import br.com.dbc.modelos.Colaborador;
import br.com.dbc.modelos.Contato;
import br.com.dbc.modelos.Endereco;
import br.com.dbc.repositorios.ICrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColaboradorService implements ICrud {

    static Scanner scanner = new Scanner(System.in);

    private List<Colaborador> colaboradores;
    private List<Contato> contatos = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();

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
//        colaboradores.add(new Colaborador(nome, cpf, usuario, senha));
        colaboradores.add(new Colaborador(nome, cpf, usuario, senha, contatos, enderecos));
        System.out.println("Colaborador " + nome + " cadastrado com sucesso!");
    }

    @Override
    public void read() {
        if (colaboradores.isEmpty()) {
            System.out.println("Lista Vazia -- Não há colaboradores cadastrados!");
        } else {
            for (Colaborador colaborador : colaboradores) {
                System.out.println("Id: " + colaborador.getId() + " Nome: " + colaborador.getNome() +
                        " CPF: " + colaborador.getCpf() + " Usuario: " + colaborador.getUsuario() +
                        " Contatos : " + contatos.toString() +
                        " Enderecos:" + enderecos.toString() + "\n");
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