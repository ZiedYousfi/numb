package com.ziedscavern.numb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Media {
  private String userId;
  private String id;
  private String title;
  private String description;
  private String type;
}

