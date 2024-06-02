package com.recipes.jpa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.recipes.transferobject.RecipeTO;

@Repository
public class RecipeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<RecipeTO> getAllRecipes() throws Exception {
        String sql = "select * from recipe;";
        return jdbcTemplate.query(sql, (rs, rowNum) -> toRecipe(rs));
    }

    private RecipeTO toRecipe(ResultSet rs) {
        RecipeTO r = new RecipeTO();

        try {
            r.id = rs.getLong("id");
            r.name = rs.getString("name");
            r.description = rs.getString("description");
        } catch (SQLException e) {

        }

        return r;
    }
}
