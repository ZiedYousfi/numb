package com.ziedscavern.numb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ziedscavern.numb.domain.Media;

public interface MediaRepository extends MongoRepository<Media, String> {

}
