package br.com.dbc.modelos;

import java.util.List;

public class Comprador extends Usuario {

    private String usuario;
    private String senha;
    private String email;

    public Comprador() {
    }

    public Comprador(String nome, String cpf, String usuario, String senha, String email, List<Contato> contatos, List<Endereco> enderecos) {
        super(nome, cpf, contatos, enderecos);
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}