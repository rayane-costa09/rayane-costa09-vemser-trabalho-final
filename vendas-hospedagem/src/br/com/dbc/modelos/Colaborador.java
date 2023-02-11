package br.com.dbc.modelos;

import br.com.dbc.modelos.Usuario;

import java.util.List;

public class Colaborador extends Usuario {

    private String usuario;
    private String senha;

    public Colaborador() {
    }

    public Colaborador(String nome, String cpf, String usuario, String senha) {
        super(nome, cpf);
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
//
//    public List<Contato> getContatos() { return getContatos(); }
//
//    public void setContatos(Contato contatos) { this.getContatos().add(contatos); }
//
//    public List<Endereco> getEnderecos() { return getEnderecos(); }
//
//    public void setEnderecos(Endereco enderecos) { this.getEnderecos().add(enderecos); }
}