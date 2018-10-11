# \ShortCodeApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DedicatedshortcodeGetinboundsms**](ShortCodeApi.md#DedicatedshortcodeGetinboundsms) | **Post** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
[**DedicatedshortcodeListshortcode**](ShortCodeApi.md#DedicatedshortcodeListshortcode) | **Post** /dedicatedshortcode/listshortcode.json | List Shortcodes
[**DedicatedshortcodeSendsms**](ShortCodeApi.md#DedicatedshortcodeSendsms) | **Post** /dedicatedshortcode/sendsms.json | Send SMS
[**DedicatedshortcodeUpdateshortcode**](ShortCodeApi.md#DedicatedshortcodeUpdateshortcode) | **Post** /dedicatedshortcode/updateshortcode.json | Update Shortcode
[**DedicatedshortcodeViewshortcode**](ShortCodeApi.md#DedicatedshortcodeViewshortcode) | **Post** /dedicatedshortcode/viewshortcode.json | View SMS
[**ShortcodeListsms**](ShortCodeApi.md#ShortcodeListsms) | **Post** /shortcode/listsms.json | List SMS
[**ShortcodeViewsms**](ShortCodeApi.md#ShortcodeViewsms) | **Post** /shortcode/viewsms.json | View SMS


# **DedicatedshortcodeGetinboundsms**
> string DedicatedshortcodeGetinboundsms(ctx, optional)
List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pagesize** | **int32**| Number of individual resources listed in the response per page | [default to 10]
 **from** | **string**| Only list SMS messages sent from this number | 
 **shortcode** | **string**| Only list SMS messages sent to Shortcode | 
 **datecreated** | **string**| Only list SMS messages sent in the specified date MAKE REQUEST | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DedicatedshortcodeListshortcode**
> string DedicatedshortcodeListshortcode(ctx, optional)
List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| Only list Short Code Assignment sent from this Short Code | 
 **page** | **string**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | 
 **pagesize** | **string**| The count of objects to return per page. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DedicatedshortcodeSendsms**
> string DedicatedshortcodeSendsms(ctx, shortcode, to, body, optional)
Send SMS

Send Dedicated Shortcode

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **shortcode** | **int32**| Your dedicated shortcode | 
  **to** | **float64**| The number to send your SMS to | 
  **body** | **string**| The body of your message | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **int32**| Your dedicated shortcode | 
 **to** | **float64**| The number to send your SMS to | 
 **body** | **string**| The body of your message | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | 
 **messagestatuscallback** | **string**| URL that can be requested to receive notification when Short Code message was sent. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DedicatedshortcodeUpdateshortcode**
> string DedicatedshortcodeUpdateshortcode(ctx, shortcode, optional)
Update Shortcode

Update a dedicated shortcode.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **shortcode** | **string**| List of valid dedicated shortcode to your Ytel account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| List of valid dedicated shortcode to your Ytel account. | 
 **friendlyName** | **string**| User generated name of the dedicated shortcode. | 
 **callbackMethod** | **string**| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | 
 **callbackUrl** | **string**| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | 
 **fallbackMethod** | **string**| Specifies the HTTP method used to request the required FallbackUrl once call connects. | 
 **fallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DedicatedshortcodeViewshortcode**
> string DedicatedshortcodeViewshortcode(ctx, shortcode)
View SMS

Retrieve a single Short Code object by its shortcode assignment.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **shortcode** | **string**| List of valid Dedicated Short Code to your Ytel account | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShortcodeListsms**
> string ShortcodeListsms(ctx, optional)
List SMS

Retrieve a list of Short Code messages.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **string**| Only list messages sent from this Short Code | 
 **to** | **string**| Only list messages sent to this number | 
 **dateSent** | **string**| Only list messages sent with the specified date | 
 **page** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 1]
 **pageSize** | **int32**| The count of objects to return per page. | [default to 10]

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ShortcodeViewsms**
> string ShortcodeViewsms(ctx, messageSid)
View SMS

View a single Sms Short Code message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **messageSid** | **string**| The unique identifier for the sms resource | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

