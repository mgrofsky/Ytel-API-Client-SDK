

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

public class ShortCodeApi {
    private ApiClient apiClient;

    public ShortCodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShortCodeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for dedicatedshortcodeGetinboundsms
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Only list SMS messages sent from this number (optional)
     * @param shortcode Only list SMS messages sent to Shortcode (optional)
     * @param datecreated Only list SMS messages sent in the specified date MAKE REQUEST (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeGetinboundsmsCall(Integer page, Integer pagesize, String from, String shortcode, String datecreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dedicatedshortcode/getinboundsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (from != null)
        localVarFormParams.put("From", from);
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);
        if (datecreated != null)
        localVarFormParams.put("Datecreated", datecreated);

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
    private com.squareup.okhttp.Call dedicatedshortcodeGetinboundsmsValidateBeforeCall(Integer page, Integer pagesize, String from, String shortcode, String datecreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = dedicatedshortcodeGetinboundsmsCall(page, pagesize, from, shortcode, datecreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Inbound SMS
     * Retrive a list of inbound Sms Short Code messages associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Only list SMS messages sent from this number (optional)
     * @param shortcode Only list SMS messages sent to Shortcode (optional)
     * @param datecreated Only list SMS messages sent in the specified date MAKE REQUEST (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String dedicatedshortcodeGetinboundsms(Integer page, Integer pagesize, String from, String shortcode, String datecreated) throws ApiException {
        ApiResponse<String> resp = dedicatedshortcodeGetinboundsmsWithHttpInfo(page, pagesize, from, shortcode, datecreated);
        return resp.getData();
    }

    /**
     * List Inbound SMS
     * Retrive a list of inbound Sms Short Code messages associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Only list SMS messages sent from this number (optional)
     * @param shortcode Only list SMS messages sent to Shortcode (optional)
     * @param datecreated Only list SMS messages sent in the specified date MAKE REQUEST (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> dedicatedshortcodeGetinboundsmsWithHttpInfo(Integer page, Integer pagesize, String from, String shortcode, String datecreated) throws ApiException {
        com.squareup.okhttp.Call call = dedicatedshortcodeGetinboundsmsValidateBeforeCall(page, pagesize, from, shortcode, datecreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Inbound SMS (asynchronously)
     * Retrive a list of inbound Sms Short Code messages associated with your Ytel account.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Only list SMS messages sent from this number (optional)
     * @param shortcode Only list SMS messages sent to Shortcode (optional)
     * @param datecreated Only list SMS messages sent in the specified date MAKE REQUEST (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeGetinboundsmsAsync(Integer page, Integer pagesize, String from, String shortcode, String datecreated, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dedicatedshortcodeGetinboundsmsValidateBeforeCall(page, pagesize, from, shortcode, datecreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dedicatedshortcodeListshortcode
     * @param shortcode Only list Short Code Assignment sent from this Short Code (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)
     * @param pagesize The count of objects to return per page. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeListshortcodeCall(String shortcode, String page, String pagesize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dedicatedshortcode/listshortcode.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);
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
    private com.squareup.okhttp.Call dedicatedshortcodeListshortcodeValidateBeforeCall(String shortcode, String page, String pagesize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = dedicatedshortcodeListshortcodeCall(shortcode, page, pagesize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Shortcodes
     * Retrieve a list of Short Code assignment associated with your Ytel account.
     * @param shortcode Only list Short Code Assignment sent from this Short Code (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)
     * @param pagesize The count of objects to return per page. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String dedicatedshortcodeListshortcode(String shortcode, String page, String pagesize) throws ApiException {
        ApiResponse<String> resp = dedicatedshortcodeListshortcodeWithHttpInfo(shortcode, page, pagesize);
        return resp.getData();
    }

    /**
     * List Shortcodes
     * Retrieve a list of Short Code assignment associated with your Ytel account.
     * @param shortcode Only list Short Code Assignment sent from this Short Code (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)
     * @param pagesize The count of objects to return per page. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> dedicatedshortcodeListshortcodeWithHttpInfo(String shortcode, String page, String pagesize) throws ApiException {
        com.squareup.okhttp.Call call = dedicatedshortcodeListshortcodeValidateBeforeCall(shortcode, page, pagesize, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Shortcodes (asynchronously)
     * Retrieve a list of Short Code assignment associated with your Ytel account.
     * @param shortcode Only list Short Code Assignment sent from this Short Code (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)
     * @param pagesize The count of objects to return per page. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeListshortcodeAsync(String shortcode, String page, String pagesize, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dedicatedshortcodeListshortcodeValidateBeforeCall(shortcode, page, pagesize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dedicatedshortcodeSendsms
     * @param shortcode Your dedicated shortcode (required)
     * @param to The number to send your SMS to (required)
     * @param body The body of your message (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional)
     * @param messagestatuscallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeSendsmsCall(Integer shortcode, Double to, String body, String method, String messagestatuscallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dedicatedshortcode/sendsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (shortcode != null)
        localVarFormParams.put("shortcode", shortcode);
        if (to != null)
        localVarFormParams.put("to", to);
        if (body != null)
        localVarFormParams.put("body", body);
        if (method != null)
        localVarFormParams.put("method", method);
        if (messagestatuscallback != null)
        localVarFormParams.put("messagestatuscallback", messagestatuscallback);

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
    private com.squareup.okhttp.Call dedicatedshortcodeSendsmsValidateBeforeCall(Integer shortcode, Double to, String body, String method, String messagestatuscallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shortcode' is set
        if (shortcode == null) {
            throw new ApiException("Missing the required parameter 'shortcode' when calling dedicatedshortcodeSendsms(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling dedicatedshortcodeSendsms(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling dedicatedshortcodeSendsms(Async)");
        }
        

        com.squareup.okhttp.Call call = dedicatedshortcodeSendsmsCall(shortcode, to, body, method, messagestatuscallback, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send SMS
     * Send Dedicated Shortcode
     * @param shortcode Your dedicated shortcode (required)
     * @param to The number to send your SMS to (required)
     * @param body The body of your message (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional)
     * @param messagestatuscallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String dedicatedshortcodeSendsms(Integer shortcode, Double to, String body, String method, String messagestatuscallback) throws ApiException {
        ApiResponse<String> resp = dedicatedshortcodeSendsmsWithHttpInfo(shortcode, to, body, method, messagestatuscallback);
        return resp.getData();
    }

    /**
     * Send SMS
     * Send Dedicated Shortcode
     * @param shortcode Your dedicated shortcode (required)
     * @param to The number to send your SMS to (required)
     * @param body The body of your message (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional)
     * @param messagestatuscallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> dedicatedshortcodeSendsmsWithHttpInfo(Integer shortcode, Double to, String body, String method, String messagestatuscallback) throws ApiException {
        com.squareup.okhttp.Call call = dedicatedshortcodeSendsmsValidateBeforeCall(shortcode, to, body, method, messagestatuscallback, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send SMS (asynchronously)
     * Send Dedicated Shortcode
     * @param shortcode Your dedicated shortcode (required)
     * @param to The number to send your SMS to (required)
     * @param body The body of your message (required)
     * @param method Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional)
     * @param messagestatuscallback URL that can be requested to receive notification when Short Code message was sent. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeSendsmsAsync(Integer shortcode, Double to, String body, String method, String messagestatuscallback, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dedicatedshortcodeSendsmsValidateBeforeCall(shortcode, to, body, method, messagestatuscallback, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dedicatedshortcodeUpdateshortcode
     * @param shortcode List of valid dedicated shortcode to your Ytel account. (required)
     * @param friendlyName User generated name of the dedicated shortcode. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeUpdateshortcodeCall(String shortcode, String friendlyName, String callbackMethod, String callbackUrl, String fallbackMethod, String fallbackUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dedicatedshortcode/updateshortcode.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);
        if (friendlyName != null)
        localVarFormParams.put("FriendlyName", friendlyName);
        if (callbackMethod != null)
        localVarFormParams.put("CallbackMethod", callbackMethod);
        if (callbackUrl != null)
        localVarFormParams.put("CallbackUrl", callbackUrl);
        if (fallbackMethod != null)
        localVarFormParams.put("FallbackMethod", fallbackMethod);
        if (fallbackUrl != null)
        localVarFormParams.put("FallbackUrl", fallbackUrl);

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
    private com.squareup.okhttp.Call dedicatedshortcodeUpdateshortcodeValidateBeforeCall(String shortcode, String friendlyName, String callbackMethod, String callbackUrl, String fallbackMethod, String fallbackUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shortcode' is set
        if (shortcode == null) {
            throw new ApiException("Missing the required parameter 'shortcode' when calling dedicatedshortcodeUpdateshortcode(Async)");
        }
        

        com.squareup.okhttp.Call call = dedicatedshortcodeUpdateshortcodeCall(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update Shortcode
     * Update a dedicated shortcode.
     * @param shortcode List of valid dedicated shortcode to your Ytel account. (required)
     * @param friendlyName User generated name of the dedicated shortcode. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String dedicatedshortcodeUpdateshortcode(String shortcode, String friendlyName, String callbackMethod, String callbackUrl, String fallbackMethod, String fallbackUrl) throws ApiException {
        ApiResponse<String> resp = dedicatedshortcodeUpdateshortcodeWithHttpInfo(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl);
        return resp.getData();
    }

    /**
     * Update Shortcode
     * Update a dedicated shortcode.
     * @param shortcode List of valid dedicated shortcode to your Ytel account. (required)
     * @param friendlyName User generated name of the dedicated shortcode. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> dedicatedshortcodeUpdateshortcodeWithHttpInfo(String shortcode, String friendlyName, String callbackMethod, String callbackUrl, String fallbackMethod, String fallbackUrl) throws ApiException {
        com.squareup.okhttp.Call call = dedicatedshortcodeUpdateshortcodeValidateBeforeCall(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Shortcode (asynchronously)
     * Update a dedicated shortcode.
     * @param shortcode List of valid dedicated shortcode to your Ytel account. (required)
     * @param friendlyName User generated name of the dedicated shortcode. (optional)
     * @param callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeUpdateshortcodeAsync(String shortcode, String friendlyName, String callbackMethod, String callbackUrl, String fallbackMethod, String fallbackUrl, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dedicatedshortcodeUpdateshortcodeValidateBeforeCall(shortcode, friendlyName, callbackMethod, callbackUrl, fallbackMethod, fallbackUrl, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dedicatedshortcodeViewshortcode
     * @param shortcode List of valid Dedicated Short Code to your Ytel account (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeViewshortcodeCall(String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dedicatedshortcode/viewshortcode.json";

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
    private com.squareup.okhttp.Call dedicatedshortcodeViewshortcodeValidateBeforeCall(String shortcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'shortcode' is set
        if (shortcode == null) {
            throw new ApiException("Missing the required parameter 'shortcode' when calling dedicatedshortcodeViewshortcode(Async)");
        }
        

        com.squareup.okhttp.Call call = dedicatedshortcodeViewshortcodeCall(shortcode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View SMS
     * Retrieve a single Short Code object by its shortcode assignment.
     * @param shortcode List of valid Dedicated Short Code to your Ytel account (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String dedicatedshortcodeViewshortcode(String shortcode) throws ApiException {
        ApiResponse<String> resp = dedicatedshortcodeViewshortcodeWithHttpInfo(shortcode);
        return resp.getData();
    }

    /**
     * View SMS
     * Retrieve a single Short Code object by its shortcode assignment.
     * @param shortcode List of valid Dedicated Short Code to your Ytel account (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> dedicatedshortcodeViewshortcodeWithHttpInfo(String shortcode) throws ApiException {
        com.squareup.okhttp.Call call = dedicatedshortcodeViewshortcodeValidateBeforeCall(shortcode, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View SMS (asynchronously)
     * Retrieve a single Short Code object by its shortcode assignment.
     * @param shortcode List of valid Dedicated Short Code to your Ytel account (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dedicatedshortcodeViewshortcodeAsync(String shortcode, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dedicatedshortcodeViewshortcodeValidateBeforeCall(shortcode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for shortcodeListsms
     * @param shortcode Only list messages sent from this Short Code (optional)
     * @param to Only list messages sent to this number (optional)
     * @param dateSent Only list messages sent with the specified date (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shortcodeListsmsCall(String shortcode, String to, String dateSent, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shortcode/listsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (shortcode != null)
        localVarFormParams.put("Shortcode", shortcode);
        if (to != null)
        localVarFormParams.put("To", to);
        if (dateSent != null)
        localVarFormParams.put("DateSent", dateSent);
        if (page != null)
        localVarFormParams.put("Page", page);
        if (pageSize != null)
        localVarFormParams.put("PageSize", pageSize);

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
    private com.squareup.okhttp.Call shortcodeListsmsValidateBeforeCall(String shortcode, String to, String dateSent, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = shortcodeListsmsCall(shortcode, to, dateSent, page, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List SMS
     * Retrieve a list of Short Code messages.
     * @param shortcode Only list messages sent from this Short Code (optional)
     * @param to Only list messages sent to this number (optional)
     * @param dateSent Only list messages sent with the specified date (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String shortcodeListsms(String shortcode, String to, String dateSent, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<String> resp = shortcodeListsmsWithHttpInfo(shortcode, to, dateSent, page, pageSize);
        return resp.getData();
    }

    /**
     * List SMS
     * Retrieve a list of Short Code messages.
     * @param shortcode Only list messages sent from this Short Code (optional)
     * @param to Only list messages sent to this number (optional)
     * @param dateSent Only list messages sent with the specified date (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> shortcodeListsmsWithHttpInfo(String shortcode, String to, String dateSent, Integer page, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = shortcodeListsmsValidateBeforeCall(shortcode, to, dateSent, page, pageSize, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List SMS (asynchronously)
     * Retrieve a list of Short Code messages.
     * @param shortcode Only list messages sent from this Short Code (optional)
     * @param to Only list messages sent to this number (optional)
     * @param dateSent Only list messages sent with the specified date (optional)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shortcodeListsmsAsync(String shortcode, String to, String dateSent, Integer page, Integer pageSize, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shortcodeListsmsValidateBeforeCall(shortcode, to, dateSent, page, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for shortcodeViewsms
     * @param messageSid The unique identifier for the sms resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call shortcodeViewsmsCall(String messageSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/shortcode/viewsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (messageSid != null)
        localVarFormParams.put("MessageSid", messageSid);

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
    private com.squareup.okhttp.Call shortcodeViewsmsValidateBeforeCall(String messageSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'messageSid' is set
        if (messageSid == null) {
            throw new ApiException("Missing the required parameter 'messageSid' when calling shortcodeViewsms(Async)");
        }
        

        com.squareup.okhttp.Call call = shortcodeViewsmsCall(messageSid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View SMS
     * View a single Sms Short Code message.
     * @param messageSid The unique identifier for the sms resource (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String shortcodeViewsms(String messageSid) throws ApiException {
        ApiResponse<String> resp = shortcodeViewsmsWithHttpInfo(messageSid);
        return resp.getData();
    }

    /**
     * View SMS
     * View a single Sms Short Code message.
     * @param messageSid The unique identifier for the sms resource (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> shortcodeViewsmsWithHttpInfo(String messageSid) throws ApiException {
        com.squareup.okhttp.Call call = shortcodeViewsmsValidateBeforeCall(messageSid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View SMS (asynchronously)
     * View a single Sms Short Code message.
     * @param messageSid The unique identifier for the sms resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call shortcodeViewsmsAsync(String messageSid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = shortcodeViewsmsValidateBeforeCall(messageSid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
