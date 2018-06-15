# \PhoneNumberApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IncomingphoneAvailablenumber**](PhoneNumberApi.md#IncomingphoneAvailablenumber) | **Post** /incomingphone/availablenumber.json | Available Numbers
[**IncomingphoneBulkbuy**](PhoneNumberApi.md#IncomingphoneBulkbuy) | **Post** /incomingphone/bulkbuy.json | Bulk Buy Numbers
[**IncomingphoneBuynumber**](PhoneNumberApi.md#IncomingphoneBuynumber) | **Post** /incomingphone/buynumber.json | Purchase Number
[**IncomingphoneGetdidscore**](PhoneNumberApi.md#IncomingphoneGetdidscore) | **Post** /incomingphone/getdidscore.json | Get DID Score
[**IncomingphoneListnumber**](PhoneNumberApi.md#IncomingphoneListnumber) | **Post** /incomingphone/listnumber.json | List Numbers
[**IncomingphoneMassreleasenumber**](PhoneNumberApi.md#IncomingphoneMassreleasenumber) | **Post** /incomingphone/massreleasenumber.json | Bulk Release
[**IncomingphoneMassupdatenumber**](PhoneNumberApi.md#IncomingphoneMassupdatenumber) | **Post** /incomingphone/massupdatenumber.json | Bulk Update Numbers
[**IncomingphoneReleasenumberByResponseTypePost**](PhoneNumberApi.md#IncomingphoneReleasenumberByResponseTypePost) | **Post** /incomingphone/releasenumber.{ResponseType} | Release Number
[**IncomingphoneTransferphonenumbers**](PhoneNumberApi.md#IncomingphoneTransferphonenumbers) | **Post** /incomingphone/transferphonenumbers.json | Move Number
[**IncomingphoneUpdatenumber**](PhoneNumberApi.md#IncomingphoneUpdatenumber) | **Post** /incomingphone/updatenumber.json | Update Number
[**IncomingphoneViewnumber**](PhoneNumberApi.md#IncomingphoneViewnumber) | **Post** /incomingphone/viewnumber.json | View Details


# **IncomingphoneAvailablenumber**
> string IncomingphoneAvailablenumber(ctx, numbertype, areacode, optional)
Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **numbertype** | **string**| Number type either SMS,Voice or all | 
  **areacode** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **string**| Number type either SMS,Voice or all | 
 **areacode** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **pagesize** | **int32**| The count of objects to return. | [default to 10]

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneBulkbuy**
> string IncomingphoneBulkbuy(ctx, numberType, areaCode, quantity, optional)
Bulk Buy Numbers

Purchase a selected number of DID's from specific area codes to be used with your Ytel account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **numberType** | **string**| The capability the number supports. | 
  **areaCode** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
  **quantity** | **string**| A positive integer that tells how many number you want to buy at a time. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberType** | **string**| The capability the number supports. | 
 **areaCode** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **quantity** | **string**| A positive integer that tells how many number you want to buy at a time. | 
 **leftover** | **string**| If desired quantity is unavailable purchase what is available . | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneBuynumber**
> string IncomingphoneBuynumber(ctx, phoneNumber)
Purchase Number

Purchase a phone number to be used with your Ytel account

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phoneNumber** | **string**| A valid 10-digit Ytel number (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneGetdidscore**
> string IncomingphoneGetdidscore(ctx, phonenumber)
Get DID Score

Get DID Score Number

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phonenumber** | **string**| Specifies the multiple phone numbers for check updated spamscore . | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneListnumber**
> string IncomingphoneListnumber(ctx, optional)
List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32**| Which page of the overall response will be returned. Page indexing starts at 1. | [default to 1]
 **pageSize** | **int32**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [default to 10]
 **numberType** | **string**| The capability supported by the number.Number type either SMS,Voice or all | 
 **friendlyName** | **string**| A human-readable label added to the number object. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneMassreleasenumber**
> string IncomingphoneMassreleasenumber(ctx, phoneNumber)
Bulk Release

Remove a purchased Ytel number from your account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phoneNumber** | **string**| A valid Ytel comma separated numbers (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneMassupdatenumber**
> string IncomingphoneMassupdatenumber(ctx, phoneNumber, voiceUrl, optional)
Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phoneNumber** | **string**| A valid comma(,) separated Ytel numbers. (E.164 format). | 
  **voiceUrl** | **string**| The URL returning InboundXML incoming calls should execute when connected. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid comma(,) separated Ytel numbers. (E.164 format). | 
 **voiceUrl** | **string**| The URL returning InboundXML incoming calls should execute when connected. | 
 **friendlyName** | **string**| A human-readable value for labeling the number. | 
 **voiceMethod** | **string**| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | 
 **voiceFallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | 
 **voiceFallbackMethod** | **string**| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | 
 **hangupCallback** | **string**| URL that can be requested to receive notification when and how incoming call has ended. | 
 **hangupCallbackMethod** | **string**| The HTTP method Ytel will use when requesting the HangupCallback URL. | 
 **heartbeatUrl** | **string**| URL that can be used to monitor the phone number. | 
 **heartbeatMethod** | **string**| The HTTP method Ytel will use when requesting the HeartbeatUrl. | 
 **smsUrl** | **string**| URL requested when an SMS is received. | 
 **smsMethod** | **string**| The HTTP method Ytel will use when requesting the SmsUrl. | 
 **smsFallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | 
 **smsFallbackMethod** | **string**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneReleasenumberByResponseTypePost**
> string IncomingphoneReleasenumberByResponseTypePost(ctx, phoneNumber, responseType)
Release Number

Remove a purchased Ytel number from your account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phoneNumber** | **string**| A valid 10-digit Ytel number (E.164 format). | 
  **responseType** | **string**| Response type format xml or json | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneTransferphonenumbers**
> string IncomingphoneTransferphonenumbers(ctx, phonenumber, fromaccountsid, toaccountsid)
Move Number

Transfer phone number that has been purchased for from one account to another account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phonenumber** | **string**| A valid 10-digit Ytel number (E.164 format). | 
  **fromaccountsid** | **string**| A specific Accountsid from where Number is getting transfer. | 
  **toaccountsid** | **string**| A specific Accountsid to which Number is getting transfer. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneUpdatenumber**
> string IncomingphoneUpdatenumber(ctx, phoneNumber, voiceUrl, optional)
Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phoneNumber** | **string**| A valid Ytel number (E.164 format). | 
  **voiceUrl** | **string**| URL requested once the call connects | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid Ytel number (E.164 format). | 
 **voiceUrl** | **string**| URL requested once the call connects | 
 **friendlyName** | **string**| Phone number friendly name description | 
 **voiceMethod** | **string**| Post or Get | 
 **voiceFallbackUrl** | **string**| URL requested if the voice URL is not available | 
 **voiceFallbackMethod** | **string**| Post or Get | 
 **hangupCallback** | **string**| callback url after a hangup occurs | 
 **hangupCallbackMethod** | **string**| Post or Get | 
 **heartbeatUrl** | **string**| URL requested once the call connects | 
 **heartbeatMethod** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed time | 
 **smsUrl** | **string**| URL requested when an SMS is received | 
 **smsMethod** | **string**| Post or Get | 
 **smsFallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | 
 **smsFallbackMethod** | **string**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **IncomingphoneViewnumber**
> string IncomingphoneViewnumber(ctx, phoneNumber)
View Details

Retrieve the details for a phone number by its number.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **phoneNumber** | **string**| A valid Ytel 10-digit phone number (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

