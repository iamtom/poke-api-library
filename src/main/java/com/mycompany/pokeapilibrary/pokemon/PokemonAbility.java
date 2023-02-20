package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonAbility {

    @SerializedName("is_hidden")
    private Boolean isHidden;
    private int slot;
    private NamedAPIResource ability;

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public NamedAPIResource getAbility() {
        return ability;
    }

    public void setAbility(NamedAPIResource ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "PokemonAbility{" + "isHidden=" + isHidden + ", slot=" + slot + ", ability=" + ability + '}';
    }

}
