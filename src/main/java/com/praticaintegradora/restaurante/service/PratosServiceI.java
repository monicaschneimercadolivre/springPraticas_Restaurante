package com.praticaintegradora.restaurante.service;

import com.praticaintegradora.restaurante.model.Ingredientes;
import com.praticaintegradora.restaurante.model.Pratos;

import java.util.List;
import java.util.Optional;

public interface PratosServiceI {
   List<Pratos> getPratos();
   Double getCalorias(Pratos prato);

   Optional<Ingredientes> getMaiorCaloria();

}