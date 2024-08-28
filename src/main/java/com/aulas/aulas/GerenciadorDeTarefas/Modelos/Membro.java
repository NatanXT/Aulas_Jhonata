package com.aulas.aulas.GerenciadorDeTarefas.Modelos;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Objects;

@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String permissao;
    //Lazy carregamento preguiçoso , enquanto vc nao precisar ele nao vai carregar pra vc
    //Eager carregamento rapido, enquanto vc nao precisar ele ja vai deixar carregado pra vc
    @ManyToOne(fetch = FetchType.LAZY)
    private Tarefa tarefa;
    public Membro() {
    }

    public Membro(Integer id, String name, String permissao) {
        id = id;
        this.name = name;
        this.permissao = permissao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", permissao='" + permissao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membro membro = (Membro) o;
        return Objects.equals(id, membro.id) && Objects.equals(name, membro.name) && Objects.equals(permissao, membro.permissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, permissao);
    }
}
