/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CarrierApi {

  /**
   * Get the Carrier Lookup
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param phoneNumber A valid 10-digit number (E.164 format).
   */
  def carrierLookup(phoneNumber: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/carrier/lookup.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("PhoneNumber", phoneNumber)
      .withSuccessResponse[String](200)
        /**
   * Retrieve a list of carrier lookup objects.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pageSize The count of objects to return per page.
   */
  def carrierLookuplist(page: Option[Int], pageSize: Option[Int])(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.message360.com/api/v3/", "/carrier/lookuplist.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Page", page)
      .withFormParam("PageSize", pageSize)
      .withSuccessResponse[String](200)
      

}
