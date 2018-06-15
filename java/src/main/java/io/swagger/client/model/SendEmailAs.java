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
 * send email TEXT or HTML format
 */
@JsonAdapter(SendEmailAs.Adapter.class)
public enum SendEmailAs {
  
  TEXT("text"),
  
  HTML("html");

  private String value;

  SendEmailAs(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SendEmailAs fromValue(String text) {
    for (SendEmailAs b : SendEmailAs.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SendEmailAs> {
    @Override
    public void write(final JsonWriter jsonWriter, final SendEmailAs enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SendEmailAs read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SendEmailAs.fromValue(String.valueOf(value));
    }
  }
}

