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
 * Audio Format file type mp3 or wav
 */
@JsonAdapter(AudioFormat.Adapter.class)
public enum AudioFormat {
  
  MP3("mp3"),
  
  WAV("wav");

  private String value;

  AudioFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudioFormat fromValue(String text) {
    for (AudioFormat b : AudioFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudioFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudioFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudioFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudioFormat.fromValue(String.valueOf(value));
    }
  }
}

