package com.techelevator.models;

public class WhiteWine extends Wine{

    public WhiteWine(int wineId, String varietal, String country, String region, String subregion, String color, String alcohol, String body, String acidity, String sweetness, boolean hasOak, String fruitCondition, String fruitType, String nonFruitNotes, String climate, String oldOrNewWorld) {
        super(wineId, varietal, country, region, subregion, color, alcohol, body, acidity, sweetness, hasOak, fruitCondition, fruitType, nonFruitNotes, climate, oldOrNewWorld);
    }

    public WhiteWine() {
    }
}

