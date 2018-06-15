package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Numbertype16
 */
@JsonAdapter(Numbertype16.Adapter.class)
public enum Numbertype16 {
  
  ALL("all"),
  
  VOICE("voice"),
  
  SMS("sms");

  private String value;

  Numbertype16(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Numbertype16 fromValue(String text) {
    for (Numbertype16 b : Numbertype16.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Numbertype16> {
    @Override
    public void write(final JsonWriter jsonWriter, final Numbertype16 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Numbertype16 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Numbertype16.fromValue(String.valueOf(value));
    }
  }
}

