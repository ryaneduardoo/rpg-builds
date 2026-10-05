package com.ryan.rpg_builds.controller;

import com.ryan.rpg_builds.model.Composicao;
import com.ryan.rpg_builds.repository.ComposicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/composicoes")

public class ComposicaoController {
    @Autowired
    private ComposicaoRepository repository;

    @GetMapping
    public List<Composicao> listar(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Composicao buscarPorID(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarPorID(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PostMapping
    public Composicao salvar(@RequestBody Composicao composicao) {
        return repository.save(composicao);
    }
}
