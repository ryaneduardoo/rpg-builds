package com.ryan.rpg_builds.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Composicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome = "Equipe principal";
    private String sacerdote = "Helar";
    private String arqueiro = "Hox";
    private String feiticeiro = "Ignis";
    private String cavaleiro = "Valen";


}
