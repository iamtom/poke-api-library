package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonAbilityInfo {
    private NamedAPIResource ability;
    @SerializedName("is_hidden")
    private Boolean isHidden;
    private Double slot;

    public NamedAPIResource getAbilitySimple() {
        return ability;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public Double getSlot() {
        return slot;
    }

    @Override
    public String toString() {
        return "AbilityInfo{" + "ability=" + ability + ", is_hidden=" + isHidden + ", slot=" + slot + '}';
    }
    
    
    
}
