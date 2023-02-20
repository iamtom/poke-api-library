package com.mycompany.pokeapilibrary;

import com.mycompany.pokeapilibrary.pokemon.Pokemon;
import com.google.gson.Gson;
import com.mycompany.pokeapilibrary.move.Move;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Request {
    
    private Random random;
        
    public Request () {
        this.random = new Random();
    }
    
    public String search(String address) {
        String jsonString = null;
        //Pokemon names must be lower case or we get a 404
        //To lower case here rather than in all other search methods
        address = address.toLowerCase();

        try {
            HttpClient httpClient = HttpClient.newHttpClient();            
            
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(new URI(address))
                    .GET()          
                    .build();
            
            //this is where the response is stored as a string
            HttpResponse<String> postResponse;   

            //send the httpRequest (bodyhandlers.ofString tells it we expect a string in return)
            postResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            jsonString = postResponse.body();

        } catch (IOException | InterruptedException | URISyntaxException ex) {
            Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return jsonString; 
    }
    
    public String pokemonAsJson (String searchFor) {
        String address = Constants.getApiAddressForPokemon() + searchFor;
        String response = search(address);
        
        //System.out.println("JSON: ");
        //System.out.println(response);   
        
        return response;
    }
    
    public Pokemon searchPokemon(String searchFor) {
        //searchFor must either be Pokemon name or number
        String response = pokemonAsJson(searchFor);
               
        Gson gson = new Gson();
        
        Pokemon pokemon = gson.fromJson(response, Pokemon.class);
        return pokemon;        
    }
    
    public Pokemon searchPokemon(int id) {
        Pokemon pokemon = searchPokemon(String.valueOf(id));
        return pokemon;        
    }
    
    public int noOfPokemon() {
        String address = Constants.getApiAddressForPokemonSpecies();
        String response = search(address);
        
        //remove everything around the count number (number of pokemon)
        String s = response.substring(9, 13);
        int number = Integer.valueOf(s);
        //System.out.println("Total number of Pokemon: " + number);
        
        return number; 
    }
    
    public Pokemon randomPokemon() {
        int max = noOfPokemon();
        
        int x = this.random.nextInt(max + 1);
        //System.out.println("Random ID: " + x);
        
        Pokemon pokemon = searchPokemon(x);
        
        return pokemon;
    }
    
    public String moveAsJson(String searchFor) {
        String address = Constants.getApiAddressForMove() + searchFor;
        String response = search(address);
        
        //System.out.println("JSON: ");
        //System.out.println(response);   
        
        return response;        
    }
    
    public Move searchMove(String searchFor) {
        String response = moveAsJson(searchFor);
               
        Gson gson = new Gson();

        Move move = gson.fromJson(response, Move.class);
        return move;         
    }
    
    public String allMovesAsJson(int offset, int limit) {
        String address = "https://pokeapi.co/api/v2/move?offset=" + offset + "&limit=" + limit;
        String response = search(address);
        
        return response;
    }
    
    public NamedAPIResourceList allMoves(int offset, int limit) {
        String response = allMovesAsJson(offset, limit);
        
        Gson gson = new Gson();
        NamedAPIResourceList moves = gson.fromJson(response, NamedAPIResourceList.class);
        
        return moves;
    }
    
    public NamedAPIResourceList allMoves() {
        NamedAPIResourceList moves = allMoves(0, 20);
        return moves;
    }
    
    //this method was created to enable testing using a mock Random
    public void setRandomUtil(Random newRandom) {
        this.random = newRandom;
    }
    
    
}
