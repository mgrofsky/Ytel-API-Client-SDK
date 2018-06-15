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
 * Returns a list of all usage for a specific \&quot;product\&quot; or feature of Message360.
 */
@JsonAdapter(ProductCode.Adapter.class)
public enum ProductCode {
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2(2),
  
  NUMBER_3(3),
  
  NUMBER_4(4),
  
  NUMBER_5(5),
  
  NUMBER_6(6),
  
  NUMBER_7(7),
  
  NUMBER_8(8),
  
  NUMBER_9(9),
  
  NUMBER_10(10),
  
  NUMBER_11(11),
  
  NUMBER_12(12),
  
  NUMBER_13(13);

  private Integer value;

  ProductCode(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductCode fromValue(String text) {
    for (ProductCode b : ProductCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProductCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProductCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProductCode read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInteger();
      return ProductCode.fromValue(String.valueOf(value));
    }
  }
}

