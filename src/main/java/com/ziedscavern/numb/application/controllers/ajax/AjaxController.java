package com.ziedscavern.numb.application.controllers.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ziedscavern.numb.application.services.MediaService;

import lombok.Getter;
import lombok.Setter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    model.addAttribute("medias", mediaService.getAllMedias());
    return "ajax/medias :: mediasFragment";
  }

  @PostMapping("/new-media")
  @ResponseBody
  public String createMedia(@ModelAttribute NewMediaDTO mediaDTO) {
    mediaService.createMedia(
        new com.ziedscavern.numb.domain.Media(
            null,
            mediaDTO.getTitle(),
            mediaDTO.getDescription(),
            mediaDTO.getType()));

    return "<p>Media created</p>";
  }

  @Getter
  @Setter
  public static class NewMediaDTO {
    private String title;
    private String description;
    private String type;
  }

}
