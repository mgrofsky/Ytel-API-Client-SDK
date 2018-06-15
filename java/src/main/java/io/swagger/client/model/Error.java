package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Error
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T17:03:08.063Z")
public class Error {
  @SerializedName("Code")
  private String code = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("MoreInfo")
  private List<String> moreInfo = new ArrayList<String>();

  public Error code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error moreInfo(List<String> moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

  public Error addMoreInfoItem(String moreInfoItem) {
    this.moreInfo.add(moreInfoItem);
    return this;
  }

   /**
   * 
   * @return moreInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(List<String> moreInfo) {
    this.moreInfo = moreInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.moreInfo, error.moreInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, moreInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

