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

/**
 * TemplateData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T17:03:08.063Z")
public class TemplateData {
  @SerializedName("companyname")
  private String companyname = null;

  @SerializedName("otpcode")
  private String otpcode = null;

  public TemplateData companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * 
   * @return companyname
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }

  public TemplateData otpcode(String otpcode) {
    this.otpcode = otpcode;
    return this;
  }

   /**
   * 
   * @return otpcode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOtpcode() {
    return otpcode;
  }

  public void setOtpcode(String otpcode) {
    this.otpcode = otpcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateData templateData = (TemplateData) o;
    return Objects.equals(this.companyname, templateData.companyname) &&
        Objects.equals(this.otpcode, templateData.otpcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyname, otpcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateData {\n");
    
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
    sb.append("    otpcode: ").append(toIndentedString(otpcode)).append("\n");
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

