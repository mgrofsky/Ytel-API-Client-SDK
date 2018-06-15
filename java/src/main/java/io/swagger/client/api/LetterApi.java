

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

public class LetterApi {
    private ApiClient apiClient;

    public LetterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LetterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for letterCreate
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing letter by attaching its LetterId. (required)
     * @param file File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. (required)
     * @param color Specify if letter should be printed in color. (required)
     * @param description A description for the letter. (optional)
     * @param extraservice Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
     * @param doublesided Specify if letter should be printed on both sides. (optional)
     * @param template Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call letterCreateCall(String to, String from, String attachbyid, String file, String color, String description, String extraservice, String doublesided, String template, String htmldata, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/letter/create.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (to != null)
        localVarFormParams.put("to", to);
        if (from != null)
        localVarFormParams.put("from", from);
        if (attachbyid != null)
        localVarFormParams.put("attachbyid", attachbyid);
        if (file != null)
        localVarFormParams.put("file", file);
        if (color != null)
        localVarFormParams.put("color", color);
        if (description != null)
        localVarFormParams.put("description", description);
        if (extraservice != null)
        localVarFormParams.put("extraservice", extraservice);
        if (doublesided != null)
        localVarFormParams.put("doublesided", doublesided);
        if (template != null)
        localVarFormParams.put("template", template);
        if (htmldata != null)
        localVarFormParams.put("htmldata", htmldata);

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
    private com.squareup.okhttp.Call letterCreateValidateBeforeCall(String to, String from, String attachbyid, String file, String color, String description, String extraservice, String doublesided, String template, String htmldata, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new ApiException("Missing the required parameter 'to' when calling letterCreate(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling letterCreate(Async)");
        }
        
        // verify the required parameter 'attachbyid' is set
        if (attachbyid == null) {
            throw new ApiException("Missing the required parameter 'attachbyid' when calling letterCreate(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling letterCreate(Async)");
        }
        
        // verify the required parameter 'color' is set
        if (color == null) {
            throw new ApiException("Missing the required parameter 'color' when calling letterCreate(Async)");
        }
        

        com.squareup.okhttp.Call call = letterCreateCall(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Letter
     * Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing letter by attaching its LetterId. (required)
     * @param file File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. (required)
     * @param color Specify if letter should be printed in color. (required)
     * @param description A description for the letter. (optional)
     * @param extraservice Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
     * @param doublesided Specify if letter should be printed on both sides. (optional)
     * @param template Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String letterCreate(String to, String from, String attachbyid, String file, String color, String description, String extraservice, String doublesided, String template, String htmldata) throws ApiException {
        ApiResponse<String> resp = letterCreateWithHttpInfo(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata);
        return resp.getData();
    }

    /**
     * Create Letter
     * Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing letter by attaching its LetterId. (required)
     * @param file File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. (required)
     * @param color Specify if letter should be printed in color. (required)
     * @param description A description for the letter. (optional)
     * @param extraservice Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
     * @param doublesided Specify if letter should be printed on both sides. (optional)
     * @param template Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> letterCreateWithHttpInfo(String to, String from, String attachbyid, String file, String color, String description, String extraservice, String doublesided, String template, String htmldata) throws ApiException {
        com.squareup.okhttp.Call call = letterCreateValidateBeforeCall(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Letter (asynchronously)
     * Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
     * @param to The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param from The AddressId or an object structured when creating an address by addresses/Create. (required)
     * @param attachbyid Set an existing letter by attaching its LetterId. (required)
     * @param file File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. (required)
     * @param color Specify if letter should be printed in color. (required)
     * @param description A description for the letter. (optional)
     * @param extraservice Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
     * @param doublesided Specify if letter should be printed on both sides. (optional)
     * @param template Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
     * @param htmldata A string value that contains HTML markup. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call letterCreateAsync(String to, String from, String attachbyid, String file, String color, String description, String extraservice, String doublesided, String template, String htmldata, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = letterCreateValidateBeforeCall(to, from, attachbyid, file, color, description, extraservice, doublesided, template, htmldata, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for letterDelete
     * @param lettersid The unique identifier for a letter object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call letterDeleteCall(String lettersid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/letter/delete.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (lettersid != null)
        localVarFormParams.put("lettersid", lettersid);

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
    private com.squareup.okhttp.Call letterDeleteValidateBeforeCall(String lettersid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lettersid' is set
        if (lettersid == null) {
            throw new ApiException("Missing the required parameter 'lettersid' when calling letterDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = letterDeleteCall(lettersid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Letter
     * Remove a letter object by its LetterId.
     * @param lettersid The unique identifier for a letter object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String letterDelete(String lettersid) throws ApiException {
        ApiResponse<String> resp = letterDeleteWithHttpInfo(lettersid);
        return resp.getData();
    }

    /**
     * Delete Letter
     * Remove a letter object by its LetterId.
     * @param lettersid The unique identifier for a letter object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> letterDeleteWithHttpInfo(String lettersid) throws ApiException {
        com.squareup.okhttp.Call call = letterDeleteValidateBeforeCall(lettersid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Letter (asynchronously)
     * Remove a letter object by its LetterId.
     * @param lettersid The unique identifier for a letter object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call letterDeleteAsync(String lettersid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = letterDeleteValidateBeforeCall(lettersid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for letterListsletter
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param lettersid The unique identifier for a letter object. (optional)
     * @param dateCreated The date the letter was created. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call letterListsletterCall(Integer page, Integer pagesize, String lettersid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/letter/listsletter.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (page != null)
        localVarFormParams.put("page", page);
        if (pagesize != null)
        localVarFormParams.put("pagesize", pagesize);
        if (lettersid != null)
        localVarFormParams.put("lettersid", lettersid);
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
    private com.squareup.okhttp.Call letterListsletterValidateBeforeCall(Integer page, Integer pagesize, String lettersid, String dateCreated, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = letterListsletterCall(page, pagesize, lettersid, dateCreated, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Letters
     * Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param lettersid The unique identifier for a letter object. (optional)
     * @param dateCreated The date the letter was created. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String letterListsletter(Integer page, Integer pagesize, String lettersid, String dateCreated) throws ApiException {
        ApiResponse<String> resp = letterListsletterWithHttpInfo(page, pagesize, lettersid, dateCreated);
        return resp.getData();
    }

    /**
     * List Letters
     * Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param lettersid The unique identifier for a letter object. (optional)
     * @param dateCreated The date the letter was created. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> letterListsletterWithHttpInfo(Integer page, Integer pagesize, String lettersid, String dateCreated) throws ApiException {
        com.squareup.okhttp.Call call = letterListsletterValidateBeforeCall(page, pagesize, lettersid, dateCreated, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Letters (asynchronously)
     * Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
     * @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
     * @param pagesize The count of objects to return per page. (optional, default to 10)
     * @param lettersid The unique identifier for a letter object. (optional)
     * @param dateCreated The date the letter was created. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call letterListsletterAsync(Integer page, Integer pagesize, String lettersid, String dateCreated, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = letterListsletterValidateBeforeCall(page, pagesize, lettersid, dateCreated, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for letterViewletter
     * @param lettersid The unique identifier for a letter object. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call letterViewletterCall(String lettersid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/letter/viewletter.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (lettersid != null)
        localVarFormParams.put("lettersid", lettersid);

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
    private com.squareup.okhttp.Call letterViewletterValidateBeforeCall(String lettersid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'lettersid' is set
        if (lettersid == null) {
            throw new ApiException("Missing the required parameter 'lettersid' when calling letterViewletter(Async)");
        }
        

        com.squareup.okhttp.Call call = letterViewletterCall(lettersid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View Letter
     * Retrieve a letter object by its LetterSid.
     * @param lettersid The unique identifier for a letter object. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String letterViewletter(String lettersid) throws ApiException {
        ApiResponse<String> resp = letterViewletterWithHttpInfo(lettersid);
        return resp.getData();
    }

    /**
     * View Letter
     * Retrieve a letter object by its LetterSid.
     * @param lettersid The unique identifier for a letter object. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> letterViewletterWithHttpInfo(String lettersid) throws ApiException {
        com.squareup.okhttp.Call call = letterViewletterValidateBeforeCall(lettersid, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View Letter (asynchronously)
     * Retrieve a letter object by its LetterSid.
     * @param lettersid The unique identifier for a letter object. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call letterViewletterAsync(String lettersid, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = letterViewletterValidateBeforeCall(lettersid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
