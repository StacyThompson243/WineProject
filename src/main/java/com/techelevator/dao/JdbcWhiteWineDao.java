package com.techelevator.dao;

import com.techelevator.models.RedWine;
import com.techelevator.models.WhiteWine;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcWhiteWineDao implements WhiteWineDAO {
    private final JdbcTemplate jdbcTemplate;

    public JdbcWhiteWineDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<WhiteWine> matchWineByColor(String color) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE color = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, color);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    @Override
    public List<WhiteWine> matchWineByAlcohol(String alcohol) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE alcohol = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, alcohol);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    @Override
    public List<WhiteWine> matchWineByBody(String body) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE body = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, body);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    @Override
    public List<WhiteWine>matchWineByAcidity(String acidity) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE acidity = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, acidity);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    @Override
    public List<WhiteWine> matchWineBySweetness(String sweetness) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE sweetness = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, sweetness);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    @Override
    public List<WhiteWine> matchWineByHasOak(boolean hasOak) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE has_oak = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hasOak);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    @Override
        public List<WhiteWine> matchWineByFruitCondition(String fruitCondition) {
        String[] array = fruitCondition.split(",");
        List<WhiteWine> wines = new ArrayList<>();
        String sql;
        if(array.length == 1) {
            sql = "SELECT * " +
                    "FROM white_wines " +
                    "WHERE fruit_condition = ?;";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, fruitCondition);
            while (results.next()) {
                wines.add(mapRowToWhiteWine(results));
            }
        } else {
            sql = "SELECT * " +
                    "FROM white_wines " +
                    "WHERE fruit_condition ILIKE '%'||?||'%' OR fruit_condition ILIKE '%'||?||'%';";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, array[0], array[1]);
            while (results.next()) {
                wines.add(mapRowToWhiteWine(results));
            }
        }
        return wines;
    }

    @Override
    public List<WhiteWine> matchWineByFruitType(String fruitType) {
        String[] array = fruitType.split(",");
        List<WhiteWine> wines = new ArrayList<>();
        String sql;
        if(array.length == 1) {
            sql = "SELECT * " +
                    "FROM white_wines " +
                    "WHERE fruit_type = ?;";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, fruitType);
            while (results.next()) {
                wines.add(mapRowToWhiteWine(results));
            }
        } else {
            sql = "SELECT * " +
                    "FROM white_wines " +
                    "WHERE fruit_type ILIKE '%'||?||'%' OR fruit_type ILIKE '%'||?||'%';";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, array[0], array[1]);
            while (results.next()) {
                wines.add(mapRowToWhiteWine(results));
            }
        }
        return wines;
    }
    /////THIS METHOD IS NOT WORKING
    @Override
    public List<WhiteWine> matchWineByNonFruitNotes(String nonFruitNotes) {
        List<WhiteWine> wines = new ArrayList<>();
        String[] array = nonFruitNotes.split(",");
        for(int i = 0; i < array.length; i++){
            String sql = "SELECT * " +
                    "FROM white_wines " +
                    "WHERE nonfruit_notes ILIKE '%'||?||'%';";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, array[i]);
            while (results.next()) {
                wines.add(mapRowToWhiteWine(results));
            }
        } return wines;
    }

    @Override
    public List<WhiteWine> matchWineByClimate(String climate) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE climate = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, climate);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    @Override
    public List<WhiteWine> matchWineByOldOrNewWorld(String world) {
        List<WhiteWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM white_wines " +
                "WHERE old_new_world = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, world);
        while (results.next()) {
            wines.add(mapRowToWhiteWine(results));
        }  return wines;
    }

    private WhiteWine mapRowToWhiteWine(SqlRowSet rowSet) {
        WhiteWine wine = new WhiteWine();
        wine.setWineId(rowSet.getInt("wine_id"));
        wine.setVarietal(rowSet.getString("varietal"));
        wine.setCountry(rowSet.getString("country"));
        wine.setRegion(rowSet.getString("state_or_region"));
        wine.setSubregion(rowSet.getString("sub_region"));
        wine.setColor(rowSet.getString("color"));
        wine.setAlcohol(rowSet.getString("alcohol"));
        wine.setBody(rowSet.getString("body"));
        wine.setAcidity(rowSet.getString("acidity"));
        wine.setSweetness(rowSet.getString("sweetness"));
        wine.setHasOak(rowSet.getBoolean("has_oak"));
        wine.setFruitCondition(rowSet.getString("fruit_condition"));
        wine.setFruitType(rowSet.getString("fruit_type"));
        wine.setNonFruitNotes(rowSet.getString("nonfruit_notes"));
        wine.setClimate(rowSet.getString("climate"));
        wine.setOldOrNewWorld(rowSet.getString("old_new_world"));
        return wine;
    }

}
