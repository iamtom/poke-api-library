package com.mycompany.pokeapilibrary;

import com.google.gson.Gson;
import java.util.ArrayList;

//https://pokeapi.co/api/v2/move/ this returns all moves plus some additional info
//results contains name and url of each move

public class NamedAPIResourceList {
    private int count;
    private String next;
    private String previous;
    private ArrayList<NamedAPIResource> results;

    public int getCount() {
        return count;
    }
    
    public String getNextURL() {
        return next;
    }

    public String getPreviousURL() {
        return previous;
    }
    
    public ArrayList<NamedAPIResource> getResults() {
        return results;
    }
    
    public void nextPage() {
        this.newPage(this.next);
    }

    public void previousPage() {
        this.newPage(this.previous);
    }
    
    private void newPage(String page) {
        Request request = new Request();
        String response = request.search(page);
        Gson gson = new Gson();
        
        NamedAPIResourceList newPage = gson.fromJson(response, NamedAPIResourceList.class);
        
        this.count = newPage.getCount();
        this.next = newPage.getNextURL();
        this.previous = newPage.getPreviousURL();
        this.results = newPage.getResults();
    }

    @Override
    public String toString() {
        return "Moves{" + "count=" + count + ", next=" + next + ", previous=" + previous + ", results=" + results + '}';
    }
    
    
    
}
