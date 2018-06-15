package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TemplateData;
import java.io.IOException;

/**
 * Message
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T17:03:08.063Z")
public class Message {
  @SerializedName("ApiVersion")
  private String apiVersion = null;

  @SerializedName("MessageSid")
  private String messageSid = null;

  @SerializedName("From")
  private String from = null;

  @SerializedName("To")
  private String to = null;

  @SerializedName("MessagePrice")
  private String messagePrice = null;

  @SerializedName("Body")
  private String body = null;

  @SerializedName("DateSent")
  private String dateSent = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("TemplateId")
  private String templateId = null;

  @SerializedName("TemplateData")
  private TemplateData templateData = null;

  public Message apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * 
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public Message messageSid(String messageSid) {
    this.messageSid = messageSid;
    return this;
  }

   /**
   * 
   * @return messageSid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessageSid() {
    return messageSid;
  }

  public void setMessageSid(String messageSid) {
    this.messageSid = messageSid;
  }

  public Message from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 
   * @return from
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Message to(String to) {
    this.to = to;
    return this;
  }

   /**
   * 
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Message messagePrice(String messagePrice) {
    this.messagePrice = messagePrice;
    return this;
  }

   /**
   * 
   * @return messagePrice
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessagePrice() {
    return messagePrice;
  }

  public void setMessagePrice(String messagePrice) {
    this.messagePrice = messagePrice;
  }

  public Message body(String body) {
    this.body = body;
    return this;
  }

   /**
   * 
   * @return body
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Message dateSent(String dateSent) {
    this.dateSent = dateSent;
    return this;
  }

   /**
   * 
   * @return dateSent
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDateSent() {
    return dateSent;
  }

  public void setDateSent(String dateSent) {
    this.dateSent = dateSent;
  }

  public Message status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Message templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public Message templateData(TemplateData templateData) {
    this.templateData = templateData;
    return this;
  }

   /**
   * Get templateData
   * @return templateData
  **/
  @ApiModelProperty(required = true, value = "")
  public TemplateData getTemplateData() {
    return templateData;
  }

  public void setTemplateData(TemplateData templateData) {
    this.templateData = templateData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.apiVersion, message.apiVersion) &&
        Objects.equals(this.messageSid, message.messageSid) &&
        Objects.equals(this.from, message.from) &&
        Objects.equals(this.to, message.to) &&
        Objects.equals(this.messagePrice, message.messagePrice) &&
        Objects.equals(this.body, message.body) &&
        Objects.equals(this.dateSent, message.dateSent) &&
        Objects.equals(this.status, message.status) &&
        Objects.equals(this.templateId, message.templateId) &&
        Objects.equals(this.templateData, message.templateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, messageSid, from, to, messagePrice, body, dateSent, status, templateId, templateData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    messageSid: ").append(toIndentedString(messageSid)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    messagePrice: ").append(toIndentedString(messagePrice)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    dateSent: ").append(toIndentedString(dateSent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
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

