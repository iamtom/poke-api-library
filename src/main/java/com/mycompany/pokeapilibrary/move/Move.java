package com.mycompany.pokeapilibrary.move;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.SimpleInfo;
import java.util.ArrayList;

//https://pokeapi.co/api/v2/move/{id} or {move name}

public class Move {
    @SerializedName("learned_by_pokemon")
    private ArrayList<SimpleInfo> learnedByPokemon;

    public ArrayList<SimpleInfo> learnedByPokemon() {
        return learnedByPokemon;
    }

    public void setLearnedByPokemon(ArrayList<SimpleInfo> learnedByPokemon) {
        this.learnedByPokemon = learnedByPokemon;
    }   
}
