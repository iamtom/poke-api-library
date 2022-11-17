package com.mycompany.pokeapilibrary;

public class StringFormatter {
    public static String basicFormat(String input) {
        //the API returns lower case strings with "-" instead of spaces
        //e.g. flare-blitz becomes Flare Blitz
        String result;
        
        String[] array = input.split("-");
        
        //capitalise first letter of each string
        for (int i = 0; i < array.length; i++) {
            if(!array[i].isBlank()) {
                String firstLetter = array[i].substring(0, 1);
                firstLetter = firstLetter.toUpperCase();
                String restOfWord = array[i].substring(1);
                array[i] = firstLetter.concat(restOfWord);     
            }
        }
        
        result = String.join(" ", array);
        
        return result;
    }
    
    public static String formatVersionName(String versionName) {
        
        //formatting for versions that aren't just one word
        switch(versionName) {
            case "red-blue":
                versionName = "Red and Blue";
                break;
            case "gold-silver":
                versionName = "Gold & Silver";
                break;
            case "ruby-sapphire":
                versionName = "Ruby and Sapphire";
                break;
            case "firered-leafgreen":
                versionName = "Fire Red & Leaf Green";
                break;
            case "diamond-pearl":
                versionName = "Diamond & Pearl";
                break;
            case "heartgold-soulsilver":
                versionName = "Heart Gold & Soul Silver";
                break;
            case "black-white":
                versionName = "Black & White";
                break;
            case "xd":
                versionName = "XD";
                break;
            case "black-2-white-2":
                versionName = "Black 2 & White 2";
                break;
            case "x-y":
                versionName = "X & Y";
                break;
            case "omega-ruby-alpha-sapphire":
                versionName = "Omega Ruby & Alpha Sapphire";
                break;
            case "sun-moon":
                versionName = "Sun & Moon";
                break;
            case "ultra-sun-ultra-moon":
                versionName = "Ultra Sun & Ultra Moon";
                break;
            case "lets-go-pikachu-lets-go-eevee":
                versionName = "Let's Go Pikachu & Let's Go Eevee";
                break;
            case "sword-shield":
                versionName = "Sword & Shield";
                break;
            default:
                break;
        }
        
        //formatting for versions that are one word aside from XD version
        if(!versionName.equals("XD")) {
           versionName = basicFormat(versionName); 
        }      
              
        return versionName;
    }
}
