package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GroupConfirmFile
 */
@JsonAdapter(GroupConfirmFile.Adapter.class)
public enum GroupConfirmFile {
  
  MP3("mp3"),
  
  WAV("wav");

  private String value;

  GroupConfirmFile(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupConfirmFile fromValue(String text) {
    for (GroupConfirmFile b : GroupConfirmFile.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<GroupConfirmFile> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupConfirmFile enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupConfirmFile read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupConfirmFile.fromValue(String.valueOf(value));
    }
  }
}

