package com.fatec.sigvs.ti_tdd;

public class Livro {

    String nome;
    String autor;

    public Livro (String nome, String autor){
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
