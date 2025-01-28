package com.example.java_practice.modell;

import java.util.Arrays;
import java.util.List;

public record Pokemon(String name) {
    public static List<Pokemon> pokemonList = Arrays.asList(
            new Pokemon("Pokemon1"),
            new Pokemon("Pokemon2")
    );

    public static List<Pokemon> getPokemonList() {
        return Pokemon.pokemonList;
    }
}
