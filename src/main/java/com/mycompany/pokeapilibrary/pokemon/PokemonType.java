package com.mycompany.pokeapilibrary.pokemon;

import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonType {
   private int slot;
   private NamedAPIResource type;

    public int getSlot() {
        return slot;
    }

    public NamedAPIResource getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PokemonType{" + "slot=" + slot + ", type=" + type + '}';
    }
   
   
}
