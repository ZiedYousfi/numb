package com.ziedscavern.numb.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Health {

  @GetMapping("/health")
  public String checkHealth() {
    return "OK";
  }

}
