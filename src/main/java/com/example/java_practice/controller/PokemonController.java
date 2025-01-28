package com.example.java_practice.controller;

import com.example.java_practice.modell.Pokemon;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PokemonController {

    @QueryMapping
    public List<Pokemon> getAllPokemons() {
        return Pokemon.getPokemonList();
    }
}
