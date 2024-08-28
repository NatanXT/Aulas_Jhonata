package com.aulas.aulas.GerenciadorDeTarefas.Repository;

import com.aulas.aulas.GerenciadorDeTarefas.Modelos.Membro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembroRepository extends JpaRepository<Membro, Integer> {

    List<Membro> findByNomeContaining(String nome);

}
