package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Play DTMF Direction &amp; in play audio &amp; sendDigit
 */
@JsonAdapter(Direction.Adapter.class)
public enum Direction {
  
  IN("in"),
  
  OUT("out"),
  
  BOTH("both");

  private String value;

  Direction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Direction fromValue(String text) {
    for (Direction b : Direction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Direction> {
    @Override
    public void write(final JsonWriter jsonWriter, final Direction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Direction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Direction.fromValue(String.valueOf(value));
    }
  }
}

