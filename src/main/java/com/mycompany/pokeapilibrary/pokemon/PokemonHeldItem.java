package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;

public class PokemonHeldItem {

    private NamedAPIResource item;
    @SerializedName("version_details")
    private ArrayList<PokemonHeldItemVersion> versionDetails;

    public NamedAPIResource getItem() {
        return item;
    }

    public void setItem(NamedAPIResource item) {
        this.item = item;
    }

    public ArrayList<PokemonHeldItemVersion> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(ArrayList<PokemonHeldItemVersion> versionDetails) {
        this.versionDetails = versionDetails;
    }

    @Override
    public String toString() {
        return "PokemonHeldItem{" + "item=" + item + ", versionDetails=" + versionDetails + '}';
    }

}
