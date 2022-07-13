package com.praticaintegradora.restaurante.utils;

import com.praticaintegradora.restaurante.model.Ingredientes;
import com.praticaintegradora.restaurante.model.Pratos;

import java.util.ArrayList;
import java.util.List;

public class GeneratorTest {

    public static Pratos getPratosWithIngredientes(String nome) {
        Ingredientes ingrediente1 = new Ingredientes("", 8.0);
        Ingredientes ingrediente2 = new Ingredientes("", 6.0);
        Ingredientes ingrediente3 = new Ingredientes("", 4.0);

        List<Ingredientes> ingredientes = new ArrayList<>();
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        ingredientes.add(ingrediente3);

        Pratos p = new Pratos();
        p.setNome(nome);

        return p;
    }

    public static List<Pratos> getPratos() {
        Pratos p1 = getPratosWithIngredientes("lasanha");
        Pratos p2 = getPratosWithIngredientes("empada");
        Pratos p3 = getPratosWithIngredientes("feijao");

        List<Pratos> pratos = new ArrayList<>();

            pratos.add(p1);
            pratos.add(p2);
            pratos.add(p3);

            return pratos;

    }
}
