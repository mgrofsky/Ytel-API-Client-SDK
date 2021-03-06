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
 * Types Of Method
 */
@JsonAdapter(HttpAction.Adapter.class)
public enum HttpAction {
  
  GET("GET"),
  
  POST("POST");

  private String value;

  HttpAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HttpAction fromValue(String text) {
    for (HttpAction b : HttpAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HttpAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final HttpAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HttpAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HttpAction.fromValue(String.valueOf(value));
    }
  }
}

