package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class VersionGameIndex {

    @SerializedName("game_index")
    private int gameIndex;
    private NamedAPIResource version;

    public int getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(int gameIndex) {
        this.gameIndex = gameIndex;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "VersionGameIndex{" + "gameIndex=" + gameIndex + ", version=" + version + '}';
    }

}
