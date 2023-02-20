package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;

public class PokemonHeldItem {
    private NamedAPIResource item;
    @SerializedName("version_details")
    private ArrayList<HeldItemVersionDetails> versionDetails;

    public NamedAPIResource getItem() {
        return item;
    }

    public ArrayList<HeldItemVersionDetails> getVersionDetails() {
        return versionDetails;
    }

    @Override
    public String toString() {
        return "PokemonHeldItem{" + "item=" + item + ", versionDetails=" + versionDetails + '}';
    }
    
    
}
