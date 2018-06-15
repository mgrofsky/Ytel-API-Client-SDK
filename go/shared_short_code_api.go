/* 
 * Ytel API V3
 *
 * Ytel API version 3
 *
 * API version: 3.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

import (
	"net/url"
	"net/http"
	"strings"
	"golang.org/x/net/context"
	"encoding/json"
)

// Linger please
var (
	_ context.Context
)

type SharedShortCodeApiService service


/* SharedShortCodeApiService List Keywords
 Retrieve a list of keywords associated with your Ytel account.
 * @param ctx context.Context Authentication Context 
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "page" (int32) The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     @param "pagesize" (int32) Number of individual resources listed in the response per page
     @param "keyword" (string) Only list keywords of keyword
     @param "shortcode" (int32) Only list keywords of shortcode
 @return string*/
func (a *SharedShortCodeApiService) KeywordLists(ctx context.Context, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/keyword/lists.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["page"], "int32", "page"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["pagesize"], "int32", "pagesize"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["keyword"], "string", "keyword"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["shortcode"], "int32", "shortcode"); err != nil {
		return successPayload, nil, err
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarTempParam, localVarOk := localVarOptionals["page"].(int32); localVarOk {
		localVarFormParams.Add("page", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["pagesize"].(int32); localVarOk {
		localVarFormParams.Add("pagesize", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["keyword"].(string); localVarOk {
		localVarFormParams.Add("Keyword", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["shortcode"].(int32); localVarOk {
		localVarFormParams.Add("Shortcode", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService View Keyword
 View a set of properties for a single keyword.
 * @param ctx context.Context Authentication Context 
 @param keywordid The unique identifier of each keyword
 @return string*/
func (a *SharedShortCodeApiService) KeywordView(ctx context.Context, keywordid string) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/keyword/view.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	localVarFormParams.Add("Keywordid", parameterToString(keywordid, ""))
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService List Inbound SMS
 List All Inbound ShortCode
 * @param ctx context.Context Authentication Context 
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "page" (int32) The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     @param "pagesize" (int32) Number of individual resources listed in the response per page
     @param "from" (string) From Number to Inbound ShortCode
     @param "shortcode" (string) Only list messages sent to this Short Code
     @param "datecreated" (string) Only list messages sent with the specified date
 @return string*/
func (a *SharedShortCodeApiService) ShortcodeGetinboundsms(ctx context.Context, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/shortcode/getinboundsms.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["page"], "int32", "page"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["pagesize"], "int32", "pagesize"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["from"], "string", "from"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["shortcode"], "string", "shortcode"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["datecreated"], "string", "datecreated"); err != nil {
		return successPayload, nil, err
	}

	if localVarTempParam, localVarOk := localVarOptionals["datecreated"].(string); localVarOk {
		localVarQueryParams.Add("Datecreated", parameterToString(localVarTempParam, ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarTempParam, localVarOk := localVarOptionals["page"].(int32); localVarOk {
		localVarFormParams.Add("page", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["pagesize"].(int32); localVarOk {
		localVarFormParams.Add("pagesize", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["from"].(string); localVarOk {
		localVarFormParams.Add("from", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["shortcode"].(string); localVarOk {
		localVarFormParams.Add("Shortcode", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService List Shortcodes
 Retrieve a list of shortcode assignment associated with your Ytel account.
 * @param ctx context.Context Authentication Context 
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "page" (int32) The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     @param "pagesize" (int32) Number of individual resources listed in the response per page
     @param "shortcode" (string) Only list keywords of shortcode
 @return string*/
func (a *SharedShortCodeApiService) ShortcodeListshortcode(ctx context.Context, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/shortcode/listshortcode.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["page"], "int32", "page"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["pagesize"], "int32", "pagesize"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["shortcode"], "string", "shortcode"); err != nil {
		return successPayload, nil, err
	}

	if localVarTempParam, localVarOk := localVarOptionals["shortcode"].(string); localVarOk {
		localVarQueryParams.Add("Shortcode", parameterToString(localVarTempParam, ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarTempParam, localVarOk := localVarOptionals["page"].(int32); localVarOk {
		localVarFormParams.Add("page", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["pagesize"].(int32); localVarOk {
		localVarFormParams.Add("pagesize", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService Send SMS
 Send an SMS from a Ytel ShortCode
 * @param ctx context.Context Authentication Context 
 @param shortcode The Short Code number that is the sender of this message
 @param to A valid 10-digit number that should receive the message
 @param templateid The unique identifier for the template used for the message
 @param data format of your data, example: {companyname}:test,{otpcode}:1234
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "method" (string) Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     @param "messageStatusCallback" (string) URL that can be requested to receive notification when Short Code message was sent.
 @return string*/
func (a *SharedShortCodeApiService) ShortcodeSendsms(ctx context.Context, shortcode string, to string, templateid string, data string, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/shortcode/sendsms.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["method"], "string", "method"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["messageStatusCallback"], "string", "messageStatusCallback"); err != nil {
		return successPayload, nil, err
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	localVarFormParams.Add("shortcode", parameterToString(shortcode, ""))
	localVarFormParams.Add("to", parameterToString(to, ""))
	localVarFormParams.Add("templateid", parameterToString(templateid, ""))
	localVarFormParams.Add("data", parameterToString(data, ""))
	if localVarTempParam, localVarOk := localVarOptionals["method"].(string); localVarOk {
		localVarFormParams.Add("Method", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["messageStatusCallback"].(string); localVarOk {
		localVarFormParams.Add("MessageStatusCallback", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService Update Shortcode
 Update Assignment
 * @param ctx context.Context Authentication Context 
 @param shortcode List of valid shortcode to your Ytel account
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "friendlyName" (string) User generated name of the shortcode
     @param "callbackUrl" (string) URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     @param "callbackMethod" (string) Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     @param "fallbackUrl" (string) URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
     @param "fallbackUrlMethod" (string) Specifies the HTTP method used to request the required FallbackUrl once call connects.
 @return string*/
func (a *SharedShortCodeApiService) ShortcodeUpdateshortcode(ctx context.Context, shortcode string, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/shortcode/updateshortcode.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["friendlyName"], "string", "friendlyName"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["callbackUrl"], "string", "callbackUrl"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["callbackMethod"], "string", "callbackMethod"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["fallbackUrl"], "string", "fallbackUrl"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["fallbackUrlMethod"], "string", "fallbackUrlMethod"); err != nil {
		return successPayload, nil, err
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	localVarFormParams.Add("Shortcode", parameterToString(shortcode, ""))
	if localVarTempParam, localVarOk := localVarOptionals["friendlyName"].(string); localVarOk {
		localVarFormParams.Add("FriendlyName", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["callbackUrl"].(string); localVarOk {
		localVarFormParams.Add("CallbackUrl", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["callbackMethod"].(string); localVarOk {
		localVarFormParams.Add("CallbackMethod", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["fallbackUrl"].(string); localVarOk {
		localVarFormParams.Add("FallbackUrl", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["fallbackUrlMethod"].(string); localVarOk {
		localVarFormParams.Add("FallbackUrlMethod", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService View Shortcode
 The response returned here contains all resource properties associated with the given Shortcode.
 * @param ctx context.Context Authentication Context 
 @param shortcode List of valid Shortcode to your Ytel account
 @return string*/
func (a *SharedShortCodeApiService) ShortcodeViewshortcode(ctx context.Context, shortcode string) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/shortcode/viewshortcode.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	localVarFormParams.Add("Shortcode", parameterToString(shortcode, ""))
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService List Templates
 List Shortcode Templates by Type
 * @param ctx context.Context Authentication Context 
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "type_" (string) The type (category) of template Valid values: marketing, authorization
     @param "page" (int32) The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     @param "pagesize" (int32) The count of objects to return per page.
     @param "shortcode" (string) Only list templates of type
 @return string*/
func (a *SharedShortCodeApiService) TemplateLists(ctx context.Context, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/template/lists.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["type_"], "string", "type_"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["page"], "int32", "page"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["pagesize"], "int32", "pagesize"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["shortcode"], "string", "shortcode"); err != nil {
		return successPayload, nil, err
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarTempParam, localVarOk := localVarOptionals["type_"].(string); localVarOk {
		localVarFormParams.Add("type", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["page"].(int32); localVarOk {
		localVarFormParams.Add("page", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["pagesize"].(int32); localVarOk {
		localVarFormParams.Add("pagesize", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["shortcode"].(string); localVarOk {
		localVarFormParams.Add("Shortcode", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* SharedShortCodeApiService View Template
 View a Shared ShortCode Template
 * @param ctx context.Context Authentication Context 
 @param templateId The unique identifier for a template object
 @return string*/
func (a *SharedShortCodeApiService) TemplateView(ctx context.Context, templateId string) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/template/view.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	localVarFormParams.Add("TemplateId", parameterToString(templateId, ""))
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return successPayload, localVarHttpResponse, err
	}
	defer localVarHttpResponse.Body.Close()
	if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	}

	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
		return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

