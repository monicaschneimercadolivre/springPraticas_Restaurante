package com.praticaintegradora.restaurante.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.praticaintegradora.restaurante.model.Ingredientes;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class IngredientesRepository {
    private final static String linkIngredFile = "src/main/resources/ingredientes.json";

    public List<Ingredientes> getIngredientes (){
        ObjectMapper lendoJsonIngredientes = new ObjectMapper();
        List<Ingredientes> listIngredientes = new ArrayList<>();
        try {
            listIngredientes= Arrays.asList(lendoJsonIngredientes.readValue(new File(linkIngredFile), Ingredientes[].class));
        }catch (Exception e){

        }
        return listIngredientes;
        }
    }

