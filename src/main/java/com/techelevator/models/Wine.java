package com.techelevator.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Wine {

    private int wineId;
    private String varietal;
    private String country;
    private String region;
    private String subregion;
    private String color;
    private String alcohol;
    private String body;
    private String acidity;
    private String sweetness;
    private boolean hasOak;
    private String fruitCondition;
    private String fruitType;
    private String nonFruitNotes;
    private String climate;
    private String oldOrNewWorld;

    public Wine() {
    }

    public Wine(int wineId, String varietal, String country, String region, String subregion, String color, String alcohol, String body, String acidity, String sweetness, boolean hasOak, String fruitCondition, String fruitType, String nonFruitNotes, String climate, String oldOrNewWorld) {
        this.wineId = wineId;
        this.varietal = varietal;
        this.country = country;
        this.region = region;
        this.subregion = subregion;
        this.color = color;
        this.alcohol = alcohol;
        this.body = body;
        this.acidity = acidity;
        this.sweetness = sweetness;
        this.hasOak = hasOak;
        this.fruitCondition = fruitCondition;
        this.fruitType = fruitType;
        this.nonFruitNotes = nonFruitNotes;
        this.climate = climate;
        this.oldOrNewWorld = oldOrNewWorld;
    }

    public int getWineId() {return wineId;}

    public String getVarietal() {return varietal;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}

    public String getRegion() {return region;}

    public String getSubregion() {return subregion;}

    public String getColor() {return color;}

    public String getAlcohol() {return alcohol;}

    public String getBody() {return body;}

    public String getAcidity() {return acidity;}

    public String getSweetness() {return sweetness;}

    public boolean isHasOak() {return hasOak;}

    public String getFruitCondition() {return fruitCondition;}

    public String getFruitType() {return fruitType;}

    public String getClimate() {return climate;}

    public String getOldOrNewWorld() {return oldOrNewWorld;}

    public void setWineId(int wineId) {this.wineId = wineId;}

    public void setVarietal(String varietal) {this.varietal = varietal;}

    public void setRegion(String region) {this.region = region;}

    public void setSubregion(String subregion) {this.subregion = subregion;}

    public void setColor(String color) {this.color = color;}

    public void setAlcohol(String alcohol) {this.alcohol = alcohol;}

    public void setBody(String body) {this.body = body;}

    public void setAcidity(String acidity) {this.acidity = acidity;}

    public void setSweetness(String sweetness) {this.sweetness = sweetness;}

    public void setHasOak(boolean hasOak) {this.hasOak = hasOak;}

    public void setFruitCondition(String fruitCondition) {this.fruitCondition = fruitCondition;}

    public void setFruitType(String fruitType) {this.fruitType = fruitType;}

    public String getNonFruitNotes() {return nonFruitNotes;}

    public void setNonFruitNotes(String nonFruitNotes) {this.nonFruitNotes = nonFruitNotes;}

    public void setClimate(String climate) {this.climate = climate;}

    public void setOldOrNewWorld(String oldOrNewWorld) {this.oldOrNewWorld = oldOrNewWorld;}


    @Override
    public String toString() {
        if (subregion.equals("none")) {
            return varietal + ", " + country + ", " + region;
        } return varietal + ", " + country + ", " + region + ", " + subregion;

    }

    public List<String> getNotesAsList(){
        List<String> newList = new ArrayList<>();
        String[] array = nonFruitNotes.split(",");
        newList = Arrays.asList(array);
        return newList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wine)) return false;
        Wine wine = (Wine) o;
        return getWineId() == wine.getWineId() && isHasOak() == wine.isHasOak() && getVarietal().equals(wine.getVarietal()) && getCountry().equals(wine.getCountry()) && getRegion().equals(wine.getRegion()) && getSubregion().equals(wine.getSubregion()) && getColor().equals(wine.getColor()) && getAlcohol().equals(wine.getAlcohol()) && getBody().equals(wine.getBody()) && getAcidity().equals(wine.getAcidity()) && getSweetness().equals(wine.getSweetness()) && getFruitCondition().equals(wine.getFruitCondition()) && getFruitType().equals(wine.getFruitType()) && getNonFruitNotes().equals(wine.getNonFruitNotes()) && getClimate().equals(wine.getClimate()) && getOldOrNewWorld().equals(wine.getOldOrNewWorld());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWineId());
    }
}
