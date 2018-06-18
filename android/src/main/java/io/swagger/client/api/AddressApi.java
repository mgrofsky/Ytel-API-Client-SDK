/**
 * Ytel API V3
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AddressApi {
  String basePath = "https://api.message360.com/api/v3/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Create Address
  * To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
   * @param name Name of user
   * @param address Address of user.
   * @param country Must be a 2 letter country short-name code (ISO 3166)
   * @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
   * @param city City Name.
   * @param zip Zip code of city.
   * @param description Description of addresses.
   * @param email Email Id of user.
   * @param phone Phone number of user.
   * @return String
  */
  public String addressCreateaddress (String name, String address, String country, String state, String city, String zip, String description, String email, String phone) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'name' is set
    if (name == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'name' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'name' when calling addressCreateaddress"));
    }
    // verify the required parameter 'address' is set
    if (address == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'address' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'address' when calling addressCreateaddress"));
    }
    // verify the required parameter 'country' is set
    if (country == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'country' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'country' when calling addressCreateaddress"));
    }
    // verify the required parameter 'state' is set
    if (state == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'state' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'state' when calling addressCreateaddress"));
    }
    // verify the required parameter 'city' is set
    if (city == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'city' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'city' when calling addressCreateaddress"));
    }
    // verify the required parameter 'zip' is set
    if (zip == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'zip' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'zip' when calling addressCreateaddress"));
    }

    // create path and map variables
    String path = "/address/createaddress.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (name != null) {
        localVarBuilder.addTextBody("Name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (address != null) {
        localVarBuilder.addTextBody("Address", ApiInvoker.parameterToString(address), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (country != null) {
        localVarBuilder.addTextBody("Country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (state != null) {
        localVarBuilder.addTextBody("State", ApiInvoker.parameterToString(state), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (city != null) {
        localVarBuilder.addTextBody("City", ApiInvoker.parameterToString(city), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (zip != null) {
        localVarBuilder.addTextBody("Zip", ApiInvoker.parameterToString(zip), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (description != null) {
        localVarBuilder.addTextBody("Description", ApiInvoker.parameterToString(description), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (email != null) {
        localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (phone != null) {
        localVarBuilder.addTextBody("Phone", ApiInvoker.parameterToString(phone), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("Name", ApiInvoker.parameterToString(name));
      formParams.put("Address", ApiInvoker.parameterToString(address));
      formParams.put("Country", ApiInvoker.parameterToString(country));
      formParams.put("State", ApiInvoker.parameterToString(state));
      formParams.put("City", ApiInvoker.parameterToString(city));
      formParams.put("Zip", ApiInvoker.parameterToString(zip));
      formParams.put("Description", ApiInvoker.parameterToString(description));
      formParams.put("email", ApiInvoker.parameterToString(email));
      formParams.put("Phone", ApiInvoker.parameterToString(phone));
    }

    String[] authNames = new String[] { "auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create Address
   * To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
   * @param name Name of user   * @param address Address of user.   * @param country Must be a 2 letter country short-name code (ISO 3166)   * @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.   * @param city City Name.   * @param zip Zip code of city.   * @param description Description of addresses.   * @param email Email Id of user.   * @param phone Phone number of user.
  */
  public void addressCreateaddress (String name, String address, String country, String state, String city, String zip, String description, String email, String phone, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'name' is set
    if (name == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'name' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'name' when calling addressCreateaddress"));
    }
    // verify the required parameter 'address' is set
    if (address == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'address' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'address' when calling addressCreateaddress"));
    }
    // verify the required parameter 'country' is set
    if (country == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'country' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'country' when calling addressCreateaddress"));
    }
    // verify the required parameter 'state' is set
    if (state == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'state' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'state' when calling addressCreateaddress"));
    }
    // verify the required parameter 'city' is set
    if (city == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'city' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'city' when calling addressCreateaddress"));
    }
    // verify the required parameter 'zip' is set
    if (zip == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'zip' when calling addressCreateaddress",
        new ApiException(400, "Missing the required parameter 'zip' when calling addressCreateaddress"));
    }

    // create path and map variables
    String path = "/address/createaddress.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (name != null) {
        localVarBuilder.addTextBody("Name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (address != null) {
        localVarBuilder.addTextBody("Address", ApiInvoker.parameterToString(address), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (country != null) {
        localVarBuilder.addTextBody("Country", ApiInvoker.parameterToString(country), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (state != null) {
        localVarBuilder.addTextBody("State", ApiInvoker.parameterToString(state), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (city != null) {
        localVarBuilder.addTextBody("City", ApiInvoker.parameterToString(city), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (zip != null) {
        localVarBuilder.addTextBody("Zip", ApiInvoker.parameterToString(zip), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (description != null) {
        localVarBuilder.addTextBody("Description", ApiInvoker.parameterToString(description), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (email != null) {
        localVarBuilder.addTextBody("email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (phone != null) {
        localVarBuilder.addTextBody("Phone", ApiInvoker.parameterToString(phone), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("Name", ApiInvoker.parameterToString(name));
formParams.put("Address", ApiInvoker.parameterToString(address));
formParams.put("Country", ApiInvoker.parameterToString(country));
formParams.put("State", ApiInvoker.parameterToString(state));
formParams.put("City", ApiInvoker.parameterToString(city));
formParams.put("Zip", ApiInvoker.parameterToString(zip));
formParams.put("Description", ApiInvoker.parameterToString(description));
formParams.put("email", ApiInvoker.parameterToString(email));
formParams.put("Phone", ApiInvoker.parameterToString(phone));
    }

    String[] authNames = new String[] { "auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete Address
  * To delete Address to your address book
   * @param addressid The identifier of the address to be deleted.
   * @return String
  */
  public String addressDeleteaddress (String addressid) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'addressid' is set
    if (addressid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressid' when calling addressDeleteaddress",
        new ApiException(400, "Missing the required parameter 'addressid' when calling addressDeleteaddress"));
    }

    // create path and map variables
    String path = "/address/deleteaddress.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("addressid", ApiInvoker.parameterToString(addressid));
    }

    String[] authNames = new String[] { "auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Delete Address
   * To delete Address to your address book
   * @param addressid The identifier of the address to be deleted.
  */
  public void addressDeleteaddress (String addressid, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'addressid' is set
    if (addressid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressid' when calling addressDeleteaddress",
        new ApiException(400, "Missing the required parameter 'addressid' when calling addressDeleteaddress"));
    }

    // create path and map variables
    String path = "/address/deleteaddress.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("addressid", ApiInvoker.parameterToString(addressid));
    }

    String[] authNames = new String[] { "auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * List Addresses
  * List All Address 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pagesize How many results to return, default is 10, max is 100, must be an integer
   * @param addressid addresses Sid
   * @param dateCreated date created address.
   * @return String
  */
  public String addressListaddress (Integer page, Integer pagesize, String addressid, String dateCreated) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/address/listaddress.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (page != null) {
        localVarBuilder.addTextBody("page", ApiInvoker.parameterToString(page), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (pagesize != null) {
        localVarBuilder.addTextBody("pagesize", ApiInvoker.parameterToString(pagesize), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (dateCreated != null) {
        localVarBuilder.addTextBody("dateCreated", ApiInvoker.parameterToString(dateCreated), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("page", ApiInvoker.parameterToString(page));
      formParams.put("pagesize", ApiInvoker.parameterToString(pagesize));
      formParams.put("addressid", ApiInvoker.parameterToString(addressid));
      formParams.put("dateCreated", ApiInvoker.parameterToString(dateCreated));
    }

    String[] authNames = new String[] { "auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * List Addresses
   * List All Address 
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.   * @param pagesize How many results to return, default is 10, max is 100, must be an integer   * @param addressid addresses Sid   * @param dateCreated date created address.
  */
  public void addressListaddress (Integer page, Integer pagesize, String addressid, String dateCreated, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/address/listaddress.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (page != null) {
        localVarBuilder.addTextBody("page", ApiInvoker.parameterToString(page), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pagesize != null) {
        localVarBuilder.addTextBody("pagesize", ApiInvoker.parameterToString(pagesize), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (dateCreated != null) {
        localVarBuilder.addTextBody("dateCreated", ApiInvoker.parameterToString(dateCreated), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("page", ApiInvoker.parameterToString(page));
formParams.put("pagesize", ApiInvoker.parameterToString(pagesize));
formParams.put("addressid", ApiInvoker.parameterToString(addressid));
formParams.put("dateCreated", ApiInvoker.parameterToString(dateCreated));
    }

    String[] authNames = new String[] { "auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Verify Address
  * Validates an address given.
   * @param addressid The identifier of the address to be verified.
   * @return String
  */
  public String addressVerifyaddress (String addressid) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'addressid' is set
    if (addressid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressid' when calling addressVerifyaddress",
        new ApiException(400, "Missing the required parameter 'addressid' when calling addressVerifyaddress"));
    }

    // create path and map variables
    String path = "/address/verifyaddress.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("addressid", ApiInvoker.parameterToString(addressid));
    }

    String[] authNames = new String[] { "auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Verify Address
   * Validates an address given.
   * @param addressid The identifier of the address to be verified.
  */
  public void addressVerifyaddress (String addressid, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'addressid' is set
    if (addressid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressid' when calling addressVerifyaddress",
        new ApiException(400, "Missing the required parameter 'addressid' when calling addressVerifyaddress"));
    }

    // create path and map variables
    String path = "/address/verifyaddress.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("addressid", ApiInvoker.parameterToString(addressid));
    }

    String[] authNames = new String[] { "auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * View Address
  * View Address Specific address Book by providing the address id
   * @param addressid The identifier of the address to be retrieved.
   * @return String
  */
  public String addressViewaddress (String addressid) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'addressid' is set
    if (addressid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressid' when calling addressViewaddress",
        new ApiException(400, "Missing the required parameter 'addressid' when calling addressViewaddress"));
    }

    // create path and map variables
    String path = "/address/viewaddress.json";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("addressid", ApiInvoker.parameterToString(addressid));
    }

    String[] authNames = new String[] { "auth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (String) ApiInvoker.deserialize(localVarResponse, "", String.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * View Address
   * View Address Specific address Book by providing the address id
   * @param addressid The identifier of the address to be retrieved.
  */
  public void addressViewaddress (String addressid, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'addressid' is set
    if (addressid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'addressid' when calling addressViewaddress",
        new ApiException(400, "Missing the required parameter 'addressid' when calling addressViewaddress"));
    }

    // create path and map variables
    String path = "/address/viewaddress.json".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (addressid != null) {
        localVarBuilder.addTextBody("addressid", ApiInvoker.parameterToString(addressid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("addressid", ApiInvoker.parameterToString(addressid));
    }

    String[] authNames = new String[] { "auth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((String) ApiInvoker.deserialize(localVarResponse,  "", String.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}