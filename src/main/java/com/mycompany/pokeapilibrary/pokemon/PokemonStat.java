package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonStat {
    @SerializedName("base_stat")
    private int baseStat;
    private int effort;
    private NamedAPIResource stat;

    public int getBaseStat() {
        return baseStat;
    }

    public int getEffort() {
        return effort;
    }

    public NamedAPIResource getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return "PokemonStat{" + "baseStat=" + baseStat + ", effort=" + effort + ", stat=" + stat + '}';
    }
    
    
    
    
}
