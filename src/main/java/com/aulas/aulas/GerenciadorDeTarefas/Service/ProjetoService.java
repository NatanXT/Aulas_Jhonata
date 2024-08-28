package com.aulas.aulas.GerenciadorDeTarefas.Service;

import com.aulas.aulas.GerenciadorDeTarefas.Modelos.Projeto;
import com.aulas.aulas.GerenciadorDeTarefas.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> findAll(){
        return projetoRepository.findAll();
    }
    public Projeto findById(int Id){
        return projetoRepository.findById(Id).orElseThrow();
    }
    public Projeto save(Projeto projeto){
        return this.projetoRepository.save(projeto);
    }
    public void delete(Projeto projeto){
        projetoRepository.delete(projeto);
    }
    public Projeto update(Projeto projeto){
        return this.projetoRepository.save(projeto);
    }
    public List<Projeto> findByNome(String nome){
        return this.projetoRepository.findByNome(nome);
    }

}
