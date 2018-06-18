/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object SMSApi {

  /**
   * Retrieve a list of Inbound SMS message objects.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pageSize The count of objects to return per page.
   * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format).
   * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format).
   * @param dateSent Filter sms message objects by this date.
   */
  def smsGetinboundsms(page: Option[Int], pageSize: Option[Int], from: Option[String] = None, to: Option[String] = None, dateSent: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/sms/getinboundsms.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Page", page)
      .withFormParam("PageSize", pageSize)
      .withFormParam("From", from)
      .withFormParam("To", to)
      .withFormParam("DateSent", dateSent)
      .withSuccessResponse[String](200)
        /**
   * Retrieve a list of Outbound SMS message objects.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pageSize Number of individual resources listed in the response per page
   * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format).
   * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format).
   * @param dateSent Only list SMS messages sent in the specified date range
   */
  def smsListsms(page: Option[Int], pageSize: Option[Int], from: Option[String] = None, to: Option[String] = None, dateSent: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/sms/listsms.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Page", page)
      .withFormParam("PageSize", pageSize)
      .withFormParam("From", from)
      .withFormParam("To", to)
      .withFormParam("DateSent", dateSent)
      .withSuccessResponse[String](200)
        /**
   * Send an SMS from a Ytel number
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param from The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
   * @param to The 10-digit phone number (E.164 format) that will receive the message.
   * @param body The body message that is to be sent in the text.
   * @param method Specifies the HTTP method used to request the required URL once SMS sent.
   * @param messageStatusCallback URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
   * @param smartsms Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message.
   * @param deliveryStatus Delivery reports are a method to tell your system if the message has arrived on the destination phone.
   */
  def smsSendsms(from: String, to: String, body: String, method: Option[String] = None, messageStatusCallback: Option[String] = None, smartsms: Option[Boolean], deliveryStatus: Option[Boolean])(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/sms/sendsms.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("From", from)
      .withFormParam("To", to)
      .withFormParam("Body", body)
      .withFormParam("Method", method)
      .withFormParam("MessageStatusCallback", messageStatusCallback)
      .withFormParam("Smartsms", smartsms)
      .withFormParam("DeliveryStatus", deliveryStatus)
      .withSuccessResponse[String](200)
        /**
   * Retrieve a single SMS message object with details by its SmsSid.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param messageSid The unique identifier for a sms message.
   */
  def smsViewdetailsms(messageSid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/sms/viewdetailsms.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("MessageSid", messageSid)
      .withSuccessResponse[String](200)
        /**
   * Retrieve a single SMS message object by its SmsSid.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param messageSid The unique identifier for a sms message.
   */
  def smsViewsms(messageSid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/sms/viewsms.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("MessageSid", messageSid)
      .withSuccessResponse[String](200)
      

}
