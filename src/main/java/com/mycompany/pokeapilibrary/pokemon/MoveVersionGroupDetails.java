package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.SimpleInfo;

public class MoveVersionGroupDetails {
    @SerializedName("level_learned_at")
    private int levelLearnedAt;
    
    @SerializedName("move_learn_method")
    private SimpleInfo moveLearnMethod;
    
    @SerializedName("version_group")
    private SimpleInfo versionGroup;

    public int getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public SimpleInfo getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public SimpleInfo getVersionGroup() {
        return versionGroup;
    }

    @Override
    public String toString() {
        return "MoveVersionGroupDetails{" + "levelLearnedAt=" + levelLearnedAt + ", moveLearnMethod=" + moveLearnMethod + ", versionGroup=" + versionGroup + '}';
    }       
}
