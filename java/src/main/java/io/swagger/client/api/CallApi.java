

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

public class CallApi {
    private ApiClient apiClient;

    public CallApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CallApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for callsGroupcall
     * @param from This number to display on Caller ID as calling (required)
     * @param to Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 (required)
     * @param url URL requested once the call connects (required)
     * @param groupConfirmKey Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * (required)
     * @param groupConfirmFile Specify the audio file you want to play when the called party picks up the call (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) we should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsGroupcallCall(String from, String to, String url, String groupConfirmKey, String groupConfirmFile, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, String hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/groupcall.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (from != null)
        localVarFormParams.put("From", from);
        if (to != null)
        localVarFormParams.put("To", to);
        if (url != null)
        localVarFormParams.put("Url", url);
        if (groupConfirmKey != null)
        localVarFormParams.put("GroupConfirmKey", groupConfirmKey);
        if (groupConfirmFile != null)
        localVarFormParams.put("GroupConfirmFile", groupConfirmFile);
        if (method != null)
        localVarFormParams.put("Method", method);
        if (statusCallBackUrl != null)
        localVarFormParams.put("StatusCallBackUrl", statusCallBackUrl);
        if (statusCallBackMethod != null)
        localVarFormParams.put("StatusCallBackMethod", statusCallBackMethod);
        if (fallBackUrl != null)
        localVarFormParams.put("FallBackUrl", fallBackUrl);
        if (fallBackMethod != null)
        localVarFormParams.put("FallBackMethod", fallBackMethod);
        if (heartBeatUrl != null)
        localVarFormParams.put("HeartBeatUrl", heartBeatUrl);
        if (heartBeatMethod != null)
        localVarFormParams.put("HeartBeatMethod", heartBeatMethod);
        if (timeout != null)
        localVarFormParams.put("Timeout", timeout);
        if (playDtmf != null)
        localVarFormParams.put("PlayDtmf", playDtmf);
        if (hideCallerId != null)
        localVarFormParams.put("HideCallerId", hideCallerId);
        if (record != null)
        localVarFormParams.put("Record", record);
        if (recordCallBackUrl != null)
        localVarFormParams.put("RecordCallBackUrl", recordCallBackUrl);
        if (recordCallBackMethod != null)
        localVarFormParams.put("RecordCallBackMethod", recordCallBackMethod);
        if (transcribe != null)
        localVarFormParams.put("Transcribe", transcribe);
        if (transcribeCallBackUrl != null)
        localVarFormParams.put("TranscribeCallBackUrl", transcribeCallBackUrl);

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
    private com.squareup.okhttp.Call callsGroupcallValidateBeforeCall(String from, String to, String url, String groupConfirmKey, String groupConfirmFile, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, String hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling callsGroupcall(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling callsGroupcall(Async)");
        }
        
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling callsGroupcall(Async)");
        }
        
        // verify the required parameter 'groupConfirmKey' is set
        if (groupConfirmKey == null) {
            throw new ApiException("Missing the required parameter 'groupConfirmKey' when calling callsGroupcall(Async)");
        }
        
        // verify the required parameter 'groupConfirmFile' is set
        if (groupConfirmFile == null) {
            throw new ApiException("Missing the required parameter 'groupConfirmFile' when calling callsGroupcall(Async)");
        }
        

        com.squareup.okhttp.Call call = callsGroupcallCall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Group Call
     * Group Call
     * @param from This number to display on Caller ID as calling (required)
     * @param to Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 (required)
     * @param url URL requested once the call connects (required)
     * @param groupConfirmKey Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * (required)
     * @param groupConfirmFile Specify the audio file you want to play when the called party picks up the call (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) we should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsGroupcall(String from, String to, String url, String groupConfirmKey, String groupConfirmFile, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, String hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl) throws ApiException {
        ApiResponse<String> resp = callsGroupcallWithHttpInfo(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl);
        return resp.getData();
    }

    /**
     * Group Call
     * Group Call
     * @param from This number to display on Caller ID as calling (required)
     * @param to Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 (required)
     * @param url URL requested once the call connects (required)
     * @param groupConfirmKey Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * (required)
     * @param groupConfirmFile Specify the audio file you want to play when the called party picks up the call (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) we should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsGroupcallWithHttpInfo(String from, String to, String url, String groupConfirmKey, String groupConfirmFile, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, String hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl) throws ApiException {
        com.squareup.okhttp.Call call = callsGroupcallValidateBeforeCall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Group Call (asynchronously)
     * Group Call
     * @param from This number to display on Caller ID as calling (required)
     * @param to Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : 1111111111,2222222222 (required)
     * @param url URL requested once the call connects (required)
     * @param groupConfirmKey Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, * (required)
     * @param groupConfirmFile Specify the audio file you want to play when the called party picks up the call (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information. (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) we should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsGroupcallAsync(String from, String to, String url, String groupConfirmKey, String groupConfirmFile, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, String hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsGroupcallValidateBeforeCall(from, to, url, groupConfirmKey, groupConfirmFile, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsInterruptcalls
     * @param callSid The unique identifier for voice call that is in progress. (required)
     * @param url URL the in-progress call will be redirected to (optional)
     * @param method The method used to request the above Url parameter (optional)
     * @param status Status to set the in-progress call to (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsInterruptcallsCall(String callSid, String url, String method, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/interruptcalls.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (callSid != null)
        localVarFormParams.put("CallSid", callSid);
        if (url != null)
        localVarFormParams.put("Url", url);
        if (method != null)
        localVarFormParams.put("Method", method);
        if (status != null)
        localVarFormParams.put("Status", status);

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
    private com.squareup.okhttp.Call callsInterruptcallsValidateBeforeCall(String callSid, String url, String method, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'callSid' is set
        if (callSid == null) {
            throw new ApiException("Missing the required parameter 'callSid' when calling callsInterruptcalls(Async)");
        }
        

        com.squareup.okhttp.Call call = callsInterruptcallsCall(callSid, url, method, status, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Interrupt Call
     * Interrupt the Call by Call Sid
     * @param callSid The unique identifier for voice call that is in progress. (required)
     * @param url URL the in-progress call will be redirected to (optional)
     * @param method The method used to request the above Url parameter (optional)
     * @param status Status to set the in-progress call to (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsInterruptcalls(String callSid, String url, String method, String status) throws ApiException {
        ApiResponse<String> resp = callsInterruptcallsWithHttpInfo(callSid, url, method, status);
        return resp.getData();
    }

    /**
     * Interrupt Call
     * Interrupt the Call by Call Sid
     * @param callSid The unique identifier for voice call that is in progress. (required)
     * @param url URL the in-progress call will be redirected to (optional)
     * @param method The method used to request the above Url parameter (optional)
     * @param status Status to set the in-progress call to (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsInterruptcallsWithHttpInfo(String callSid, String url, String method, String status) throws ApiException {
        com.squareup.okhttp.Call call = callsInterruptcallsValidateBeforeCall(callSid, url, method, status, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Interrupt Call (asynchronously)
     * Interrupt the Call by Call Sid
     * @param callSid The unique identifier for voice call that is in progress. (required)
     * @param url URL the in-progress call will be redirected to (optional)
     * @param method The method used to request the above Url parameter (optional)
     * @param status Status to set the in-progress call to (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsInterruptcallsAsync(String callSid, String url, String method, String status, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsInterruptcallsValidateBeforeCall(callSid, url, method, status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsListcalls
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param to Filter calls that were sent to this 10-digit number (E.164 format). (optional)
     * @param from Filter calls that were sent from this 10-digit number (E.164 format). (optional)
     * @param dateCreated Return calls that are from a specified date. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsListcallsCall(Integer page, Integer pageSize, String to, String from, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/listcalls.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("Page", page);
        if (pageSize != null)
        localVarFormParams.put("PageSize", pageSize);
        if (to != null)
        localVarFormParams.put("To", to);
        if (from != null)
        localVarFormParams.put("From", from);
        if (dateCreated != null)
        localVarFormParams.put("DateCreated", dateCreated);

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
    private com.squareup.okhttp.Call callsListcallsValidateBeforeCall(Integer page, Integer pageSize, String to, String from, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = callsListcallsCall(page, pageSize, to, from, dateCreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Calls
     * A list of calls associated with your Ytel account
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param to Filter calls that were sent to this 10-digit number (E.164 format). (optional)
     * @param from Filter calls that were sent from this 10-digit number (E.164 format). (optional)
     * @param dateCreated Return calls that are from a specified date. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsListcalls(Integer page, Integer pageSize, String to, String from, String dateCreated) throws ApiException {
        ApiResponse<String> resp = callsListcallsWithHttpInfo(page, pageSize, to, from, dateCreated);
        return resp.getData();
    }

    /**
     * List Calls
     * A list of calls associated with your Ytel account
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param to Filter calls that were sent to this 10-digit number (E.164 format). (optional)
     * @param from Filter calls that were sent from this 10-digit number (E.164 format). (optional)
     * @param dateCreated Return calls that are from a specified date. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsListcallsWithHttpInfo(Integer page, Integer pageSize, String to, String from, String dateCreated) throws ApiException {
        com.squareup.okhttp.Call call = callsListcallsValidateBeforeCall(page, pageSize, to, from, dateCreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Calls (asynchronously)
     * A list of calls associated with your Ytel account
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize Number of individual resources listed in the response per page (optional, default to 10)
     * @param to Filter calls that were sent to this 10-digit number (E.164 format). (optional)
     * @param from Filter calls that were sent from this 10-digit number (E.164 format). (optional)
     * @param dateCreated Return calls that are from a specified date. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsListcallsAsync(Integer page, Integer pageSize, String to, String from, String dateCreated, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsListcallsValidateBeforeCall(page, pageSize, to, from, dateCreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsMakecall
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param to To number (required)
     * @param url URL requested once the call connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @param ifMachine How Ytel should handle the receiving numbers voicemail machine (optional)
     * @param ifMachineUrl URL requested when IfMachine&#x3D;continue (optional)
     * @param ifMachineMethod Method used to request the IfMachineUrl. (optional)
     * @param feedback Specify if survey should be enable or not (optional)
     * @param surveyId The unique identifier for the survey. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsMakecallCall(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, Boolean hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, String ifMachine, String ifMachineUrl, String ifMachineMethod, Boolean feedback, String surveyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/makecall.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (from != null)
        localVarFormParams.put("From", from);
        if (to != null)
        localVarFormParams.put("To", to);
        if (url != null)
        localVarFormParams.put("Url", url);
        if (method != null)
        localVarFormParams.put("Method", method);
        if (statusCallBackUrl != null)
        localVarFormParams.put("StatusCallBackUrl", statusCallBackUrl);
        if (statusCallBackMethod != null)
        localVarFormParams.put("StatusCallBackMethod", statusCallBackMethod);
        if (fallBackUrl != null)
        localVarFormParams.put("FallBackUrl", fallBackUrl);
        if (fallBackMethod != null)
        localVarFormParams.put("FallBackMethod", fallBackMethod);
        if (heartBeatUrl != null)
        localVarFormParams.put("HeartBeatUrl", heartBeatUrl);
        if (heartBeatMethod != null)
        localVarFormParams.put("HeartBeatMethod", heartBeatMethod);
        if (timeout != null)
        localVarFormParams.put("Timeout", timeout);
        if (playDtmf != null)
        localVarFormParams.put("PlayDtmf", playDtmf);
        if (hideCallerId != null)
        localVarFormParams.put("HideCallerId", hideCallerId);
        if (record != null)
        localVarFormParams.put("Record", record);
        if (recordCallBackUrl != null)
        localVarFormParams.put("RecordCallBackUrl", recordCallBackUrl);
        if (recordCallBackMethod != null)
        localVarFormParams.put("RecordCallBackMethod", recordCallBackMethod);
        if (transcribe != null)
        localVarFormParams.put("Transcribe", transcribe);
        if (transcribeCallBackUrl != null)
        localVarFormParams.put("TranscribeCallBackUrl", transcribeCallBackUrl);
        if (ifMachine != null)
        localVarFormParams.put("IfMachine", ifMachine);
        if (ifMachineUrl != null)
        localVarFormParams.put("IfMachineUrl", ifMachineUrl);
        if (ifMachineMethod != null)
        localVarFormParams.put("IfMachineMethod", ifMachineMethod);
        if (feedback != null)
        localVarFormParams.put("Feedback", feedback);
        if (surveyId != null)
        localVarFormParams.put("SurveyId", surveyId);

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
    private com.squareup.okhttp.Call callsMakecallValidateBeforeCall(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, Boolean hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, String ifMachine, String ifMachineUrl, String ifMachineMethod, Boolean feedback, String surveyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling callsMakecall(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling callsMakecall(Async)");
        }
        
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling callsMakecall(Async)");
        }
        

        com.squareup.okhttp.Call call = callsMakecallCall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Make Call
     * You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param to To number (required)
     * @param url URL requested once the call connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @param ifMachine How Ytel should handle the receiving numbers voicemail machine (optional)
     * @param ifMachineUrl URL requested when IfMachine&#x3D;continue (optional)
     * @param ifMachineMethod Method used to request the IfMachineUrl. (optional)
     * @param feedback Specify if survey should be enable or not (optional)
     * @param surveyId The unique identifier for the survey. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsMakecall(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, Boolean hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, String ifMachine, String ifMachineUrl, String ifMachineMethod, Boolean feedback, String surveyId) throws ApiException {
        ApiResponse<String> resp = callsMakecallWithHttpInfo(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId);
        return resp.getData();
    }

    /**
     * Make Call
     * You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param to To number (required)
     * @param url URL requested once the call connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @param ifMachine How Ytel should handle the receiving numbers voicemail machine (optional)
     * @param ifMachineUrl URL requested when IfMachine&#x3D;continue (optional)
     * @param ifMachineMethod Method used to request the IfMachineUrl. (optional)
     * @param feedback Specify if survey should be enable or not (optional)
     * @param surveyId The unique identifier for the survey. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsMakecallWithHttpInfo(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, Boolean hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, String ifMachine, String ifMachineUrl, String ifMachineMethod, Boolean feedback, String surveyId) throws ApiException {
        com.squareup.okhttp.Call call = callsMakecallValidateBeforeCall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Make Call (asynchronously)
     * You can experiment with initiating a call through Ytel and view the request response generated when doing so and get the response in json
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param to To number (required)
     * @param url URL requested once the call connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallBackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallBackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param heartBeatUrl URL that can be requested every 60 seconds during the call to notify of elapsed tim (optional)
     * @param heartBeatMethod Specifies the HTTP method used to request HeartbeatUrl. (optional)
     * @param timeout Time (in seconds) Ytel should wait while the call is ringing before canceling the call (optional)
     * @param playDtmf DTMF Digits to play to the call once it connects. 0-9, #, or * (optional)
     * @param hideCallerId Specifies if the caller id will be hidden (optional)
     * @param record Specifies if the call should be recorded (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion (optional)
     * @param recordCallBackMethod Method used to request the RecordCallback URL. (optional)
     * @param transcribe Specifies if the call recording should be transcribed (optional)
     * @param transcribeCallBackUrl Transcription parameters will be sent here upon completion (optional)
     * @param ifMachine How Ytel should handle the receiving numbers voicemail machine (optional)
     * @param ifMachineUrl URL requested when IfMachine&#x3D;continue (optional)
     * @param ifMachineMethod Method used to request the IfMachineUrl. (optional)
     * @param feedback Specify if survey should be enable or not (optional)
     * @param surveyId The unique identifier for the survey. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsMakecallAsync(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallBackUrl, String fallBackMethod, String heartBeatUrl, String heartBeatMethod, Integer timeout, String playDtmf, Boolean hideCallerId, Boolean record, String recordCallBackUrl, String recordCallBackMethod, Boolean transcribe, String transcribeCallBackUrl, String ifMachine, String ifMachineUrl, String ifMachineMethod, Boolean feedback, String surveyId, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsMakecallValidateBeforeCall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallBackUrl, fallBackMethod, heartBeatUrl, heartBeatMethod, timeout, playDtmf, hideCallerId, record, recordCallBackUrl, recordCallBackMethod, transcribe, transcribeCallBackUrl, ifMachine, ifMachineUrl, ifMachineMethod, feedback, surveyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsMakervm
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param rvMCallerId A required secondary Caller ID for RVM to work. (required)
     * @param to A valid number (E.164 format) that will receive the phone call. (required)
     * @param voiceMailURL The URL requested once the RVM connects. A set of default parameters will be sent here. (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to GET)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statsCallBackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsMakervmCall(String from, String rvMCallerId, String to, String voiceMailURL, String method, String statusCallBackUrl, String statsCallBackMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/makervm.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (from != null)
        localVarFormParams.put("From", from);
        if (rvMCallerId != null)
        localVarFormParams.put("RVMCallerId", rvMCallerId);
        if (to != null)
        localVarFormParams.put("To", to);
        if (voiceMailURL != null)
        localVarFormParams.put("VoiceMailURL", voiceMailURL);
        if (method != null)
        localVarFormParams.put("Method", method);
        if (statusCallBackUrl != null)
        localVarFormParams.put("StatusCallBackUrl", statusCallBackUrl);
        if (statsCallBackMethod != null)
        localVarFormParams.put("StatsCallBackMethod", statsCallBackMethod);

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
    private com.squareup.okhttp.Call callsMakervmValidateBeforeCall(String from, String rvMCallerId, String to, String voiceMailURL, String method, String statusCallBackUrl, String statsCallBackMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling callsMakervm(Async)");
        }
        
        // verify the required parameter 'rvMCallerId' is set
        if (rvMCallerId == null) {
            throw new ApiException("Missing the required parameter 'rvMCallerId' when calling callsMakervm(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling callsMakervm(Async)");
        }
        
        // verify the required parameter 'voiceMailURL' is set
        if (voiceMailURL == null) {
            throw new ApiException("Missing the required parameter 'voiceMailURL' when calling callsMakervm(Async)");
        }
        

        com.squareup.okhttp.Call call = callsMakervmCall(from, rvMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send RVM
     * Initiate an outbound Ringless Voicemail through Ytel.
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param rvMCallerId A required secondary Caller ID for RVM to work. (required)
     * @param to A valid number (E.164 format) that will receive the phone call. (required)
     * @param voiceMailURL The URL requested once the RVM connects. A set of default parameters will be sent here. (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to GET)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statsCallBackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsMakervm(String from, String rvMCallerId, String to, String voiceMailURL, String method, String statusCallBackUrl, String statsCallBackMethod) throws ApiException {
        ApiResponse<String> resp = callsMakervmWithHttpInfo(from, rvMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod);
        return resp.getData();
    }

    /**
     * Send RVM
     * Initiate an outbound Ringless Voicemail through Ytel.
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param rvMCallerId A required secondary Caller ID for RVM to work. (required)
     * @param to A valid number (E.164 format) that will receive the phone call. (required)
     * @param voiceMailURL The URL requested once the RVM connects. A set of default parameters will be sent here. (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to GET)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statsCallBackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsMakervmWithHttpInfo(String from, String rvMCallerId, String to, String voiceMailURL, String method, String statusCallBackUrl, String statsCallBackMethod) throws ApiException {
        com.squareup.okhttp.Call call = callsMakervmValidateBeforeCall(from, rvMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send RVM (asynchronously)
     * Initiate an outbound Ringless Voicemail through Ytel.
     * @param from A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call. (required)
     * @param rvMCallerId A required secondary Caller ID for RVM to work. (required)
     * @param to A valid number (E.164 format) that will receive the phone call. (required)
     * @param voiceMailURL The URL requested once the RVM connects. A set of default parameters will be sent here. (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to GET)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
     * @param statsCallBackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsMakervmAsync(String from, String rvMCallerId, String to, String voiceMailURL, String method, String statusCallBackUrl, String statsCallBackMethod, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsMakervmValidateBeforeCall(from, rvMCallerId, to, voiceMailURL, method, statusCallBackUrl, statsCallBackMethod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsPlayaudios
     * @param callSid The unique identifier of each call resource (required)
     * @param audioUrl URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav (required)
     * @param sayText Valid alphanumeric string that should be played to the In-progress call. (required)
     * @param length Time limit in seconds for audio play back (optional)
     * @param direction The leg of the call audio will be played to (optional)
     * @param mix If false, all other audio will be muted (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsPlayaudiosCall(String callSid, String audioUrl, String sayText, Integer length, String direction, Boolean mix, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/playaudios.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (callSid != null)
        localVarFormParams.put("CallSid", callSid);
        if (audioUrl != null)
        localVarFormParams.put("AudioUrl", audioUrl);
        if (sayText != null)
        localVarFormParams.put("SayText", sayText);
        if (length != null)
        localVarFormParams.put("Length", length);
        if (direction != null)
        localVarFormParams.put("Direction", direction);
        if (mix != null)
        localVarFormParams.put("Mix", mix);

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
    private com.squareup.okhttp.Call callsPlayaudiosValidateBeforeCall(String callSid, String audioUrl, String sayText, Integer length, String direction, Boolean mix, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'callSid' is set
        if (callSid == null) {
            throw new ApiException("Missing the required parameter 'callSid' when calling callsPlayaudios(Async)");
        }
        
        // verify the required parameter 'audioUrl' is set
        if (audioUrl == null) {
            throw new ApiException("Missing the required parameter 'audioUrl' when calling callsPlayaudios(Async)");
        }
        
        // verify the required parameter 'sayText' is set
        if (sayText == null) {
            throw new ApiException("Missing the required parameter 'sayText' when calling callsPlayaudios(Async)");
        }
        

        com.squareup.okhttp.Call call = callsPlayaudiosCall(callSid, audioUrl, sayText, length, direction, mix, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Play Audio
     * Play Audio from a url
     * @param callSid The unique identifier of each call resource (required)
     * @param audioUrl URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav (required)
     * @param sayText Valid alphanumeric string that should be played to the In-progress call. (required)
     * @param length Time limit in seconds for audio play back (optional)
     * @param direction The leg of the call audio will be played to (optional)
     * @param mix If false, all other audio will be muted (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsPlayaudios(String callSid, String audioUrl, String sayText, Integer length, String direction, Boolean mix) throws ApiException {
        ApiResponse<String> resp = callsPlayaudiosWithHttpInfo(callSid, audioUrl, sayText, length, direction, mix);
        return resp.getData();
    }

    /**
     * Play Audio
     * Play Audio from a url
     * @param callSid The unique identifier of each call resource (required)
     * @param audioUrl URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav (required)
     * @param sayText Valid alphanumeric string that should be played to the In-progress call. (required)
     * @param length Time limit in seconds for audio play back (optional)
     * @param direction The leg of the call audio will be played to (optional)
     * @param mix If false, all other audio will be muted (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsPlayaudiosWithHttpInfo(String callSid, String audioUrl, String sayText, Integer length, String direction, Boolean mix) throws ApiException {
        com.squareup.okhttp.Call call = callsPlayaudiosValidateBeforeCall(callSid, audioUrl, sayText, length, direction, mix, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Play Audio (asynchronously)
     * Play Audio from a url
     * @param callSid The unique identifier of each call resource (required)
     * @param audioUrl URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav (required)
     * @param sayText Valid alphanumeric string that should be played to the In-progress call. (required)
     * @param length Time limit in seconds for audio play back (optional)
     * @param direction The leg of the call audio will be played to (optional)
     * @param mix If false, all other audio will be muted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsPlayaudiosAsync(String callSid, String audioUrl, String sayText, Integer length, String direction, Boolean mix, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsPlayaudiosValidateBeforeCall(callSid, audioUrl, sayText, length, direction, mix, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsRecordcalls
     * @param callSid The unique identifier of each call resource (required)
     * @param record Set true to initiate recording or false to terminate recording (required)
     * @param direction The leg of the call to record (optional)
     * @param timeLimit Time in seconds the recording duration should not exceed (optional)
     * @param callBackUrl URL consulted after the recording completes (optional)
     * @param fileformat Format of the recording file. Can be .mp3 or .wav (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsRecordcallsCall(String callSid, Boolean record, String direction, Integer timeLimit, String callBackUrl, String fileformat, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/recordcalls.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (callSid != null)
        localVarFormParams.put("CallSid", callSid);
        if (record != null)
        localVarFormParams.put("Record", record);
        if (direction != null)
        localVarFormParams.put("Direction", direction);
        if (timeLimit != null)
        localVarFormParams.put("TimeLimit", timeLimit);
        if (callBackUrl != null)
        localVarFormParams.put("CallBackUrl", callBackUrl);
        if (fileformat != null)
        localVarFormParams.put("Fileformat", fileformat);

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
    private com.squareup.okhttp.Call callsRecordcallsValidateBeforeCall(String callSid, Boolean record, String direction, Integer timeLimit, String callBackUrl, String fileformat, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'callSid' is set
        if (callSid == null) {
            throw new ApiException("Missing the required parameter 'callSid' when calling callsRecordcalls(Async)");
        }
        
        // verify the required parameter 'record' is set
        if (record == null) {
            throw new ApiException("Missing the required parameter 'record' when calling callsRecordcalls(Async)");
        }
        

        com.squareup.okhttp.Call call = callsRecordcallsCall(callSid, record, direction, timeLimit, callBackUrl, fileformat, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Record Call
     * Start or stop recording of an in-progress voice call.
     * @param callSid The unique identifier of each call resource (required)
     * @param record Set true to initiate recording or false to terminate recording (required)
     * @param direction The leg of the call to record (optional)
     * @param timeLimit Time in seconds the recording duration should not exceed (optional)
     * @param callBackUrl URL consulted after the recording completes (optional)
     * @param fileformat Format of the recording file. Can be .mp3 or .wav (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsRecordcalls(String callSid, Boolean record, String direction, Integer timeLimit, String callBackUrl, String fileformat) throws ApiException {
        ApiResponse<String> resp = callsRecordcallsWithHttpInfo(callSid, record, direction, timeLimit, callBackUrl, fileformat);
        return resp.getData();
    }

    /**
     * Record Call
     * Start or stop recording of an in-progress voice call.
     * @param callSid The unique identifier of each call resource (required)
     * @param record Set true to initiate recording or false to terminate recording (required)
     * @param direction The leg of the call to record (optional)
     * @param timeLimit Time in seconds the recording duration should not exceed (optional)
     * @param callBackUrl URL consulted after the recording completes (optional)
     * @param fileformat Format of the recording file. Can be .mp3 or .wav (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsRecordcallsWithHttpInfo(String callSid, Boolean record, String direction, Integer timeLimit, String callBackUrl, String fileformat) throws ApiException {
        com.squareup.okhttp.Call call = callsRecordcallsValidateBeforeCall(callSid, record, direction, timeLimit, callBackUrl, fileformat, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Record Call (asynchronously)
     * Start or stop recording of an in-progress voice call.
     * @param callSid The unique identifier of each call resource (required)
     * @param record Set true to initiate recording or false to terminate recording (required)
     * @param direction The leg of the call to record (optional)
     * @param timeLimit Time in seconds the recording duration should not exceed (optional)
     * @param callBackUrl URL consulted after the recording completes (optional)
     * @param fileformat Format of the recording file. Can be .mp3 or .wav (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsRecordcallsAsync(String callSid, Boolean record, String direction, Integer timeLimit, String callBackUrl, String fileformat, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsRecordcallsValidateBeforeCall(callSid, record, direction, timeLimit, callBackUrl, fileformat, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsSenddigits
     * @param callSid The unique identifier of each call resource (required)
     * @param playDtmf DTMF digits to play to the call. 0-9, #, *, W, or w (required)
     * @param playDtmfDirection The leg of the call DTMF digits should be sent to (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsSenddigitsCall(String callSid, String playDtmf, String playDtmfDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/senddigits.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (callSid != null)
        localVarFormParams.put("CallSid", callSid);
        if (playDtmf != null)
        localVarFormParams.put("PlayDtmf", playDtmf);
        if (playDtmfDirection != null)
        localVarFormParams.put("PlayDtmfDirection", playDtmfDirection);

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
    private com.squareup.okhttp.Call callsSenddigitsValidateBeforeCall(String callSid, String playDtmf, String playDtmfDirection, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'callSid' is set
        if (callSid == null) {
            throw new ApiException("Missing the required parameter 'callSid' when calling callsSenddigits(Async)");
        }
        
        // verify the required parameter 'playDtmf' is set
        if (playDtmf == null) {
            throw new ApiException("Missing the required parameter 'playDtmf' when calling callsSenddigits(Async)");
        }
        

        com.squareup.okhttp.Call call = callsSenddigitsCall(callSid, playDtmf, playDtmfDirection, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Play DTMF
     * Play Dtmf and send the Digit
     * @param callSid The unique identifier of each call resource (required)
     * @param playDtmf DTMF digits to play to the call. 0-9, #, *, W, or w (required)
     * @param playDtmfDirection The leg of the call DTMF digits should be sent to (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsSenddigits(String callSid, String playDtmf, String playDtmfDirection) throws ApiException {
        ApiResponse<String> resp = callsSenddigitsWithHttpInfo(callSid, playDtmf, playDtmfDirection);
        return resp.getData();
    }

    /**
     * Play DTMF
     * Play Dtmf and send the Digit
     * @param callSid The unique identifier of each call resource (required)
     * @param playDtmf DTMF digits to play to the call. 0-9, #, *, W, or w (required)
     * @param playDtmfDirection The leg of the call DTMF digits should be sent to (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsSenddigitsWithHttpInfo(String callSid, String playDtmf, String playDtmfDirection) throws ApiException {
        com.squareup.okhttp.Call call = callsSenddigitsValidateBeforeCall(callSid, playDtmf, playDtmfDirection, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Play DTMF (asynchronously)
     * Play Dtmf and send the Digit
     * @param callSid The unique identifier of each call resource (required)
     * @param playDtmf DTMF digits to play to the call. 0-9, #, *, W, or w (required)
     * @param playDtmfDirection The leg of the call DTMF digits should be sent to (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsSenddigitsAsync(String callSid, String playDtmf, String playDtmfDirection, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsSenddigitsValidateBeforeCall(callSid, playDtmf, playDtmfDirection, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsViewcalldetail
     * @param callSid The unique identifier for the voice call. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsViewcalldetailCall(String callSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/viewcalldetail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (callSid != null)
        localVarFormParams.put("callSid", callSid);

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
    private com.squareup.okhttp.Call callsViewcalldetailValidateBeforeCall(String callSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'callSid' is set
        if (callSid == null) {
            throw new ApiException("Missing the required parameter 'callSid' when calling callsViewcalldetail(Async)");
        }
        

        com.squareup.okhttp.Call call = callsViewcalldetailCall(callSid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Call
     * Retrieve a single voice call’s information by its CallSid.
     * @param callSid The unique identifier for the voice call. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsViewcalldetail(String callSid) throws ApiException {
        ApiResponse<String> resp = callsViewcalldetailWithHttpInfo(callSid);
        return resp.getData();
    }

    /**
     * View Call
     * Retrieve a single voice call’s information by its CallSid.
     * @param callSid The unique identifier for the voice call. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsViewcalldetailWithHttpInfo(String callSid) throws ApiException {
        com.squareup.okhttp.Call call = callsViewcalldetailValidateBeforeCall(callSid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Call (asynchronously)
     * Retrieve a single voice call’s information by its CallSid.
     * @param callSid The unique identifier for the voice call. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsViewcalldetailAsync(String callSid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsViewcalldetailValidateBeforeCall(callSid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsViewcalls
     * @param callsid The unique identifier for the voice call. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsViewcallsCall(String callsid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/viewcalls.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (callsid != null)
        localVarFormParams.put("callsid", callsid);

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
    private com.squareup.okhttp.Call callsViewcallsValidateBeforeCall(String callsid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'callsid' is set
        if (callsid == null) {
            throw new ApiException("Missing the required parameter 'callsid' when calling callsViewcalls(Async)");
        }
        

        com.squareup.okhttp.Call call = callsViewcallsCall(callsid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Call
     * Retrieve a single voice call’s information by its CallSid.
     * @param callsid The unique identifier for the voice call. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsViewcalls(String callsid) throws ApiException {
        ApiResponse<String> resp = callsViewcallsWithHttpInfo(callsid);
        return resp.getData();
    }

    /**
     * View Call
     * Retrieve a single voice call’s information by its CallSid.
     * @param callsid The unique identifier for the voice call. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsViewcallsWithHttpInfo(String callsid) throws ApiException {
        com.squareup.okhttp.Call call = callsViewcallsValidateBeforeCall(callsid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Call (asynchronously)
     * Retrieve a single voice call’s information by its CallSid.
     * @param callsid The unique identifier for the voice call. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsViewcallsAsync(String callsid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsViewcallsValidateBeforeCall(callsid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for callsVoiceeffect
     * @param callSid The unique identifier for the in-progress voice call. (required)
     * @param audioDirection The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional)
     * @param pitchSemiTones Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional)
     * @param pitchOctaves Set the pitch in octave intervals.. Value between -1 and 1 (optional)
     * @param pitch Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional)
     * @param rate Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional)
     * @param tempo Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callsVoiceeffectCall(String callSid, String audioDirection, Double pitchSemiTones, Double pitchOctaves, Double pitch, Double rate, Double tempo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/calls/voiceeffect.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (callSid != null)
        localVarFormParams.put("CallSid", callSid);
        if (audioDirection != null)
        localVarFormParams.put("AudioDirection", audioDirection);
        if (pitchSemiTones != null)
        localVarFormParams.put("PitchSemiTones", pitchSemiTones);
        if (pitchOctaves != null)
        localVarFormParams.put("PitchOctaves", pitchOctaves);
        if (pitch != null)
        localVarFormParams.put("Pitch", pitch);
        if (rate != null)
        localVarFormParams.put("Rate", rate);
        if (tempo != null)
        localVarFormParams.put("Tempo", tempo);

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
    private com.squareup.okhttp.Call callsVoiceeffectValidateBeforeCall(String callSid, String audioDirection, Double pitchSemiTones, Double pitchOctaves, Double pitch, Double rate, Double tempo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'callSid' is set
        if (callSid == null) {
            throw new ApiException("Missing the required parameter 'callSid' when calling callsVoiceeffect(Async)");
        }
        

        com.squareup.okhttp.Call call = callsVoiceeffectCall(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Voice Effect
     * Add audio voice effects to the an in-progress voice call.
     * @param callSid The unique identifier for the in-progress voice call. (required)
     * @param audioDirection The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional)
     * @param pitchSemiTones Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional)
     * @param pitchOctaves Set the pitch in octave intervals.. Value between -1 and 1 (optional)
     * @param pitch Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional)
     * @param rate Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional)
     * @param tempo Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String callsVoiceeffect(String callSid, String audioDirection, Double pitchSemiTones, Double pitchOctaves, Double pitch, Double rate, Double tempo) throws ApiException {
        ApiResponse<String> resp = callsVoiceeffectWithHttpInfo(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo);
        return resp.getData();
    }

    /**
     * Voice Effect
     * Add audio voice effects to the an in-progress voice call.
     * @param callSid The unique identifier for the in-progress voice call. (required)
     * @param audioDirection The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional)
     * @param pitchSemiTones Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional)
     * @param pitchOctaves Set the pitch in octave intervals.. Value between -1 and 1 (optional)
     * @param pitch Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional)
     * @param rate Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional)
     * @param tempo Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> callsVoiceeffectWithHttpInfo(String callSid, String audioDirection, Double pitchSemiTones, Double pitchOctaves, Double pitch, Double rate, Double tempo) throws ApiException {
        com.squareup.okhttp.Call call = callsVoiceeffectValidateBeforeCall(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Voice Effect (asynchronously)
     * Add audio voice effects to the an in-progress voice call.
     * @param callSid The unique identifier for the in-progress voice call. (required)
     * @param audioDirection The direction the audio effect should be placed on. If IN, the effects will occur on the incoming audio stream. If OUT, the effects will occur on the outgoing audio stream. (optional)
     * @param pitchSemiTones Set the pitch in semitone (half-step) intervals. Value between -14 and 14 (optional)
     * @param pitchOctaves Set the pitch in octave intervals.. Value between -1 and 1 (optional)
     * @param pitch Set the pitch (lowness/highness) of the audio. The higher the value, the higher the pitch. Value greater than 0 (optional)
     * @param rate Set the rate for audio. The lower the value, the lower the rate. value greater than 0 (optional)
     * @param tempo Set the tempo (speed) of the audio. A higher value denotes a faster tempo. Value greater than 0 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callsVoiceeffectAsync(String callSid, String audioDirection, Double pitchSemiTones, Double pitchOctaves, Double pitch, Double rate, Double tempo, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = callsVoiceeffectValidateBeforeCall(callSid, audioDirection, pitchSemiTones, pitchOctaves, pitch, rate, tempo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
