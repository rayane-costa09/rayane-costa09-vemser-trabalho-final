package br.com.dbc.modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private Integer id;
    private String nome;
    private String cpf;
    private List <Contato> contatos = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();
    // contador de ID para simular o auto incremento do banco de dados
    private static int contadorId = 1;

    public Usuario() {}

    public Usuario(String nome, String cpf) {
//        id = contadorId++;
        this.id = contadorId++;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Contato> getContatos() { return contatos; }

    public void setContatos(Contato contatos) { this.contatos.add(contatos); }

    public List<Endereco> getEnderecos() { return enderecos; }

    public void setEnderecos(Endereco enderecos) { this.enderecos.add(enderecos); }

    public void imprimirUsuario() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        imprimirContato();
        imprimirEndereco();
    }
    public void imprimirContato() {
        System.out.println("-------- Contatos --------");
        for (Contato contato : contatos ) {
            if(contato != null)
                contato.imprimirContato();
        }
    }
    public void imprimirEndereco() {
        System.out.println("-------- Endereços --------");
        for (Endereco endereco : enderecos) {
            if (endereco != null) {
                endereco.imprimirEndereco();
            }
        }
    }
}