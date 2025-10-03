package com.ziedscavern.numb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ziedscavern.numb.domain.Media;

public interface MediaRepository extends MongoRepository<Media, String> {

  @Query("{ 'title': ?0 }")
  Media findByTitle(String title);

  @Query("{ 'type': ?0 }")
  Media findByType(String type);
}
