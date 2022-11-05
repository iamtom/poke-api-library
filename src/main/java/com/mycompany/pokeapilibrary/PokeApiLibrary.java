package com.mycompany.pokeapilibrary;

import com.mycompany.pokeapilibrary.pokemon.Pokemon;

public class PokeApiLibrary {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Request request = new Request();
        Pokemon pokemon = request.searchPokemon(1);
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getMoves().get(4));
        
        Pokemon pokemon2 = request.searchPokemon("bulbasaur");
        System.out.println(pokemon.getName());
        
        Pokemon pokemon3 = request.randomPokemon();
        System.out.println(pokemon.getName());        
        
        int no = request.noOfPokemon();
        System.out.println(no);
    }
}
