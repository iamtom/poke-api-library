package com.mycompany.pokeapilibrary.move;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;

//https://pokeapi.co/api/v2/move/{id} or {move name}

public class Move {
    private String name;
    @SerializedName("learned_by_pokemon")
    private ArrayList<NamedAPIResource> learnedByPokemon;
    //TODO: add more properties as required

    public ArrayList<NamedAPIResource> learnedByPokemon() {
        return learnedByPokemon;
    }

    public void setLearnedByPokemon(ArrayList<NamedAPIResource> learnedByPokemon) {
        this.learnedByPokemon = learnedByPokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Move{" + "name=" + name + ", learnedByPokemon=" + learnedByPokemon + '}';
    }
}
