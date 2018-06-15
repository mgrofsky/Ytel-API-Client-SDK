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
 * Choose sub account either merge or delete
 */
@JsonAdapter(MergeNumberStatus.Adapter.class)
public enum MergeNumberStatus {
  
  NUMBER_0(0),
  
  NUMBER_1(1);

  private Integer value;

  MergeNumberStatus(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MergeNumberStatus fromValue(String text) {
    for (MergeNumberStatus b : MergeNumberStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MergeNumberStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final MergeNumberStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MergeNumberStatus read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInteger();
      return MergeNumberStatus.fromValue(String.valueOf(value));
    }
  }
}

