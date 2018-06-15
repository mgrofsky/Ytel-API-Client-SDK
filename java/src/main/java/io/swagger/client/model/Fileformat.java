package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Fileformat
 */
@JsonAdapter(Fileformat.Adapter.class)
public enum Fileformat {
  
  MP3("mp3"),
  
  WAV("wav");

  private String value;

  Fileformat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Fileformat fromValue(String text) {
    for (Fileformat b : Fileformat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Fileformat> {
    @Override
    public void write(final JsonWriter jsonWriter, final Fileformat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Fileformat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Fileformat.fromValue(String.valueOf(value));
    }
  }
}

