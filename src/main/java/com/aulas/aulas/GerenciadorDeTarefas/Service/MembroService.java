package com.aulas.aulas.GerenciadorDeTarefas.Service;

import com.aulas.aulas.GerenciadorDeTarefas.Modelos.Membro;
import com.aulas.aulas.GerenciadorDeTarefas.Repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {
    @Autowired
    private MembroRepository membroRepository;

    public List<Membro> findAll(){
        return membroRepository.findAll();
    }
    public Membro findById(Integer Id){
        return this.membroRepository.findById(Id).orElseThrow();
    }

    public Membro save(Membro membro){
        return this.membroRepository.save(membro);
    }
    public void delete(Membro membro){
        this.membroRepository.delete(membro);
    }
    public Membro update(Membro membro){
        return this.membroRepository.save(membro);
    }

    public List<Membro> findByName(String nome){
        return this.membroRepository.findByNomeContaining(nome);
    }
}
