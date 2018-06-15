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
 * Interrupted Call Status
 */
@JsonAdapter(InterruptedCallStatus.Adapter.class)
public enum InterruptedCallStatus {
  
  CANCELED("canceled"),
  
  COMPLETED("completed");

  private String value;

  InterruptedCallStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InterruptedCallStatus fromValue(String text) {
    for (InterruptedCallStatus b : InterruptedCallStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InterruptedCallStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final InterruptedCallStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InterruptedCallStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InterruptedCallStatus.fromValue(String.valueOf(value));
    }
  }
}
