package com.ziedscavern.numb.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/test")
public class TestController {

  @GetMapping("/template")
  public String getTemplateTest(@RequestParam String tessString, Model model) {
    model.addAttribute("tessString", tessString);
    return "test";
  }

}
