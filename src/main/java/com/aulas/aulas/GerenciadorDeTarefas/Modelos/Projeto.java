package com.aulas.aulas.GerenciadorDeTarefas.Modelos;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false,unique = true)
    private String nome;
    @Column(nullable = false)
    private String info;
    @OneToMany(fetch =FetchType.LAZY)
    private List<Tarefa> tarefa;


    public Projeto(Integer id, String nome, String info) {
        id = id;
        this.nome = nome;
        this.info = info;
    }

    public Projeto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Tarefa> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "Id=" + id +
                ", nome='" + nome + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projeto projeto = (Projeto) o;
        return Objects.equals(id, projeto.id) && Objects.equals(nome, projeto.nome) && Objects.equals(info, projeto.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, info);
    }
}
