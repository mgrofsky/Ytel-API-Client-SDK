package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets MergeNumber
 */
@JsonAdapter(MergeNumber.Adapter.class)
public enum MergeNumber {
  
  NUMBER_0(0),
  
  NUMBER_1(1);

  private Integer value;

  MergeNumber(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MergeNumber fromValue(String text) {
    for (MergeNumber b : MergeNumber.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MergeNumber> {
    @Override
    public void write(final JsonWriter jsonWriter, final MergeNumber enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MergeNumber read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInteger();
      return MergeNumber.fromValue(String.valueOf(value));
    }
  }
}

