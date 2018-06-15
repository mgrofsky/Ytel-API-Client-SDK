

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostCardApi {
    private ApiClient apiClient;

    public PostCardApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PostCardApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postcardCreatepostcard
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing postcard by attaching its PostcardId. (required)
     * @param front A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param back A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. (required)
     * @param message The message for the back of the postcard with a maximum of 350 characters. (required)
     * @param setting Code for the dimensions of the media to be printed. (required)
     * @param description A description for the postcard. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postcardCreatepostcardCall(String to, String from, String attachbyid, String front, String back, String message, String setting, String description, String htmldata, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Postcard/createpostcard.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (to != null)
        localVarFormParams.put("to", to);
        if (from != null)
        localVarFormParams.put("from", from);
        if (attachbyid != null)
        localVarFormParams.put("attachbyid", attachbyid);
        if (front != null)
        localVarFormParams.put("front", front);
        if (back != null)
        localVarFormParams.put("back", back);
        if (message != null)
        localVarFormParams.put("message", message);
        if (setting != null)
        localVarFormParams.put("setting", setting);
        if (description != null)
        localVarFormParams.put("description", description);
        if (htmldata != null)
        localVarFormParams.put("htmldata", htmldata);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postcardCreatepostcardValidateBeforeCall(String to, String from, String attachbyid, String front, String back, String message, String setting, String description, String htmldata, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling postcardCreatepostcard(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling postcardCreatepostcard(Async)");
        }
        
        // verify the required parameter 'attachbyid' is set
        if (attachbyid == null) {
            throw new ApiException("Missing the required parameter 'attachbyid' when calling postcardCreatepostcard(Async)");
        }
        
        // verify the required parameter 'front' is set
        if (front == null) {
            throw new ApiException("Missing the required parameter 'front' when calling postcardCreatepostcard(Async)");
        }
        
        // verify the required parameter 'back' is set
        if (back == null) {
            throw new ApiException("Missing the required parameter 'back' when calling postcardCreatepostcard(Async)");
        }
        
        // verify the required parameter 'message' is set
        if (message == null) {
            throw new ApiException("Missing the required parameter 'message' when calling postcardCreatepostcard(Async)");
        }
        
        // verify the required parameter 'setting' is set
        if (setting == null) {
            throw new ApiException("Missing the required parameter 'setting' when calling postcardCreatepostcard(Async)");
        }
        

        com.squareup.okhttp.Call call = postcardCreatepostcardCall(to, from, attachbyid, front, back, message, setting, description, htmldata, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Postcard
     * Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing postcard by attaching its PostcardId. (required)
     * @param front A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param back A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. (required)
     * @param message The message for the back of the postcard with a maximum of 350 characters. (required)
     * @param setting Code for the dimensions of the media to be printed. (required)
     * @param description A description for the postcard. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String postcardCreatepostcard(String to, String from, String attachbyid, String front, String back, String message, String setting, String description, String htmldata) throws ApiException {
        ApiResponse<String> resp = postcardCreatepostcardWithHttpInfo(to, from, attachbyid, front, back, message, setting, description, htmldata);
        return resp.getData();
    }

    /**
     * Create Postcard
     * Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing postcard by attaching its PostcardId. (required)
     * @param front A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param back A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. (required)
     * @param message The message for the back of the postcard with a maximum of 350 characters. (required)
     * @param setting Code for the dimensions of the media to be printed. (required)
     * @param description A description for the postcard. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> postcardCreatepostcardWithHttpInfo(String to, String from, String attachbyid, String front, String back, String message, String setting, String description, String htmldata) throws ApiException {
        com.squareup.okhttp.Call call = postcardCreatepostcardValidateBeforeCall(to, from, attachbyid, front, back, message, setting, description, htmldata, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Postcard (asynchronously)
     * Create, print, and mail a postcard to an address. The postcard front must be supplied as a PDF, image, or an HTML string. The back can be a PDF, image, HTML string, or it can be automatically generated by supplying a custom message.
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing postcard by attaching its PostcardId. (required)
     * @param front A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the front of the postcard.  This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param back A 4.25\&quot;x6.25\&quot; or 6.25\&quot;x11.25\&quot; image to use as the back of the postcard, supplied as a URL, local file, or HTML string.  This allows you to customize your back design, but we will still insert the recipient address for you. (required)
     * @param message The message for the back of the postcard with a maximum of 350 characters. (required)
     * @param setting Code for the dimensions of the media to be printed. (required)
     * @param description A description for the postcard. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postcardCreatepostcardAsync(String to, String from, String attachbyid, String front, String back, String message, String setting, String description, String htmldata, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postcardCreatepostcardValidateBeforeCall(to, from, attachbyid, front, back, message, setting, description, htmldata, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postcardDeletepostcard
     * @param postcardid The unique identifier of a postcard object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postcardDeletepostcardCall(String postcardid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Postcard/deletepostcard.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (postcardid != null)
        localVarFormParams.put("postcardid", postcardid);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postcardDeletepostcardValidateBeforeCall(String postcardid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'postcardid' is set
        if (postcardid == null) {
            throw new ApiException("Missing the required parameter 'postcardid' when calling postcardDeletepostcard(Async)");
        }
        

        com.squareup.okhttp.Call call = postcardDeletepostcardCall(postcardid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Postcard
     * Remove a postcard object.
     * @param postcardid The unique identifier of a postcard object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String postcardDeletepostcard(String postcardid) throws ApiException {
        ApiResponse<String> resp = postcardDeletepostcardWithHttpInfo(postcardid);
        return resp.getData();
    }

    /**
     * Delete Postcard
     * Remove a postcard object.
     * @param postcardid The unique identifier of a postcard object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> postcardDeletepostcardWithHttpInfo(String postcardid) throws ApiException {
        com.squareup.okhttp.Call call = postcardDeletepostcardValidateBeforeCall(postcardid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Postcard (asynchronously)
     * Remove a postcard object.
     * @param postcardid The unique identifier of a postcard object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postcardDeletepostcardAsync(String postcardid, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postcardDeletepostcardValidateBeforeCall(postcardid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postcardListpostcard
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param postcardid The unique identifier for a postcard object. (optional)
     * @param dateCreated The date the postcard was created. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postcardListpostcardCall(Integer page, Integer pagesize, String postcardid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Postcard/listpostcard.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (postcardid != null)
        localVarFormParams.put("postcardid", postcardid);
        if (dateCreated != null)
        localVarFormParams.put("dateCreated", dateCreated);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postcardListpostcardValidateBeforeCall(Integer page, Integer pagesize, String postcardid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = postcardListpostcardCall(page, pagesize, postcardid, dateCreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Postcards
     * Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param postcardid The unique identifier for a postcard object. (optional)
     * @param dateCreated The date the postcard was created. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String postcardListpostcard(Integer page, Integer pagesize, String postcardid, String dateCreated) throws ApiException {
        ApiResponse<String> resp = postcardListpostcardWithHttpInfo(page, pagesize, postcardid, dateCreated);
        return resp.getData();
    }

    /**
     * List Postcards
     * Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param postcardid The unique identifier for a postcard object. (optional)
     * @param dateCreated The date the postcard was created. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> postcardListpostcardWithHttpInfo(Integer page, Integer pagesize, String postcardid, String dateCreated) throws ApiException {
        com.squareup.okhttp.Call call = postcardListpostcardValidateBeforeCall(page, pagesize, postcardid, dateCreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Postcards (asynchronously)
     * Retrieve a list of postcard objects. The postcards objects are sorted by creation date, with the most recently created postcards appearing first.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param postcardid The unique identifier for a postcard object. (optional)
     * @param dateCreated The date the postcard was created. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postcardListpostcardAsync(Integer page, Integer pagesize, String postcardid, String dateCreated, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postcardListpostcardValidateBeforeCall(page, pagesize, postcardid, dateCreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postcardViewpostcard
     * @param postcardid The unique identifier for a postcard object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postcardViewpostcardCall(String postcardid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/Postcard/viewpostcard.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (postcardid != null)
        localVarFormParams.put("postcardid", postcardid);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postcardViewpostcardValidateBeforeCall(String postcardid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'postcardid' is set
        if (postcardid == null) {
            throw new ApiException("Missing the required parameter 'postcardid' when calling postcardViewpostcard(Async)");
        }
        

        com.squareup.okhttp.Call call = postcardViewpostcardCall(postcardid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Postcard
     * Retrieve a postcard object by its PostcardId.
     * @param postcardid The unique identifier for a postcard object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String postcardViewpostcard(String postcardid) throws ApiException {
        ApiResponse<String> resp = postcardViewpostcardWithHttpInfo(postcardid);
        return resp.getData();
    }

    /**
     * View Postcard
     * Retrieve a postcard object by its PostcardId.
     * @param postcardid The unique identifier for a postcard object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> postcardViewpostcardWithHttpInfo(String postcardid) throws ApiException {
        com.squareup.okhttp.Call call = postcardViewpostcardValidateBeforeCall(postcardid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Postcard (asynchronously)
     * Retrieve a postcard object by its PostcardId.
     * @param postcardid The unique identifier for a postcard object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postcardViewpostcardAsync(String postcardid, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postcardViewpostcardValidateBeforeCall(postcardid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
