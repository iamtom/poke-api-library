package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Move {
    @SerializedName("learned_by_pokemon")
    private ArrayList<SimpleInfo> learnedByPokemon;

    public ArrayList<SimpleInfo> learnedByPokemon() {
        return learnedByPokemon;
    }
    
}
