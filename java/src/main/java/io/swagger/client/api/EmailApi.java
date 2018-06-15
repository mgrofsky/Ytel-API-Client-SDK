

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

public class EmailApi {
    private ApiClient apiClient;

    public EmailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for emailAddunsubscribesemail
     * @param email A valid email address that is to be added to the unsubscribe list (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailAddunsubscribesemailCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/addunsubscribesemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (email != null)
        localVarFormParams.put("email", email);

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
    private com.squareup.okhttp.Call emailAddunsubscribesemailValidateBeforeCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling emailAddunsubscribesemail(Async)");
        }
        

        com.squareup.okhttp.Call call = emailAddunsubscribesemailCall(email, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add Email Unsubscribe
     * Add an email to the unsubscribe list
     * @param email A valid email address that is to be added to the unsubscribe list (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailAddunsubscribesemail(String email) throws ApiException {
        ApiResponse<String> resp = emailAddunsubscribesemailWithHttpInfo(email);
        return resp.getData();
    }

    /**
     * Add Email Unsubscribe
     * Add an email to the unsubscribe list
     * @param email A valid email address that is to be added to the unsubscribe list (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailAddunsubscribesemailWithHttpInfo(String email) throws ApiException {
        com.squareup.okhttp.Call call = emailAddunsubscribesemailValidateBeforeCall(email, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add Email Unsubscribe (asynchronously)
     * Add an email to the unsubscribe list
     * @param email A valid email address that is to be added to the unsubscribe list (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailAddunsubscribesemailAsync(String email, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailAddunsubscribesemailValidateBeforeCall(email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeleteblocksemail
     * @param email The email address to be remove from the blocked list. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeleteblocksemailCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/deleteblocksemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (email != null)
        localVarFormParams.put("Email", email);

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
    private com.squareup.okhttp.Call emailDeleteblocksemailValidateBeforeCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling emailDeleteblocksemail(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeleteblocksemailCall(email, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Blocked Address
     * Remove an email from blocked emails list.
     * @param email The email address to be remove from the blocked list. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeleteblocksemail(String email) throws ApiException {
        ApiResponse<String> resp = emailDeleteblocksemailWithHttpInfo(email);
        return resp.getData();
    }

    /**
     * Remove Blocked Address
     * Remove an email from blocked emails list.
     * @param email The email address to be remove from the blocked list. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeleteblocksemailWithHttpInfo(String email) throws ApiException {
        com.squareup.okhttp.Call call = emailDeleteblocksemailValidateBeforeCall(email, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove Blocked Address (asynchronously)
     * Remove an email from blocked emails list.
     * @param email The email address to be remove from the blocked list. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeleteblocksemailAsync(String email, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailDeleteblocksemailValidateBeforeCall(email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeletebouncesemail
     * @param email The email address to be remove from the bounced email list. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeletebouncesemailCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/deletebouncesemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (email != null)
        localVarFormParams.put("Email", email);

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
    private com.squareup.okhttp.Call emailDeletebouncesemailValidateBeforeCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling emailDeletebouncesemail(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeletebouncesemailCall(email, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Bounced Email
     * Remove an email address from the bounced list.
     * @param email The email address to be remove from the bounced email list. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeletebouncesemail(String email) throws ApiException {
        ApiResponse<String> resp = emailDeletebouncesemailWithHttpInfo(email);
        return resp.getData();
    }

    /**
     * Remove Bounced Email
     * Remove an email address from the bounced list.
     * @param email The email address to be remove from the bounced email list. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeletebouncesemailWithHttpInfo(String email) throws ApiException {
        com.squareup.okhttp.Call call = emailDeletebouncesemailValidateBeforeCall(email, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove Bounced Email (asynchronously)
     * Remove an email address from the bounced list.
     * @param email The email address to be remove from the bounced email list. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeletebouncesemailAsync(String email, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailDeletebouncesemailValidateBeforeCall(email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeleteinvalidemail
     * @param email A valid email address that is to be remove from the invalid email list. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeleteinvalidemailCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/deleteinvalidemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (email != null)
        localVarFormParams.put("Email", email);

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
    private com.squareup.okhttp.Call emailDeleteinvalidemailValidateBeforeCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling emailDeleteinvalidemail(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeleteinvalidemailCall(email, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Invalid Email
     * Remove an email from the invalid email list.
     * @param email A valid email address that is to be remove from the invalid email list. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeleteinvalidemail(String email) throws ApiException {
        ApiResponse<String> resp = emailDeleteinvalidemailWithHttpInfo(email);
        return resp.getData();
    }

    /**
     * Remove Invalid Email
     * Remove an email from the invalid email list.
     * @param email A valid email address that is to be remove from the invalid email list. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeleteinvalidemailWithHttpInfo(String email) throws ApiException {
        com.squareup.okhttp.Call call = emailDeleteinvalidemailValidateBeforeCall(email, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove Invalid Email (asynchronously)
     * Remove an email from the invalid email list.
     * @param email A valid email address that is to be remove from the invalid email list. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeleteinvalidemailAsync(String email, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailDeleteinvalidemailValidateBeforeCall(email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeletespamemail
     * @param email A valid email address that is to be remove from the spam list. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeletespamemailCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/deletespamemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (email != null)
        localVarFormParams.put("Email", email);

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
    private com.squareup.okhttp.Call emailDeletespamemailValidateBeforeCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling emailDeletespamemail(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeletespamemailCall(email, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Spam Address
     * Remove an email from the spam email list.
     * @param email A valid email address that is to be remove from the spam list. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeletespamemail(String email) throws ApiException {
        ApiResponse<String> resp = emailDeletespamemailWithHttpInfo(email);
        return resp.getData();
    }

    /**
     * Remove Spam Address
     * Remove an email from the spam email list.
     * @param email A valid email address that is to be remove from the spam list. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeletespamemailWithHttpInfo(String email) throws ApiException {
        com.squareup.okhttp.Call call = emailDeletespamemailValidateBeforeCall(email, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove Spam Address (asynchronously)
     * Remove an email from the spam email list.
     * @param email A valid email address that is to be remove from the spam list. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeletespamemailAsync(String email, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailDeletespamemailValidateBeforeCall(email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailDeleteunsubscribedemail
     * @param email A valid email address that is to be remove from the unsubscribe list. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailDeleteunsubscribedemailCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/deleteunsubscribedemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (email != null)
        localVarFormParams.put("email", email);

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
    private com.squareup.okhttp.Call emailDeleteunsubscribedemailValidateBeforeCall(String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling emailDeleteunsubscribedemail(Async)");
        }
        

        com.squareup.okhttp.Call call = emailDeleteunsubscribedemailCall(email, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Unsubscribed Email
     * Remove an email address from the list of unsubscribed emails.
     * @param email A valid email address that is to be remove from the unsubscribe list. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailDeleteunsubscribedemail(String email) throws ApiException {
        ApiResponse<String> resp = emailDeleteunsubscribedemailWithHttpInfo(email);
        return resp.getData();
    }

    /**
     * Remove Unsubscribed Email
     * Remove an email address from the list of unsubscribed emails.
     * @param email A valid email address that is to be remove from the unsubscribe list. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailDeleteunsubscribedemailWithHttpInfo(String email) throws ApiException {
        com.squareup.okhttp.Call call = emailDeleteunsubscribedemailValidateBeforeCall(email, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove Unsubscribed Email (asynchronously)
     * Remove an email address from the list of unsubscribed emails.
     * @param email A valid email address that is to be remove from the unsubscribe list. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailDeleteunsubscribedemailAsync(String email, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailDeleteunsubscribedemailValidateBeforeCall(email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailListblockemail
     * @param offset The starting point of the list of blocked emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailListblockemailCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/listblockemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (offset != null)
        localVarFormParams.put("Offset", offset);
        if (limit != null)
        localVarFormParams.put("Limit", limit);

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
    private com.squareup.okhttp.Call emailListblockemailValidateBeforeCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = emailListblockemailCall(offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Blocked Emails
     * Retrieve a list of emails that have been blocked.
     * @param offset The starting point of the list of blocked emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailListblockemail(String offset, String limit) throws ApiException {
        ApiResponse<String> resp = emailListblockemailWithHttpInfo(offset, limit);
        return resp.getData();
    }

    /**
     * Blocked Emails
     * Retrieve a list of emails that have been blocked.
     * @param offset The starting point of the list of blocked emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailListblockemailWithHttpInfo(String offset, String limit) throws ApiException {
        com.squareup.okhttp.Call call = emailListblockemailValidateBeforeCall(offset, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Blocked Emails (asynchronously)
     * Retrieve a list of emails that have been blocked.
     * @param offset The starting point of the list of blocked emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailListblockemailAsync(String offset, String limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailListblockemailValidateBeforeCall(offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailListbounceemail
     * @param offset The starting point of the list of bounced emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailListbounceemailCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/listbounceemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (offset != null)
        localVarFormParams.put("Offset", offset);
        if (limit != null)
        localVarFormParams.put("Limit", limit);

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
    private com.squareup.okhttp.Call emailListbounceemailValidateBeforeCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = emailListbounceemailCall(offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bounced Emails
     * Retrieve a list of emails that have bounced.
     * @param offset The starting point of the list of bounced emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailListbounceemail(String offset, String limit) throws ApiException {
        ApiResponse<String> resp = emailListbounceemailWithHttpInfo(offset, limit);
        return resp.getData();
    }

    /**
     * Bounced Emails
     * Retrieve a list of emails that have bounced.
     * @param offset The starting point of the list of bounced emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailListbounceemailWithHttpInfo(String offset, String limit) throws ApiException {
        com.squareup.okhttp.Call call = emailListbounceemailValidateBeforeCall(offset, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bounced Emails (asynchronously)
     * Retrieve a list of emails that have bounced.
     * @param offset The starting point of the list of bounced emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailListbounceemailAsync(String offset, String limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailListbounceemailValidateBeforeCall(offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailListinvalidemail
     * @param offset The starting point of the list of invalid emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailListinvalidemailCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/listinvalidemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (offset != null)
        localVarFormParams.put("Offset", offset);
        if (limit != null)
        localVarFormParams.put("Limit", limit);

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
    private com.squareup.okhttp.Call emailListinvalidemailValidateBeforeCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = emailListinvalidemailCall(offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Invalid Emails
     * Retrieve a list of invalid email addresses.
     * @param offset The starting point of the list of invalid emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailListinvalidemail(String offset, String limit) throws ApiException {
        ApiResponse<String> resp = emailListinvalidemailWithHttpInfo(offset, limit);
        return resp.getData();
    }

    /**
     * Invalid Emails
     * Retrieve a list of invalid email addresses.
     * @param offset The starting point of the list of invalid emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailListinvalidemailWithHttpInfo(String offset, String limit) throws ApiException {
        com.squareup.okhttp.Call call = emailListinvalidemailValidateBeforeCall(offset, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Invalid Emails (asynchronously)
     * Retrieve a list of invalid email addresses.
     * @param offset The starting point of the list of invalid emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailListinvalidemailAsync(String offset, String limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailListinvalidemailValidateBeforeCall(offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailListspamemail
     * @param offset The starting point of the list of spam emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailListspamemailCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/listspamemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (offset != null)
        localVarFormParams.put("Offset", offset);
        if (limit != null)
        localVarFormParams.put("Limit", limit);

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
    private com.squareup.okhttp.Call emailListspamemailValidateBeforeCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = emailListspamemailCall(offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Spam Emails
     * Retrieve a list of emails that are on the spam list.
     * @param offset The starting point of the list of spam emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailListspamemail(String offset, String limit) throws ApiException {
        ApiResponse<String> resp = emailListspamemailWithHttpInfo(offset, limit);
        return resp.getData();
    }

    /**
     * Spam Emails
     * Retrieve a list of emails that are on the spam list.
     * @param offset The starting point of the list of spam emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailListspamemailWithHttpInfo(String offset, String limit) throws ApiException {
        com.squareup.okhttp.Call call = emailListspamemailValidateBeforeCall(offset, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Spam Emails (asynchronously)
     * Retrieve a list of emails that are on the spam list.
     * @param offset The starting point of the list of spam emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailListspamemailAsync(String offset, String limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailListspamemailValidateBeforeCall(offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailListunsubscribedemail
     * @param offset The starting point of the list of unsubscribed emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailListunsubscribedemailCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/listunsubscribedemail.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (offset != null)
        localVarFormParams.put("Offset", offset);
        if (limit != null)
        localVarFormParams.put("Limit", limit);

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
    private com.squareup.okhttp.Call emailListunsubscribedemailValidateBeforeCall(String offset, String limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = emailListunsubscribedemailCall(offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Unsubscribed Emails
     * Retrieve a list of email addresses from the unsubscribe list.
     * @param offset The starting point of the list of unsubscribed emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailListunsubscribedemail(String offset, String limit) throws ApiException {
        ApiResponse<String> resp = emailListunsubscribedemailWithHttpInfo(offset, limit);
        return resp.getData();
    }

    /**
     * List Unsubscribed Emails
     * Retrieve a list of email addresses from the unsubscribe list.
     * @param offset The starting point of the list of unsubscribed emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailListunsubscribedemailWithHttpInfo(String offset, String limit) throws ApiException {
        com.squareup.okhttp.Call call = emailListunsubscribedemailValidateBeforeCall(offset, limit, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Unsubscribed Emails (asynchronously)
     * Retrieve a list of email addresses from the unsubscribe list.
     * @param offset The starting point of the list of unsubscribed emails that should be returned. (optional)
     * @param limit The count of results that should be returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailListunsubscribedemailAsync(String offset, String limit, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailListunsubscribedemailValidateBeforeCall(offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for emailSendemails
     * @param to A valid address that will receive the email. Multiple addresses can be separated by using commas. (required)
     * @param type Specifies the type of email to be sent (required)
     * @param subject The subject of the mail. Must be a valid string. (required)
     * @param message The email message that is to be sent in the text. (required)
     * @param from A valid address that will send the email. (optional)
     * @param cc Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param bcc Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param attachment A file that is attached to the email. Must be less than 7 MB in size. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call emailSendemailsCall(String to, String type, String subject, String message, String from, String cc, String bcc, String attachment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/email/sendemails.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (to != null)
        localVarFormParams.put("To", to);
        if (type != null)
        localVarFormParams.put("Type", type);
        if (subject != null)
        localVarFormParams.put("Subject", subject);
        if (message != null)
        localVarFormParams.put("Message", message);
        if (from != null)
        localVarFormParams.put("From", from);
        if (cc != null)
        localVarFormParams.put("Cc", cc);
        if (bcc != null)
        localVarFormParams.put("Bcc", bcc);
        if (attachment != null)
        localVarFormParams.put("Attachment", attachment);

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
    private com.squareup.okhttp.Call emailSendemailsValidateBeforeCall(String to, String type, String subject, String message, String from, String cc, String bcc, String attachment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling emailSendemails(Async)");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling emailSendemails(Async)");
        }
        
        // verify the required parameter 'subject' is set
        if (subject == null) {
            throw new ApiException("Missing the required parameter 'subject' when calling emailSendemails(Async)");
        }
        
        // verify the required parameter 'message' is set
        if (message == null) {
            throw new ApiException("Missing the required parameter 'message' when calling emailSendemails(Async)");
        }
        

        com.squareup.okhttp.Call call = emailSendemailsCall(to, type, subject, message, from, cc, bcc, attachment, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send Email
     * Create and submit an email message to one or more email addresses.
     * @param to A valid address that will receive the email. Multiple addresses can be separated by using commas. (required)
     * @param type Specifies the type of email to be sent (required)
     * @param subject The subject of the mail. Must be a valid string. (required)
     * @param message The email message that is to be sent in the text. (required)
     * @param from A valid address that will send the email. (optional)
     * @param cc Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param bcc Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param attachment A file that is attached to the email. Must be less than 7 MB in size. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String emailSendemails(String to, String type, String subject, String message, String from, String cc, String bcc, String attachment) throws ApiException {
        ApiResponse<String> resp = emailSendemailsWithHttpInfo(to, type, subject, message, from, cc, bcc, attachment);
        return resp.getData();
    }

    /**
     * Send Email
     * Create and submit an email message to one or more email addresses.
     * @param to A valid address that will receive the email. Multiple addresses can be separated by using commas. (required)
     * @param type Specifies the type of email to be sent (required)
     * @param subject The subject of the mail. Must be a valid string. (required)
     * @param message The email message that is to be sent in the text. (required)
     * @param from A valid address that will send the email. (optional)
     * @param cc Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param bcc Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param attachment A file that is attached to the email. Must be less than 7 MB in size. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> emailSendemailsWithHttpInfo(String to, String type, String subject, String message, String from, String cc, String bcc, String attachment) throws ApiException {
        com.squareup.okhttp.Call call = emailSendemailsValidateBeforeCall(to, type, subject, message, from, cc, bcc, attachment, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send Email (asynchronously)
     * Create and submit an email message to one or more email addresses.
     * @param to A valid address that will receive the email. Multiple addresses can be separated by using commas. (required)
     * @param type Specifies the type of email to be sent (required)
     * @param subject The subject of the mail. Must be a valid string. (required)
     * @param message The email message that is to be sent in the text. (required)
     * @param from A valid address that will send the email. (optional)
     * @param cc Carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param bcc Blind carbon copy. A valid address that will receive the email. Multiple addresses can be separated by using commas. (optional)
     * @param attachment A file that is attached to the email. Must be less than 7 MB in size. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call emailSendemailsAsync(String to, String type, String subject, String message, String from, String cc, String bcc, String attachment, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = emailSendemailsValidateBeforeCall(to, type, subject, message, from, cc, bcc, attachment, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}