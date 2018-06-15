package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AudioUrl
 */
@JsonAdapter(AudioUrl.Adapter.class)
public enum AudioUrl {
  
  MP3("mp3"),
  
  WAV("wav");

  private String value;

  AudioUrl(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudioUrl fromValue(String text) {
    for (AudioUrl b : AudioUrl.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudioUrl> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudioUrl enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudioUrl read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudioUrl.fromValue(String.valueOf(value));
    }
  }
}

