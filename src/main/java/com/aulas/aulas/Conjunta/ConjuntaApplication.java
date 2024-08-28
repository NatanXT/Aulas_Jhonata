package com.aulas.aulas.Conjunta;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConjuntaApplication {

    //control + alt/shift + L pra organizar o codigo
    public static void main(String[] args) {
        luidy();


    }

    private static void luidy() {
        System.out.println("Conceito de Classe Objeto ");
        Carro carro = new Carro();
        carro.setAno(2024);
        carro.setMarca("fiat ");
        carro.setModelo("uno ");

        Carro carro2 = new Carro();
        carro2.setAno(2020);
        carro2.setMarca("honda ");
        carro2.setModelo("civic ");

        carro.acelerar();
        carro2.acelerar();
    }

}
