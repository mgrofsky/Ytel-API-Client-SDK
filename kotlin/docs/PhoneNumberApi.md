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
[**incomingphoneReleasenumberByResponseTypePost**](PhoneNumberApi.md#incomingphoneReleasenumberByResponseTypePost) | **POST** /incomingphone/releasenumber.json | Release Number
[**incomingphoneTransferphonenumbers**](PhoneNumberApi.md#incomingphoneTransferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
[**incomingphoneUpdatenumber**](PhoneNumberApi.md#incomingphoneUpdatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
[**incomingphoneViewnumber**](PhoneNumberApi.md#incomingphoneViewnumber) | **POST** /incomingphone/viewnumber.json | View Details


<a name="incomingphoneAvailablenumber"></a>
# **incomingphoneAvailablenumber**
> kotlin.String incomingphoneAvailablenumber(numbertype, areacode, pagesize)

Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val numbertype : kotlin.String = numbertype_example // kotlin.String | Number type either SMS,Voice or all
val areacode : kotlin.String = areacode_example // kotlin.String | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
val pagesize : kotlin.Int = 56 // kotlin.Int | The count of objects to return.
try {
    val result : kotlin.String = apiInstance.incomingphoneAvailablenumber(numbertype, areacode, pagesize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneAvailablenumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneAvailablenumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **kotlin.String**| Number type either SMS,Voice or all | [enum: all, voice, sms]
 **areacode** | **kotlin.String**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
 **pagesize** | **kotlin.Int**| The count of objects to return. | [optional] [default to 10]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneBulkbuy"></a>
# **incomingphoneBulkbuy**
> kotlin.String incomingphoneBulkbuy(numberType, areaCode, quantity, leftover)

Bulk Buy Numbers

Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val numberType : kotlin.String = numberType_example // kotlin.String | The capability the number supports.
val areaCode : kotlin.String = areaCode_example // kotlin.String | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
val quantity : kotlin.String = quantity_example // kotlin.String | A positive integer that tells how many number you want to buy at a time.
val leftover : kotlin.String = leftover_example // kotlin.String | If desired quantity is unavailable purchase what is available .
try {
    val result : kotlin.String = apiInstance.incomingphoneBulkbuy(numberType, areaCode, quantity, leftover)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneBulkbuy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneBulkbuy")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberType** | **kotlin.String**| The capability the number supports. | [enum: all, voice, sms]
 **areaCode** | **kotlin.String**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. |
 **quantity** | **kotlin.String**| A positive integer that tells how many number you want to buy at a time. |
 **leftover** | **kotlin.String**| If desired quantity is unavailable purchase what is available . | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneBuynumber"></a>
# **incomingphoneBuynumber**
> kotlin.String incomingphoneBuynumber(phoneNumber)

Purchase Number

Purchase a phone number to be used with your Ytel account

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phoneNumber : kotlin.String = phoneNumber_example // kotlin.String | A valid 10-digit Ytel number (E.164 format).
try {
    val result : kotlin.String = apiInstance.incomingphoneBuynumber(phoneNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneBuynumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneBuynumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **kotlin.String**| A valid 10-digit Ytel number (E.164 format). |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneGetdidscore"></a>
# **incomingphoneGetdidscore**
> kotlin.String incomingphoneGetdidscore(phonenumber)

Get DID Score

Get DID Score Number

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phonenumber : kotlin.String = phonenumber_example // kotlin.String | Specifies the multiple phone numbers for check updated spamscore .
try {
    val result : kotlin.String = apiInstance.incomingphoneGetdidscore(phonenumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneGetdidscore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneGetdidscore")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **kotlin.String**| Specifies the multiple phone numbers for check updated spamscore . |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneListnumber"></a>
# **incomingphoneListnumber**
> kotlin.String incomingphoneListnumber(page, pageSize, numberType, friendlyName)

List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val page : kotlin.Int = 56 // kotlin.Int | Which page of the overall response will be returned. Page indexing starts at 1.
val pageSize : kotlin.Int = 56 // kotlin.Int | The page count to retrieve from the total results in the collection. Page indexing starts at 1.
val numberType : kotlin.String = numberType_example // kotlin.String | The capability supported by the number.Number type either SMS,Voice or all
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | A human-readable label added to the number object.
try {
    val result : kotlin.String = apiInstance.incomingphoneListnumber(page, pageSize, numberType, friendlyName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneListnumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneListnumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| Which page of the overall response will be returned. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **kotlin.Int**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 10]
 **numberType** | **kotlin.String**| The capability supported by the number.Number type either SMS,Voice or all | [optional] [enum: all, voice, sms]
 **friendlyName** | **kotlin.String**| A human-readable label added to the number object. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneMassreleasenumber"></a>
# **incomingphoneMassreleasenumber**
> kotlin.String incomingphoneMassreleasenumber(phoneNumber)

Bulk Release

Remove a purchased Ytel number from your account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phoneNumber : kotlin.String = phoneNumber_example // kotlin.String | A valid Ytel comma separated numbers (E.164 format).
try {
    val result : kotlin.String = apiInstance.incomingphoneMassreleasenumber(phoneNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneMassreleasenumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneMassreleasenumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **kotlin.String**| A valid Ytel comma separated numbers (E.164 format). |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneMassupdatenumber"></a>
# **incomingphoneMassupdatenumber**
> kotlin.String incomingphoneMassupdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod)

Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phoneNumber : kotlin.String = phoneNumber_example // kotlin.String | A valid comma(,) separated Ytel numbers. (E.164 format).
val voiceUrl : kotlin.String = voiceUrl_example // kotlin.String | The URL returning InboundXML incoming calls should execute when connected.
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | A human-readable value for labeling the number.
val voiceMethod : kotlin.String = voiceMethod_example // kotlin.String | Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
val voiceFallbackUrl : kotlin.String = voiceFallbackUrl_example // kotlin.String | URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
val voiceFallbackMethod : kotlin.String = voiceFallbackMethod_example // kotlin.String | Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
val hangupCallback : kotlin.String = hangupCallback_example // kotlin.String | URL that can be requested to receive notification when and how incoming call has ended.
val hangupCallbackMethod : kotlin.String = hangupCallbackMethod_example // kotlin.String | The HTTP method Ytel will use when requesting the HangupCallback URL.
val heartbeatUrl : kotlin.String = heartbeatUrl_example // kotlin.String | URL that can be used to monitor the phone number.
val heartbeatMethod : kotlin.String = heartbeatMethod_example // kotlin.String | The HTTP method Ytel will use when requesting the HeartbeatUrl.
val smsUrl : kotlin.String = smsUrl_example // kotlin.String | URL requested when an SMS is received.
val smsMethod : kotlin.String = smsMethod_example // kotlin.String | The HTTP method Ytel will use when requesting the SmsUrl.
val smsFallbackUrl : kotlin.String = smsFallbackUrl_example // kotlin.String | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
val smsFallbackMethod : kotlin.String = smsFallbackMethod_example // kotlin.String | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
try {
    val result : kotlin.String = apiInstance.incomingphoneMassupdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneMassupdatenumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneMassupdatenumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **kotlin.String**| A valid comma(,) separated Ytel numbers. (E.164 format). |
 **voiceUrl** | **kotlin.String**| The URL returning InboundXML incoming calls should execute when connected. |
 **friendlyName** | **kotlin.String**| A human-readable value for labeling the number. | [optional]
 **voiceMethod** | **kotlin.String**| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | [optional]
 **voiceFallbackUrl** | **kotlin.String**| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | [optional]
 **voiceFallbackMethod** | **kotlin.String**| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | [optional]
 **hangupCallback** | **kotlin.String**| URL that can be requested to receive notification when and how incoming call has ended. | [optional]
 **hangupCallbackMethod** | **kotlin.String**| The HTTP method Ytel will use when requesting the HangupCallback URL. | [optional]
 **heartbeatUrl** | **kotlin.String**| URL that can be used to monitor the phone number. | [optional]
 **heartbeatMethod** | **kotlin.String**| The HTTP method Ytel will use when requesting the HeartbeatUrl. | [optional]
 **smsUrl** | **kotlin.String**| URL requested when an SMS is received. | [optional]
 **smsMethod** | **kotlin.String**| The HTTP method Ytel will use when requesting the SmsUrl. | [optional]
 **smsFallbackUrl** | **kotlin.String**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional]
 **smsFallbackMethod** | **kotlin.String**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneReleasenumberByResponseTypePost"></a>
# **incomingphoneReleasenumberByResponseTypePost**
> kotlin.String incomingphoneReleasenumberByResponseTypePost(phoneNumber, responseType)

Release Number

Remove a purchased Ytel number from your account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phoneNumber : kotlin.String = phoneNumber_example // kotlin.String | A valid 10-digit Ytel number (E.164 format).
val responseType : kotlin.String = responseType_example // kotlin.String | Response type format xml or json
try {
    val result : kotlin.String = apiInstance.incomingphoneReleasenumberByResponseTypePost(phoneNumber, responseType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneReleasenumberByResponseTypePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneReleasenumberByResponseTypePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **kotlin.String**| A valid 10-digit Ytel number (E.164 format). |
 **responseType** | **kotlin.String**| Response type format xml or json |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneTransferphonenumbers"></a>
# **incomingphoneTransferphonenumbers**
> kotlin.String incomingphoneTransferphonenumbers(phonenumber, fromaccountsid, toaccountsid)

Move Number

Transfer phone number that has been purchased for from one account to another account.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phonenumber : kotlin.String = phonenumber_example // kotlin.String | A valid 10-digit Ytel number (E.164 format).
val fromaccountsid : kotlin.String = fromaccountsid_example // kotlin.String | A specific Accountsid from where Number is getting transfer.
val toaccountsid : kotlin.String = toaccountsid_example // kotlin.String | A specific Accountsid to which Number is getting transfer.
try {
    val result : kotlin.String = apiInstance.incomingphoneTransferphonenumbers(phonenumber, fromaccountsid, toaccountsid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneTransferphonenumbers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneTransferphonenumbers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **kotlin.String**| A valid 10-digit Ytel number (E.164 format). |
 **fromaccountsid** | **kotlin.String**| A specific Accountsid from where Number is getting transfer. |
 **toaccountsid** | **kotlin.String**| A specific Accountsid to which Number is getting transfer. |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneUpdatenumber"></a>
# **incomingphoneUpdatenumber**
> kotlin.String incomingphoneUpdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod)

Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phoneNumber : kotlin.String = phoneNumber_example // kotlin.String | A valid Ytel number (E.164 format).
val voiceUrl : kotlin.String = voiceUrl_example // kotlin.String | URL requested once the call connects
val friendlyName : kotlin.String = friendlyName_example // kotlin.String | Phone number friendly name description
val voiceMethod : kotlin.String = voiceMethod_example // kotlin.String | Post or Get
val voiceFallbackUrl : kotlin.String = voiceFallbackUrl_example // kotlin.String | URL requested if the voice URL is not available
val voiceFallbackMethod : kotlin.String = voiceFallbackMethod_example // kotlin.String | Post or Get
val hangupCallback : kotlin.String = hangupCallback_example // kotlin.String | callback url after a hangup occurs
val hangupCallbackMethod : kotlin.String = hangupCallbackMethod_example // kotlin.String | Post or Get
val heartbeatUrl : kotlin.String = heartbeatUrl_example // kotlin.String | URL requested once the call connects
val heartbeatMethod : kotlin.String = heartbeatMethod_example // kotlin.String | URL that can be requested every 60 seconds during the call to notify of elapsed time
val smsUrl : kotlin.String = smsUrl_example // kotlin.String | URL requested when an SMS is received
val smsMethod : kotlin.String = smsMethod_example // kotlin.String | Post or Get
val smsFallbackUrl : kotlin.String = smsFallbackUrl_example // kotlin.String | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
val smsFallbackMethod : kotlin.String = smsFallbackMethod_example // kotlin.String | The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
try {
    val result : kotlin.String = apiInstance.incomingphoneUpdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneUpdatenumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneUpdatenumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **kotlin.String**| A valid Ytel number (E.164 format). |
 **voiceUrl** | **kotlin.String**| URL requested once the call connects |
 **friendlyName** | **kotlin.String**| Phone number friendly name description | [optional]
 **voiceMethod** | **kotlin.String**| Post or Get | [optional]
 **voiceFallbackUrl** | **kotlin.String**| URL requested if the voice URL is not available | [optional]
 **voiceFallbackMethod** | **kotlin.String**| Post or Get | [optional]
 **hangupCallback** | **kotlin.String**| callback url after a hangup occurs | [optional]
 **hangupCallbackMethod** | **kotlin.String**| Post or Get | [optional]
 **heartbeatUrl** | **kotlin.String**| URL requested once the call connects | [optional]
 **heartbeatMethod** | **kotlin.String**| URL that can be requested every 60 seconds during the call to notify of elapsed time | [optional]
 **smsUrl** | **kotlin.String**| URL requested when an SMS is received | [optional]
 **smsMethod** | **kotlin.String**| Post or Get | [optional]
 **smsFallbackUrl** | **kotlin.String**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional]
 **smsFallbackMethod** | **kotlin.String**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional]

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="incomingphoneViewnumber"></a>
# **incomingphoneViewnumber**
> kotlin.String incomingphoneViewnumber(phoneNumber)

View Details

Retrieve the details for a phone number by its number.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PhoneNumberApi()
val phoneNumber : kotlin.String = phoneNumber_example // kotlin.String | A valid Ytel 10-digit phone number (E.164 format).
try {
    val result : kotlin.String = apiInstance.incomingphoneViewnumber(phoneNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PhoneNumberApi#incomingphoneViewnumber")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PhoneNumberApi#incomingphoneViewnumber")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **kotlin.String**| A valid Ytel 10-digit phone number (E.164 format). |

### Return type

**kotlin.String**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

