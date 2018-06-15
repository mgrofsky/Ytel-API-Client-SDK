package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Activate
 */
@JsonAdapter(Activate.Adapter.class)
public enum Activate {
  
  NUMBER_1(1),
  
  NUMBER_0(0);

  private Integer value;

  Activate(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Activate fromValue(String text) {
    for (Activate b : Activate.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Activate> {
    @Override
    public void write(final JsonWriter jsonWriter, final Activate enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Activate read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInteger();
      return Activate.fromValue(String.valueOf(value));
    }
  }
}

