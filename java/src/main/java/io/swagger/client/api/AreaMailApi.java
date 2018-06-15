

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

public class AreaMailApi {
    private ApiClient apiClient;

    public AreaMailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AreaMailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for areamailCreate
     * @param routes List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 (required)
     * @param attachbyid Set an existing areamail by attaching its AreamailId. (required)
     * @param front The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required (required)
     * @param back The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param description A string value to use as a description for this AreaMail item. (optional)
     * @param targettype The delivery location type. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call areamailCreateCall(String routes, String attachbyid, String front, String back, String description, String targettype, String htmldata, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/areamail/create.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (routes != null)
        localVarFormParams.put("routes", routes);
        if (attachbyid != null)
        localVarFormParams.put("attachbyid", attachbyid);
        if (front != null)
        localVarFormParams.put("front", front);
        if (back != null)
        localVarFormParams.put("back", back);
        if (description != null)
        localVarFormParams.put("description", description);
        if (targettype != null)
        localVarFormParams.put("targettype", targettype);
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
    private com.squareup.okhttp.Call areamailCreateValidateBeforeCall(String routes, String attachbyid, String front, String back, String description, String targettype, String htmldata, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'routes' is set
        if (routes == null) {
            throw new ApiException("Missing the required parameter 'routes' when calling areamailCreate(Async)");
        }
        
        // verify the required parameter 'attachbyid' is set
        if (attachbyid == null) {
            throw new ApiException("Missing the required parameter 'attachbyid' when calling areamailCreate(Async)");
        }
        
        // verify the required parameter 'front' is set
        if (front == null) {
            throw new ApiException("Missing the required parameter 'front' when calling areamailCreate(Async)");
        }
        
        // verify the required parameter 'back' is set
        if (back == null) {
            throw new ApiException("Missing the required parameter 'back' when calling areamailCreate(Async)");
        }
        

        com.squareup.okhttp.Call call = areamailCreateCall(routes, attachbyid, front, back, description, targettype, htmldata, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create AreaMail
     * Create a new AreaMail object.
     * @param routes List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 (required)
     * @param attachbyid Set an existing areamail by attaching its AreamailId. (required)
     * @param front The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required (required)
     * @param back The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param description A string value to use as a description for this AreaMail item. (optional)
     * @param targettype The delivery location type. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String areamailCreate(String routes, String attachbyid, String front, String back, String description, String targettype, String htmldata) throws ApiException {
        ApiResponse<String> resp = areamailCreateWithHttpInfo(routes, attachbyid, front, back, description, targettype, htmldata);
        return resp.getData();
    }

    /**
     * Create AreaMail
     * Create a new AreaMail object.
     * @param routes List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 (required)
     * @param attachbyid Set an existing areamail by attaching its AreamailId. (required)
     * @param front The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required (required)
     * @param back The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param description A string value to use as a description for this AreaMail item. (optional)
     * @param targettype The delivery location type. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> areamailCreateWithHttpInfo(String routes, String attachbyid, String front, String back, String description, String targettype, String htmldata) throws ApiException {
        com.squareup.okhttp.Call call = areamailCreateValidateBeforeCall(routes, attachbyid, front, back, description, targettype, htmldata, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create AreaMail (asynchronously)
     * Create a new AreaMail object.
     * @param routes List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 (required)
     * @param attachbyid Set an existing areamail by attaching its AreamailId. (required)
     * @param front The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required (required)
     * @param back The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. (required)
     * @param description A string value to use as a description for this AreaMail item. (optional)
     * @param targettype The delivery location type. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call areamailCreateAsync(String routes, String attachbyid, String front, String back, String description, String targettype, String htmldata, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = areamailCreateValidateBeforeCall(routes, attachbyid, front, back, description, targettype, htmldata, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for areamailDelete
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call areamailDeleteCall(String areamailid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/areamail/delete.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (areamailid != null)
        localVarFormParams.put("areamailid", areamailid);

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
    private com.squareup.okhttp.Call areamailDeleteValidateBeforeCall(String areamailid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'areamailid' is set
        if (areamailid == null) {
            throw new ApiException("Missing the required parameter 'areamailid' when calling areamailDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = areamailDeleteCall(areamailid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete AreaMail
     * Remove an AreaMail object by its AreaMailId.
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String areamailDelete(String areamailid) throws ApiException {
        ApiResponse<String> resp = areamailDeleteWithHttpInfo(areamailid);
        return resp.getData();
    }

    /**
     * Delete AreaMail
     * Remove an AreaMail object by its AreaMailId.
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> areamailDeleteWithHttpInfo(String areamailid) throws ApiException {
        com.squareup.okhttp.Call call = areamailDeleteValidateBeforeCall(areamailid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete AreaMail (asynchronously)
     * Remove an AreaMail object by its AreaMailId.
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call areamailDeleteAsync(String areamailid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = areamailDeleteValidateBeforeCall(areamailid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for areamailLists
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param areamailsid The unique identifier for an AreaMail object. (optional)
     * @param dateCreated The date the AreaMail was created. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call areamailListsCall(Integer page, Integer pagesize, String areamailsid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/areamail/lists.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (areamailsid != null)
        localVarFormParams.put("areamailsid", areamailsid);
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
    private com.squareup.okhttp.Call areamailListsValidateBeforeCall(Integer page, Integer pagesize, String areamailsid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = areamailListsCall(page, pagesize, areamailsid, dateCreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List AreaMails
     * Retrieve a list of AreaMail objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param areamailsid The unique identifier for an AreaMail object. (optional)
     * @param dateCreated The date the AreaMail was created. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String areamailLists(Integer page, Integer pagesize, String areamailsid, String dateCreated) throws ApiException {
        ApiResponse<String> resp = areamailListsWithHttpInfo(page, pagesize, areamailsid, dateCreated);
        return resp.getData();
    }

    /**
     * List AreaMails
     * Retrieve a list of AreaMail objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param areamailsid The unique identifier for an AreaMail object. (optional)
     * @param dateCreated The date the AreaMail was created. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> areamailListsWithHttpInfo(Integer page, Integer pagesize, String areamailsid, String dateCreated) throws ApiException {
        com.squareup.okhttp.Call call = areamailListsValidateBeforeCall(page, pagesize, areamailsid, dateCreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List AreaMails (asynchronously)
     * Retrieve a list of AreaMail objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param areamailsid The unique identifier for an AreaMail object. (optional)
     * @param dateCreated The date the AreaMail was created. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call areamailListsAsync(Integer page, Integer pagesize, String areamailsid, String dateCreated, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = areamailListsValidateBeforeCall(page, pagesize, areamailsid, dateCreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for areamailView
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call areamailViewCall(String areamailid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/areamail/view.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (areamailid != null)
        localVarFormParams.put("areamailid", areamailid);

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
    private com.squareup.okhttp.Call areamailViewValidateBeforeCall(String areamailid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'areamailid' is set
        if (areamailid == null) {
            throw new ApiException("Missing the required parameter 'areamailid' when calling areamailView(Async)");
        }
        

        com.squareup.okhttp.Call call = areamailViewCall(areamailid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View AreaMail
     * Retrieve an AreaMail object by its AreaMailId.
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String areamailView(String areamailid) throws ApiException {
        ApiResponse<String> resp = areamailViewWithHttpInfo(areamailid);
        return resp.getData();
    }

    /**
     * View AreaMail
     * Retrieve an AreaMail object by its AreaMailId.
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> areamailViewWithHttpInfo(String areamailid) throws ApiException {
        com.squareup.okhttp.Call call = areamailViewValidateBeforeCall(areamailid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View AreaMail (asynchronously)
     * Retrieve an AreaMail object by its AreaMailId.
     * @param areamailid The unique identifier for an AreaMail object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call areamailViewAsync(String areamailid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = areamailViewValidateBeforeCall(areamailid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
