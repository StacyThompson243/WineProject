package com.techelevator.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.models.RedWine;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcRedWineDao implements RedWineDAO {

    private final JdbcTemplate jdbcTemplate;

    public JdbcRedWineDao(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
     }

    @Override
    public List<RedWine> matchWineByColor(String color) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE color = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, color);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineByTannin(String tannin) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE tannin = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, tannin);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineByAlcohol(String alcohol) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE alcohol = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, alcohol);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineByBody(String body) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE body = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, body);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineByAcidity(String acidity) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE acidity = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, acidity);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineBySweetness(String sweetness) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE sweetness = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, sweetness);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineByHasOak(boolean hasOak) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE has_oak = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hasOak);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineByFruitCondition(String fruitCondition) {
        String[] array = fruitCondition.split(",");
        List<RedWine> wines = new ArrayList<>();
        String sql;
        if(array.length == 1) {
            sql = "SELECT * " +
                    "FROM red_wines " +
                    "WHERE fruit_condition = ?;";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, fruitCondition);
            while (results.next()) {
                wines.add(mapRowToRedWine(results));
            }
        } else {
            sql = "SELECT * " +
                    "FROM red_wines " +
                    "WHERE fruit_condition ILIKE '%'||?||'%' OR fruit_condition ILIKE '%'||?||'%';";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, array[0], array[1]);
            while (results.next()) {
                wines.add(mapRowToRedWine(results));
            }
        }
        return wines;
    }

    @Override
    public List<RedWine> matchWineByFruitType(String fruitType) {
        String[] array = fruitType.split(",");
        List<RedWine> wines = new ArrayList<>();
        if(array.length == 1) {
            String sql = "SELECT * " +
                    "FROM red_wines " +
                    "WHERE fruit_type = ?;";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, fruitType);
            while (results.next()) {
                wines.add(mapRowToRedWine(results));
            }
            return wines;
        } else {
            String sql = "SELECT * " +
                    "FROM red_wines " +
                    "WHERE fruit_type ILIKE '%'||?||'%' OR fruit_type ILIKE '%'||?||'%';";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, array[0], array[1]);
            while (results.next()) {
                wines.add(mapRowToRedWine(results));
            }
            return wines;
        }
    }
/////THIS METHOD IS NOT WORKING
    @Override
    public List<RedWine> matchWineByNonFruitNotes(String nonFruitNotes) {
        List<RedWine> wines = new ArrayList<>();
        String[] array = nonFruitNotes.split(",");
        for(int i = 0; i < array.length; i++){
            String sql = "SELECT * " +
                    "FROM red_wines " +
                    "WHERE nonfruit_notes ILIKE '%'||?||'%';";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, array[i]);
            while (results.next()) {
                wines.add(mapRowToRedWine(results));
            }
        } return wines;
    }

    @Override
    public List<RedWine> matchWineByClimate(String climate) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE climate = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, climate);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    @Override
    public List<RedWine> matchWineByOldOrNewWorld(String world) {
        List<RedWine> wines = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM red_wines " +
                "WHERE old_new_world = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, world);
        while (results.next()) {
            wines.add(mapRowToRedWine(results));
        }  return wines;
    }

    private RedWine mapRowToRedWine(SqlRowSet rowSet) {
        RedWine wine = new RedWine();
        wine.setWineId(rowSet.getInt("wine_id"));
        wine.setVarietal(rowSet.getString("varietal"));
        wine.setCountry(rowSet.getString("country"));
        wine.setRegion(rowSet.getString("state_or_region"));
        wine.setSubregion(rowSet.getString("sub_region"));
        wine.setColor(rowSet.getString("color"));
        wine.setTannin(rowSet.getString("tannin"));
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
