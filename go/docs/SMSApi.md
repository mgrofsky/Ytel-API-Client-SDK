# \SMSApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SmsGetinboundsms**](SMSApi.md#SmsGetinboundsms) | **Post** /sms/getinboundsms.json | List Inbound SMS
[**SmsListsms**](SMSApi.md#SmsListsms) | **Post** /sms/listsms.json | List SMS
[**SmsSendsms**](SMSApi.md#SmsSendsms) | **Post** /sms/sendsms.json | Send SMS
[**SmsViewdetailsms**](SMSApi.md#SmsViewdetailsms) | **Post** /sms/viewdetailsms.json | View SMS
[**SmsViewsms**](SMSApi.md#SmsViewsms) | **Post** /sms/viewsms.json | View SMS


# **SmsGetinboundsms**
> string SmsGetinboundsms(ctx, optional)
List Inbound SMS

Retrieve a list of Inbound SMS message objects.

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
 **pageSize** | **int32**| The count of objects to return per page. | [default to 10]
 **from** | **string**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | 
 **to** | **string**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | 
 **dateSent** | **string**| Filter sms message objects by this date. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SmsListsms**
> string SmsListsms(ctx, optional)
List SMS

Retrieve a list of Outbound SMS message objects.

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
 **pageSize** | **int32**| Number of individual resources listed in the response per page | [default to 10]
 **from** | **string**| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | 
 **to** | **string**| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | 
 **dateSent** | **string**| Only list SMS messages sent in the specified date range | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SmsSendsms**
> string SmsSendsms(ctx, from, to, body, optional)
Send SMS

Send an SMS from a Ytel number

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **from** | **string**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. | 
  **to** | **string**| The 10-digit phone number (E.164 format) that will receive the message. | 
  **body** | **string**| The body message that is to be sent in the text. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **string**| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. | 
 **to** | **string**| The 10-digit phone number (E.164 format) that will receive the message. | 
 **body** | **string**| The body message that is to be sent in the text. | 
 **method** | **string**| Specifies the HTTP method used to request the required URL once SMS sent. | 
 **messageStatusCallback** | **string**| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | 
 **smartsms** | **bool**| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [default to false]
 **deliveryStatus** | **bool**| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [default to false]

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SmsViewdetailsms**
> string SmsViewdetailsms(ctx, messageSid)
View SMS

Retrieve a single SMS message object with details by its SmsSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **messageSid** | **string**| The unique identifier for a sms message. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SmsViewsms**
> string SmsViewsms(ctx, messageSid)
View SMS

Retrieve a single SMS message object by its SmsSid.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for logging, tracing, authentication, etc.
  **messageSid** | **string**| The unique identifier for a sms message. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

