package com.techelevator;

import com.techelevator.dao.JdbcRedWineDao;
import com.techelevator.dao.JdbcWhiteWineDao;
import com.techelevator.dao.RedWineDAO;
import com.techelevator.dao.WhiteWineDAO;
import com.techelevator.models.RedWine;
import com.techelevator.models.WhiteWine;
import com.techelevator.services.ConsoleService;
import com.techelevator.services.OutputService;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class App {

    private final RedWineDAO redWineDAO;
    private WhiteWineDAO whiteWineDAO;

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/WineProject");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        App app = new App(dataSource);
        OutputService.promptForRedOrWhite();
        if(ConsoleService.tastingRedOrWhite().equals("white")){
            app.runVersionWhite();
        } else {
            app.runVersionRed();
        }

    }
    public App(DataSource dataSource) {
        redWineDAO = new JdbcRedWineDao(dataSource);
        whiteWineDAO = new JdbcWhiteWineDao(dataSource);
    }

    public void runVersionRed(){
        List<RedWine> wines = new ArrayList<>();

        OutputService.promptForRedColor();
        List<RedWine> addWinesByColor = redWineDAO.matchWineByColor(ConsoleService.getRedColorFromInput());
        wines.addAll(addWinesByColor);

        OutputService.promptForTannin();
        List<RedWine> addWinesByTannin = redWineDAO.matchWineByTannin(ConsoleService.getStructureFromInput());
        wines.retainAll(addWinesByTannin);

        OutputService.promptForAlcohol();
        List<RedWine> addWinesByAlcohol = redWineDAO.matchWineByAlcohol(ConsoleService.getStructureFromInput());
        wines.retainAll(addWinesByAlcohol);

        OutputService.promptForBody();
        List<RedWine> addWinesByBody = redWineDAO.matchWineByBody(ConsoleService.getBodyFromInput());
        wines.retainAll(addWinesByBody);

        OutputService.promptForAcidity();
        List<RedWine> addWinesByAcidity = redWineDAO.matchWineByAcidity(ConsoleService.getStructureFromInput());
        wines.retainAll(addWinesByAcidity);

        OutputService.promptForSweetness();
        List<RedWine> addWinesBySweetness = redWineDAO.matchWineBySweetness(ConsoleService.getSweetnessFromInput());
        wines.retainAll(addWinesBySweetness);

        OutputService.promptForHasOak();
        List<RedWine> addWinesByOak = redWineDAO.matchWineByHasOak(ConsoleService.getHasOakFromInput());
        wines.retainAll(addWinesByOak);

        OutputService.promptForFruitCondition();
        List<RedWine> addWinesByFruitCondition = redWineDAO.matchWineByFruitCondition(ConsoleService.promptForStringInput());
        wines.retainAll(addWinesByFruitCondition);

        OutputService.promptForFruitTypeRed();
        List<RedWine> addWinesByFruitType = redWineDAO.matchWineByFruitType(ConsoleService.promptForStringInput());
        wines.retainAll(addWinesByFruitType);

        OutputService.promptForRedNonFruitNotes();
        List<RedWine> addWinesByNonFruitNotes = redWineDAO.matchWineByNonFruitNotes(ConsoleService.promptForStringInput());
        wines.retainAll(addWinesByNonFruitNotes);

        OutputService.promptForClimate();
        List<RedWine> addWinesByClimate = redWineDAO.matchWineByClimate(ConsoleService.getClimateFromInput());
        wines.retainAll(addWinesByClimate);

        OutputService.promptForWorld();
        List<RedWine> addWinesOldOrNewWorld = redWineDAO.matchWineByOldOrNewWorld(ConsoleService.promptForStringInputToUpperCase());
        wines.retainAll(addWinesOldOrNewWorld);

        System.out.println("Wines with characteristics matching your selections:");
        for(RedWine wine: wines){
            System.out.println(wine.toString());
        }
    }

    public void runVersionWhite(){
        List<WhiteWine> wines = new ArrayList<>();

        OutputService.promptForWhiteColor();
        List<WhiteWine> addWinesByColor = whiteWineDAO.matchWineByColor(ConsoleService.getWhiteColorFromInput());
        wines.addAll(addWinesByColor);

        OutputService.promptForAlcohol();
        List<WhiteWine> addWinesByAlcohol = whiteWineDAO.matchWineByAlcohol(ConsoleService.getStructureFromInput());
        wines.retainAll(addWinesByAlcohol);

        OutputService.promptForBody();
        List<WhiteWine> addWinesByBody = whiteWineDAO.matchWineByBody(ConsoleService.getBodyFromInput());
        wines.retainAll(addWinesByBody);

        OutputService.promptForAcidity();
        List<WhiteWine> addWinesByAcidity = whiteWineDAO.matchWineByAcidity(ConsoleService.getStructureFromInput());
        wines.retainAll(addWinesByAcidity);

        OutputService.promptForSweetness();
        List<WhiteWine> addWinesBySweetness = whiteWineDAO.matchWineBySweetness(ConsoleService.getSweetnessFromInput());
        wines.retainAll(addWinesBySweetness);

        OutputService.promptForHasOak();
        List<WhiteWine> addWinesByOak = whiteWineDAO.matchWineByHasOak(ConsoleService.getHasOakFromInput());
        wines.retainAll(addWinesByOak);

        OutputService.promptForFruitCondition();
        List<WhiteWine> addWinesByFruitCondition = whiteWineDAO.matchWineByFruitCondition(ConsoleService.promptForStringInput());
        wines.retainAll(addWinesByFruitCondition);

        OutputService.promptForFruitTypeWhite();
        List<WhiteWine> addWinesByFruitType = whiteWineDAO.matchWineByFruitType(ConsoleService.promptForStringInput());
        wines.retainAll(addWinesByFruitType);

        OutputService.promptForWhiteNonFruitNotes();
        List<WhiteWine> addWinesByNonFruitNotes = whiteWineDAO.matchWineByNonFruitNotes(ConsoleService.promptForStringInput());
        wines.retainAll(addWinesByNonFruitNotes);

        OutputService.promptForClimate();
        List<WhiteWine> addWinesByClimate = whiteWineDAO.matchWineByClimate(ConsoleService.getClimateFromInput());
        wines.retainAll(addWinesByClimate);

        OutputService.promptForWorld();
        List<WhiteWine> addWinesOldOrNewWorld = whiteWineDAO.matchWineByOldOrNewWorld(ConsoleService.promptForStringInputToUpperCase());
        wines.retainAll(addWinesOldOrNewWorld);

        System.out.println("Wines with characteristics matching your selections:");
        for(WhiteWine wine: wines){
            System.out.println(wine.toString());
        }
    }
}
