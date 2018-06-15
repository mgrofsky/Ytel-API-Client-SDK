

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


import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedShortCodeApi {
    private ApiClient apiClient;

    public SharedShortCodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SharedShortCodeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for keywordLists
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param keyword Only list keywords of keyword (optional)
     * @param shortcode Only list keywords of shortcode (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call keywordListsCall(Integer page, Integer pagesize, String keyword, Integer shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/keyword/lists.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (keyword != null)
        localVarFormParams.put("Keyword", keyword);
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);

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
    private com.squareup.okhttp.Call keywordListsValidateBeforeCall(Integer page, Integer pagesize, String keyword, Integer shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = keywordListsCall(page, pagesize, keyword, shortcode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Keywords
     * Retrieve a list of keywords associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param keyword Only list keywords of keyword (optional)
     * @param shortcode Only list keywords of shortcode (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String keywordLists(Integer page, Integer pagesize, String keyword, Integer shortcode) throws ApiException {
        ApiResponse<String> resp = keywordListsWithHttpInfo(page, pagesize, keyword, shortcode);
        return resp.getData();
    }

    /**
     * List Keywords
     * Retrieve a list of keywords associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param keyword Only list keywords of keyword (optional)
     * @param shortcode Only list keywords of shortcode (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> keywordListsWithHttpInfo(Integer page, Integer pagesize, String keyword, Integer shortcode) throws ApiException {
        com.squareup.okhttp.Call call = keywordListsValidateBeforeCall(page, pagesize, keyword, shortcode, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Keywords (asynchronously)
     * Retrieve a list of keywords associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param keyword Only list keywords of keyword (optional)
     * @param shortcode Only list keywords of shortcode (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call keywordListsAsync(Integer page, Integer pagesize, String keyword, Integer shortcode, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = keywordListsValidateBeforeCall(page, pagesize, keyword, shortcode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for keywordView
     * @param keywordid The unique identifier of each keyword (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call keywordViewCall(String keywordid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/keyword/view.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (keywordid != null)
        localVarFormParams.put("Keywordid", keywordid);

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
    private com.squareup.okhttp.Call keywordViewValidateBeforeCall(String keywordid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keywordid' is set
        if (keywordid == null) {
            throw new ApiException("Missing the required parameter 'keywordid' when calling keywordView(Async)");
        }
        

        com.squareup.okhttp.Call call = keywordViewCall(keywordid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Keyword
     * View a set of properties for a single keyword.
     * @param keywordid The unique identifier of each keyword (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String keywordView(String keywordid) throws ApiException {
        ApiResponse<String> resp = keywordViewWithHttpInfo(keywordid);
        return resp.getData();
    }

    /**
     * View Keyword
     * View a set of properties for a single keyword.
     * @param keywordid The unique identifier of each keyword (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> keywordViewWithHttpInfo(String keywordid) throws ApiException {
        com.squareup.okhttp.Call call = keywordViewValidateBeforeCall(keywordid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Keyword (asynchronously)
     * View a set of properties for a single keyword.
     * @param keywordid The unique identifier of each keyword (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call keywordViewAsync(String keywordid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = keywordViewValidateBeforeCall(keywordid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for shortcodeGetinboundsms
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from From Number to Inbound ShortCode (optional)
     * @param shortcode Only list messages sent to this Short Code (optional)
     * @param datecreated Only list messages sent with the specified date (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shortcodeGetinboundsmsCall(Integer page, Integer pagesize, String from, String shortcode, String datecreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shortcode/getinboundsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datecreated != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Datecreated", datecreated));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (from != null)
        localVarFormParams.put("from", from);
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);

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
    private com.squareup.okhttp.Call shortcodeGetinboundsmsValidateBeforeCall(Integer page, Integer pagesize, String from, String shortcode, String datecreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = shortcodeGetinboundsmsCall(page, pagesize, from, shortcode, datecreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Inbound SMS
     * List All Inbound ShortCode
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from From Number to Inbound ShortCode (optional)
     * @param shortcode Only list messages sent to this Short Code (optional)
     * @param datecreated Only list messages sent with the specified date (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String shortcodeGetinboundsms(Integer page, Integer pagesize, String from, String shortcode, String datecreated) throws ApiException {
        ApiResponse<String> resp = shortcodeGetinboundsmsWithHttpInfo(page, pagesize, from, shortcode, datecreated);
        return resp.getData();
    }

    /**
     * List Inbound SMS
     * List All Inbound ShortCode
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from From Number to Inbound ShortCode (optional)
     * @param shortcode Only list messages sent to this Short Code (optional)
     * @param datecreated Only list messages sent with the specified date (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> shortcodeGetinboundsmsWithHttpInfo(Integer page, Integer pagesize, String from, String shortcode, String datecreated) throws ApiException {
        com.squareup.okhttp.Call call = shortcodeGetinboundsmsValidateBeforeCall(page, pagesize, from, shortcode, datecreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Inbound SMS (asynchronously)
     * List All Inbound ShortCode
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from From Number to Inbound ShortCode (optional)
     * @param shortcode Only list messages sent to this Short Code (optional)
     * @param datecreated Only list messages sent with the specified date (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shortcodeGetinboundsmsAsync(Integer page, Integer pagesize, String from, String shortcode, String datecreated, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shortcodeGetinboundsmsValidateBeforeCall(page, pagesize, from, shortcode, datecreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for shortcodeListshortcode
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param shortcode Only list keywords of shortcode (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shortcodeListshortcodeCall(Integer page, Integer pagesize, String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shortcode/listshortcode.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shortcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Shortcode", shortcode));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);

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
    private com.squareup.okhttp.Call shortcodeListshortcodeValidateBeforeCall(Integer page, Integer pagesize, String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = shortcodeListshortcodeCall(page, pagesize, shortcode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Shortcodes
     * Retrieve a list of shortcode assignment associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param shortcode Only list keywords of shortcode (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String shortcodeListshortcode(Integer page, Integer pagesize, String shortcode) throws ApiException {
        ApiResponse<String> resp = shortcodeListshortcodeWithHttpInfo(page, pagesize, shortcode);
        return resp.getData();
    }

    /**
     * List Shortcodes
     * Retrieve a list of shortcode assignment associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param shortcode Only list keywords of shortcode (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> shortcodeListshortcodeWithHttpInfo(Integer page, Integer pagesize, String shortcode) throws ApiException {
        com.squareup.okhttp.Call call = shortcodeListshortcodeValidateBeforeCall(page, pagesize, shortcode, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Shortcodes (asynchronously)
     * Retrieve a list of shortcode assignment associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param shortcode Only list keywords of shortcode (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shortcodeListshortcodeAsync(Integer page, Integer pagesize, String shortcode, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shortcodeListshortcodeValidateBeforeCall(page, pagesize, shortcode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for shortcodeSendsms
     * @param shortcode The Short Code number that is the sender of this message (required)
     * @param to A valid 10-digit number that should receive the message (required)
     * @param templateid The unique identifier for the template used for the message (required)
     * @param data format of your data, example: {companyname}:test,{otpcode}:1234 (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional, default to GET)
     * @param messageStatusCallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shortcodeSendsmsCall(String shortcode, String to, UUID templateid, String data, String method, String messageStatusCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shortcode/sendsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (shortcode != null)
        localVarFormParams.put("shortcode", shortcode);
        if (to != null)
        localVarFormParams.put("to", to);
        if (templateid != null)
        localVarFormParams.put("templateid", templateid);
        if (data != null)
        localVarFormParams.put("data", data);
        if (method != null)
        localVarFormParams.put("Method", method);
        if (messageStatusCallback != null)
        localVarFormParams.put("MessageStatusCallback", messageStatusCallback);

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
    private com.squareup.okhttp.Call shortcodeSendsmsValidateBeforeCall(String shortcode, String to, UUID templateid, String data, String method, String messageStatusCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shortcode' is set
        if (shortcode == null) {
            throw new ApiException("Missing the required parameter 'shortcode' when calling shortcodeSendsms(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling shortcodeSendsms(Async)");
        }
        
        // verify the required parameter 'templateid' is set
        if (templateid == null) {
            throw new ApiException("Missing the required parameter 'templateid' when calling shortcodeSendsms(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling shortcodeSendsms(Async)");
        }
        

        com.squareup.okhttp.Call call = shortcodeSendsmsCall(shortcode, to, templateid, data, method, messageStatusCallback, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send SMS
     * Send an SMS from a Ytel ShortCode
     * @param shortcode The Short Code number that is the sender of this message (required)
     * @param to A valid 10-digit number that should receive the message (required)
     * @param templateid The unique identifier for the template used for the message (required)
     * @param data format of your data, example: {companyname}:test,{otpcode}:1234 (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional, default to GET)
     * @param messageStatusCallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String shortcodeSendsms(String shortcode, String to, UUID templateid, String data, String method, String messageStatusCallback) throws ApiException {
        ApiResponse<String> resp = shortcodeSendsmsWithHttpInfo(shortcode, to, templateid, data, method, messageStatusCallback);
        return resp.getData();
    }

    /**
     * Send SMS
     * Send an SMS from a Ytel ShortCode
     * @param shortcode The Short Code number that is the sender of this message (required)
     * @param to A valid 10-digit number that should receive the message (required)
     * @param templateid The unique identifier for the template used for the message (required)
     * @param data format of your data, example: {companyname}:test,{otpcode}:1234 (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional, default to GET)
     * @param messageStatusCallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> shortcodeSendsmsWithHttpInfo(String shortcode, String to, UUID templateid, String data, String method, String messageStatusCallback) throws ApiException {
        com.squareup.okhttp.Call call = shortcodeSendsmsValidateBeforeCall(shortcode, to, templateid, data, method, messageStatusCallback, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send SMS (asynchronously)
     * Send an SMS from a Ytel ShortCode
     * @param shortcode The Short Code number that is the sender of this message (required)
     * @param to A valid 10-digit number that should receive the message (required)
     * @param templateid The unique identifier for the template used for the message (required)
     * @param data format of your data, example: {companyname}:test,{otpcode}:1234 (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional, default to GET)
     * @param messageStatusCallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shortcodeSendsmsAsync(String shortcode, String to, UUID templateid, String data, String method, String messageStatusCallback, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shortcodeSendsmsValidateBeforeCall(shortcode, to, templateid, data, method, messageStatusCallback, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for shortcodeUpdateshortcode
     * @param shortcode List of valid shortcode to your Ytel account (required)
     * @param friendlyName User generated name of the shortcode (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @param fallbackUrlMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shortcodeUpdateshortcodeCall(String shortcode, String friendlyName, String callbackUrl, String callbackMethod, String fallbackUrl, String fallbackUrlMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shortcode/updateshortcode.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);
        if (friendlyName != null)
        localVarFormParams.put("FriendlyName", friendlyName);
        if (callbackUrl != null)
        localVarFormParams.put("CallbackUrl", callbackUrl);
        if (callbackMethod != null)
        localVarFormParams.put("CallbackMethod", callbackMethod);
        if (fallbackUrl != null)
        localVarFormParams.put("FallbackUrl", fallbackUrl);
        if (fallbackUrlMethod != null)
        localVarFormParams.put("FallbackUrlMethod", fallbackUrlMethod);

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
    private com.squareup.okhttp.Call shortcodeUpdateshortcodeValidateBeforeCall(String shortcode, String friendlyName, String callbackUrl, String callbackMethod, String fallbackUrl, String fallbackUrlMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shortcode' is set
        if (shortcode == null) {
            throw new ApiException("Missing the required parameter 'shortcode' when calling shortcodeUpdateshortcode(Async)");
        }
        

        com.squareup.okhttp.Call call = shortcodeUpdateshortcodeCall(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update Shortcode
     * Update Assignment
     * @param shortcode List of valid shortcode to your Ytel account (required)
     * @param friendlyName User generated name of the shortcode (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @param fallbackUrlMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String shortcodeUpdateshortcode(String shortcode, String friendlyName, String callbackUrl, String callbackMethod, String fallbackUrl, String fallbackUrlMethod) throws ApiException {
        ApiResponse<String> resp = shortcodeUpdateshortcodeWithHttpInfo(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod);
        return resp.getData();
    }

    /**
     * Update Shortcode
     * Update Assignment
     * @param shortcode List of valid shortcode to your Ytel account (required)
     * @param friendlyName User generated name of the shortcode (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @param fallbackUrlMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> shortcodeUpdateshortcodeWithHttpInfo(String shortcode, String friendlyName, String callbackUrl, String callbackMethod, String fallbackUrl, String fallbackUrlMethod) throws ApiException {
        com.squareup.okhttp.Call call = shortcodeUpdateshortcodeValidateBeforeCall(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Shortcode (asynchronously)
     * Update Assignment
     * @param shortcode List of valid shortcode to your Ytel account (required)
     * @param friendlyName User generated name of the shortcode (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @param fallbackUrlMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shortcodeUpdateshortcodeAsync(String shortcode, String friendlyName, String callbackUrl, String callbackMethod, String fallbackUrl, String fallbackUrlMethod, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shortcodeUpdateshortcodeValidateBeforeCall(shortcode, friendlyName, callbackUrl, callbackMethod, fallbackUrl, fallbackUrlMethod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for shortcodeViewshortcode
     * @param shortcode List of valid Shortcode to your Ytel account (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shortcodeViewshortcodeCall(String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shortcode/viewshortcode.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);

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
    private com.squareup.okhttp.Call shortcodeViewshortcodeValidateBeforeCall(String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shortcode' is set
        if (shortcode == null) {
            throw new ApiException("Missing the required parameter 'shortcode' when calling shortcodeViewshortcode(Async)");
        }
        

        com.squareup.okhttp.Call call = shortcodeViewshortcodeCall(shortcode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Shortcode
     * The response returned here contains all resource properties associated with the given Shortcode.
     * @param shortcode List of valid Shortcode to your Ytel account (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String shortcodeViewshortcode(String shortcode) throws ApiException {
        ApiResponse<String> resp = shortcodeViewshortcodeWithHttpInfo(shortcode);
        return resp.getData();
    }

    /**
     * View Shortcode
     * The response returned here contains all resource properties associated with the given Shortcode.
     * @param shortcode List of valid Shortcode to your Ytel account (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> shortcodeViewshortcodeWithHttpInfo(String shortcode) throws ApiException {
        com.squareup.okhttp.Call call = shortcodeViewshortcodeValidateBeforeCall(shortcode, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Shortcode (asynchronously)
     * The response returned here contains all resource properties associated with the given Shortcode.
     * @param shortcode List of valid Shortcode to your Ytel account (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shortcodeViewshortcodeAsync(String shortcode, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shortcodeViewshortcodeValidateBeforeCall(shortcode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for templateLists
     * @param type The type (category) of template Valid values: marketing, authorization (optional, default to authorization)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param shortcode Only list templates of type (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call templateListsCall(String type, Integer page, Integer pagesize, String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/template/lists.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (type != null)
        localVarFormParams.put("type", type);
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);

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
    private com.squareup.okhttp.Call templateListsValidateBeforeCall(String type, Integer page, Integer pagesize, String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = templateListsCall(type, page, pagesize, shortcode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Templates
     * List Shortcode Templates by Type
     * @param type The type (category) of template Valid values: marketing, authorization (optional, default to authorization)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param shortcode Only list templates of type (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String templateLists(String type, Integer page, Integer pagesize, String shortcode) throws ApiException {
        ApiResponse<String> resp = templateListsWithHttpInfo(type, page, pagesize, shortcode);
        return resp.getData();
    }

    /**
     * List Templates
     * List Shortcode Templates by Type
     * @param type The type (category) of template Valid values: marketing, authorization (optional, default to authorization)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param shortcode Only list templates of type (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> templateListsWithHttpInfo(String type, Integer page, Integer pagesize, String shortcode) throws ApiException {
        com.squareup.okhttp.Call call = templateListsValidateBeforeCall(type, page, pagesize, shortcode, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Templates (asynchronously)
     * List Shortcode Templates by Type
     * @param type The type (category) of template Valid values: marketing, authorization (optional, default to authorization)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param shortcode Only list templates of type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call templateListsAsync(String type, Integer page, Integer pagesize, String shortcode, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = templateListsValidateBeforeCall(type, page, pagesize, shortcode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for templateView
     * @param templateId The unique identifier for a template object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call templateViewCall(UUID templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/template/view.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (templateId != null)
        localVarFormParams.put("TemplateId", templateId);

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
    private com.squareup.okhttp.Call templateViewValidateBeforeCall(UUID templateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'templateId' is set
        if (templateId == null) {
            throw new ApiException("Missing the required parameter 'templateId' when calling templateView(Async)");
        }
        

        com.squareup.okhttp.Call call = templateViewCall(templateId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Template
     * View a Shared ShortCode Template
     * @param templateId The unique identifier for a template object (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String templateView(UUID templateId) throws ApiException {
        ApiResponse<String> resp = templateViewWithHttpInfo(templateId);
        return resp.getData();
    }

    /**
     * View Template
     * View a Shared ShortCode Template
     * @param templateId The unique identifier for a template object (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> templateViewWithHttpInfo(UUID templateId) throws ApiException {
        com.squareup.okhttp.Call call = templateViewValidateBeforeCall(templateId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Template (asynchronously)
     * View a Shared ShortCode Template
     * @param templateId The unique identifier for a template object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call templateViewAsync(UUID templateId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = templateViewValidateBeforeCall(templateId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}