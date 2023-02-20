package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class PokemonMoveVersion {

    @SerializedName("move_learn_method")
    private NamedAPIResource moveLearnMethod;
    @SerializedName("version_group")
    private NamedAPIResource versionGroup;
    @SerializedName("level_learned_at")
    private int levelLearnedAt;

    public NamedAPIResource getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(NamedAPIResource moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public NamedAPIResource getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedAPIResource versionGroup) {
        this.versionGroup = versionGroup;
    }

    public int getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(int levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    @Override
    public String toString() {
        return "PokemonMoveVersion{" + "moveLearnMethod=" + moveLearnMethod + ", versionGroup=" + versionGroup + ", levelLearnedAt=" + levelLearnedAt + '}';
    }

}
