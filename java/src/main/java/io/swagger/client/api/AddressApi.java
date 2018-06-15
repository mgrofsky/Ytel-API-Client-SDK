

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

public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addressCreateaddress
     * @param name Name of user (required)
     * @param address Address of user. (required)
     * @param country Must be a 2 letter country short-name code (ISO 3166) (required)
     * @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. (required)
     * @param city City Name. (required)
     * @param zip Zip code of city. (required)
     * @param description Description of addresses. (optional)
     * @param email Email Id of user. (optional)
     * @param phone Phone number of user. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressCreateaddressCall(String name, String address, String country, String state, String city, String zip, String description, String email, String phone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/address/createaddress.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (name != null)
        localVarFormParams.put("Name", name);
        if (address != null)
        localVarFormParams.put("Address", address);
        if (country != null)
        localVarFormParams.put("Country", country);
        if (state != null)
        localVarFormParams.put("State", state);
        if (city != null)
        localVarFormParams.put("City", city);
        if (zip != null)
        localVarFormParams.put("Zip", zip);
        if (description != null)
        localVarFormParams.put("Description", description);
        if (email != null)
        localVarFormParams.put("email", email);
        if (phone != null)
        localVarFormParams.put("Phone", phone);

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
    private com.squareup.okhttp.Call addressCreateaddressValidateBeforeCall(String name, String address, String country, String state, String city, String zip, String description, String email, String phone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling addressCreateaddress(Async)");
        }
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling addressCreateaddress(Async)");
        }
        
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new ApiException("Missing the required parameter 'country' when calling addressCreateaddress(Async)");
        }
        
        // verify the required parameter 'state' is set
        if (state == null) {
            throw new ApiException("Missing the required parameter 'state' when calling addressCreateaddress(Async)");
        }
        
        // verify the required parameter 'city' is set
        if (city == null) {
            throw new ApiException("Missing the required parameter 'city' when calling addressCreateaddress(Async)");
        }
        
        // verify the required parameter 'zip' is set
        if (zip == null) {
            throw new ApiException("Missing the required parameter 'zip' when calling addressCreateaddress(Async)");
        }
        

        com.squareup.okhttp.Call call = addressCreateaddressCall(name, address, country, state, city, zip, description, email, phone, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Address
     * To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
     * @param name Name of user (required)
     * @param address Address of user. (required)
     * @param country Must be a 2 letter country short-name code (ISO 3166) (required)
     * @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. (required)
     * @param city City Name. (required)
     * @param zip Zip code of city. (required)
     * @param description Description of addresses. (optional)
     * @param email Email Id of user. (optional)
     * @param phone Phone number of user. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String addressCreateaddress(String name, String address, String country, String state, String city, String zip, String description, String email, String phone) throws ApiException {
        ApiResponse<String> resp = addressCreateaddressWithHttpInfo(name, address, country, state, city, zip, description, email, phone);
        return resp.getData();
    }

    /**
     * Create Address
     * To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
     * @param name Name of user (required)
     * @param address Address of user. (required)
     * @param country Must be a 2 letter country short-name code (ISO 3166) (required)
     * @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. (required)
     * @param city City Name. (required)
     * @param zip Zip code of city. (required)
     * @param description Description of addresses. (optional)
     * @param email Email Id of user. (optional)
     * @param phone Phone number of user. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> addressCreateaddressWithHttpInfo(String name, String address, String country, String state, String city, String zip, String description, String email, String phone) throws ApiException {
        com.squareup.okhttp.Call call = addressCreateaddressValidateBeforeCall(name, address, country, state, city, zip, description, email, phone, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Address (asynchronously)
     * To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
     * @param name Name of user (required)
     * @param address Address of user. (required)
     * @param country Must be a 2 letter country short-name code (ISO 3166) (required)
     * @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. (required)
     * @param city City Name. (required)
     * @param zip Zip code of city. (required)
     * @param description Description of addresses. (optional)
     * @param email Email Id of user. (optional)
     * @param phone Phone number of user. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressCreateaddressAsync(String name, String address, String country, String state, String city, String zip, String description, String email, String phone, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addressCreateaddressValidateBeforeCall(name, address, country, state, city, zip, description, email, phone, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addressDeleteaddress
     * @param addressid The identifier of the address to be deleted. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressDeleteaddressCall(String addressid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/address/deleteaddress.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (addressid != null)
        localVarFormParams.put("addressid", addressid);

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
    private com.squareup.okhttp.Call addressDeleteaddressValidateBeforeCall(String addressid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'addressid' is set
        if (addressid == null) {
            throw new ApiException("Missing the required parameter 'addressid' when calling addressDeleteaddress(Async)");
        }
        

        com.squareup.okhttp.Call call = addressDeleteaddressCall(addressid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Address
     * To delete Address to your address book
     * @param addressid The identifier of the address to be deleted. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String addressDeleteaddress(String addressid) throws ApiException {
        ApiResponse<String> resp = addressDeleteaddressWithHttpInfo(addressid);
        return resp.getData();
    }

    /**
     * Delete Address
     * To delete Address to your address book
     * @param addressid The identifier of the address to be deleted. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> addressDeleteaddressWithHttpInfo(String addressid) throws ApiException {
        com.squareup.okhttp.Call call = addressDeleteaddressValidateBeforeCall(addressid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Address (asynchronously)
     * To delete Address to your address book
     * @param addressid The identifier of the address to be deleted. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressDeleteaddressAsync(String addressid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addressDeleteaddressValidateBeforeCall(addressid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addressListaddress
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize How many results to return, default is 10, max is 100, must be an integer (optional, default to 10)
     * @param addressid addresses Sid (optional)
     * @param dateCreated date created address. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressListaddressCall(Integer page, Integer pagesize, String addressid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/address/listaddress.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (addressid != null)
        localVarFormParams.put("addressid", addressid);
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
    private com.squareup.okhttp.Call addressListaddressValidateBeforeCall(Integer page, Integer pagesize, String addressid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = addressListaddressCall(page, pagesize, addressid, dateCreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Addresses
     * List All Address 
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize How many results to return, default is 10, max is 100, must be an integer (optional, default to 10)
     * @param addressid addresses Sid (optional)
     * @param dateCreated date created address. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String addressListaddress(Integer page, Integer pagesize, String addressid, String dateCreated) throws ApiException {
        ApiResponse<String> resp = addressListaddressWithHttpInfo(page, pagesize, addressid, dateCreated);
        return resp.getData();
    }

    /**
     * List Addresses
     * List All Address 
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize How many results to return, default is 10, max is 100, must be an integer (optional, default to 10)
     * @param addressid addresses Sid (optional)
     * @param dateCreated date created address. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> addressListaddressWithHttpInfo(Integer page, Integer pagesize, String addressid, String dateCreated) throws ApiException {
        com.squareup.okhttp.Call call = addressListaddressValidateBeforeCall(page, pagesize, addressid, dateCreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Addresses (asynchronously)
     * List All Address 
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize How many results to return, default is 10, max is 100, must be an integer (optional, default to 10)
     * @param addressid addresses Sid (optional)
     * @param dateCreated date created address. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressListaddressAsync(Integer page, Integer pagesize, String addressid, String dateCreated, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addressListaddressValidateBeforeCall(page, pagesize, addressid, dateCreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addressVerifyaddress
     * @param addressid The identifier of the address to be verified. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressVerifyaddressCall(String addressid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/address/verifyaddress.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (addressid != null)
        localVarFormParams.put("addressid", addressid);

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
    private com.squareup.okhttp.Call addressVerifyaddressValidateBeforeCall(String addressid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'addressid' is set
        if (addressid == null) {
            throw new ApiException("Missing the required parameter 'addressid' when calling addressVerifyaddress(Async)");
        }
        

        com.squareup.okhttp.Call call = addressVerifyaddressCall(addressid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Verify Address
     * Validates an address given.
     * @param addressid The identifier of the address to be verified. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String addressVerifyaddress(String addressid) throws ApiException {
        ApiResponse<String> resp = addressVerifyaddressWithHttpInfo(addressid);
        return resp.getData();
    }

    /**
     * Verify Address
     * Validates an address given.
     * @param addressid The identifier of the address to be verified. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> addressVerifyaddressWithHttpInfo(String addressid) throws ApiException {
        com.squareup.okhttp.Call call = addressVerifyaddressValidateBeforeCall(addressid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify Address (asynchronously)
     * Validates an address given.
     * @param addressid The identifier of the address to be verified. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressVerifyaddressAsync(String addressid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addressVerifyaddressValidateBeforeCall(addressid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addressViewaddress
     * @param addressid The identifier of the address to be retrieved. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressViewaddressCall(String addressid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/address/viewaddress.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (addressid != null)
        localVarFormParams.put("addressid", addressid);

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
    private com.squareup.okhttp.Call addressViewaddressValidateBeforeCall(String addressid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'addressid' is set
        if (addressid == null) {
            throw new ApiException("Missing the required parameter 'addressid' when calling addressViewaddress(Async)");
        }
        

        com.squareup.okhttp.Call call = addressViewaddressCall(addressid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Address
     * View Address Specific address Book by providing the address id
     * @param addressid The identifier of the address to be retrieved. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String addressViewaddress(String addressid) throws ApiException {
        ApiResponse<String> resp = addressViewaddressWithHttpInfo(addressid);
        return resp.getData();
    }

    /**
     * View Address
     * View Address Specific address Book by providing the address id
     * @param addressid The identifier of the address to be retrieved. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> addressViewaddressWithHttpInfo(String addressid) throws ApiException {
        com.squareup.okhttp.Call call = addressViewaddressValidateBeforeCall(addressid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Address (asynchronously)
     * View Address Specific address Book by providing the address id
     * @param addressid The identifier of the address to be retrieved. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressViewaddressAsync(String addressid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addressViewaddressValidateBeforeCall(addressid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
