package com.dmodi.jsonandxml.wire;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {

  @JsonProperty("identification")
  UUID id;

  @JsonProperty("name")
  String name;
}
