package com.example.desenhosanimados;

public class Desenho {

    private String nome;
    private int logo;

    public Desenho(String nome, int logo) {
        this.nome = nome;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
