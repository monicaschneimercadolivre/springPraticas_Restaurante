package com.praticaintegradora.restaurante.controller;

import com.praticaintegradora.restaurante.model.Ingredientes;
import com.praticaintegradora.restaurante.service.IngredientesServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Ingredientes")
public class IngredientesController {

    @Autowired
    private IngredientesServiceI serviceIngredientes;

    @GetMapping ("/all")
    public ResponseEntity<List<Ingredientes>> getIngredientes (){
        List<Ingredientes> listaIngredientes = serviceIngredientes.getIngredientes();
        return ResponseEntity.ok(listaIngredientes);
    }



}
