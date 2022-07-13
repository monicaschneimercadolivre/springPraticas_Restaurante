package com.praticaintegradora.restaurante.model;

import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pratos {
    private String nome;
    private List<Ingredientes> ingredientes;
}


