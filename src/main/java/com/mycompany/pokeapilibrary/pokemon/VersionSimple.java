package com.mycompany.pokeapilibrary.pokemon;

public class VersionSimple {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "GameVersion{" + "name=" + name + ", url=" + url + '}';
    }
    
    
}
