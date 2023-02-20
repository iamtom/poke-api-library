package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;

public class MoveVersionGroupDetails {
    @SerializedName("level_learned_at")
    private int levelLearnedAt;
    
    @SerializedName("move_learn_method")
    private NamedAPIResource moveLearnMethod;
    
    @SerializedName("version_group")
    private NamedAPIResource versionGroup;

    public int getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public NamedAPIResource getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public NamedAPIResource getVersionGroup() {
        return versionGroup;
    }

    @Override
    public String toString() {
        return "MoveVersionGroupDetails{" + "levelLearnedAt=" + levelLearnedAt + ", moveLearnMethod=" + moveLearnMethod + ", versionGroup=" + versionGroup + '}';
    }       
}
