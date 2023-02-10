package br.com.dbc.modelos;

import br.com.dbc.modelos.Usuario;

public class Colaborador extends Usuario {

    private String usuario;
    private String senha;

    public Colaborador() { }

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



    public void imprimirColaborador() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Usuario: " + getUsuario());
    }
}