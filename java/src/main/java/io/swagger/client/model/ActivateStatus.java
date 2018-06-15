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
 * Choose account status either 0 or 1
 */
@JsonAdapter(ActivateStatus.Adapter.class)
public enum ActivateStatus {
  
  NUMBER_1(1),
  
  NUMBER_0(0);

  private Integer value;

  ActivateStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivateStatus fromValue(String text) {
    for (ActivateStatus b : ActivateStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ActivateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivateStatus read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInteger();
      return ActivateStatus.fromValue(String.valueOf(value));
    }
  }
}

