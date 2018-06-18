/**
 * Ytel API V3
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.0
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

public class AreaMailApi {
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
  * Create AreaMail
  * Create a new AreaMail object.
   * @param routes List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
   * @param attachbyid Set an existing areamail by attaching its AreamailId.
   * @param front The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
   * @param back The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
   * @param description A string value to use as a description for this AreaMail item.
   * @param targettype The delivery location type.
   * @param htmldata A string value that contains HTML markup.
   * @return String
  */
  public String areamailCreate (String routes, String attachbyid, String front, String back, String description, String targettype, String htmldata) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'routes' is set
    if (routes == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routes' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'routes' when calling areamailCreate"));
    }
    // verify the required parameter 'attachbyid' is set
    if (attachbyid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'attachbyid' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'attachbyid' when calling areamailCreate"));
    }
    // verify the required parameter 'front' is set
    if (front == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'front' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'front' when calling areamailCreate"));
    }
    // verify the required parameter 'back' is set
    if (back == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'back' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'back' when calling areamailCreate"));
    }

    // create path and map variables
    String path = "/areamail/create.json";

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
      if (routes != null) {
        localVarBuilder.addTextBody("routes", ApiInvoker.parameterToString(routes), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (attachbyid != null) {
        localVarBuilder.addTextBody("attachbyid", ApiInvoker.parameterToString(attachbyid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (front != null) {
        localVarBuilder.addTextBody("front", ApiInvoker.parameterToString(front), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (back != null) {
        localVarBuilder.addTextBody("back", ApiInvoker.parameterToString(back), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (description != null) {
        localVarBuilder.addTextBody("description", ApiInvoker.parameterToString(description), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (targettype != null) {
        localVarBuilder.addTextBody("targettype", ApiInvoker.parameterToString(targettype), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (htmldata != null) {
        localVarBuilder.addTextBody("htmldata", ApiInvoker.parameterToString(htmldata), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("routes", ApiInvoker.parameterToString(routes));
      formParams.put("attachbyid", ApiInvoker.parameterToString(attachbyid));
      formParams.put("front", ApiInvoker.parameterToString(front));
      formParams.put("back", ApiInvoker.parameterToString(back));
      formParams.put("description", ApiInvoker.parameterToString(description));
      formParams.put("targettype", ApiInvoker.parameterToString(targettype));
      formParams.put("htmldata", ApiInvoker.parameterToString(htmldata));
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
   * Create AreaMail
   * Create a new AreaMail object.
   * @param routes List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043   * @param attachbyid Set an existing areamail by attaching its AreamailId.   * @param front The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required   * @param back The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.   * @param description A string value to use as a description for this AreaMail item.   * @param targettype The delivery location type.   * @param htmldata A string value that contains HTML markup.
  */
  public void areamailCreate (String routes, String attachbyid, String front, String back, String description, String targettype, String htmldata, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'routes' is set
    if (routes == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routes' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'routes' when calling areamailCreate"));
    }
    // verify the required parameter 'attachbyid' is set
    if (attachbyid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'attachbyid' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'attachbyid' when calling areamailCreate"));
    }
    // verify the required parameter 'front' is set
    if (front == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'front' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'front' when calling areamailCreate"));
    }
    // verify the required parameter 'back' is set
    if (back == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'back' when calling areamailCreate",
        new ApiException(400, "Missing the required parameter 'back' when calling areamailCreate"));
    }

    // create path and map variables
    String path = "/areamail/create.json".replaceAll("\\{format\\}","json");

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
      
      if (routes != null) {
        localVarBuilder.addTextBody("routes", ApiInvoker.parameterToString(routes), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (attachbyid != null) {
        localVarBuilder.addTextBody("attachbyid", ApiInvoker.parameterToString(attachbyid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (front != null) {
        localVarBuilder.addTextBody("front", ApiInvoker.parameterToString(front), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (back != null) {
        localVarBuilder.addTextBody("back", ApiInvoker.parameterToString(back), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (description != null) {
        localVarBuilder.addTextBody("description", ApiInvoker.parameterToString(description), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (targettype != null) {
        localVarBuilder.addTextBody("targettype", ApiInvoker.parameterToString(targettype), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (htmldata != null) {
        localVarBuilder.addTextBody("htmldata", ApiInvoker.parameterToString(htmldata), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("routes", ApiInvoker.parameterToString(routes));
formParams.put("attachbyid", ApiInvoker.parameterToString(attachbyid));
formParams.put("front", ApiInvoker.parameterToString(front));
formParams.put("back", ApiInvoker.parameterToString(back));
formParams.put("description", ApiInvoker.parameterToString(description));
formParams.put("targettype", ApiInvoker.parameterToString(targettype));
formParams.put("htmldata", ApiInvoker.parameterToString(htmldata));
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
  * Delete AreaMail
  * Remove an AreaMail object by its AreaMailId.
   * @param areamailid The unique identifier for an AreaMail object.
   * @return String
  */
  public String areamailDelete (String areamailid) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'areamailid' is set
    if (areamailid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'areamailid' when calling areamailDelete",
        new ApiException(400, "Missing the required parameter 'areamailid' when calling areamailDelete"));
    }

    // create path and map variables
    String path = "/areamail/delete.json";

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
      if (areamailid != null) {
        localVarBuilder.addTextBody("areamailid", ApiInvoker.parameterToString(areamailid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("areamailid", ApiInvoker.parameterToString(areamailid));
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
   * Delete AreaMail
   * Remove an AreaMail object by its AreaMailId.
   * @param areamailid The unique identifier for an AreaMail object.
  */
  public void areamailDelete (String areamailid, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'areamailid' is set
    if (areamailid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'areamailid' when calling areamailDelete",
        new ApiException(400, "Missing the required parameter 'areamailid' when calling areamailDelete"));
    }

    // create path and map variables
    String path = "/areamail/delete.json".replaceAll("\\{format\\}","json");

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
      
      if (areamailid != null) {
        localVarBuilder.addTextBody("areamailid", ApiInvoker.parameterToString(areamailid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("areamailid", ApiInvoker.parameterToString(areamailid));
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
  * List AreaMails
  * Retrieve a list of AreaMail objects.
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
   * @param pagesize The count of objects to return per page.
   * @param areamailsid The unique identifier for an AreaMail object.
   * @param dateCreated The date the AreaMail was created.
   * @return String
  */
  public String areamailLists (Integer page, Integer pagesize, String areamailsid, String dateCreated) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/areamail/lists.json";

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
      if (areamailsid != null) {
        localVarBuilder.addTextBody("areamailsid", ApiInvoker.parameterToString(areamailsid), ApiInvoker.TEXT_PLAIN_UTF8);
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
      formParams.put("areamailsid", ApiInvoker.parameterToString(areamailsid));
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
   * List AreaMails
   * Retrieve a list of AreaMail objects.
   * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1.   * @param pagesize The count of objects to return per page.   * @param areamailsid The unique identifier for an AreaMail object.   * @param dateCreated The date the AreaMail was created.
  */
  public void areamailLists (Integer page, Integer pagesize, String areamailsid, String dateCreated, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/areamail/lists.json".replaceAll("\\{format\\}","json");

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
      
      if (areamailsid != null) {
        localVarBuilder.addTextBody("areamailsid", ApiInvoker.parameterToString(areamailsid), ApiInvoker.TEXT_PLAIN_UTF8);
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
formParams.put("areamailsid", ApiInvoker.parameterToString(areamailsid));
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
  * View AreaMail
  * Retrieve an AreaMail object by its AreaMailId.
   * @param areamailid The unique identifier for an AreaMail object.
   * @return String
  */
  public String areamailView (String areamailid) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'areamailid' is set
    if (areamailid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'areamailid' when calling areamailView",
        new ApiException(400, "Missing the required parameter 'areamailid' when calling areamailView"));
    }

    // create path and map variables
    String path = "/areamail/view.json";

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
      if (areamailid != null) {
        localVarBuilder.addTextBody("areamailid", ApiInvoker.parameterToString(areamailid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("areamailid", ApiInvoker.parameterToString(areamailid));
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
   * View AreaMail
   * Retrieve an AreaMail object by its AreaMailId.
   * @param areamailid The unique identifier for an AreaMail object.
  */
  public void areamailView (String areamailid, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'areamailid' is set
    if (areamailid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'areamailid' when calling areamailView",
        new ApiException(400, "Missing the required parameter 'areamailid' when calling areamailView"));
    }

    // create path and map variables
    String path = "/areamail/view.json".replaceAll("\\{format\\}","json");

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
      
      if (areamailid != null) {
        localVarBuilder.addTextBody("areamailid", ApiInvoker.parameterToString(areamailid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("areamailid", ApiInvoker.parameterToString(areamailid));
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
