package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;

public class PokemonSprites {

    @SerializedName("front_default")
    private String frontDefault;
    @SerializedName("front_shiny")
    private String frontShiny;
    @SerializedName("front_female")
    private String frontFemale;
    @SerializedName("front_shiny_female")
    private String frontShinyFemale;
    @SerializedName("back_default")
    private String backDefault;
    @SerializedName("back_shiny")
    private String backShiny;
    @SerializedName("back_female")
    private String backFemale;
    @SerializedName("back_shiny_female")
    private String backShinyFemale;

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }

    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    public String getBackFemale() {
        return backFemale;
    }

    public void setBackFemale(String backFemale) {
        this.backFemale = backFemale;
    }

    public String getBackShinyFemale() {
        return backShinyFemale;
    }

    public void setBackShinyFemale(String backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    @Override
    public String toString() {
        return "PokemonSprites{" + "frontDefault=" + frontDefault + ", frontShiny=" + frontShiny + ", frontFemale=" + frontFemale + ", frontShinyFemale=" + frontShinyFemale + ", backDefault=" + backDefault + ", backShiny=" + backShiny + ", backFemale=" + backFemale + ", backShinyFemale=" + backShinyFemale + '}';
    }

}
