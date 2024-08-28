package com.aulas.aulas.Conjunta;

public class Veiculo {
    //Atributos
    private String marca;
    private int ano;
    //Atributos

    //Set+Get
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //Set+Get

    //Construtor
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo() {
    }
    //Construtor

    //Metodos
    public void acelerar() {
        System.out.println(ano + marca + "O veiculo está acelerando");
    }
    //Metodos
}
