package com.mycompany.pokeapilibrary.pokemon;

import com.google.gson.annotations.SerializedName;
import com.mycompany.pokeapilibrary.NamedAPIResource;
import java.util.ArrayList;
import java.util.Random;

public class Pokemon {

    private int id;
    private String name;
    @SerializedName("base_experience")
    private int baseExperience;
    private int height;
    @SerializedName("is_default")
    private Boolean isDefault;
    private int order;
    private int weight;
    private ArrayList<PokemonAbility> abilities;
    private ArrayList<NamedAPIResource> forms;
    @SerializedName("game_indices")
    private ArrayList<VersionGameIndex> gameIndices;
    @SerializedName("held_items")
    private ArrayList<PokemonHeldItem> heldItems;
    @SerializedName("location_area_encounters")
    private String locationAreaEncounters;
    private ArrayList<PokemonMove> moves;
    @SerializedName("past_types")
    private ArrayList<PokemonTypePast> pastTypes;
    private PokemonSprites sprites;
    private NamedAPIResource species;
    private ArrayList<PokemonStat> stats;
    private ArrayList<PokemonType> types;

    private transient Random random;

    public Pokemon() {
        this.random = new Random();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<NamedAPIResource> getForms() {
        return forms;
    }

    public void setForms(ArrayList<NamedAPIResource> forms) {
        this.forms = forms;
    }

    public ArrayList<VersionGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(ArrayList<VersionGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public ArrayList<PokemonHeldItem> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(ArrayList<PokemonHeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public ArrayList<PokemonMove> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<PokemonMove> moves) {
        this.moves = moves;
    }

    public ArrayList<PokemonTypePast> getPastTypes() {
        return pastTypes;
    }

    public void setPastTypes(ArrayList<PokemonTypePast> pastTypes) {
        this.pastTypes = pastTypes;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public NamedAPIResource getSpecies() {
        return species;
    }

    public void setSpecies(NamedAPIResource species) {
        this.species = species;
    }

    public ArrayList<PokemonStat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<PokemonStat> stats) {
        this.stats = stats;
    }

    public ArrayList<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<PokemonType> types) {
        this.types = types;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    //TODO: move three below methods out to pokemon-quiz-app
    public ArrayList<PokemonMove> movesContainingMinLevel(int minLevel) {
        ArrayList<PokemonMove> movesList = this.moves;
        ArrayList<PokemonMove> filteredMoves = new ArrayList<>();

        //this removes all moves where the move can never be learned at minLevel or higher
        //these are often "learned at" level 0 - i.e. TM or tutor moves
        //this is useful for e.g. "abc learns move at level x. It can also learn it via TM"
        int i = 0;
        while (i < movesList.size()) {
            PokemonMove move = movesList.get(i);
            ArrayList<PokemonMoveVersion> versionDetails = move.getVersionGroupDetails();

            for (int j = 0; j < versionDetails.size(); j++) {
                PokemonMoveVersion version = versionDetails.get(j);
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

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", baseExperience=" + baseExperience + ", height=" + height + ", isDefault=" + isDefault + ", order=" + order + ", weight=" + weight + ", abilities=" + abilities + ", forms=" + forms + ", gameIndices=" + gameIndices + ", heldItems=" + heldItems + ", locationAreaEncounters=" + locationAreaEncounters + ", moves=" + moves + ", pastTypes=" + pastTypes + ", sprites=" + sprites + ", species=" + species + ", stats=" + stats + ", types=" + types + ", random=" + random + '}';
    }

}
