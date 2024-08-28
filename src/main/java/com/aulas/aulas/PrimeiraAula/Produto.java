package com.aulas.aulas.PrimeiraAula;

public class Produto {
    //Atributos
    private String nome;
    private String descricao;
    private double valor;

    //Construtor
    public Produto(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    public Produto(){

    }
    //Get and Sett
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //Override
    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", descricao='" + descricao + '\'' + ", valor=" + valor + '}';
    }
}