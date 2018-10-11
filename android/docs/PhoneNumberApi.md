# PhoneNumberApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**incomingphoneAvailablenumber**](PhoneNumberApi.md#incomingphoneAvailablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
[**incomingphoneBulkbuy**](PhoneNumberApi.md#incomingphoneBulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
[**incomingphoneBuynumber**](PhoneNumberApi.md#incomingphoneBuynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
[**incomingphoneGetdidscore**](PhoneNumberApi.md#incomingphoneGetdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
[**incomingphoneListnumber**](PhoneNumberApi.md#incomingphoneListnumber) | **POST** /incomingphone/listnumber.json | List Numbers
[**incomingphoneMassreleasenumber**](PhoneNumberApi.md#incomingphoneMassreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
[**incomingphoneMassupdatenumber**](PhoneNumberApi.md#incomingphoneMassupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
[**incomingphoneReleasenumberByResponseTypePost**](PhoneNumberApi.md#incomingphoneReleasenumberByResponseTypePost) | **POST** /incomingphone/releasenumber.{ResponseType} | Release Number
[**incomingphoneTransferphonenumbers**](PhoneNumberApi.md#incomingphoneTransferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
[**incomingphoneUpdatenumber**](PhoneNumberApi.md#incomingphoneUpdatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
[**incomingphoneViewnumber**](PhoneNumberApi.md#incomingphoneViewnumber) | **POST** /incomingphone/viewnumber.json | View Details


<a name="incomingphoneAvailablenumber"></a>
# **incomingphoneAvailablenumber**
> String incomingphoneAvailablenumber(numbertype, areacode, pagesize)

Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String numbertype = "numbertype_example"; // String | Number type either SMS,Voice or all
String areacode = "areacode_example"; // String | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
Integer pagesize = 10; // Integer | The count of objects to return.
try {
    String result = apiInstance.incomingphoneAvailablenumber(numbertype, areacode, pagesize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneAvailablenumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **String**| Number type either SMS,Voice or all | [enum: all, voice, sms]
 **areacode** | **String**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
 **pagesize** | **Integer**| The count of objects to return. | [optional] [default to 10]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneBulkbuy"></a>
# **incomingphoneBulkbuy**
> String incomingphoneBulkbuy(numberType, areaCode, quantity, leftover)

Bulk Buy Numbers

Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String numberType = "numberType_example"; // String | The capability the number supports.
String areaCode = "areaCode_example"; // String | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
String quantity = "quantity_example"; // String | A positive integer that tells how many number you want to buy at a time.
String leftover = "leftover_example"; // String | If desired quantity is unavailable purchase what is available .
try {
    String result = apiInstance.incomingphoneBulkbuy(numberType, areaCode, quantity, leftover);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneBulkbuy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberType** | **String**| The capability the number supports. | [enum: all, voice, sms]
 **areaCode** | **String**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
 **quantity** | **String**| A positive integer that tells how many number you want to buy at a time. |
 **leftover** | **String**| If desired quantity is unavailable purchase what is available . | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneBuynumber"></a>
# **incomingphoneBuynumber**
> String incomingphoneBuynumber(phoneNumber)

Purchase Number

Purchase a phone number to be used with your Ytel account

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phoneNumber = "phoneNumber_example"; // String | A valid 10-digit Ytel number (E.164 format).
try {
    String result = apiInstance.incomingphoneBuynumber(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneBuynumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| A valid 10-digit Ytel number (E.164 format). |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneGetdidscore"></a>
# **incomingphoneGetdidscore**
> String incomingphoneGetdidscore(phonenumber)

Get DID Score

Get DID Score Number

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phonenumber = "phonenumber_example"; // String | Specifies the multiple phone numbers for check updated spamscore .
try {
    String result = apiInstance.incomingphoneGetdidscore(phonenumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneGetdidscore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **String**| Specifies the multiple phone numbers for check updated spamscore . |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneListnumber"></a>
# **incomingphoneListnumber**
> String incomingphoneListnumber(page, pageSize, numberType, friendlyName)

List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
Integer page = 1; // Integer | Which page of the overall response will be returned. Page indexing starts at 1.
Integer pageSize = 10; // Integer | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
String numberType = "numberType_example"; // String | The capability supported by the number.Number type either SMS,Voice or all
String friendlyName = "friendlyName_example"; // String | A human-readable label added to the number object.
try {
    String result = apiInstance.incomingphoneListnumber(page, pageSize, numberType, friendlyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneListnumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Which page of the overall response will be returned. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **Integer**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 10]
 **numberType** | **String**| The capability supported by the number.Number type either SMS,Voice or all | [optional] [enum: all, voice, sms]
 **friendlyName** | **String**| A human-readable label added to the number object. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneMassreleasenumber"></a>
# **incomingphoneMassreleasenumber**
> String incomingphoneMassreleasenumber(phoneNumber)

Bulk Release

Remove a purchased Ytel number from your account.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phoneNumber = "phoneNumber_example"; // String | A valid Ytel comma separated numbers (E.164 format).
try {
    String result = apiInstance.incomingphoneMassreleasenumber(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneMassreleasenumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| A valid Ytel comma separated numbers (E.164 format). |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneMassupdatenumber"></a>
# **incomingphoneMassupdatenumber**
> String incomingphoneMassupdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod)

Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phoneNumber = "phoneNumber_example"; // String | A valid comma(,) separated Ytel numbers. (E.164 format).
String voiceUrl = "voiceUrl_example"; // String | The URL returning InboundXML incoming calls should execute when connected.
String friendlyName = "friendlyName_example"; // String | A human-readable value for labeling the number.
String voiceMethod = "voiceMethod_example"; // String | Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
String voiceFallbackUrl = "voiceFallbackUrl_example"; // String | URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
String voiceFallbackMethod = "voiceFallbackMethod_example"; // String | Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
String hangupCallback = "hangupCallback_example"; // String | URL that can be requested to receive notification when and how incoming call has ended.
String hangupCallbackMethod = "hangupCallbackMethod_example"; // String | The HTTP method Ytel will use when requesting the HangupCallback URL.
String heartbeatUrl = "heartbeatUrl_example"; // String | URL that can be used to monitor the phone number.
String heartbeatMethod = "heartbeatMethod_example"; // String | The HTTP method Ytel will use when requesting the HeartbeatUrl.
String smsUrl = "smsUrl_example"; // String | URL requested when an SMS is received.
String smsMethod = "smsMethod_example"; // String | The HTTP method Ytel will use when requesting the SmsUrl.
String smsFallbackUrl = "smsFallbackUrl_example"; // String | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
String smsFallbackMethod = "smsFallbackMethod_example"; // String | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
try {
    String result = apiInstance.incomingphoneMassupdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneMassupdatenumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| A valid comma(,) separated Ytel numbers. (E.164 format). |
 **voiceUrl** | **String**| The URL returning InboundXML incoming calls should execute when connected. |
 **friendlyName** | **String**| A human-readable value for labeling the number. | [optional]
 **voiceMethod** | **String**| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | [optional]
 **voiceFallbackUrl** | **String**| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | [optional]
 **voiceFallbackMethod** | **String**| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | [optional]
 **hangupCallback** | **String**| URL that can be requested to receive notification when and how incoming call has ended. | [optional]
 **hangupCallbackMethod** | **String**| The HTTP method Ytel will use when requesting the HangupCallback URL. | [optional]
 **heartbeatUrl** | **String**| URL that can be used to monitor the phone number. | [optional]
 **heartbeatMethod** | **String**| The HTTP method Ytel will use when requesting the HeartbeatUrl. | [optional]
 **smsUrl** | **String**| URL requested when an SMS is received. | [optional]
 **smsMethod** | **String**| The HTTP method Ytel will use when requesting the SmsUrl. | [optional]
 **smsFallbackUrl** | **String**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional]
 **smsFallbackMethod** | **String**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneReleasenumberByResponseTypePost"></a>
# **incomingphoneReleasenumberByResponseTypePost**
> String incomingphoneReleasenumberByResponseTypePost(phoneNumber, responseType)

Release Number

Remove a purchased Ytel number from your account.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phoneNumber = "phoneNumber_example"; // String | A valid 10-digit Ytel number (E.164 format).
String responseType = "responseType_example"; // String | Response type format xml or json
try {
    String result = apiInstance.incomingphoneReleasenumberByResponseTypePost(phoneNumber, responseType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneReleasenumberByResponseTypePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| A valid 10-digit Ytel number (E.164 format). |
 **responseType** | **String**| Response type format xml or json |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneTransferphonenumbers"></a>
# **incomingphoneTransferphonenumbers**
> String incomingphoneTransferphonenumbers(phonenumber, fromaccountsid, toaccountsid)

Move Number

Transfer phone number that has been purchased for from one account to another account.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phonenumber = "phonenumber_example"; // String | A valid 10-digit Ytel number (E.164 format).
String fromaccountsid = "fromaccountsid_example"; // String | A specific Accountsid from where Number is getting transfer.
String toaccountsid = "toaccountsid_example"; // String | A specific Accountsid to which Number is getting transfer.
try {
    String result = apiInstance.incomingphoneTransferphonenumbers(phonenumber, fromaccountsid, toaccountsid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneTransferphonenumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **String**| A valid 10-digit Ytel number (E.164 format). |
 **fromaccountsid** | **String**| A specific Accountsid from where Number is getting transfer. |
 **toaccountsid** | **String**| A specific Accountsid to which Number is getting transfer. |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneUpdatenumber"></a>
# **incomingphoneUpdatenumber**
> String incomingphoneUpdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod)

Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phoneNumber = "phoneNumber_example"; // String | A valid Ytel number (E.164 format).
String voiceUrl = "voiceUrl_example"; // String | URL requested once the call connects
String friendlyName = "friendlyName_example"; // String | Phone number friendly name description
String voiceMethod = "voiceMethod_example"; // String | Post or Get
String voiceFallbackUrl = "voiceFallbackUrl_example"; // String | URL requested if the voice URL is not available
String voiceFallbackMethod = "voiceFallbackMethod_example"; // String | Post or Get
String hangupCallback = "hangupCallback_example"; // String | callback url after a hangup occurs
String hangupCallbackMethod = "hangupCallbackMethod_example"; // String | Post or Get
String heartbeatUrl = "heartbeatUrl_example"; // String | URL requested once the call connects
String heartbeatMethod = "heartbeatMethod_example"; // String | URL that can be requested every 60 seconds during the call to notify of elapsed time
String smsUrl = "smsUrl_example"; // String | URL requested when an SMS is received
String smsMethod = "smsMethod_example"; // String | Post or Get
String smsFallbackUrl = "smsFallbackUrl_example"; // String | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
String smsFallbackMethod = "smsFallbackMethod_example"; // String | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
try {
    String result = apiInstance.incomingphoneUpdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneUpdatenumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| A valid Ytel number (E.164 format). |
 **voiceUrl** | **String**| URL requested once the call connects |
 **friendlyName** | **String**| Phone number friendly name description | [optional]
 **voiceMethod** | **String**| Post or Get | [optional]
 **voiceFallbackUrl** | **String**| URL requested if the voice URL is not available | [optional]
 **voiceFallbackMethod** | **String**| Post or Get | [optional]
 **hangupCallback** | **String**| callback url after a hangup occurs | [optional]
 **hangupCallbackMethod** | **String**| Post or Get | [optional]
 **heartbeatUrl** | **String**| URL requested once the call connects | [optional]
 **heartbeatMethod** | **String**| URL that can be requested every 60 seconds during the call to notify of elapsed time | [optional]
 **smsUrl** | **String**| URL requested when an SMS is received | [optional]
 **smsMethod** | **String**| Post or Get | [optional]
 **smsFallbackUrl** | **String**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional]
 **smsFallbackMethod** | **String**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional]

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneViewnumber"></a>
# **incomingphoneViewnumber**
> String incomingphoneViewnumber(phoneNumber)

View Details

Retrieve the details for a phone number by its number.

### Example
```java
// Import classes:
//import io.swagger.client.api.PhoneNumberApi;

PhoneNumberApi apiInstance = new PhoneNumberApi();
String phoneNumber = "phoneNumber_example"; // String | A valid Ytel 10-digit phone number (E.164 format).
try {
    String result = apiInstance.incomingphoneViewnumber(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneNumberApi#incomingphoneViewnumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| A valid Ytel 10-digit phone number (E.164 format). |

### Return type

**String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

