package com.mycompany.pokeapilibrary.pokemon;

import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonHeldItemVersion {

    private NamedAPIResource version;
    private int rarity;

    public NamedAPIResource getVersion() {
        return version;
    }

    public void setVersion(NamedAPIResource version) {
        this.version = version;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return "PokemonHeldItemVersion{" + "version=" + version + ", rarity=" + rarity + '}';
    }

}
