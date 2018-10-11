/**
 * Ytel API V3
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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

public class SubAccountApi {
  String basePath = "https://api.ytel.com/api/v3";
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
  * Create Subaccount
  * Create a sub user account under the parent account
   * @param firstName Sub account user first name
   * @param lastName sub account user last name
   * @param email Sub account email address
   * @param friendlyName Descriptive name of the sub account
   * @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
   * @return String
  */
  public String userCreatesubaccount (String firstName, String lastName, String email, String friendlyName, String password) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'firstName' is set
    if (firstName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'firstName' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'firstName' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'lastName' is set
    if (lastName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'lastName' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'lastName' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'email' is set
    if (email == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'email' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'friendlyName' is set
    if (friendlyName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'friendlyName' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'friendlyName' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'password' is set
    if (password == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'password' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'password' when calling userCreatesubaccount"));
    }

    // create path and map variables
    String path = "/user/createsubaccount.json";

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
      if (firstName != null) {
        localVarBuilder.addTextBody("FirstName", ApiInvoker.parameterToString(firstName), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (lastName != null) {
        localVarBuilder.addTextBody("LastName", ApiInvoker.parameterToString(lastName), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (email != null) {
        localVarBuilder.addTextBody("Email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (friendlyName != null) {
        localVarBuilder.addTextBody("FriendlyName", ApiInvoker.parameterToString(friendlyName), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (password != null) {
        localVarBuilder.addTextBody("Password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("FirstName", ApiInvoker.parameterToString(firstName));
      formParams.put("LastName", ApiInvoker.parameterToString(lastName));
      formParams.put("Email", ApiInvoker.parameterToString(email));
      formParams.put("FriendlyName", ApiInvoker.parameterToString(friendlyName));
      formParams.put("Password", ApiInvoker.parameterToString(password));
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
   * Create Subaccount
   * Create a sub user account under the parent account
   * @param firstName Sub account user first name   * @param lastName sub account user last name   * @param email Sub account email address   * @param friendlyName Descriptive name of the sub account   * @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
  */
  public void userCreatesubaccount (String firstName, String lastName, String email, String friendlyName, String password, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'firstName' is set
    if (firstName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'firstName' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'firstName' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'lastName' is set
    if (lastName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'lastName' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'lastName' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'email' is set
    if (email == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'email' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'email' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'friendlyName' is set
    if (friendlyName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'friendlyName' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'friendlyName' when calling userCreatesubaccount"));
    }
    // verify the required parameter 'password' is set
    if (password == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'password' when calling userCreatesubaccount",
        new ApiException(400, "Missing the required parameter 'password' when calling userCreatesubaccount"));
    }

    // create path and map variables
    String path = "/user/createsubaccount.json".replaceAll("\\{format\\}","json");

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
      
      if (firstName != null) {
        localVarBuilder.addTextBody("FirstName", ApiInvoker.parameterToString(firstName), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (lastName != null) {
        localVarBuilder.addTextBody("LastName", ApiInvoker.parameterToString(lastName), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (email != null) {
        localVarBuilder.addTextBody("Email", ApiInvoker.parameterToString(email), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (friendlyName != null) {
        localVarBuilder.addTextBody("FriendlyName", ApiInvoker.parameterToString(friendlyName), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (password != null) {
        localVarBuilder.addTextBody("Password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("FirstName", ApiInvoker.parameterToString(firstName));
formParams.put("LastName", ApiInvoker.parameterToString(lastName));
formParams.put("Email", ApiInvoker.parameterToString(email));
formParams.put("FriendlyName", ApiInvoker.parameterToString(friendlyName));
formParams.put("Password", ApiInvoker.parameterToString(password));
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
  * Delete Subaccount
  * Delete sub account or merge numbers into parent
   * @param subAccountSID The SubaccountSid to be deleted
   * @param mergeNumber 0 to delete or 1 to merge numbers to parent account.
   * @return String
  */
  public String userDeletesubaccount (String subAccountSID, String mergeNumber) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'subAccountSID' is set
    if (subAccountSID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subAccountSID' when calling userDeletesubaccount",
        new ApiException(400, "Missing the required parameter 'subAccountSID' when calling userDeletesubaccount"));
    }
    // verify the required parameter 'mergeNumber' is set
    if (mergeNumber == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'mergeNumber' when calling userDeletesubaccount",
        new ApiException(400, "Missing the required parameter 'mergeNumber' when calling userDeletesubaccount"));
    }

    // create path and map variables
    String path = "/user/deletesubaccount.json";

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
      if (subAccountSID != null) {
        localVarBuilder.addTextBody("SubAccountSID", ApiInvoker.parameterToString(subAccountSID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (mergeNumber != null) {
        localVarBuilder.addTextBody("MergeNumber", ApiInvoker.parameterToString(mergeNumber), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("SubAccountSID", ApiInvoker.parameterToString(subAccountSID));
      formParams.put("MergeNumber", ApiInvoker.parameterToString(mergeNumber));
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
   * Delete Subaccount
   * Delete sub account or merge numbers into parent
   * @param subAccountSID The SubaccountSid to be deleted   * @param mergeNumber 0 to delete or 1 to merge numbers to parent account.
  */
  public void userDeletesubaccount (String subAccountSID, String mergeNumber, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'subAccountSID' is set
    if (subAccountSID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subAccountSID' when calling userDeletesubaccount",
        new ApiException(400, "Missing the required parameter 'subAccountSID' when calling userDeletesubaccount"));
    }
    // verify the required parameter 'mergeNumber' is set
    if (mergeNumber == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'mergeNumber' when calling userDeletesubaccount",
        new ApiException(400, "Missing the required parameter 'mergeNumber' when calling userDeletesubaccount"));
    }

    // create path and map variables
    String path = "/user/deletesubaccount.json".replaceAll("\\{format\\}","json");

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
      
      if (subAccountSID != null) {
        localVarBuilder.addTextBody("SubAccountSID", ApiInvoker.parameterToString(subAccountSID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (mergeNumber != null) {
        localVarBuilder.addTextBody("MergeNumber", ApiInvoker.parameterToString(mergeNumber), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("SubAccountSID", ApiInvoker.parameterToString(subAccountSID));
formParams.put("MergeNumber", ApiInvoker.parameterToString(mergeNumber));
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
  * Toggle Subaccount Status
  * Suspend or unsuspend
   * @param subAccountSID The SubaccountSid to be activated or suspended
   * @param activate 0 to suspend or 1 to activate
   * @return String
  */
  public String userSubaccountactivation (String subAccountSID, String activate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'subAccountSID' is set
    if (subAccountSID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subAccountSID' when calling userSubaccountactivation",
        new ApiException(400, "Missing the required parameter 'subAccountSID' when calling userSubaccountactivation"));
    }
    // verify the required parameter 'activate' is set
    if (activate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'activate' when calling userSubaccountactivation",
        new ApiException(400, "Missing the required parameter 'activate' when calling userSubaccountactivation"));
    }

    // create path and map variables
    String path = "/user/subaccountactivation.json";

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
      if (subAccountSID != null) {
        localVarBuilder.addTextBody("SubAccountSID", ApiInvoker.parameterToString(subAccountSID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (activate != null) {
        localVarBuilder.addTextBody("Activate", ApiInvoker.parameterToString(activate), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("SubAccountSID", ApiInvoker.parameterToString(subAccountSID));
      formParams.put("Activate", ApiInvoker.parameterToString(activate));
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
   * Toggle Subaccount Status
   * Suspend or unsuspend
   * @param subAccountSID The SubaccountSid to be activated or suspended   * @param activate 0 to suspend or 1 to activate
  */
  public void userSubaccountactivation (String subAccountSID, String activate, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'subAccountSID' is set
    if (subAccountSID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'subAccountSID' when calling userSubaccountactivation",
        new ApiException(400, "Missing the required parameter 'subAccountSID' when calling userSubaccountactivation"));
    }
    // verify the required parameter 'activate' is set
    if (activate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'activate' when calling userSubaccountactivation",
        new ApiException(400, "Missing the required parameter 'activate' when calling userSubaccountactivation"));
    }

    // create path and map variables
    String path = "/user/subaccountactivation.json".replaceAll("\\{format\\}","json");

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
      
      if (subAccountSID != null) {
        localVarBuilder.addTextBody("SubAccountSID", ApiInvoker.parameterToString(subAccountSID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (activate != null) {
        localVarBuilder.addTextBody("Activate", ApiInvoker.parameterToString(activate), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("SubAccountSID", ApiInvoker.parameterToString(subAccountSID));
formParams.put("Activate", ApiInvoker.parameterToString(activate));
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
