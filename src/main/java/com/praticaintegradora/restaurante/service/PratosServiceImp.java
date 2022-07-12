package com.praticaintegradora.restaurante.service;

import com.praticaintegradora.restaurante.model.Ingredientes;
import com.praticaintegradora.restaurante.model.Pratos;
import com.praticaintegradora.restaurante.repository.IngredientesRepository;
import com.praticaintegradora.restaurante.repository.PratosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class PratosServiceImp implements PratosServiceI{

    @Autowired
    PratosRepository pratosRepo;

    @Autowired
    IngredientesRepository ingredientesRepo;


    @Override
    public List<Pratos> getPratos() {
        List<Pratos> listaPratos = pratosRepo.getPratos();


        return listaPratos;
    }


    @Override
    public Double getCalorias(Pratos prato) {
        List<Pratos> listaPratos = pratosRepo.getPratos();
        List<Ingredientes> ingredientesList = ingredientesRepo.getIngredientes();

        Pratos prato1 = null;
//
//        List<Pratos> listaPrato1 =  listaPratos.stream().filter(p -> p.getNome().equals(prato.getNome())).collect(Collectors.toList());
            for(Pratos p : listaPratos){
                if(p.getNome().equals(prato.getNome())){
                    prato1=p;
                };
            }
            List<Ingredientes> pratoIng = prato1.getIngredientes();
            Double somaCalorias = pratoIng.stream().mapToDouble(Ingredientes::getCalories).sum();

        return somaCalorias;
    }

    @Override
    public Optional<Ingredientes> getMaiorCaloria() {
        return Optional.empty();
    }

//    @Override
//    public Optional<Ingredientes> getMaiorCaloria(Pratos prato) {
//        List<Ingredientes> listaIngredientes = ingredientesRepo.getIngredientes();
//
//        return listaIngredientes.stream().max(Comparator.comparing(ingredientes -> ingredientes.getCalories()));
//
//    }


}
