package com.mycompany.pokeapilibrary.pokemon;

import com.mycompany.pokeapilibrary.SimpleInfo;

public class HeldItemVersionDetails {
    private String rarity;
    private SimpleInfo version;

    public String getRarity() {
        return rarity;
    }

    public SimpleInfo getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "HeldItemVersionDetails{" + "rarity=" + rarity + ", version=" + version + '}';
    }
    
    
}
