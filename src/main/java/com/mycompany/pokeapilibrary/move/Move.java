package com.mycompany.pokeapilibrary.move;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;

//https://pokeapi.co/api/v2/move/{id} or {move name}

public class Move {
    @SerializedName("learned_by_pokemon")
    private ArrayList<NamedAPIResource> learnedByPokemon;

    public ArrayList<NamedAPIResource> learnedByPokemon() {
        return learnedByPokemon;
    }

    public void setLearnedByPokemon(ArrayList<NamedAPIResource> learnedByPokemon) {
        this.learnedByPokemon = learnedByPokemon;
    }   

    @Override
    public String toString() {
        return "Move{" + "learnedByPokemon=" + learnedByPokemon + '}';
    }
}
