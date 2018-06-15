/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import java.util.UUID
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object SharedShortCodeApi {

  /**
   * Retrieve a list of keywords associated with your Ytel account.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pagesize Number of individual resources listed in the response per page
   * @param keyword Only list keywords of keyword
   * @param shortcode Only list keywords of shortcode
   */
  def keywordLists(page: Option[Int], pagesize: Option[Int], keyword: Option[String] = None, shortcode: Option[Int] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/keyword/lists.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("page", page)
      .withFormParam("pagesize", pagesize)
      .withFormParam("Keyword", keyword)
      .withFormParam("Shortcode", shortcode)
      .withSuccessResponse[String](200)
        /**
   * View a set of properties for a single keyword.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param keywordid The unique identifier of each keyword
   */
  def keywordView(keywordid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/keyword/view.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Keywordid", keywordid)
      .withSuccessResponse[String](200)
        /**
   * List All Inbound ShortCode
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pagesize Number of individual resources listed in the response per page
   * @param from From Number to Inbound ShortCode
   * @param shortcode Only list messages sent to this Short Code
   * @param datecreated Only list messages sent with the specified date
   */
  def shortcodeGetinboundsms(page: Option[Int], pagesize: Option[Int], from: Option[String] = None, shortcode: Option[String] = None, datecreated: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/shortcode/getinboundsms.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("page", page)
      .withFormParam("pagesize", pagesize)
      .withFormParam("from", from)
      .withFormParam("Shortcode", shortcode)
      .withQueryParam("Datecreated", datecreated)
      .withSuccessResponse[String](200)
        /**
   * Retrieve a list of shortcode assignment associated with your Ytel account.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pagesize Number of individual resources listed in the response per page
   * @param shortcode Only list keywords of shortcode
   */
  def shortcodeListshortcode(page: Option[Int], pagesize: Option[Int], shortcode: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/shortcode/listshortcode.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("page", page)
      .withFormParam("pagesize", pagesize)
      .withQueryParam("Shortcode", shortcode)
      .withSuccessResponse[String](200)
        /**
   * Send an SMS from a Ytel ShortCode
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param shortcode The Short Code number that is the sender of this message
   * @param to A valid 10-digit number that should receive the message
   * @param templateid The unique identifier for the template used for the message
   * @param data format of your data, example: {companyname}:test,{otpcode}:1234
   * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent.
   * @param messageStatusCallback URL that can be requested to receive notification when Short Code message was sent.
   */
  def shortcodeSendsms(shortcode: String, to: String, templateid: UUID, data: String, method: Option[String], messageStatusCallback: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/shortcode/sendsms.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("shortcode", shortcode)
      .withFormParam("to", to)
      .withFormParam("templateid", templateid)
      .withFormParam("data", data)
      .withFormParam("Method", method)
      .withFormParam("MessageStatusCallback", messageStatusCallback)
      .withSuccessResponse[String](200)
        /**
   * Update Assignment
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param shortcode List of valid shortcode to your Ytel account
   * @param friendlyName User generated name of the shortcode
   * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
   * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
   * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
   * @param fallbackUrlMethod Specifies the HTTP method used to request the required FallbackUrl once call connects.
   */
  def shortcodeUpdateshortcode(shortcode: String, friendlyName: Option[String] = None, callbackUrl: Option[String] = None, callbackMethod: Option[String] = None, fallbackUrl: Option[String] = None, fallbackUrlMethod: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/shortcode/updateshortcode.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Shortcode", shortcode)
      .withFormParam("FriendlyName", friendlyName)
      .withFormParam("CallbackUrl", callbackUrl)
      .withFormParam("CallbackMethod", callbackMethod)
      .withFormParam("FallbackUrl", fallbackUrl)
      .withFormParam("FallbackUrlMethod", fallbackUrlMethod)
      .withSuccessResponse[String](200)
        /**
   * The response returned here contains all resource properties associated with the given Shortcode.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param shortcode List of valid Shortcode to your Ytel account
   */
  def shortcodeViewshortcode(shortcode: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/shortcode/viewshortcode.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Shortcode", shortcode)
      .withSuccessResponse[String](200)
        /**
   * List Shortcode Templates by Type
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param &#x60;type&#x60; The type (category) of template Valid values: marketing, authorization
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pagesize The count of objects to return per page.
   * @param shortcode Only list templates of type
   */
  def templateLists(&#x60;type&#x60;: Option[String], page: Option[Int], pagesize: Option[Int], shortcode: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/template/lists.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("type", `type`)
      .withFormParam("page", page)
      .withFormParam("pagesize", pagesize)
      .withFormParam("Shortcode", shortcode)
      .withSuccessResponse[String](200)
        /**
   * View a Shared ShortCode Template
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param templateId The unique identifier for a template object
   */
  def templateView(templateId: UUID)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/template/view.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("TemplateId", templateId)
      .withSuccessResponse[String](200)
      

}

