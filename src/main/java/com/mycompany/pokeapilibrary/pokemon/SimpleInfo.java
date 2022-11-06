
package com.mycompany.pokeapilibrary.pokemon;

public class SimpleInfo {
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
        return "SimpleInfo{" + "name=" + name + ", url=" + url + '}';
    }    
}
