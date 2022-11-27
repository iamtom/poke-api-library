package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.SimpleInfo;

public class PokemonAbilityInfo {
    private SimpleInfo ability;
    @SerializedName("is_hidden")
    private Boolean isHidden;
    private Double slot;

    public SimpleInfo getAbilitySimple() {
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
