package com.mycompany.pokeapilibrary.pokemon;

import com.mycompany.pokeapilibrary.NamedAPIResource;

public class HeldItemVersionDetails {
    private String rarity;
    private NamedAPIResource version;

    public String getRarity() {
        return rarity;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "HeldItemVersionDetails{" + "rarity=" + rarity + ", version=" + version + '}';
    }
    
    
}
