package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;
import java.util.Random;

public class PokemonMove {
    private NamedAPIResource move;
    @SerializedName("version_group_details")
    private ArrayList<PokemonMoveVersion> versionGroupDetails;
    
    private transient Random random;
    
    public PokemonMove() {
        this.random = new Random();
    }

    public NamedAPIResource getMove() {
        return move;
    }

    public void setMove(NamedAPIResource move) {
        this.move = move;
    }

    public ArrayList<PokemonMoveVersion> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(ArrayList<PokemonMoveVersion> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    //TODO: move the below two methods out to pokemon-quiz-app
    public void removeVersionsBelowMinLevel(int minLevel) {
        ArrayList<PokemonMoveVersion> tempList = new ArrayList<>();
        
        for (int i = 0; i < this.versionGroupDetails.size(); i++) {
            int levelLearnedAt = this.versionGroupDetails.get(i).getLevelLearnedAt();
            if (levelLearnedAt >= minLevel) {
                tempList.add(this.versionGroupDetails.get(i));
            }
        }
        this.versionGroupDetails = new ArrayList<>(tempList);
    }
    
    public PokemonMoveVersion randomMoveVersionGroupDetails() {
        int maxVersions = this.getVersionGroupDetails().size();
        int randomVersionNo = 0;
        if (maxVersions > 1) {
            randomVersionNo = this.random.nextInt(maxVersions - 1);
        }        
        PokemonMoveVersion versionDetails = this.getVersionGroupDetails().get(randomVersionNo);
        
        return versionDetails;
    }

    @Override
    public String toString() {
        return "PokemonMove{" + "move=" + move + ", versionGroupDetails=" + versionGroupDetails + ", random=" + random + '}';
    }
    

}