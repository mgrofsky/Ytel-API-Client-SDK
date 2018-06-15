

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

public class PhoneNumberApi {
    private ApiClient apiClient;

    public PhoneNumberApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PhoneNumberApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for incomingphoneAvailablenumber
     * @param numbertype Number type either SMS,Voice or all (required)
     * @param areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param pagesize The count of objects to return. (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneAvailablenumberCall(String numbertype, String areacode, Integer pagesize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/availablenumber.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (numbertype != null)
        localVarFormParams.put("numbertype", numbertype);
        if (areacode != null)
        localVarFormParams.put("areacode", areacode);
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
    private com.squareup.okhttp.Call incomingphoneAvailablenumberValidateBeforeCall(String numbertype, String areacode, Integer pagesize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'numbertype' is set
        if (numbertype == null) {
            throw new ApiException("Missing the required parameter 'numbertype' when calling incomingphoneAvailablenumber(Async)");
        }
        
        // verify the required parameter 'areacode' is set
        if (areacode == null) {
            throw new ApiException("Missing the required parameter 'areacode' when calling incomingphoneAvailablenumber(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneAvailablenumberCall(numbertype, areacode, pagesize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Available Numbers
     * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
     * @param numbertype Number type either SMS,Voice or all (required)
     * @param areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param pagesize The count of objects to return. (optional, default to 10)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneAvailablenumber(String numbertype, String areacode, Integer pagesize) throws ApiException {
        ApiResponse<String> resp = incomingphoneAvailablenumberWithHttpInfo(numbertype, areacode, pagesize);
        return resp.getData();
    }

    /**
     * Available Numbers
     * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
     * @param numbertype Number type either SMS,Voice or all (required)
     * @param areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param pagesize The count of objects to return. (optional, default to 10)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneAvailablenumberWithHttpInfo(String numbertype, String areacode, Integer pagesize) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneAvailablenumberValidateBeforeCall(numbertype, areacode, pagesize, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Available Numbers (asynchronously)
     * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
     * @param numbertype Number type either SMS,Voice or all (required)
     * @param areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param pagesize The count of objects to return. (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneAvailablenumberAsync(String numbertype, String areacode, Integer pagesize, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneAvailablenumberValidateBeforeCall(numbertype, areacode, pagesize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneBulkbuy
     * @param numberType The capability the number supports. (required)
     * @param areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param quantity A positive integer that tells how many number you want to buy at a time. (required)
     * @param leftover If desired quantity is unavailable purchase what is available . (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneBulkbuyCall(String numberType, String areaCode, String quantity, String leftover, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/bulkbuy.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (numberType != null)
        localVarFormParams.put("NumberType", numberType);
        if (areaCode != null)
        localVarFormParams.put("AreaCode", areaCode);
        if (quantity != null)
        localVarFormParams.put("Quantity", quantity);
        if (leftover != null)
        localVarFormParams.put("Leftover", leftover);

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
    private com.squareup.okhttp.Call incomingphoneBulkbuyValidateBeforeCall(String numberType, String areaCode, String quantity, String leftover, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'numberType' is set
        if (numberType == null) {
            throw new ApiException("Missing the required parameter 'numberType' when calling incomingphoneBulkbuy(Async)");
        }
        
        // verify the required parameter 'areaCode' is set
        if (areaCode == null) {
            throw new ApiException("Missing the required parameter 'areaCode' when calling incomingphoneBulkbuy(Async)");
        }
        
        // verify the required parameter 'quantity' is set
        if (quantity == null) {
            throw new ApiException("Missing the required parameter 'quantity' when calling incomingphoneBulkbuy(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneBulkbuyCall(numberType, areaCode, quantity, leftover, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bulk Buy Numbers
     * Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.
     * @param numberType The capability the number supports. (required)
     * @param areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param quantity A positive integer that tells how many number you want to buy at a time. (required)
     * @param leftover If desired quantity is unavailable purchase what is available . (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneBulkbuy(String numberType, String areaCode, String quantity, String leftover) throws ApiException {
        ApiResponse<String> resp = incomingphoneBulkbuyWithHttpInfo(numberType, areaCode, quantity, leftover);
        return resp.getData();
    }

    /**
     * Bulk Buy Numbers
     * Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.
     * @param numberType The capability the number supports. (required)
     * @param areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param quantity A positive integer that tells how many number you want to buy at a time. (required)
     * @param leftover If desired quantity is unavailable purchase what is available . (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneBulkbuyWithHttpInfo(String numberType, String areaCode, String quantity, String leftover) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneBulkbuyValidateBeforeCall(numberType, areaCode, quantity, leftover, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bulk Buy Numbers (asynchronously)
     * Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.
     * @param numberType The capability the number supports. (required)
     * @param areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers. (required)
     * @param quantity A positive integer that tells how many number you want to buy at a time. (required)
     * @param leftover If desired quantity is unavailable purchase what is available . (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneBulkbuyAsync(String numberType, String areaCode, String quantity, String leftover, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneBulkbuyValidateBeforeCall(numberType, areaCode, quantity, leftover, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneBuynumber
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneBuynumberCall(String phoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/buynumber.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phoneNumber != null)
        localVarFormParams.put("PhoneNumber", phoneNumber);

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
    private com.squareup.okhttp.Call incomingphoneBuynumberValidateBeforeCall(String phoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling incomingphoneBuynumber(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneBuynumberCall(phoneNumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Purchase Number
     * Purchase a phone number to be used with your Ytel account
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneBuynumber(String phoneNumber) throws ApiException {
        ApiResponse<String> resp = incomingphoneBuynumberWithHttpInfo(phoneNumber);
        return resp.getData();
    }

    /**
     * Purchase Number
     * Purchase a phone number to be used with your Ytel account
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneBuynumberWithHttpInfo(String phoneNumber) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneBuynumberValidateBeforeCall(phoneNumber, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Purchase Number (asynchronously)
     * Purchase a phone number to be used with your Ytel account
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneBuynumberAsync(String phoneNumber, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneBuynumberValidateBeforeCall(phoneNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneGetdidscore
     * @param phonenumber Specifies the multiple phone numbers for check updated spamscore . (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneGetdidscoreCall(String phonenumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/getdidscore.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phonenumber != null)
        localVarFormParams.put("Phonenumber", phonenumber);

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
    private com.squareup.okhttp.Call incomingphoneGetdidscoreValidateBeforeCall(String phonenumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phonenumber' is set
        if (phonenumber == null) {
            throw new ApiException("Missing the required parameter 'phonenumber' when calling incomingphoneGetdidscore(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneGetdidscoreCall(phonenumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get DID Score
     * Get DID Score Number
     * @param phonenumber Specifies the multiple phone numbers for check updated spamscore . (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneGetdidscore(String phonenumber) throws ApiException {
        ApiResponse<String> resp = incomingphoneGetdidscoreWithHttpInfo(phonenumber);
        return resp.getData();
    }

    /**
     * Get DID Score
     * Get DID Score Number
     * @param phonenumber Specifies the multiple phone numbers for check updated spamscore . (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneGetdidscoreWithHttpInfo(String phonenumber) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneGetdidscoreValidateBeforeCall(phonenumber, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get DID Score (asynchronously)
     * Get DID Score Number
     * @param phonenumber Specifies the multiple phone numbers for check updated spamscore . (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneGetdidscoreAsync(String phonenumber, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneGetdidscoreValidateBeforeCall(phonenumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneListnumber
     * @param page Which page of the overall response will be returned. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 10)
     * @param numberType The capability supported by the number.Number type either SMS,Voice or all (optional)
     * @param friendlyName A human-readable label added to the number object. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneListnumberCall(Integer page, Integer pageSize, String numberType, String friendlyName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/listnumber.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("Page", page);
        if (pageSize != null)
        localVarFormParams.put("PageSize", pageSize);
        if (numberType != null)
        localVarFormParams.put("NumberType", numberType);
        if (friendlyName != null)
        localVarFormParams.put("FriendlyName", friendlyName);

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
    private com.squareup.okhttp.Call incomingphoneListnumberValidateBeforeCall(Integer page, Integer pageSize, String numberType, String friendlyName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = incomingphoneListnumberCall(page, pageSize, numberType, friendlyName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Numbers
     * Retrieve a list of purchased phones numbers associated with your Ytel account.
     * @param page Which page of the overall response will be returned. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 10)
     * @param numberType The capability supported by the number.Number type either SMS,Voice or all (optional)
     * @param friendlyName A human-readable label added to the number object. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneListnumber(Integer page, Integer pageSize, String numberType, String friendlyName) throws ApiException {
        ApiResponse<String> resp = incomingphoneListnumberWithHttpInfo(page, pageSize, numberType, friendlyName);
        return resp.getData();
    }

    /**
     * List Numbers
     * Retrieve a list of purchased phones numbers associated with your Ytel account.
     * @param page Which page of the overall response will be returned. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 10)
     * @param numberType The capability supported by the number.Number type either SMS,Voice or all (optional)
     * @param friendlyName A human-readable label added to the number object. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneListnumberWithHttpInfo(Integer page, Integer pageSize, String numberType, String friendlyName) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneListnumberValidateBeforeCall(page, pageSize, numberType, friendlyName, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Numbers (asynchronously)
     * Retrieve a list of purchased phones numbers associated with your Ytel account.
     * @param page Which page of the overall response will be returned. Page indexing starts at 1. (optional, default to 1)
     * @param pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 10)
     * @param numberType The capability supported by the number.Number type either SMS,Voice or all (optional)
     * @param friendlyName A human-readable label added to the number object. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneListnumberAsync(Integer page, Integer pageSize, String numberType, String friendlyName, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneListnumberValidateBeforeCall(page, pageSize, numberType, friendlyName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneMassreleasenumber
     * @param phoneNumber A valid Ytel comma separated numbers (E.164 format). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneMassreleasenumberCall(String phoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/massreleasenumber.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phoneNumber != null)
        localVarFormParams.put("PhoneNumber", phoneNumber);

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
    private com.squareup.okhttp.Call incomingphoneMassreleasenumberValidateBeforeCall(String phoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling incomingphoneMassreleasenumber(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneMassreleasenumberCall(phoneNumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bulk Release
     * Remove a purchased Ytel number from your account.
     * @param phoneNumber A valid Ytel comma separated numbers (E.164 format). (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneMassreleasenumber(String phoneNumber) throws ApiException {
        ApiResponse<String> resp = incomingphoneMassreleasenumberWithHttpInfo(phoneNumber);
        return resp.getData();
    }

    /**
     * Bulk Release
     * Remove a purchased Ytel number from your account.
     * @param phoneNumber A valid Ytel comma separated numbers (E.164 format). (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneMassreleasenumberWithHttpInfo(String phoneNumber) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneMassreleasenumberValidateBeforeCall(phoneNumber, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bulk Release (asynchronously)
     * Remove a purchased Ytel number from your account.
     * @param phoneNumber A valid Ytel comma separated numbers (E.164 format). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneMassreleasenumberAsync(String phoneNumber, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneMassreleasenumberValidateBeforeCall(phoneNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneMassupdatenumber
     * @param phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format). (required)
     * @param voiceUrl The URL returning InboundXML incoming calls should execute when connected. (required)
     * @param friendlyName A human-readable value for labeling the number. (optional)
     * @param voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
     * @param voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
     * @param voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
     * @param hangupCallback URL that can be requested to receive notification when and how incoming call has ended. (optional)
     * @param hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
     * @param heartbeatUrl URL that can be used to monitor the phone number. (optional)
     * @param heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
     * @param smsUrl URL requested when an SMS is received. (optional)
     * @param smsMethod The HTTP method Ytel will use when requesting the SmsUrl. (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneMassupdatenumberCall(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/massupdatenumber.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phoneNumber != null)
        localVarFormParams.put("PhoneNumber", phoneNumber);
        if (voiceUrl != null)
        localVarFormParams.put("VoiceUrl", voiceUrl);
        if (friendlyName != null)
        localVarFormParams.put("FriendlyName", friendlyName);
        if (voiceMethod != null)
        localVarFormParams.put("VoiceMethod", voiceMethod);
        if (voiceFallbackUrl != null)
        localVarFormParams.put("VoiceFallbackUrl", voiceFallbackUrl);
        if (voiceFallbackMethod != null)
        localVarFormParams.put("VoiceFallbackMethod", voiceFallbackMethod);
        if (hangupCallback != null)
        localVarFormParams.put("HangupCallback", hangupCallback);
        if (hangupCallbackMethod != null)
        localVarFormParams.put("HangupCallbackMethod", hangupCallbackMethod);
        if (heartbeatUrl != null)
        localVarFormParams.put("HeartbeatUrl", heartbeatUrl);
        if (heartbeatMethod != null)
        localVarFormParams.put("HeartbeatMethod", heartbeatMethod);
        if (smsUrl != null)
        localVarFormParams.put("SmsUrl", smsUrl);
        if (smsMethod != null)
        localVarFormParams.put("SmsMethod", smsMethod);
        if (smsFallbackUrl != null)
        localVarFormParams.put("SmsFallbackUrl", smsFallbackUrl);
        if (smsFallbackMethod != null)
        localVarFormParams.put("SmsFallbackMethod", smsFallbackMethod);

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
    private com.squareup.okhttp.Call incomingphoneMassupdatenumberValidateBeforeCall(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling incomingphoneMassupdatenumber(Async)");
        }
        
        // verify the required parameter 'voiceUrl' is set
        if (voiceUrl == null) {
            throw new ApiException("Missing the required parameter 'voiceUrl' when calling incomingphoneMassupdatenumber(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneMassupdatenumberCall(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bulk Update Numbers
     * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format). (required)
     * @param voiceUrl The URL returning InboundXML incoming calls should execute when connected. (required)
     * @param friendlyName A human-readable value for labeling the number. (optional)
     * @param voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
     * @param voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
     * @param voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
     * @param hangupCallback URL that can be requested to receive notification when and how incoming call has ended. (optional)
     * @param hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
     * @param heartbeatUrl URL that can be used to monitor the phone number. (optional)
     * @param heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
     * @param smsUrl URL requested when an SMS is received. (optional)
     * @param smsMethod The HTTP method Ytel will use when requesting the SmsUrl. (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneMassupdatenumber(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod) throws ApiException {
        ApiResponse<String> resp = incomingphoneMassupdatenumberWithHttpInfo(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
        return resp.getData();
    }

    /**
     * Bulk Update Numbers
     * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format). (required)
     * @param voiceUrl The URL returning InboundXML incoming calls should execute when connected. (required)
     * @param friendlyName A human-readable value for labeling the number. (optional)
     * @param voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
     * @param voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
     * @param voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
     * @param hangupCallback URL that can be requested to receive notification when and how incoming call has ended. (optional)
     * @param hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
     * @param heartbeatUrl URL that can be used to monitor the phone number. (optional)
     * @param heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
     * @param smsUrl URL requested when an SMS is received. (optional)
     * @param smsMethod The HTTP method Ytel will use when requesting the SmsUrl. (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneMassupdatenumberWithHttpInfo(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneMassupdatenumberValidateBeforeCall(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bulk Update Numbers (asynchronously)
     * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format). (required)
     * @param voiceUrl The URL returning InboundXML incoming calls should execute when connected. (required)
     * @param friendlyName A human-readable value for labeling the number. (optional)
     * @param voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
     * @param voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
     * @param voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
     * @param hangupCallback URL that can be requested to receive notification when and how incoming call has ended. (optional)
     * @param hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
     * @param heartbeatUrl URL that can be used to monitor the phone number. (optional)
     * @param heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
     * @param smsUrl URL requested when an SMS is received. (optional)
     * @param smsMethod The HTTP method Ytel will use when requesting the SmsUrl. (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneMassupdatenumberAsync(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneMassupdatenumberValidateBeforeCall(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneReleasenumberByResponseTypePost
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param responseType Response type format xml or json (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneReleasenumberByResponseTypePostCall(String phoneNumber, String responseType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/releasenumber.{ResponseType}"
            .replaceAll("\\{" + "ResponseType" + "\\}", apiClient.escapeString(responseType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phoneNumber != null)
        localVarFormParams.put("PhoneNumber", phoneNumber);

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
    private com.squareup.okhttp.Call incomingphoneReleasenumberByResponseTypePostValidateBeforeCall(String phoneNumber, String responseType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling incomingphoneReleasenumberByResponseTypePost(Async)");
        }
        
        // verify the required parameter 'responseType' is set
        if (responseType == null) {
            throw new ApiException("Missing the required parameter 'responseType' when calling incomingphoneReleasenumberByResponseTypePost(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneReleasenumberByResponseTypePostCall(phoneNumber, responseType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Release Number
     * Remove a purchased Ytel number from your account.
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param responseType Response type format xml or json (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneReleasenumberByResponseTypePost(String phoneNumber, String responseType) throws ApiException {
        ApiResponse<String> resp = incomingphoneReleasenumberByResponseTypePostWithHttpInfo(phoneNumber, responseType);
        return resp.getData();
    }

    /**
     * Release Number
     * Remove a purchased Ytel number from your account.
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param responseType Response type format xml or json (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneReleasenumberByResponseTypePostWithHttpInfo(String phoneNumber, String responseType) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneReleasenumberByResponseTypePostValidateBeforeCall(phoneNumber, responseType, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Release Number (asynchronously)
     * Remove a purchased Ytel number from your account.
     * @param phoneNumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param responseType Response type format xml or json (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneReleasenumberByResponseTypePostAsync(String phoneNumber, String responseType, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneReleasenumberByResponseTypePostValidateBeforeCall(phoneNumber, responseType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneTransferphonenumbers
     * @param phonenumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param fromaccountsid A specific Accountsid from where Number is getting transfer. (required)
     * @param toaccountsid A specific Accountsid to which Number is getting transfer. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneTransferphonenumbersCall(String phonenumber, String fromaccountsid, String toaccountsid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/transferphonenumbers.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phonenumber != null)
        localVarFormParams.put("phonenumber", phonenumber);
        if (fromaccountsid != null)
        localVarFormParams.put("fromaccountsid", fromaccountsid);
        if (toaccountsid != null)
        localVarFormParams.put("toaccountsid", toaccountsid);

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
    private com.squareup.okhttp.Call incomingphoneTransferphonenumbersValidateBeforeCall(String phonenumber, String fromaccountsid, String toaccountsid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phonenumber' is set
        if (phonenumber == null) {
            throw new ApiException("Missing the required parameter 'phonenumber' when calling incomingphoneTransferphonenumbers(Async)");
        }
        
        // verify the required parameter 'fromaccountsid' is set
        if (fromaccountsid == null) {
            throw new ApiException("Missing the required parameter 'fromaccountsid' when calling incomingphoneTransferphonenumbers(Async)");
        }
        
        // verify the required parameter 'toaccountsid' is set
        if (toaccountsid == null) {
            throw new ApiException("Missing the required parameter 'toaccountsid' when calling incomingphoneTransferphonenumbers(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneTransferphonenumbersCall(phonenumber, fromaccountsid, toaccountsid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Move Number
     * Transfer phone number that has been purchased for from one account to another account.
     * @param phonenumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param fromaccountsid A specific Accountsid from where Number is getting transfer. (required)
     * @param toaccountsid A specific Accountsid to which Number is getting transfer. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneTransferphonenumbers(String phonenumber, String fromaccountsid, String toaccountsid) throws ApiException {
        ApiResponse<String> resp = incomingphoneTransferphonenumbersWithHttpInfo(phonenumber, fromaccountsid, toaccountsid);
        return resp.getData();
    }

    /**
     * Move Number
     * Transfer phone number that has been purchased for from one account to another account.
     * @param phonenumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param fromaccountsid A specific Accountsid from where Number is getting transfer. (required)
     * @param toaccountsid A specific Accountsid to which Number is getting transfer. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneTransferphonenumbersWithHttpInfo(String phonenumber, String fromaccountsid, String toaccountsid) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneTransferphonenumbersValidateBeforeCall(phonenumber, fromaccountsid, toaccountsid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Move Number (asynchronously)
     * Transfer phone number that has been purchased for from one account to another account.
     * @param phonenumber A valid 10-digit Ytel number (E.164 format). (required)
     * @param fromaccountsid A specific Accountsid from where Number is getting transfer. (required)
     * @param toaccountsid A specific Accountsid to which Number is getting transfer. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneTransferphonenumbersAsync(String phonenumber, String fromaccountsid, String toaccountsid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneTransferphonenumbersValidateBeforeCall(phonenumber, fromaccountsid, toaccountsid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneUpdatenumber
     * @param phoneNumber A valid Ytel number (E.164 format). (required)
     * @param voiceUrl URL requested once the call connects (required)
     * @param friendlyName Phone number friendly name description (optional)
     * @param voiceMethod Post or Get (optional)
     * @param voiceFallbackUrl URL requested if the voice URL is not available (optional)
     * @param voiceFallbackMethod Post or Get (optional)
     * @param hangupCallback callback url after a hangup occurs (optional)
     * @param hangupCallbackMethod Post or Get (optional)
     * @param heartbeatUrl URL requested once the call connects (optional)
     * @param heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
     * @param smsUrl URL requested when an SMS is received (optional)
     * @param smsMethod Post or Get (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneUpdatenumberCall(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/updatenumber.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phoneNumber != null)
        localVarFormParams.put("PhoneNumber", phoneNumber);
        if (voiceUrl != null)
        localVarFormParams.put("VoiceUrl", voiceUrl);
        if (friendlyName != null)
        localVarFormParams.put("FriendlyName", friendlyName);
        if (voiceMethod != null)
        localVarFormParams.put("VoiceMethod", voiceMethod);
        if (voiceFallbackUrl != null)
        localVarFormParams.put("VoiceFallbackUrl", voiceFallbackUrl);
        if (voiceFallbackMethod != null)
        localVarFormParams.put("VoiceFallbackMethod", voiceFallbackMethod);
        if (hangupCallback != null)
        localVarFormParams.put("HangupCallback", hangupCallback);
        if (hangupCallbackMethod != null)
        localVarFormParams.put("HangupCallbackMethod", hangupCallbackMethod);
        if (heartbeatUrl != null)
        localVarFormParams.put("HeartbeatUrl", heartbeatUrl);
        if (heartbeatMethod != null)
        localVarFormParams.put("HeartbeatMethod", heartbeatMethod);
        if (smsUrl != null)
        localVarFormParams.put("SmsUrl", smsUrl);
        if (smsMethod != null)
        localVarFormParams.put("SmsMethod", smsMethod);
        if (smsFallbackUrl != null)
        localVarFormParams.put("SmsFallbackUrl", smsFallbackUrl);
        if (smsFallbackMethod != null)
        localVarFormParams.put("SmsFallbackMethod", smsFallbackMethod);

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
    private com.squareup.okhttp.Call incomingphoneUpdatenumberValidateBeforeCall(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling incomingphoneUpdatenumber(Async)");
        }
        
        // verify the required parameter 'voiceUrl' is set
        if (voiceUrl == null) {
            throw new ApiException("Missing the required parameter 'voiceUrl' when calling incomingphoneUpdatenumber(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneUpdatenumberCall(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update Number
     * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param phoneNumber A valid Ytel number (E.164 format). (required)
     * @param voiceUrl URL requested once the call connects (required)
     * @param friendlyName Phone number friendly name description (optional)
     * @param voiceMethod Post or Get (optional)
     * @param voiceFallbackUrl URL requested if the voice URL is not available (optional)
     * @param voiceFallbackMethod Post or Get (optional)
     * @param hangupCallback callback url after a hangup occurs (optional)
     * @param hangupCallbackMethod Post or Get (optional)
     * @param heartbeatUrl URL requested once the call connects (optional)
     * @param heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
     * @param smsUrl URL requested when an SMS is received (optional)
     * @param smsMethod Post or Get (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneUpdatenumber(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod) throws ApiException {
        ApiResponse<String> resp = incomingphoneUpdatenumberWithHttpInfo(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
        return resp.getData();
    }

    /**
     * Update Number
     * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param phoneNumber A valid Ytel number (E.164 format). (required)
     * @param voiceUrl URL requested once the call connects (required)
     * @param friendlyName Phone number friendly name description (optional)
     * @param voiceMethod Post or Get (optional)
     * @param voiceFallbackUrl URL requested if the voice URL is not available (optional)
     * @param voiceFallbackMethod Post or Get (optional)
     * @param hangupCallback callback url after a hangup occurs (optional)
     * @param hangupCallbackMethod Post or Get (optional)
     * @param heartbeatUrl URL requested once the call connects (optional)
     * @param heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
     * @param smsUrl URL requested when an SMS is received (optional)
     * @param smsMethod Post or Get (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneUpdatenumberWithHttpInfo(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneUpdatenumberValidateBeforeCall(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Number (asynchronously)
     * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
     * @param phoneNumber A valid Ytel number (E.164 format). (required)
     * @param voiceUrl URL requested once the call connects (required)
     * @param friendlyName Phone number friendly name description (optional)
     * @param voiceMethod Post or Get (optional)
     * @param voiceFallbackUrl URL requested if the voice URL is not available (optional)
     * @param voiceFallbackMethod Post or Get (optional)
     * @param hangupCallback callback url after a hangup occurs (optional)
     * @param hangupCallbackMethod Post or Get (optional)
     * @param heartbeatUrl URL requested once the call connects (optional)
     * @param heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
     * @param smsUrl URL requested when an SMS is received (optional)
     * @param smsMethod Post or Get (optional)
     * @param smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
     * @param smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneUpdatenumberAsync(String phoneNumber, String voiceUrl, String friendlyName, String voiceMethod, String voiceFallbackUrl, String voiceFallbackMethod, String hangupCallback, String hangupCallbackMethod, String heartbeatUrl, String heartbeatMethod, String smsUrl, String smsMethod, String smsFallbackUrl, String smsFallbackMethod, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneUpdatenumberValidateBeforeCall(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for incomingphoneViewnumber
     * @param phoneNumber A valid Ytel 10-digit phone number (E.164 format). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call incomingphoneViewnumberCall(String phoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/incomingphone/viewnumber.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (phoneNumber != null)
        localVarFormParams.put("PhoneNumber", phoneNumber);

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
    private com.squareup.okhttp.Call incomingphoneViewnumberValidateBeforeCall(String phoneNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling incomingphoneViewnumber(Async)");
        }
        

        com.squareup.okhttp.Call call = incomingphoneViewnumberCall(phoneNumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Details
     * Retrieve the details for a phone number by its number.
     * @param phoneNumber A valid Ytel 10-digit phone number (E.164 format). (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String incomingphoneViewnumber(String phoneNumber) throws ApiException {
        ApiResponse<String> resp = incomingphoneViewnumberWithHttpInfo(phoneNumber);
        return resp.getData();
    }

    /**
     * View Details
     * Retrieve the details for a phone number by its number.
     * @param phoneNumber A valid Ytel 10-digit phone number (E.164 format). (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> incomingphoneViewnumberWithHttpInfo(String phoneNumber) throws ApiException {
        com.squareup.okhttp.Call call = incomingphoneViewnumberValidateBeforeCall(phoneNumber, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Details (asynchronously)
     * Retrieve the details for a phone number by its number.
     * @param phoneNumber A valid Ytel 10-digit phone number (E.164 format). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call incomingphoneViewnumberAsync(String phoneNumber, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = incomingphoneViewnumberValidateBeforeCall(phoneNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
