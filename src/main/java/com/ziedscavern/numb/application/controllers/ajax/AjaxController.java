package com.ziedscavern.numb.application.controllers.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ziedscavern.numb.application.services.MediaService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

  private final MediaService mediaService;

  public AjaxController(MediaService mediaService) {
    this.mediaService = mediaService;
  }

  @GetMapping("/main")
  public String getMain() {
    return "ajax/main";
  }

  @GetMapping("/medias")
  public String getMedia(Model model) {
    model.addAttribute("medias", mediaService);
    return "ajax/medias";
  }

}
