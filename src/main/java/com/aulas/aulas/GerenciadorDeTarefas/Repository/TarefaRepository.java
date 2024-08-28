package com.aulas.aulas.GerenciadorDeTarefas.Repository;

import com.aulas.aulas.GerenciadorDeTarefas.Modelos.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {


    List<Tarefa> findByStatus(String status);
}
