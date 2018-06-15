

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

public class SmsApi {
    private ApiClient apiClient;

    public SmsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for smsGetinboundsms
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Filter sms message objects by this date. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsGetinboundsmsCall(Integer page, Integer pageSize, String from, String to, String dateSent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms/getinboundsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("Page", page);
        if (pageSize != null)
        localVarFormParams.put("PageSize", pageSize);
        if (from != null)
        localVarFormParams.put("From", from);
        if (to != null)
        localVarFormParams.put("To", to);
        if (dateSent != null)
        localVarFormParams.put("DateSent", dateSent);

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
    private com.squareup.okhttp.Call smsGetinboundsmsValidateBeforeCall(Integer page, Integer pageSize, String from, String to, String dateSent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = smsGetinboundsmsCall(page, pageSize, from, to, dateSent, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Inbound SMS
     * Retrieve a list of Inbound SMS message objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Filter sms message objects by this date. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsGetinboundsms(Integer page, Integer pageSize, String from, String to, String dateSent) throws ApiException {
        ApiResponse<String> resp = smsGetinboundsmsWithHttpInfo(page, pageSize, from, to, dateSent);
        return resp.getData();
    }

    /**
     * List Inbound SMS
     * Retrieve a list of Inbound SMS message objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Filter sms message objects by this date. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsGetinboundsmsWithHttpInfo(Integer page, Integer pageSize, String from, String to, String dateSent) throws ApiException {
        com.squareup.okhttp.Call call = smsGetinboundsmsValidateBeforeCall(page, pageSize, from, to, dateSent, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Inbound SMS (asynchronously)
     * Retrieve a list of Inbound SMS message objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The count of objects to return per page. (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Filter sms message objects by this date. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsGetinboundsmsAsync(Integer page, Integer pageSize, String from, String to, String dateSent, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsGetinboundsmsValidateBeforeCall(page, pageSize, from, to, dateSent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsListsms
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Only list SMS messages sent in the specified date range (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsListsmsCall(Integer page, Integer pageSize, String from, String to, String dateSent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms/listsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("Page", page);
        if (pageSize != null)
        localVarFormParams.put("PageSize", pageSize);
        if (from != null)
        localVarFormParams.put("From", from);
        if (to != null)
        localVarFormParams.put("To", to);
        if (dateSent != null)
        localVarFormParams.put("DateSent", dateSent);

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
    private com.squareup.okhttp.Call smsListsmsValidateBeforeCall(Integer page, Integer pageSize, String from, String to, String dateSent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = smsListsmsCall(page, pageSize, from, to, dateSent, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List SMS
     * Retrieve a list of Outbound SMS message objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Only list SMS messages sent in the specified date range (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsListsms(Integer page, Integer pageSize, String from, String to, String dateSent) throws ApiException {
        ApiResponse<String> resp = smsListsmsWithHttpInfo(page, pageSize, from, to, dateSent);
        return resp.getData();
    }

    /**
     * List SMS
     * Retrieve a list of Outbound SMS message objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Only list SMS messages sent in the specified date range (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsListsmsWithHttpInfo(Integer page, Integer pageSize, String from, String to, String dateSent) throws ApiException {
        com.squareup.okhttp.Call call = smsListsmsValidateBeforeCall(page, pageSize, from, to, dateSent, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List SMS (asynchronously)
     * Retrieve a list of Outbound SMS message objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param from Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
     * @param to Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
     * @param dateSent Only list SMS messages sent in the specified date range (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsListsmsAsync(Integer page, Integer pageSize, String from, String to, String dateSent, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsListsmsValidateBeforeCall(page, pageSize, from, to, dateSent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsSendsms
     * @param from The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. (required)
     * @param to The 10-digit phone number (E.164 format) that will receive the message. (required)
     * @param body The body message that is to be sent in the text. (required)
     * @param method Specifies the HTTP method used to request the required URL once SMS sent. (optional)
     * @param messageStatusCallback URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional)
     * @param smartsms Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. (optional, default to false)
     * @param deliveryStatus Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsSendsmsCall(String from, String to, String body, String method, String messageStatusCallback, Boolean smartsms, Boolean deliveryStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms/sendsms.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (from != null)
        localVarFormParams.put("From", from);
        if (to != null)
        localVarFormParams.put("To", to);
        if (body != null)
        localVarFormParams.put("Body", body);
        if (method != null)
        localVarFormParams.put("Method", method);
        if (messageStatusCallback != null)
        localVarFormParams.put("MessageStatusCallback", messageStatusCallback);
        if (smartsms != null)
        localVarFormParams.put("Smartsms", smartsms);
        if (deliveryStatus != null)
        localVarFormParams.put("DeliveryStatus", deliveryStatus);

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
    private com.squareup.okhttp.Call smsSendsmsValidateBeforeCall(String from, String to, String body, String method, String messageStatusCallback, Boolean smartsms, Boolean deliveryStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling smsSendsms(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling smsSendsms(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling smsSendsms(Async)");
        }
        

        com.squareup.okhttp.Call call = smsSendsmsCall(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send SMS
     * Send an SMS from a Ytel number
     * @param from The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. (required)
     * @param to The 10-digit phone number (E.164 format) that will receive the message. (required)
     * @param body The body message that is to be sent in the text. (required)
     * @param method Specifies the HTTP method used to request the required URL once SMS sent. (optional)
     * @param messageStatusCallback URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional)
     * @param smartsms Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. (optional, default to false)
     * @param deliveryStatus Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional, default to false)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsSendsms(String from, String to, String body, String method, String messageStatusCallback, Boolean smartsms, Boolean deliveryStatus) throws ApiException {
        ApiResponse<String> resp = smsSendsmsWithHttpInfo(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus);
        return resp.getData();
    }

    /**
     * Send SMS
     * Send an SMS from a Ytel number
     * @param from The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. (required)
     * @param to The 10-digit phone number (E.164 format) that will receive the message. (required)
     * @param body The body message that is to be sent in the text. (required)
     * @param method Specifies the HTTP method used to request the required URL once SMS sent. (optional)
     * @param messageStatusCallback URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional)
     * @param smartsms Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. (optional, default to false)
     * @param deliveryStatus Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional, default to false)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsSendsmsWithHttpInfo(String from, String to, String body, String method, String messageStatusCallback, Boolean smartsms, Boolean deliveryStatus) throws ApiException {
        com.squareup.okhttp.Call call = smsSendsmsValidateBeforeCall(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send SMS (asynchronously)
     * Send an SMS from a Ytel number
     * @param from The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. (required)
     * @param to The 10-digit phone number (E.164 format) that will receive the message. (required)
     * @param body The body message that is to be sent in the text. (required)
     * @param method Specifies the HTTP method used to request the required URL once SMS sent. (optional)
     * @param messageStatusCallback URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional)
     * @param smartsms Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. (optional, default to false)
     * @param deliveryStatus Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsSendsmsAsync(String from, String to, String body, String method, String messageStatusCallback, Boolean smartsms, Boolean deliveryStatus, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsSendsmsValidateBeforeCall(from, to, body, method, messageStatusCallback, smartsms, deliveryStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsViewdetailsms
     * @param messageSid The unique identifier for a sms message. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsViewdetailsmsCall(String messageSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms/viewdetailsms.json";

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
    private com.squareup.okhttp.Call smsViewdetailsmsValidateBeforeCall(String messageSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'messageSid' is set
        if (messageSid == null) {
            throw new ApiException("Missing the required parameter 'messageSid' when calling smsViewdetailsms(Async)");
        }
        

        com.squareup.okhttp.Call call = smsViewdetailsmsCall(messageSid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View SMS
     * Retrieve a single SMS message object with details by its SmsSid.
     * @param messageSid The unique identifier for a sms message. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsViewdetailsms(String messageSid) throws ApiException {
        ApiResponse<String> resp = smsViewdetailsmsWithHttpInfo(messageSid);
        return resp.getData();
    }

    /**
     * View SMS
     * Retrieve a single SMS message object with details by its SmsSid.
     * @param messageSid The unique identifier for a sms message. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsViewdetailsmsWithHttpInfo(String messageSid) throws ApiException {
        com.squareup.okhttp.Call call = smsViewdetailsmsValidateBeforeCall(messageSid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View SMS (asynchronously)
     * Retrieve a single SMS message object with details by its SmsSid.
     * @param messageSid The unique identifier for a sms message. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsViewdetailsmsAsync(String messageSid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsViewdetailsmsValidateBeforeCall(messageSid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for smsViewsms
     * @param messageSid The unique identifier for a sms message. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call smsViewsmsCall(String messageSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sms/viewsms.json";

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
    private com.squareup.okhttp.Call smsViewsmsValidateBeforeCall(String messageSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'messageSid' is set
        if (messageSid == null) {
            throw new ApiException("Missing the required parameter 'messageSid' when calling smsViewsms(Async)");
        }
        

        com.squareup.okhttp.Call call = smsViewsmsCall(messageSid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View SMS
     * Retrieve a single SMS message object by its SmsSid.
     * @param messageSid The unique identifier for a sms message. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String smsViewsms(String messageSid) throws ApiException {
        ApiResponse<String> resp = smsViewsmsWithHttpInfo(messageSid);
        return resp.getData();
    }

    /**
     * View SMS
     * Retrieve a single SMS message object by its SmsSid.
     * @param messageSid The unique identifier for a sms message. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> smsViewsmsWithHttpInfo(String messageSid) throws ApiException {
        com.squareup.okhttp.Call call = smsViewsmsValidateBeforeCall(messageSid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View SMS (asynchronously)
     * Retrieve a single SMS message object by its SmsSid.
     * @param messageSid The unique identifier for a sms message. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call smsViewsmsAsync(String messageSid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = smsViewsmsValidateBeforeCall(messageSid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
