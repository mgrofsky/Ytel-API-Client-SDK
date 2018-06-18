/* 
 * Ytel API V3
 *
 * Ytel API version 3
 *
 * API version: 3.11
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

type AddressApiService service


/* AddressApiService Create Address
 To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
 * @param ctx context.Context Authentication Context 
 @param name Name of user
 @param address Address of user.
 @param country Must be a 2 letter country short-name code (ISO 3166)
 @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
 @param city City Name.
 @param zip Zip code of city.
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "description" (string) Description of addresses.
     @param "email" (string) Email Id of user.
     @param "phone" (string) Phone number of user.
 @return string*/
func (a *AddressApiService) AddressCreateaddress(ctx context.Context, name string, address string, country string, state string, city string, zip string, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/address/createaddress.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["description"], "string", "description"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["email"], "string", "email"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["phone"], "string", "phone"); err != nil {
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
	localVarFormParams.Add("Name", parameterToString(name, ""))
	localVarFormParams.Add("Address", parameterToString(address, ""))
	localVarFormParams.Add("Country", parameterToString(country, ""))
	localVarFormParams.Add("State", parameterToString(state, ""))
	localVarFormParams.Add("City", parameterToString(city, ""))
	localVarFormParams.Add("Zip", parameterToString(zip, ""))
	if localVarTempParam, localVarOk := localVarOptionals["description"].(string); localVarOk {
		localVarFormParams.Add("Description", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["email"].(string); localVarOk {
		localVarFormParams.Add("email", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["phone"].(string); localVarOk {
		localVarFormParams.Add("Phone", parameterToString(localVarTempParam, ""))
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

/* AddressApiService Delete Address
 To delete Address to your address book
 * @param ctx context.Context Authentication Context 
 @param addressid The identifier of the address to be deleted.
 @return string*/
func (a *AddressApiService) AddressDeleteaddress(ctx context.Context, addressid string) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/address/deleteaddress.json"

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
	localVarFormParams.Add("addressid", parameterToString(addressid, ""))
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

/* AddressApiService List Addresses
 List All Address 
 * @param ctx context.Context Authentication Context 
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "page" (int32) The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     @param "pagesize" (int32) How many results to return, default is 10, max is 100, must be an integer
     @param "addressid" (string) addresses Sid
     @param "dateCreated" (string) date created address.
 @return string*/
func (a *AddressApiService) AddressListaddress(ctx context.Context, localVarOptionals map[string]interface{}) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/address/listaddress.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["page"], "int32", "page"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["pagesize"], "int32", "pagesize"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["addressid"], "string", "addressid"); err != nil {
		return successPayload, nil, err
	}
	if err := typeCheckParameter(localVarOptionals["dateCreated"], "string", "dateCreated"); err != nil {
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
	if localVarTempParam, localVarOk := localVarOptionals["addressid"].(string); localVarOk {
		localVarFormParams.Add("addressid", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["dateCreated"].(string); localVarOk {
		localVarFormParams.Add("dateCreated", parameterToString(localVarTempParam, ""))
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

/* AddressApiService Verify Address
 Validates an address given.
 * @param ctx context.Context Authentication Context 
 @param addressid The identifier of the address to be verified.
 @return string*/
func (a *AddressApiService) AddressVerifyaddress(ctx context.Context, addressid string) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/address/verifyaddress.json"

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
	localVarFormParams.Add("addressid", parameterToString(addressid, ""))
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

/* AddressApiService View Address
 View Address Specific address Book by providing the address id
 * @param ctx context.Context Authentication Context 
 @param addressid The identifier of the address to be retrieved.
 @return string*/
func (a *AddressApiService) AddressViewaddress(ctx context.Context, addressid string) (string,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  string
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/address/viewaddress.json"

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
	localVarFormParams.Add("addressid", parameterToString(addressid, ""))
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

