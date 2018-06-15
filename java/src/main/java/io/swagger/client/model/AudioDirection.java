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
 * Audio Direction
 */
@JsonAdapter(AudioDirection.Adapter.class)
public enum AudioDirection {
  
  IN("in"),
  
  OUT("out");

  private String value;

  AudioDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudioDirection fromValue(String text) {
    for (AudioDirection b : AudioDirection.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudioDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudioDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudioDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudioDirection.fromValue(String.valueOf(value));
    }
  }
}

