package com.praticaintegradora.restaurante.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.praticaintegradora.restaurante.model.Ingredientes;
import com.praticaintegradora.restaurante.model.Pratos;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PratosRepository {
        private static final String linkPratosFile="src/main/resources/pratos.json";


        public List<Pratos> getPratos (){
           ObjectMapper lendoJsonPratos = new ObjectMapper();
            List<Pratos> listPratos = new ArrayList<>();
            try {
                listPratos= Arrays.asList(lendoJsonPratos.readValue(new File(linkPratosFile), Pratos[].class));
            }catch (Exception e){

            }
            return listPratos;
        }


    public boolean exists(Pratos prato) {
        boolean existe = false;

        try {
            existe = (prato.getNome()) != null;

        } catch (Exception e) {
        }

        return existe;
    }


    public Pratos getPratoByName (){

            return null;
    }
    }

