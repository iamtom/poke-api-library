package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.SimpleInfo;
import java.util.ArrayList;

public class PokemonHeldItem {
    private SimpleInfo item;
    @SerializedName("version_details")
    private ArrayList<HeldItemVersionDetails> versionDetails;

    public SimpleInfo getItem() {
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
