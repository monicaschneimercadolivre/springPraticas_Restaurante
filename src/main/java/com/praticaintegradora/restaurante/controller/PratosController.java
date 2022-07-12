package com.praticaintegradora.restaurante.controller;

import com.praticaintegradora.restaurante.model.Ingredientes;
import com.praticaintegradora.restaurante.model.Pratos;
import com.praticaintegradora.restaurante.service.IngredientesServiceI;
import com.praticaintegradora.restaurante.service.PratosServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Pratos")
public class PratosController {

    @Autowired
    PratosServiceI servicePratos;


    @GetMapping("/{prato}")
    public ResponseEntity<List<Pratos>> getPratos (@PathVariable String prato){
        List<Pratos> listaPratos = servicePratos.getPratos();
        return ResponseEntity.ok(listaPratos);
    }

    @GetMapping("/calories/{prato}")
    public ResponseEntity<Double> getCalorias(@PathVariable Pratos prato){
        Double pratosCalorias =  servicePratos.getCalorias(prato);
        return ResponseEntity.ok(pratosCalorias);

    }

    @GetMapping ("/{prato}/maiorCaloria")
    public ResponseEntity<Optional<Ingredientes>> getMaiorCaloria(@PathVariable String prato){
        List<Pratos> listaPratos = servicePratos.getPratos();
//        Optional<Ingredientes> maiorCaloria = servicePratos.getMaiorCaloria(listaPratos.get(prato));
//        return ResponseEntity.ok(maiorCaloria);
        return null;

    }
}
