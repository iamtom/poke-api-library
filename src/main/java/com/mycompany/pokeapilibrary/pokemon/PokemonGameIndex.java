package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.SimpleInfo;

public class PokemonGameIndex {
    @SerializedName("game_index")
    private String gameIndex;
    private SimpleInfo version;

    public String getGameIndex() {
        return gameIndex;
    }

    public SimpleInfo getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "GameIndex{" + "gameIndex=" + gameIndex + ", version=" + version + '}';
    }
    
}
