package com.mycompany.pokeapilibrary;

import com.mycompany.pokeapilibrary.pokemon.Pokemon;

public class PokeApiLibrary {

    public static void main(String[] args) {
        Request request = new Request();
        Pokemon pikachu = request.searchPokemon("pikachu");
        System.out.println(pikachu.getId());
    }
}
