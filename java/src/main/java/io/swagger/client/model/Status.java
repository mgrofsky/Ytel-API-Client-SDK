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
 * Transcription Status
 */
@JsonAdapter(Status.Adapter.class)
public enum Status {
  
  INPROGRESS("inprogress"),
  
  SUCCESS("success"),
  
  FAILURE("failure");

  private String value;

  Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Status fromValue(String text) {
    for (Status b : Status.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Status.fromValue(String.valueOf(value));
    }
  }
}

