package com.aulas.aulas.GerenciadorDeTarefas.Repository;

import com.aulas.aulas.GerenciadorDeTarefas.Modelos.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {

    List<Projeto> findByNome(String nome);


}
