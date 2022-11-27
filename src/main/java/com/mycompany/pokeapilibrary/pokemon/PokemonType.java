package com.mycompany.pokeapilibrary.pokemon;

import com.mycompany.pokeapilibrary.SimpleInfo;

public class PokemonType {
   private int slot;
   private SimpleInfo type;

    public int getSlot() {
        return slot;
    }

    public SimpleInfo getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PokemonType{" + "slot=" + slot + ", type=" + type + '}';
    }
   
   
}
