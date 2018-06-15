package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PlayDtmfDirection
 */
@JsonAdapter(PlayDtmfDirection.Adapter.class)
public enum PlayDtmfDirection {
  
  IN("in"),
  
  OUT("out"),
  
  BOTH("both");

  private String value;

  PlayDtmfDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayDtmfDirection fromValue(String text) {
    for (PlayDtmfDirection b : PlayDtmfDirection.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayDtmfDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayDtmfDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlayDtmfDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlayDtmfDirection.fromValue(String.valueOf(value));
    }
  }
}

