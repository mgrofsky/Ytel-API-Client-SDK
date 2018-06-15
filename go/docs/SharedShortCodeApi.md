# \SharedShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**KeywordLists**](SharedShortCodeApi.md#KeywordLists) | **Post** /keyword/lists.json | List Keywords
[**KeywordView**](SharedShortCodeApi.md#KeywordView) | **Post** /keyword/view.json | View Keyword
[**ShortcodeGetinboundsms**](SharedShortCodeApi.md#ShortcodeGetinboundsms) | **Post** /shortcode/getinboundsms.json | List Inbound SMS
[**ShortcodeListshortcode**](SharedShortCodeApi.md#ShortcodeListshortcode) | **Post** /shortcode/listshortcode.json | List Shortcodes
[**ShortcodeSendsms**](SharedShortCodeApi.md#ShortcodeSendsms) | **Post** /shortcode/sendsms.json | Send SMS
[**ShortcodeUpdateshortcode**](SharedShortCodeApi.md#ShortcodeUpdateshortcode) | **Post** /shortcode/updateshortcode.json | Update Shortcode
[**ShortcodeViewshortcode**](SharedShortCodeApi.md#ShortcodeViewshortcode) | **Post** /shortcode/viewshortcode.json | View Shortcode
[**TemplateLists**](SharedShortCodeApi.md#TemplateLists) | **Post** /template/lists.json | List Templates
[**TemplateView**](SharedShortCodeApi.md#TemplateView) | **Post** /template/view.json | View Template


# **KeywordLists**
> string KeywordLists(ctx, optional)
List Keywords

Retrieve a list of keywords associated with your Ytel account.

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
 **pagesize** | **int32**| Number of individual resources listed in the response per page | [default to 10]
 **keyword** | **string**| Only list keywords of keyword | 
 **shortcode** | **int32**| Only list keywords of shortcode | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **KeywordView**
> string KeywordView(ctx, keywordid)
View Keyword

View a set of properties for a single keyword.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **keywordid** | **string**| The unique identifier of each keyword | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShortcodeGetinboundsms**
> string ShortcodeGetinboundsms(ctx, optional)
List Inbound SMS

List All Inbound ShortCode

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
 **pagesize** | **int32**| Number of individual resources listed in the response per page | [default to 10]
 **from** | **string**| From Number to Inbound ShortCode | 
 **shortcode** | **string**| Only list messages sent to this Short Code | 
 **datecreated** | **string**| Only list messages sent with the specified date | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShortcodeListshortcode**
> string ShortcodeListshortcode(ctx, optional)
List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

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
 **pagesize** | **int32**| Number of individual resources listed in the response per page | [default to 10]
 **shortcode** | **string**| Only list keywords of shortcode | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShortcodeSendsms**
> string ShortcodeSendsms(ctx, shortcode, to, templateid, data, optional)
Send SMS

Send an SMS from a Ytel ShortCode

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **shortcode** | **string**| The Short Code number that is the sender of this message | 
  **to** | **string**| A valid 10-digit number that should receive the message | 
  **templateid** | **string**| The unique identifier for the template used for the message | 
  **data** | **string**| format of your data, example: {companyname}:test,{otpcode}:1234 | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| The Short Code number that is the sender of this message | 
 **to** | **string**| A valid 10-digit number that should receive the message | 
 **templateid** | **string**| The unique identifier for the template used for the message | 
 **data** | **string**| format of your data, example: {companyname}:test,{otpcode}:1234 | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [default to GET]
 **messageStatusCallback** | **string**| URL that can be requested to receive notification when Short Code message was sent. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShortcodeUpdateshortcode**
> string ShortcodeUpdateshortcode(ctx, shortcode, optional)
Update Shortcode

Update Assignment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **shortcode** | **string**| List of valid shortcode to your Ytel account | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid shortcode to your Ytel account | 
 **friendlyName** | **string**| User generated name of the shortcode | 
 **callbackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | 
 **callbackMethod** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | 
 **fallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | 
 **fallbackUrlMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShortcodeViewshortcode**
> string ShortcodeViewshortcode(ctx, shortcode)
View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **shortcode** | **string**| List of valid Shortcode to your Ytel account | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplateLists**
> string TemplateLists(ctx, optional)
List Templates

List Shortcode Templates by Type

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type_** | **string**| The type (category) of template Valid values: marketing, authorization | [default to authorization]
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pagesize** | **int32**| The count of objects to return per page. | [default to 10]
 **shortcode** | **string**| Only list templates of type | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplateView**
> string TemplateView(ctx, templateId)
View Template

View a Shared ShortCode Template

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **templateId** | **string**| The unique identifier for a template object | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

