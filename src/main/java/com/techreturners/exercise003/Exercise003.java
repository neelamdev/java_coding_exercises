package com.techreturners.exercise003;

import java.util.HashMap;
import java.util.Map;

public class Exercise003 {

    Map<String, Integer> iceCreamFlavourMap;

    public Exercise003() {
        iceCreamFlavourMap = new HashMap<>();
        iceCreamFlavourMap.put("Pistachio", 0);
        iceCreamFlavourMap.put("Raspberry Ripple", 1);
        iceCreamFlavourMap.put("Vanilla", 2);
        iceCreamFlavourMap.put("Mint Chocolate Chip", 3);
        iceCreamFlavourMap.put("Chocolate", 4);
        iceCreamFlavourMap.put("Mango Sorbet", 5);
    }

    int getIceCreamCode(String iceCreamFlavour) {
        return iceCreamFlavourMap.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        String[] flavours = new String[6];
        for (String key : iceCreamFlavourMap.keySet())
            flavours[iceCreamFlavourMap.get(key)] = key;
        return flavours;
    }
}



