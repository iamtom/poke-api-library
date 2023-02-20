package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonGameIndex {
    @SerializedName("game_index")
    private String gameIndex;
    private NamedAPIResource version;

    public String getGameIndex() {
        return gameIndex;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "GameIndex{" + "gameIndex=" + gameIndex + ", version=" + version + '}';
    }
    
}
