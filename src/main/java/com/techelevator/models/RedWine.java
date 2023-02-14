package com.techelevator.models;

public class RedWine extends Wine{

    private String tannin;

    public RedWine(int wineId, String varietal, String country, String region, String subregion, String color, String tannin, String alcohol, String body, String acidity, String sweetness, boolean hasOak, String fruitCondition, String fruitType, String nonFruitNotes, String climate, String oldOrNewWorld) {
        super(wineId, varietal, country, region, subregion, color, alcohol, body, acidity, sweetness, hasOak, fruitCondition, fruitType, nonFruitNotes, climate, oldOrNewWorld);
        this.tannin = tannin;
    }

    public RedWine() {
    }

    public String getTannin() {return tannin;}

    public void setTannin(String tannin) {this.tannin = tannin;}



}
