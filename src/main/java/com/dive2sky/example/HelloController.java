package com.dive2sky.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  private BlogDao blogDao;

  @RequestMapping("/")
  public String index() {
    blogDao.insertNewContent("Hello Spring?");
    return "Greetings from Spring Boot!";
  }
}
