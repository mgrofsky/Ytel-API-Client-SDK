/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AddressApi {

  /**
   * To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param name Name of user
   * @param address Address of user.
   * @param country Must be a 2 letter country short-name code (ISO 3166)
   * @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
   * @param city City Name.
   * @param zip Zip code of city.
   * @param description Description of addresses.
   * @param email Email Id of user.
   * @param phone Phone number of user.
   */
  def addressCreateaddress(name: String, address: String, country: String, state: String, city: String, zip: String, description: Option[String] = None, email: Option[String] = None, phone: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/address/createaddress.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("Name", name)
      .withFormParam("Address", address)
      .withFormParam("Country", country)
      .withFormParam("State", state)
      .withFormParam("City", city)
      .withFormParam("Zip", zip)
      .withFormParam("Description", description)
      .withFormParam("email", email)
      .withFormParam("Phone", phone)
      .withSuccessResponse[String](200)
        /**
   * To delete Address to your address book
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param addressid The identifier of the address to be deleted.
   */
  def addressDeleteaddress(addressid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/address/deleteaddress.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("addressid", addressid)
      .withSuccessResponse[String](200)
        /**
   * List All Address 
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pagesize How many results to return, default is 10, max is 100, must be an integer
   * @param addressid addresses Sid
   * @param dateCreated date created address.
   */
  def addressListaddress(page: Option[Int], pagesize: Option[Int], addressid: Option[String] = None, dateCreated: Option[String] = None)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/address/listaddress.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("page", page)
      .withFormParam("pagesize", pagesize)
      .withFormParam("addressid", addressid)
      .withFormParam("dateCreated", dateCreated)
      .withSuccessResponse[String](200)
        /**
   * Validates an address given.
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param addressid The identifier of the address to be verified.
   */
  def addressVerifyaddress(addressid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/address/verifyaddress.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("addressid", addressid)
      .withSuccessResponse[String](200)
        /**
   * View Address Specific address Book by providing the address id
   * 
   * Expected answers:
   *   code 200 : String 
   * 
   * Available security schemes:
   *   auth (basic)
   * 
   * @param addressid The identifier of the address to be retrieved.
   */
  def addressViewaddress(addressid: String)(implicit basicAuth: BasicCredentials): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.ytel.com/api/v3", "/address/viewaddress.json", "application/x-www-form-urlencoded")
      .withCredentials(basicAuth)
      .withFormParam("addressid", addressid)
      .withSuccessResponse[String](200)
      

}

