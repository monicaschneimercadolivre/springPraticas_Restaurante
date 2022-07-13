package com.praticaintegradora.restaurante.repository;

import com.praticaintegradora.restaurante.model.Pratos;
import com.praticaintegradora.restaurante.utils.GeneratorTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PratosRepositoryTest {

    @BeforeEach
    void setup () {
        Pratos prato = new Pratos();
        //apagar json
    }

    @Test
    void getPratos() {
        List<Pratos> pratoTeste = GeneratorTest.getPratos();

        boolean pratosFound =


    }
}