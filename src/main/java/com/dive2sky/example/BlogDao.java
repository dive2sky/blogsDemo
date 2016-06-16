package com.dive2sky.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void insertNewContent(String content) {
    jdbcTemplate.update("INSERT INTO blogs(content) VALUES(?)", content);
  }

}
