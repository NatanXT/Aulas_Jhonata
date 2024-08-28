package com.aulas.aulas.GerenciadorDeTarefas.Modelos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tarefa {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @Column
    private String status;
    @OneToMany(fetch =FetchType.LAZY)
    private List<Membro> membro;
    @OneToMany(fetch =FetchType.LAZY)
    private Projeto projeto;

    //Construtor
    public Tarefa(Integer id, String titulo, String descricao, String status) {
        id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    public Tarefa() {
    }

    //Get and Sett
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Membro> getMembro() {
        return membro;
    }

    public void setMembro(List<Membro> membro) {
        this.membro = membro;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    //ToString
    @Override
    public String toString() {
        return "Tarefa{" +
                "Id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
