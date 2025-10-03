package com.ziedscavern.numb.application.services;

import java.util.UUID;

import org.springframework.stereotype.Service;
import com.ziedscavern.numb.domain.Media;
import com.ziedscavern.numb.repositories.MediaRepository;

@Service
public class MediaService {

  private final MediaRepository mediaRepository;

  public MediaService(MediaRepository mediaRepository) {
    this.mediaRepository = mediaRepository;
  }

  public Media getMediaById(String id) {
    return mediaRepository.findById(id).orElse(null);
  }

  public Media createMedia(Media media) {
    media.setId(UUID.randomUUID().toString());
    return mediaRepository.save(media);
  }

  public void deleteMedia(String id) {
    mediaRepository.deleteById(id);
  }

}
