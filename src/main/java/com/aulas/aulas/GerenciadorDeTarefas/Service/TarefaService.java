package com.aulas.aulas.GerenciadorDeTarefas.Service;

import com.aulas.aulas.GerenciadorDeTarefas.Modelos.Membro;
import com.aulas.aulas.GerenciadorDeTarefas.Modelos.Tarefa;
import com.aulas.aulas.GerenciadorDeTarefas.Repository.MembroRepository;
import com.aulas.aulas.GerenciadorDeTarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;
    public List<Tarefa> findAll(){
        return tarefaRepository.findAll();
    }
    public Tarefa findById(int Id){
        return this.tarefaRepository.findById(Id).orElseThrow();
    }

    public Tarefa save(Tarefa tarefa){
        return this.tarefaRepository.save(tarefa);
    }
    public void delete(Tarefa tarefa){
        this.tarefaRepository.delete(tarefa);
    }
    public Tarefa update(Tarefa tarefa){
        return this.tarefaRepository.save(tarefa);
    }

    public List<Tarefa> findByStatus(String status){
        return this.tarefaRepository.findByStatus(status);
    }
}
