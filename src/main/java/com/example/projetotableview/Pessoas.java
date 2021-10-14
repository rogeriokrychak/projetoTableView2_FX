package com.example.projetotableview;

public class Pessoas {
    int id;
    String nome, sobrenome, gmail, yahoo, telefone, pais;

    public Pessoas(int id, String nome, String sobrenome, String gmail, String yahoo, String telefone, String pais) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.gmail = gmail;
        this.yahoo = yahoo;
        this.telefone = telefone;
        this.pais = pais;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getGmail() {
        return gmail;
    }

    public String getYahoo() {
        return yahoo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getPais() {
        return pais;
    }
}
