package com.techelevator.dao;


import com.techelevator.models.WhiteWine;

import java.util.List;

public interface WhiteWineDAO {

    public List<WhiteWine> matchWineByColor(String color);

    public List<WhiteWine> matchWineByAlcohol(String alcohol);

    public List<WhiteWine> matchWineByBody(String body);

    public List<WhiteWine> matchWineByAcidity(String acidity);

    public List<WhiteWine> matchWineBySweetness(String sweetness);

    public List<WhiteWine> matchWineByHasOak(boolean hasOak);

    public List<WhiteWine> matchWineByFruitCondition(String fruitCondition);

    public List<WhiteWine> matchWineByFruitType(String fruitType);

    public List<WhiteWine> matchWineByNonFruitNotes(String nonFruitNotes);

    public List<WhiteWine> matchWineByClimate(String climate);

    public List<WhiteWine> matchWineByOldOrNewWorld(String world);

}
