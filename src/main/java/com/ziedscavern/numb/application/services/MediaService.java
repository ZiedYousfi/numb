package com.ziedscavern.numb.application.services;

import org.springframework.stereotype.Service;
import com.ziedscavern.numb.domain.Media;

@Service
public class MediaService {

  public Media getMediaById(String id) {
    // Dummy implementation for example purposes
    return new Media(id, "Sample Title", "Sample Description", "video");
  }

  public Media createMedia(Media media) {
    // Dummy implementation for example purposes
    media.setId("generated-id");
    return media;
  }

  public void deleteMedia(String id) {
    // Dummy implementation for example purposes
    System.out.println("Media with ID " + id + " deleted.");
  }

}
