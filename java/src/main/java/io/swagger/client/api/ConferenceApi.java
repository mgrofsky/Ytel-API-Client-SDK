

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

public class ConferenceApi {
    private ApiClient apiClient;

    public ConferenceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConferenceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for conferencesAddParticipant
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantNumber The phone number of the participant to be added. (required)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesAddParticipantCall(String conferenceSid, String participantNumber, Boolean muted, Boolean deaf, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/addParticipant.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (conferenceSid != null)
        localVarFormParams.put("ConferenceSid", conferenceSid);
        if (participantNumber != null)
        localVarFormParams.put("ParticipantNumber", participantNumber);
        if (muted != null)
        localVarFormParams.put("Muted", muted);
        if (deaf != null)
        localVarFormParams.put("Deaf", deaf);

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
    private com.squareup.okhttp.Call conferencesAddParticipantValidateBeforeCall(String conferenceSid, String participantNumber, Boolean muted, Boolean deaf, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conferenceSid' is set
        if (conferenceSid == null) {
            throw new ApiException("Missing the required parameter 'conferenceSid' when calling conferencesAddParticipant(Async)");
        }
        
        // verify the required parameter 'participantNumber' is set
        if (participantNumber == null) {
            throw new ApiException("Missing the required parameter 'participantNumber' when calling conferencesAddParticipant(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesAddParticipantCall(conferenceSid, participantNumber, muted, deaf, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add Participant
     * Add Participant in conference 
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantNumber The phone number of the participant to be added. (required)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesAddParticipant(String conferenceSid, String participantNumber, Boolean muted, Boolean deaf) throws ApiException {
        ApiResponse<String> resp = conferencesAddParticipantWithHttpInfo(conferenceSid, participantNumber, muted, deaf);
        return resp.getData();
    }

    /**
     * Add Participant
     * Add Participant in conference 
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantNumber The phone number of the participant to be added. (required)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesAddParticipantWithHttpInfo(String conferenceSid, String participantNumber, Boolean muted, Boolean deaf) throws ApiException {
        com.squareup.okhttp.Call call = conferencesAddParticipantValidateBeforeCall(conferenceSid, participantNumber, muted, deaf, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add Participant (asynchronously)
     * Add Participant in conference 
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantNumber The phone number of the participant to be added. (required)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesAddParticipantAsync(String conferenceSid, String participantNumber, Boolean muted, Boolean deaf, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesAddParticipantValidateBeforeCall(conferenceSid, participantNumber, muted, deaf, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesCreateConference
     * @param from A valid 10-digit number (E.164 format) that will be initiating the conference call. (required)
     * @param to A valid 10-digit number (E.164 format) that is to receive the conference call. (required)
     * @param url URL requested once the conference connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to POST)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallbackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param record Specifies if the conference should be recorded. (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion. (optional)
     * @param recordCallBackMethod Specifies the HTTP method used to request the required URL once conference connects. (optional)
     * @param scheduleTime Schedule conference in future. Schedule time must be greater than current time (optional)
     * @param timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesCreateConferenceCall(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallbackUrl, String fallbackMethod, Boolean record, String recordCallBackUrl, String recordCallBackMethod, String scheduleTime, Integer timeout, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/createConference.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (url != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("Url", url));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (from != null)
        localVarFormParams.put("From", from);
        if (to != null)
        localVarFormParams.put("To", to);
        if (method != null)
        localVarFormParams.put("Method", method);
        if (statusCallBackUrl != null)
        localVarFormParams.put("StatusCallBackUrl", statusCallBackUrl);
        if (statusCallBackMethod != null)
        localVarFormParams.put("StatusCallBackMethod", statusCallBackMethod);
        if (fallbackUrl != null)
        localVarFormParams.put("FallbackUrl", fallbackUrl);
        if (fallbackMethod != null)
        localVarFormParams.put("FallbackMethod", fallbackMethod);
        if (record != null)
        localVarFormParams.put("Record", record);
        if (recordCallBackUrl != null)
        localVarFormParams.put("RecordCallBackUrl", recordCallBackUrl);
        if (recordCallBackMethod != null)
        localVarFormParams.put("RecordCallBackMethod", recordCallBackMethod);
        if (scheduleTime != null)
        localVarFormParams.put("ScheduleTime", scheduleTime);
        if (timeout != null)
        localVarFormParams.put("Timeout", timeout);

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
    private com.squareup.okhttp.Call conferencesCreateConferenceValidateBeforeCall(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallbackUrl, String fallbackMethod, Boolean record, String recordCallBackUrl, String recordCallBackMethod, String scheduleTime, Integer timeout, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling conferencesCreateConference(Async)");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling conferencesCreateConference(Async)");
        }
        
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new ApiException("Missing the required parameter 'url' when calling conferencesCreateConference(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesCreateConferenceCall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Conference
     * Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
     * @param from A valid 10-digit number (E.164 format) that will be initiating the conference call. (required)
     * @param to A valid 10-digit number (E.164 format) that is to receive the conference call. (required)
     * @param url URL requested once the conference connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to POST)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallbackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param record Specifies if the conference should be recorded. (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion. (optional)
     * @param recordCallBackMethod Specifies the HTTP method used to request the required URL once conference connects. (optional)
     * @param scheduleTime Schedule conference in future. Schedule time must be greater than current time (optional)
     * @param timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesCreateConference(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallbackUrl, String fallbackMethod, Boolean record, String recordCallBackUrl, String recordCallBackMethod, String scheduleTime, Integer timeout) throws ApiException {
        ApiResponse<String> resp = conferencesCreateConferenceWithHttpInfo(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout);
        return resp.getData();
    }

    /**
     * Create Conference
     * Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
     * @param from A valid 10-digit number (E.164 format) that will be initiating the conference call. (required)
     * @param to A valid 10-digit number (E.164 format) that is to receive the conference call. (required)
     * @param url URL requested once the conference connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to POST)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallbackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param record Specifies if the conference should be recorded. (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion. (optional)
     * @param recordCallBackMethod Specifies the HTTP method used to request the required URL once conference connects. (optional)
     * @param scheduleTime Schedule conference in future. Schedule time must be greater than current time (optional)
     * @param timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesCreateConferenceWithHttpInfo(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallbackUrl, String fallbackMethod, Boolean record, String recordCallBackUrl, String recordCallBackMethod, String scheduleTime, Integer timeout) throws ApiException {
        com.squareup.okhttp.Call call = conferencesCreateConferenceValidateBeforeCall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Conference (asynchronously)
     * Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
     * @param from A valid 10-digit number (E.164 format) that will be initiating the conference call. (required)
     * @param to A valid 10-digit number (E.164 format) that is to receive the conference call. (required)
     * @param url URL requested once the conference connects (required)
     * @param method Specifies the HTTP method used to request the required URL once call connects. (optional, default to POST)
     * @param statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished. (optional)
     * @param statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. (optional)
     * @param fallbackUrl URL requested if the initial Url parameter fails or encounters an error (optional)
     * @param fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
     * @param record Specifies if the conference should be recorded. (optional)
     * @param recordCallBackUrl Recording parameters will be sent here upon completion. (optional)
     * @param recordCallBackMethod Specifies the HTTP method used to request the required URL once conference connects. (optional)
     * @param scheduleTime Schedule conference in future. Schedule time must be greater than current time (optional)
     * @param timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesCreateConferenceAsync(String from, String to, String url, String method, String statusCallBackUrl, String statusCallBackMethod, String fallbackUrl, String fallbackMethod, Boolean record, String recordCallBackUrl, String recordCallBackMethod, String scheduleTime, Integer timeout, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesCreateConferenceValidateBeforeCall(from, to, url, method, statusCallBackUrl, statusCallBackMethod, fallbackUrl, fallbackMethod, record, recordCallBackUrl, recordCallBackMethod, scheduleTime, timeout, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesDeafMuteParticipant
     * @param conferenceSid ID of the active conference (required)
     * @param participantSid ID of an active participant (required)
     * @param muted Mute a participant (optional)
     * @param deaf Make it so a participant cant hear (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesDeafMuteParticipantCall(String conferenceSid, String participantSid, Boolean muted, Boolean deaf, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/deafMuteParticipant.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (conferenceSid != null)
        localVarFormParams.put("conferenceSid", conferenceSid);
        if (participantSid != null)
        localVarFormParams.put("ParticipantSid", participantSid);
        if (muted != null)
        localVarFormParams.put("Muted", muted);
        if (deaf != null)
        localVarFormParams.put("Deaf", deaf);

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
    private com.squareup.okhttp.Call conferencesDeafMuteParticipantValidateBeforeCall(String conferenceSid, String participantSid, Boolean muted, Boolean deaf, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conferenceSid' is set
        if (conferenceSid == null) {
            throw new ApiException("Missing the required parameter 'conferenceSid' when calling conferencesDeafMuteParticipant(Async)");
        }
        
        // verify the required parameter 'participantSid' is set
        if (participantSid == null) {
            throw new ApiException("Missing the required parameter 'participantSid' when calling conferencesDeafMuteParticipant(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesDeafMuteParticipantCall(conferenceSid, participantSid, muted, deaf, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Silence Participant
     * Deaf Mute Participant
     * @param conferenceSid ID of the active conference (required)
     * @param participantSid ID of an active participant (required)
     * @param muted Mute a participant (optional)
     * @param deaf Make it so a participant cant hear (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesDeafMuteParticipant(String conferenceSid, String participantSid, Boolean muted, Boolean deaf) throws ApiException {
        ApiResponse<String> resp = conferencesDeafMuteParticipantWithHttpInfo(conferenceSid, participantSid, muted, deaf);
        return resp.getData();
    }

    /**
     * Silence Participant
     * Deaf Mute Participant
     * @param conferenceSid ID of the active conference (required)
     * @param participantSid ID of an active participant (required)
     * @param muted Mute a participant (optional)
     * @param deaf Make it so a participant cant hear (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesDeafMuteParticipantWithHttpInfo(String conferenceSid, String participantSid, Boolean muted, Boolean deaf) throws ApiException {
        com.squareup.okhttp.Call call = conferencesDeafMuteParticipantValidateBeforeCall(conferenceSid, participantSid, muted, deaf, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Silence Participant (asynchronously)
     * Deaf Mute Participant
     * @param conferenceSid ID of the active conference (required)
     * @param participantSid ID of an active participant (required)
     * @param muted Mute a participant (optional)
     * @param deaf Make it so a participant cant hear (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesDeafMuteParticipantAsync(String conferenceSid, String participantSid, Boolean muted, Boolean deaf, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesDeafMuteParticipantValidateBeforeCall(conferenceSid, participantSid, muted, deaf, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesHangupParticipant
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesHangupParticipantCall(String conferenceSid, String participantSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/hangupParticipant.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (participantSid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ParticipantSid", participantSid));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (conferenceSid != null)
        localVarFormParams.put("ConferenceSid", conferenceSid);

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
    private com.squareup.okhttp.Call conferencesHangupParticipantValidateBeforeCall(String conferenceSid, String participantSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conferenceSid' is set
        if (conferenceSid == null) {
            throw new ApiException("Missing the required parameter 'conferenceSid' when calling conferencesHangupParticipant(Async)");
        }
        
        // verify the required parameter 'participantSid' is set
        if (participantSid == null) {
            throw new ApiException("Missing the required parameter 'participantSid' when calling conferencesHangupParticipant(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesHangupParticipantCall(conferenceSid, participantSid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Hangup Participant
     * Remove a participant from a conference.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesHangupParticipant(String conferenceSid, String participantSid) throws ApiException {
        ApiResponse<String> resp = conferencesHangupParticipantWithHttpInfo(conferenceSid, participantSid);
        return resp.getData();
    }

    /**
     * Hangup Participant
     * Remove a participant from a conference.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesHangupParticipantWithHttpInfo(String conferenceSid, String participantSid) throws ApiException {
        com.squareup.okhttp.Call call = conferencesHangupParticipantValidateBeforeCall(conferenceSid, participantSid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Hangup Participant (asynchronously)
     * Remove a participant from a conference.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesHangupParticipantAsync(String conferenceSid, String participantSid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesHangupParticipantValidateBeforeCall(conferenceSid, participantSid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesListParticipant
     * @param conferenceSid The unique identifier for a conference. (required)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesListParticipantCall(String conferenceSid, Integer page, Integer pagesize, Boolean muted, Boolean deaf, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/listParticipant.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (conferenceSid != null)
        localVarFormParams.put("ConferenceSid", conferenceSid);
        if (page != null)
        localVarFormParams.put("Page", page);
        if (pagesize != null)
        localVarFormParams.put("Pagesize", pagesize);
        if (muted != null)
        localVarFormParams.put("Muted", muted);
        if (deaf != null)
        localVarFormParams.put("Deaf", deaf);

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
    private com.squareup.okhttp.Call conferencesListParticipantValidateBeforeCall(String conferenceSid, Integer page, Integer pagesize, Boolean muted, Boolean deaf, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conferenceSid' is set
        if (conferenceSid == null) {
            throw new ApiException("Missing the required parameter 'conferenceSid' when calling conferencesListParticipant(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesListParticipantCall(conferenceSid, page, pagesize, muted, deaf, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Participants
     * Retrieve a list of participants for an in-progress conference.
     * @param conferenceSid The unique identifier for a conference. (required)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesListParticipant(String conferenceSid, Integer page, Integer pagesize, Boolean muted, Boolean deaf) throws ApiException {
        ApiResponse<String> resp = conferencesListParticipantWithHttpInfo(conferenceSid, page, pagesize, muted, deaf);
        return resp.getData();
    }

    /**
     * List Participants
     * Retrieve a list of participants for an in-progress conference.
     * @param conferenceSid The unique identifier for a conference. (required)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesListParticipantWithHttpInfo(String conferenceSid, Integer page, Integer pagesize, Boolean muted, Boolean deaf) throws ApiException {
        com.squareup.okhttp.Call call = conferencesListParticipantValidateBeforeCall(conferenceSid, page, pagesize, muted, deaf, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Participants (asynchronously)
     * Retrieve a list of participants for an in-progress conference.
     * @param conferenceSid The unique identifier for a conference. (required)
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param muted Specifies if participant should be muted. (optional)
     * @param deaf Specifies if the participant should hear audio in the conference. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesListParticipantAsync(String conferenceSid, Integer page, Integer pagesize, Boolean muted, Boolean deaf, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesListParticipantValidateBeforeCall(conferenceSid, page, pagesize, muted, deaf, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesListconference
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param friendlyName Only return conferences with the specified FriendlyName (optional)
     * @param dateCreated Conference created date (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesListconferenceCall(Integer page, Integer pagesize, String friendlyName, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/listconference.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (friendlyName != null)
        localVarFormParams.put("FriendlyName", friendlyName);
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
    private com.squareup.okhttp.Call conferencesListconferenceValidateBeforeCall(Integer page, Integer pagesize, String friendlyName, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = conferencesListconferenceCall(page, pagesize, friendlyName, dateCreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Conferences
     * Retrieve a list of conference objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param friendlyName Only return conferences with the specified FriendlyName (optional)
     * @param dateCreated Conference created date (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesListconference(Integer page, Integer pagesize, String friendlyName, String dateCreated) throws ApiException {
        ApiResponse<String> resp = conferencesListconferenceWithHttpInfo(page, pagesize, friendlyName, dateCreated);
        return resp.getData();
    }

    /**
     * List Conferences
     * Retrieve a list of conference objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param friendlyName Only return conferences with the specified FriendlyName (optional)
     * @param dateCreated Conference created date (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesListconferenceWithHttpInfo(Integer page, Integer pagesize, String friendlyName, String dateCreated) throws ApiException {
        com.squareup.okhttp.Call call = conferencesListconferenceValidateBeforeCall(page, pagesize, friendlyName, dateCreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Conferences (asynchronously)
     * Retrieve a list of conference objects.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize Number of individual resources listed in the response per page (optional, default to 10)
     * @param friendlyName Only return conferences with the specified FriendlyName (optional)
     * @param dateCreated Conference created date (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesListconferenceAsync(Integer page, Integer pagesize, String friendlyName, String dateCreated, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesListconferenceValidateBeforeCall(page, pagesize, friendlyName, dateCreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesPlayAudio
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param audioUrl The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesPlayAudioCall(String conferenceSid, String participantSid, String audioUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/playAudio.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (conferenceSid != null)
        localVarFormParams.put("ConferenceSid", conferenceSid);
        if (participantSid != null)
        localVarFormParams.put("ParticipantSid", participantSid);
        if (audioUrl != null)
        localVarFormParams.put("AudioUrl", audioUrl);

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
    private com.squareup.okhttp.Call conferencesPlayAudioValidateBeforeCall(String conferenceSid, String participantSid, String audioUrl, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conferenceSid' is set
        if (conferenceSid == null) {
            throw new ApiException("Missing the required parameter 'conferenceSid' when calling conferencesPlayAudio(Async)");
        }
        
        // verify the required parameter 'participantSid' is set
        if (participantSid == null) {
            throw new ApiException("Missing the required parameter 'participantSid' when calling conferencesPlayAudio(Async)");
        }
        
        // verify the required parameter 'audioUrl' is set
        if (audioUrl == null) {
            throw new ApiException("Missing the required parameter 'audioUrl' when calling conferencesPlayAudio(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesPlayAudioCall(conferenceSid, participantSid, audioUrl, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Play Audio
     * Play an audio file during a conference.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param audioUrl The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesPlayAudio(String conferenceSid, String participantSid, String audioUrl) throws ApiException {
        ApiResponse<String> resp = conferencesPlayAudioWithHttpInfo(conferenceSid, participantSid, audioUrl);
        return resp.getData();
    }

    /**
     * Play Audio
     * Play an audio file during a conference.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param audioUrl The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesPlayAudioWithHttpInfo(String conferenceSid, String participantSid, String audioUrl) throws ApiException {
        com.squareup.okhttp.Call call = conferencesPlayAudioValidateBeforeCall(conferenceSid, participantSid, audioUrl, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Play Audio (asynchronously)
     * Play an audio file during a conference.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param audioUrl The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesPlayAudioAsync(String conferenceSid, String participantSid, String audioUrl, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesPlayAudioValidateBeforeCall(conferenceSid, participantSid, audioUrl, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesViewParticipant
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesViewParticipantCall(String conferenceSid, String participantSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/viewParticipant.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (conferenceSid != null)
        localVarFormParams.put("ConferenceSid", conferenceSid);
        if (participantSid != null)
        localVarFormParams.put("ParticipantSid", participantSid);

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
    private com.squareup.okhttp.Call conferencesViewParticipantValidateBeforeCall(String conferenceSid, String participantSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conferenceSid' is set
        if (conferenceSid == null) {
            throw new ApiException("Missing the required parameter 'conferenceSid' when calling conferencesViewParticipant(Async)");
        }
        
        // verify the required parameter 'participantSid' is set
        if (participantSid == null) {
            throw new ApiException("Missing the required parameter 'participantSid' when calling conferencesViewParticipant(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesViewParticipantCall(conferenceSid, participantSid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Participant
     * Retrieve information about a participant by its ParticipantSid.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesViewParticipant(String conferenceSid, String participantSid) throws ApiException {
        ApiResponse<String> resp = conferencesViewParticipantWithHttpInfo(conferenceSid, participantSid);
        return resp.getData();
    }

    /**
     * View Participant
     * Retrieve information about a participant by its ParticipantSid.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesViewParticipantWithHttpInfo(String conferenceSid, String participantSid) throws ApiException {
        com.squareup.okhttp.Call call = conferencesViewParticipantValidateBeforeCall(conferenceSid, participantSid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Participant (asynchronously)
     * Retrieve information about a participant by its ParticipantSid.
     * @param conferenceSid The unique identifier for a conference object. (required)
     * @param participantSid The unique identifier for a participant object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesViewParticipantAsync(String conferenceSid, String participantSid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesViewParticipantValidateBeforeCall(conferenceSid, participantSid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for conferencesViewconference
     * @param conferenceSid The unique identifier of each conference resource (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call conferencesViewconferenceCall(String conferenceSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/conferences/viewconference.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (conferenceSid != null)
        localVarFormParams.put("ConferenceSid", conferenceSid);

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
    private com.squareup.okhttp.Call conferencesViewconferenceValidateBeforeCall(String conferenceSid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'conferenceSid' is set
        if (conferenceSid == null) {
            throw new ApiException("Missing the required parameter 'conferenceSid' when calling conferencesViewconference(Async)");
        }
        

        com.squareup.okhttp.Call call = conferencesViewconferenceCall(conferenceSid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Conference
     * Retrieve information about a conference by its ConferenceSid.
     * @param conferenceSid The unique identifier of each conference resource (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String conferencesViewconference(String conferenceSid) throws ApiException {
        ApiResponse<String> resp = conferencesViewconferenceWithHttpInfo(conferenceSid);
        return resp.getData();
    }

    /**
     * View Conference
     * Retrieve information about a conference by its ConferenceSid.
     * @param conferenceSid The unique identifier of each conference resource (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> conferencesViewconferenceWithHttpInfo(String conferenceSid) throws ApiException {
        com.squareup.okhttp.Call call = conferencesViewconferenceValidateBeforeCall(conferenceSid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Conference (asynchronously)
     * Retrieve information about a conference by its ConferenceSid.
     * @param conferenceSid The unique identifier of each conference resource (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call conferencesViewconferenceAsync(String conferenceSid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = conferencesViewconferenceValidateBeforeCall(conferenceSid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
