package com.mycompany.pokeapilibrary;

public class NamedAPIResource {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SimpleInfo{" + "name=" + name + ", url=" + url + '}';
    }    
}
