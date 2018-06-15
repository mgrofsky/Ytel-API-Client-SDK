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
 * Phone Number Type All,SMS or Voice
 */
@JsonAdapter(NumberType.Adapter.class)
public enum NumberType {
  
  ALL("all"),
  
  VOICE("voice"),
  
  SMS("sms");

  private String value;

  NumberType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NumberType fromValue(String text) {
    for (NumberType b : NumberType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NumberType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NumberType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NumberType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NumberType.fromValue(String.valueOf(value));
    }
  }
}

