package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonStat {

    private NamedAPIResource stat;
    @SerializedName("base_stat")
    private int effort;
    private int baseStat;

    public NamedAPIResource getStat() {
        return stat;
    }

    public void setStat(NamedAPIResource stat) {
        this.stat = stat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
    }

    @Override
    public String toString() {
        return "PokemonStat{" + "stat=" + stat + ", effort=" + effort + ", baseStat=" + baseStat + '}';
    }

}
