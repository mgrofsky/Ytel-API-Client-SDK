

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

public class UsageApi {
    private ApiClient apiClient;

    public UsageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for usageListusage
     * @param productCode Filter usage results by product type. (optional, default to 0)
     * @param startDate Filter usage objects by start date. (optional, default to 2016-09-06)
     * @param endDate Filter usage objects by end date. (optional, default to 2016-09-06)
     * @param includeSubAccounts Will include all subaccount usage data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usageListusageCall(String productCode, String startDate, String endDate, String includeSubAccounts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/usage/listusage.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (productCode != null)
        localVarFormParams.put("ProductCode", productCode);
        if (startDate != null)
        localVarFormParams.put("startDate", startDate);
        if (endDate != null)
        localVarFormParams.put("endDate", endDate);
        if (includeSubAccounts != null)
        localVarFormParams.put("IncludeSubAccounts", includeSubAccounts);

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
    private com.squareup.okhttp.Call usageListusageValidateBeforeCall(String productCode, String startDate, String endDate, String includeSubAccounts, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = usageListusageCall(productCode, startDate, endDate, includeSubAccounts, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Usage
     * Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
     * @param productCode Filter usage results by product type. (optional, default to 0)
     * @param startDate Filter usage objects by start date. (optional, default to 2016-09-06)
     * @param endDate Filter usage objects by end date. (optional, default to 2016-09-06)
     * @param includeSubAccounts Will include all subaccount usage data (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String usageListusage(String productCode, String startDate, String endDate, String includeSubAccounts) throws ApiException {
        ApiResponse<String> resp = usageListusageWithHttpInfo(productCode, startDate, endDate, includeSubAccounts);
        return resp.getData();
    }

    /**
     * List Usage
     * Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
     * @param productCode Filter usage results by product type. (optional, default to 0)
     * @param startDate Filter usage objects by start date. (optional, default to 2016-09-06)
     * @param endDate Filter usage objects by end date. (optional, default to 2016-09-06)
     * @param includeSubAccounts Will include all subaccount usage data (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> usageListusageWithHttpInfo(String productCode, String startDate, String endDate, String includeSubAccounts) throws ApiException {
        com.squareup.okhttp.Call call = usageListusageValidateBeforeCall(productCode, startDate, endDate, includeSubAccounts, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Usage (asynchronously)
     * Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.
     * @param productCode Filter usage results by product type. (optional, default to 0)
     * @param startDate Filter usage objects by start date. (optional, default to 2016-09-06)
     * @param endDate Filter usage objects by end date. (optional, default to 2016-09-06)
     * @param includeSubAccounts Will include all subaccount usage data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usageListusageAsync(String productCode, String startDate, String endDate, String includeSubAccounts, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = usageListusageValidateBeforeCall(productCode, startDate, endDate, includeSubAccounts, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
