package br.com.dbc.modelos;

import br.com.dbc.modelos.Usuario;

import java.util.List;

public class Colaborador extends Usuario {

    private String usuario;
    private String senha;

    public Colaborador() {
    }

    public Colaborador(String nome, String cpf, String usuario, String senha, List<Contato> contatos, List<Endereco> enderecos) {
        super(nome, cpf, contatos, enderecos);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}