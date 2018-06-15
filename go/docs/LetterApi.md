# \LetterApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LetterCreate**](LetterApi.md#LetterCreate) | **Post** /letter/create.json | Create Letter
[**LetterDelete**](LetterApi.md#LetterDelete) | **Post** /letter/delete.json | Delete Letter
[**LetterListsletter**](LetterApi.md#LetterListsletter) | **Post** /letter/listsletter.json | List Letters
[**LetterViewletter**](LetterApi.md#LetterViewletter) | **Post** /letter/viewletter.json | View Letter


# **LetterCreate**
> string LetterCreate(ctx, to, from, attachbyid, file, color, optional)
Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **to** | **string**| The AddressId or an object structured when creating an address by addresses/Create. | 
  **from** | **string**| The AddressId or an object structured when creating an address by addresses/Create. | 
  **attachbyid** | **string**| Set an existing letter by attaching its LetterId. | 
  **file** | **string**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. | 
  **color** | **string**| Specify if letter should be printed in color. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **string**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **from** | **string**| The AddressId or an object structured when creating an address by addresses/Create. | 
 **attachbyid** | **string**| Set an existing letter by attaching its LetterId. | 
 **file** | **string**| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. | 
 **color** | **string**| Specify if letter should be printed in color. | 
 **description** | **string**| A description for the letter. | 
 **extraservice** | **string**| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | 
 **doublesided** | **string**| Specify if letter should be printed on both sides. | 
 **template** | **string**| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | 
 **htmldata** | **string**| A string value that contains HTML markup. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LetterDelete**
> string LetterDelete(ctx, lettersid)
Delete Letter

Remove a letter object by its LetterId.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **lettersid** | **string**| The unique identifier for a letter object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LetterListsletter**
> string LetterListsletter(ctx, optional)
List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pagesize** | **int32**| The count of objects to return per page. | [default to 10]
 **lettersid** | **string**| The unique identifier for a letter object. | 
 **dateCreated** | **string**| The date the letter was created. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LetterViewletter**
> string LetterViewletter(ctx, lettersid)
View Letter

Retrieve a letter object by its LetterSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **lettersid** | **string**| The unique identifier for a letter object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

