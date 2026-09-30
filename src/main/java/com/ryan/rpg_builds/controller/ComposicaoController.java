package com.ryan.rpg_builds.controller;

import com.ryan.rpg_builds.model.Composicao;
import com.ryan.rpg_builds.repository.ComposicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/composicoes")

public class ComposicaoController {
    @Autowired
    private ComposicaoRepository repository;

    @PostMapping
    public Composicao salvar(@RequestBody Composicao composicao) {
        return repository.save(composicao);
    }
}
