package com.mycompany.pokeapilibrary.pokemon;

import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;

public class PokemonTypePast {

    private NamedAPIResource generation;
    private ArrayList<PokemonType> types;

    public NamedAPIResource getGeneration() {
        return generation;
    }

    public void setGeneration(NamedAPIResource generation) {
        this.generation = generation;
    }

    public ArrayList<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<PokemonType> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "PokemonTypePast{" + "generation=" + generation + ", types=" + types + '}';
    }

}
