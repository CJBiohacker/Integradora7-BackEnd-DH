package com.example.mesaIntegradora7.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dentista {
    private int id;
    private String nome;
    private String email;
    private int matricula;
    private boolean atendeConvenio;
}
