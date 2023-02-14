package com.techelevator.dao;


import com.techelevator.models.RedWine;

import java.util.List;

public interface RedWineDAO {
    public List<RedWine> matchWineByColor(String color);

    public List<RedWine> matchWineByTannin(String tannin);

    public List<RedWine> matchWineByAlcohol(String alcohol);

    public List<RedWine> matchWineByBody(String body);

    public List<RedWine> matchWineByAcidity(String acidity);

    public List<RedWine> matchWineBySweetness(String sweetness);

    public List<RedWine> matchWineByHasOak(boolean hasOak);

    public List<RedWine> matchWineByFruitCondition(String fruitCondition);

    public List<RedWine> matchWineByFruitType(String fruitType);

    public List<RedWine> matchWineByNonFruitNotes(String nonFruitNotes);

    public List<RedWine> matchWineByClimate(String climate);

    public List<RedWine> matchWineByOldOrNewWorld(String world);


}
