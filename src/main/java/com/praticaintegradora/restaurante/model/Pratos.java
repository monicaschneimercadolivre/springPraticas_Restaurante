package com.praticaintegradora.restaurante.model;

import lombok.*;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pratos {
    private String nome;
    private List<Ingredientes> ingredientes;
}


