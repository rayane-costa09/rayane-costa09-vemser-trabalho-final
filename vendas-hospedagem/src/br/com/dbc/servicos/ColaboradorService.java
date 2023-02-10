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

    static List<Colaborador> colaboradores;
    static List<Contato> contatos;
    static List<Endereco> enderecos;

    public ColaboradorService() {
        colaboradores = new ArrayList<>();
        contatos = new ArrayList<>();
        enderecos = new ArrayList<>();
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
        System.out.println("Informe os dados de contato do colaborador: ");
//        colaboradores.setContatos.add(new Contato());
//        colaboradores.setEnderecos.add(new Endereco());
        colaboradores.add(new Colaborador(nome, cpf, usuario, senha));
        System.out.println("Colaborador " + nome + " cadastrado com sucesso!");
    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}