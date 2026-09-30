package com.ryan.rpg_builds.repository;

import com.ryan.rpg_builds.model.Composicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ComposicaoRepository extends JpaRepository<Composicao, Long> {

}
