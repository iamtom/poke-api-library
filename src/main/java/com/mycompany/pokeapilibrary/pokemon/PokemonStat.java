package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.SimpleInfo;

public class PokemonStat {
    @SerializedName("base_stat")
    private int baseStat;
    private int effort;
    private SimpleInfo stat;

    public int getBaseStat() {
        return baseStat;
    }

    public int getEffort() {
        return effort;
    }

    public SimpleInfo getStat() {
        return stat;
    }

    @Override
    public String toString() {
        return "PokemonStat{" + "baseStat=" + baseStat + ", effort=" + effort + ", stat=" + stat + '}';
    }
    
    
    
    
}
