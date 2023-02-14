package com.techelevator.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        RedWine wine = new RedWine(1, "Pinot Noir", "France", "Burgundy", "Cote dOr", "garnet", "low", "low", "light", "moderate plus", "dry", true, "ripe", "red", "mushrooms, tar", "cool", "OW");
        RedWine wine2 = new RedWine(2, "merlot", "USA", "California", "Sonoma", "ruby", "moderate", "moderate", "medium", "low", "dry", true, "ripe", "red", "cocoa, vanilla", "warm", "NW");
        RedWine wine3 = new RedWine(1, "Pinot Noir", "France", "Burgundy", "Cote dOr", "garnet", "low", "low", "light", "moderate plus", "dry", true, "ripe", "red", "mushrooms, tar", "cool", "OW");

        List<RedWine> listOne = new ArrayList<>();
        listOne.add(wine);
        listOne.add(wine2);
        List<RedWine> listTwo = new ArrayList<>();
        listTwo.add(wine3);

        listOne.retainAll(listTwo);

        System.out.println(listOne.size());

        System.out.println(wine.toString());
    }
}


