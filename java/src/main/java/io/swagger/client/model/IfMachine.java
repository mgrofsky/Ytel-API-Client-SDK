/*
 * Ytel API V3
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


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
 * How Message360 should handle the receiving numbers voicemail machine
 */
@JsonAdapter(IfMachine.Adapter.class)
public enum IfMachine {
  
  CONTINUE("continue"),
  
  HANGUP("hangup");

  private String value;

  IfMachine(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IfMachine fromValue(String text) {
    for (IfMachine b : IfMachine.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IfMachine> {
    @Override
    public void write(final JsonWriter jsonWriter, final IfMachine enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IfMachine read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IfMachine.fromValue(String.valueOf(value));
    }
  }
}

