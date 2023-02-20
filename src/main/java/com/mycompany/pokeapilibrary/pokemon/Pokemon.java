package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;
import java.util.Random;

public class Pokemon {   
    private ArrayList<PokemonAbilityInfo> abilities; 
    
    @SerializedName("base_experience")
    private Double baseExperience;
    
    private ArrayList<NamedAPIResource> forms;
    
    @SerializedName("game_indices")
    private ArrayList<PokemonGameIndex> gameIndices;
    
    private Double height;
    
    @SerializedName("held_items")
    private ArrayList<PokemonHeldItem> heldItems; 
    
    private String id;
    
    @SerializedName("is_default")
    private Boolean isDefault;
    
    @SerializedName("location_area_encounters")
    private String locationAreaEncounters;
    
    private ArrayList<PokemonMove> moves;
    private String name;
    private Double order;
    
    @SerializedName("past_types")
    private ArrayList<PastType> pastTypes;
    
    private NamedAPIResource species;
    private Object sprites; //TO DO - create proper Sprites object
    private ArrayList<PokemonStat> stats;
    private ArrayList<PokemonType> types;
    private Double weight;
    
    private transient Random random;
    
    public Pokemon() {
        this.random = new Random();
    }
    
    public ArrayList<PokemonMove> movesContainingMinLevel(int minLevel) {
        ArrayList<PokemonMove> movesList = this.moves;
        ArrayList<PokemonMove> filteredMoves = new ArrayList<>();
        
        //this removes all moves where the move can never be learned at minLevel or higher
        //these are often "learned at" level 0 - i.e. TM or tutor moves
        //this is useful for e.g. "abc learns move at level x. It can also learn it via TM"
        int i = 0;
        while (i < movesList.size()) {
            PokemonMove move = movesList.get(i);
            ArrayList<MoveVersionGroupDetails> versionDetails = move.getVersionGroupDetails();
            
            for (int j = 0; j < versionDetails.size(); j++) {
                MoveVersionGroupDetails version = versionDetails.get(j);
                int levelLearnedAt = version.getLevelLearnedAt();
                if (levelLearnedAt >= minLevel) {
                    filteredMoves.add(move);
                }
            }
            i++;
        }
               
        return filteredMoves;
    }
    
    public void removeMovesBelowLevel(int minLevel) {
        ArrayList<PokemonMove> tempList = new ArrayList<>();
        for (int i = 0; i < this.moves.size(); i++) {
            //remove any version details where the levelLearnedAt is below minLevel
            this.moves.get(i).removeVersionsBelowMinLevel(minLevel);
            //if this makes the versionGroupDetails arraylist empty then remove the whole move
            if (!this.moves.get(i).getVersionGroupDetails().isEmpty()) {
                tempList.add(this.moves.get(i));
            }
        }
        this.moves = new ArrayList<>(tempList);
    }
    
    public PokemonMove randomMove() {        
        int maxMoves = this.getMoves().size();
        
        int randomMoveNo = 0;
        if (maxMoves > 1) {
            randomMoveNo = random.nextInt(maxMoves - 1);
        }
        
        PokemonMove move = this.getMoves().get(randomMoveNo); 
        
        return move;
    }

    public ArrayList<PokemonAbilityInfo> getAbilities() {
        return abilities;
    }

    public Double getBaseExperience() {
        return baseExperience;
    }

    public ArrayList<NamedAPIResource> getForms() {
        return forms;
    }

    public ArrayList<PokemonGameIndex> getGameIndices() {
        return gameIndices;
    }

    public Double getHeight() {
        return height;
    }

    public ArrayList getHeldItems() {
        return heldItems;
    }

    public String getId() {
        return id;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public ArrayList<PokemonMove> getMoves() {
        return moves;
    }
    
    public String getName() {
        return name;
    }

    public Double getOrder() {
        return order;
    }

    public ArrayList getPastTypes() {
        return pastTypes;
    }

    public NamedAPIResource getSpecies() {
        return species;
    }

    public Object getSprites() {
        return sprites;
    }

    public ArrayList getStats() {
        return stats;
    }

    public ArrayList<PokemonType> getTypes() {
        return types;
    }

    public Double getWeight() {
        return weight;
    }  
}
