package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Status24
 */
@JsonAdapter(Status24.Adapter.class)
public enum Status24 {
  
  CANCELED("canceled"),
  
  COMPLETED("completed");

  private String value;

  Status24(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Status24 fromValue(String text) {
    for (Status24 b : Status24.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Status24> {
    @Override
    public void write(final JsonWriter jsonWriter, final Status24 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Status24 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Status24.fromValue(String.valueOf(value));
    }
  }
}

