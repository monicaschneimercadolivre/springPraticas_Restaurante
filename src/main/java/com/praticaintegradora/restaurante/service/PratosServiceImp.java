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

    public Pratos getPratosByName(String prato) {
        List<Pratos> listaPratos = pratosRepo.getPratos();
        Pratos prato1 = null;
        for (Pratos p : listaPratos) {
            if (p.getNome().equals(prato)) {
                prato1 = p;
                System.out.println(prato1);
            }

        }
        return prato1;
    }

    @Override
    public Double getCalorias(String prato) {
        Pratos prato1 = getPratosByName(prato);
        List<Ingredientes> pratoIng = prato1.getIngredientes();
            Double somaCalorias = pratoIng.stream().mapToDouble(Ingredientes::getCalories).sum();

        return somaCalorias;
    }



    @Override
    public Ingredientes getMaiorCaloria(String prato) {
        Pratos prato1 = getPratosByName(prato);
        List<Ingredientes> pratoIng = prato1.getIngredientes();
        Ingredientes ing =null;
        double valorCalMax =0;

      //  Double.compare(i.getCalories(),valorCalMax)>0

        for(Ingredientes i : pratoIng){
            if(i.getCalories()>valorCalMax){
                valorCalMax = i.getCalories();
                ing =i;
            }
        };

      return ing;

    }

//    @Override
//    public Optional<Ingredientes> getMaiorCaloria(Pratos prato) {
//        List<Ingredientes> listaIngredientes = ingredientesRepo.getIngredientes();
//
//        return listaIngredientes.stream().max(Comparator.comparing(ingredientes -> ingredientes.getCalories()));
//
//    }


}
