package com.praticaintegradora.restaurante.service;

import com.praticaintegradora.restaurante.model.Ingredientes;
import com.praticaintegradora.restaurante.repository.IngredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesServiceImp implements IngredientesServiceI {
    @Autowired
    private IngredientesRepository ingredientesRepo;


    @Override
    public List<Ingredientes> getIngredientes() {
        List<Ingredientes> listaIngredientes = ingredientesRepo.getIngredientes();
        return listaIngredientes;
    }
}
