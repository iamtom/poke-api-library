package com.mycompany.pokeapilibrary.move;

import com.google.gson.Gson;
import com.mycompany.pokeapilibrary.Request;
import com.mycompany.pokeapilibrary.SimpleInfo;
import java.util.ArrayList;

//https://pokeapi.co/api/v2/move/ this returns all moves plus some additional info
//results contains name and url of each move

public class PagesOfMoves {
    private int count;
    private String next;
    private String previous;
    private ArrayList<SimpleInfo> results;

    public int getCount() {
        return count;
    }
    
    public String getNextURL() {
        return next;
    }

    public String getPreviousURL() {
        return previous;
    }
    
    public ArrayList<SimpleInfo> getResults() {
        return results;
    }
    
    private void newPage(String page) {
        Request request = new Request();
        String response = request.search(page);
        Gson gson = new Gson();
        
        PagesOfMoves newPage = gson.fromJson(response, PagesOfMoves.class);
        
        this.count = newPage.getCount();
        this.next = newPage.getNextURL();
        this.previous = newPage.getPreviousURL();
        this.results = newPage.getResults();
    }
    
    public void nextPage() {
        this.newPage(this.next);
    }

    public void previousPage() {
        this.newPage(this.previous);
    }

    @Override
    public String toString() {
        return "Moves{" + "count=" + count + ", next=" + next + ", previous=" + previous + ", results=" + results + '}';
    }
    
    
    
}
