

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

public class SubAccountApi {
    private ApiClient apiClient;

    public SubAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SubAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for userCreatesubaccount
     * @param firstName Sub account user first name (required)
     * @param lastName sub account user last name (required)
     * @param email Sub account email address (required)
     * @param friendlyName Descriptive name of the sub account (required)
     * @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call userCreatesubaccountCall(String firstName, String lastName, String email, String friendlyName, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/createsubaccount.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (firstName != null)
        localVarFormParams.put("FirstName", firstName);
        if (lastName != null)
        localVarFormParams.put("LastName", lastName);
        if (email != null)
        localVarFormParams.put("Email", email);
        if (friendlyName != null)
        localVarFormParams.put("FriendlyName", friendlyName);
        if (password != null)
        localVarFormParams.put("Password", password);

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
    private com.squareup.okhttp.Call userCreatesubaccountValidateBeforeCall(String firstName, String lastName, String email, String friendlyName, String password, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new ApiException("Missing the required parameter 'firstName' when calling userCreatesubaccount(Async)");
        }
        
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new ApiException("Missing the required parameter 'lastName' when calling userCreatesubaccount(Async)");
        }
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling userCreatesubaccount(Async)");
        }
        
        // verify the required parameter 'friendlyName' is set
        if (friendlyName == null) {
            throw new ApiException("Missing the required parameter 'friendlyName' when calling userCreatesubaccount(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling userCreatesubaccount(Async)");
        }
        

        com.squareup.okhttp.Call call = userCreatesubaccountCall(firstName, lastName, email, friendlyName, password, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Subaccount
     * Create a sub user account under the parent account
     * @param firstName Sub account user first name (required)
     * @param lastName sub account user last name (required)
     * @param email Sub account email address (required)
     * @param friendlyName Descriptive name of the sub account (required)
     * @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String userCreatesubaccount(String firstName, String lastName, String email, String friendlyName, String password) throws ApiException {
        ApiResponse<String> resp = userCreatesubaccountWithHttpInfo(firstName, lastName, email, friendlyName, password);
        return resp.getData();
    }

    /**
     * Create Subaccount
     * Create a sub user account under the parent account
     * @param firstName Sub account user first name (required)
     * @param lastName sub account user last name (required)
     * @param email Sub account email address (required)
     * @param friendlyName Descriptive name of the sub account (required)
     * @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> userCreatesubaccountWithHttpInfo(String firstName, String lastName, String email, String friendlyName, String password) throws ApiException {
        com.squareup.okhttp.Call call = userCreatesubaccountValidateBeforeCall(firstName, lastName, email, friendlyName, password, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Subaccount (asynchronously)
     * Create a sub user account under the parent account
     * @param firstName Sub account user first name (required)
     * @param lastName sub account user last name (required)
     * @param email Sub account email address (required)
     * @param friendlyName Descriptive name of the sub account (required)
     * @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userCreatesubaccountAsync(String firstName, String lastName, String email, String friendlyName, String password, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = userCreatesubaccountValidateBeforeCall(firstName, lastName, email, friendlyName, password, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for userDeletesubaccount
     * @param subAccountSID The SubaccountSid to be deleted (required)
     * @param mergeNumber 0 to delete or 1 to merge numbers to parent account. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call userDeletesubaccountCall(String subAccountSID, String mergeNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/deletesubaccount.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (subAccountSID != null)
        localVarFormParams.put("SubAccountSID", subAccountSID);
        if (mergeNumber != null)
        localVarFormParams.put("MergeNumber", mergeNumber);

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
    private com.squareup.okhttp.Call userDeletesubaccountValidateBeforeCall(String subAccountSID, String mergeNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'subAccountSID' is set
        if (subAccountSID == null) {
            throw new ApiException("Missing the required parameter 'subAccountSID' when calling userDeletesubaccount(Async)");
        }
        
        // verify the required parameter 'mergeNumber' is set
        if (mergeNumber == null) {
            throw new ApiException("Missing the required parameter 'mergeNumber' when calling userDeletesubaccount(Async)");
        }
        

        com.squareup.okhttp.Call call = userDeletesubaccountCall(subAccountSID, mergeNumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Subaccount
     * Delete sub account or merge numbers into parent
     * @param subAccountSID The SubaccountSid to be deleted (required)
     * @param mergeNumber 0 to delete or 1 to merge numbers to parent account. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String userDeletesubaccount(String subAccountSID, String mergeNumber) throws ApiException {
        ApiResponse<String> resp = userDeletesubaccountWithHttpInfo(subAccountSID, mergeNumber);
        return resp.getData();
    }

    /**
     * Delete Subaccount
     * Delete sub account or merge numbers into parent
     * @param subAccountSID The SubaccountSid to be deleted (required)
     * @param mergeNumber 0 to delete or 1 to merge numbers to parent account. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> userDeletesubaccountWithHttpInfo(String subAccountSID, String mergeNumber) throws ApiException {
        com.squareup.okhttp.Call call = userDeletesubaccountValidateBeforeCall(subAccountSID, mergeNumber, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Subaccount (asynchronously)
     * Delete sub account or merge numbers into parent
     * @param subAccountSID The SubaccountSid to be deleted (required)
     * @param mergeNumber 0 to delete or 1 to merge numbers to parent account. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userDeletesubaccountAsync(String subAccountSID, String mergeNumber, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = userDeletesubaccountValidateBeforeCall(subAccountSID, mergeNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for userSubaccountactivation
     * @param subAccountSID The SubaccountSid to be activated or suspended (required)
     * @param activate 0 to suspend or 1 to activate (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call userSubaccountactivationCall(String subAccountSID, String activate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/subaccountactivation.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (subAccountSID != null)
        localVarFormParams.put("SubAccountSID", subAccountSID);
        if (activate != null)
        localVarFormParams.put("Activate", activate);

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
    private com.squareup.okhttp.Call userSubaccountactivationValidateBeforeCall(String subAccountSID, String activate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'subAccountSID' is set
        if (subAccountSID == null) {
            throw new ApiException("Missing the required parameter 'subAccountSID' when calling userSubaccountactivation(Async)");
        }
        
        // verify the required parameter 'activate' is set
        if (activate == null) {
            throw new ApiException("Missing the required parameter 'activate' when calling userSubaccountactivation(Async)");
        }
        

        com.squareup.okhttp.Call call = userSubaccountactivationCall(subAccountSID, activate, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Toggle Subaccount Status
     * Suspend or unsuspend
     * @param subAccountSID The SubaccountSid to be activated or suspended (required)
     * @param activate 0 to suspend or 1 to activate (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String userSubaccountactivation(String subAccountSID, String activate) throws ApiException {
        ApiResponse<String> resp = userSubaccountactivationWithHttpInfo(subAccountSID, activate);
        return resp.getData();
    }

    /**
     * Toggle Subaccount Status
     * Suspend or unsuspend
     * @param subAccountSID The SubaccountSid to be activated or suspended (required)
     * @param activate 0 to suspend or 1 to activate (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> userSubaccountactivationWithHttpInfo(String subAccountSID, String activate) throws ApiException {
        com.squareup.okhttp.Call call = userSubaccountactivationValidateBeforeCall(subAccountSID, activate, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Toggle Subaccount Status (asynchronously)
     * Suspend or unsuspend
     * @param subAccountSID The SubaccountSid to be activated or suspended (required)
     * @param activate 0 to suspend or 1 to activate (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userSubaccountactivationAsync(String subAccountSID, String activate, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = userSubaccountactivationValidateBeforeCall(subAccountSID, activate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
