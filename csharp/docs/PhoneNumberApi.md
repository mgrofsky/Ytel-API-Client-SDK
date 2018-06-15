# IO.Swagger.Api.PhoneNumberApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IncomingphoneAvailablenumber**](PhoneNumberApi.md#incomingphoneavailablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
[**IncomingphoneBulkbuy**](PhoneNumberApi.md#incomingphonebulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
[**IncomingphoneBuynumber**](PhoneNumberApi.md#incomingphonebuynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
[**IncomingphoneGetdidscore**](PhoneNumberApi.md#incomingphonegetdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
[**IncomingphoneListnumber**](PhoneNumberApi.md#incomingphonelistnumber) | **POST** /incomingphone/listnumber.json | List Numbers
[**IncomingphoneMassreleasenumber**](PhoneNumberApi.md#incomingphonemassreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
[**IncomingphoneMassupdatenumber**](PhoneNumberApi.md#incomingphonemassupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
[**IncomingphoneReleasenumberByResponseTypePost**](PhoneNumberApi.md#incomingphonereleasenumberbyresponsetypepost) | **POST** /incomingphone/releasenumber.{ResponseType} | Release Number
[**IncomingphoneTransferphonenumbers**](PhoneNumberApi.md#incomingphonetransferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
[**IncomingphoneUpdatenumber**](PhoneNumberApi.md#incomingphoneupdatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
[**IncomingphoneViewnumber**](PhoneNumberApi.md#incomingphoneviewnumber) | **POST** /incomingphone/viewnumber.json | View Details


<a name="incomingphoneavailablenumber"></a>
# **IncomingphoneAvailablenumber**
> string IncomingphoneAvailablenumber (string numbertype, string areacode, int? pagesize = null)

Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneAvailablenumberExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var numbertype = numbertype_example;  // string | Number type either SMS,Voice or all
            var areacode = areacode_example;  // string | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
            var pagesize = 56;  // int? | The count of objects to return. (optional)  (default to 10)

            try
            {
                // Available Numbers
                string result = apiInstance.IncomingphoneAvailablenumber(numbertype, areacode, pagesize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneAvailablenumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **string**| Number type either SMS,Voice or all | 
 **areacode** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **pagesize** | **int?**| The count of objects to return. | [optional] [default to 10]

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphonebulkbuy"></a>
# **IncomingphoneBulkbuy**
> string IncomingphoneBulkbuy (string numberType, string areaCode, string quantity, string leftover = null)

Bulk Buy Numbers

Purchase a selected number of DID's from specific area codes to be used with your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneBulkbuyExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var numberType = numberType_example;  // string | The capability the number supports.
            var areaCode = areaCode_example;  // string | Specifies the area code for the returned list of available numbers. Only available for North American numbers.
            var quantity = quantity_example;  // string | A positive integer that tells how many number you want to buy at a time.
            var leftover = leftover_example;  // string | If desired quantity is unavailable purchase what is available . (optional) 

            try
            {
                // Bulk Buy Numbers
                string result = apiInstance.IncomingphoneBulkbuy(numberType, areaCode, quantity, leftover);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneBulkbuy: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberType** | **string**| The capability the number supports. | 
 **areaCode** | **string**| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **quantity** | **string**| A positive integer that tells how many number you want to buy at a time. | 
 **leftover** | **string**| If desired quantity is unavailable purchase what is available . | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphonebuynumber"></a>
# **IncomingphoneBuynumber**
> string IncomingphoneBuynumber (string phoneNumber)

Purchase Number

Purchase a phone number to be used with your Ytel account

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneBuynumberExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phoneNumber = phoneNumber_example;  // string | A valid 10-digit Ytel number (E.164 format).

            try
            {
                // Purchase Number
                string result = apiInstance.IncomingphoneBuynumber(phoneNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneBuynumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid 10-digit Ytel number (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphonegetdidscore"></a>
# **IncomingphoneGetdidscore**
> string IncomingphoneGetdidscore (string phonenumber)

Get DID Score

Get DID Score Number

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneGetdidscoreExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phonenumber = phonenumber_example;  // string | Specifies the multiple phone numbers for check updated spamscore .

            try
            {
                // Get DID Score
                string result = apiInstance.IncomingphoneGetdidscore(phonenumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneGetdidscore: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **string**| Specifies the multiple phone numbers for check updated spamscore . | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphonelistnumber"></a>
# **IncomingphoneListnumber**
> string IncomingphoneListnumber (int? page = null, int? pageSize = null, string numberType = null, string friendlyName = null)

List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneListnumberExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var page = 56;  // int? | Which page of the overall response will be returned. Page indexing starts at 1. (optional)  (default to 1)
            var pageSize = 56;  // int? | The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)  (default to 10)
            var numberType = numberType_example;  // string | The capability supported by the number.Number type either SMS,Voice or all (optional) 
            var friendlyName = friendlyName_example;  // string | A human-readable label added to the number object. (optional) 

            try
            {
                // List Numbers
                string result = apiInstance.IncomingphoneListnumber(page, pageSize, numberType, friendlyName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneListnumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| Which page of the overall response will be returned. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **int?**| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 10]
 **numberType** | **string**| The capability supported by the number.Number type either SMS,Voice or all | [optional] 
 **friendlyName** | **string**| A human-readable label added to the number object. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphonemassreleasenumber"></a>
# **IncomingphoneMassreleasenumber**
> string IncomingphoneMassreleasenumber (string phoneNumber)

Bulk Release

Remove a purchased Ytel number from your account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneMassreleasenumberExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phoneNumber = phoneNumber_example;  // string | A valid Ytel comma separated numbers (E.164 format).

            try
            {
                // Bulk Release
                string result = apiInstance.IncomingphoneMassreleasenumber(phoneNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneMassreleasenumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid Ytel comma separated numbers (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphonemassupdatenumber"></a>
# **IncomingphoneMassupdatenumber**
> string IncomingphoneMassupdatenumber (string phoneNumber, string voiceUrl, string friendlyName = null, string voiceMethod = null, string voiceFallbackUrl = null, string voiceFallbackMethod = null, string hangupCallback = null, string hangupCallbackMethod = null, string heartbeatUrl = null, string heartbeatMethod = null, string smsUrl = null, string smsMethod = null, string smsFallbackUrl = null, string smsFallbackMethod = null)

Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneMassupdatenumberExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phoneNumber = phoneNumber_example;  // string | A valid comma(,) separated Ytel numbers. (E.164 format).
            var voiceUrl = voiceUrl_example;  // string | The URL returning InboundXML incoming calls should execute when connected.
            var friendlyName = friendlyName_example;  // string | A human-readable value for labeling the number. (optional) 
            var voiceMethod = voiceMethod_example;  // string | Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional) 
            var voiceFallbackUrl = voiceFallbackUrl_example;  // string | URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional) 
            var voiceFallbackMethod = voiceFallbackMethod_example;  // string | Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional) 
            var hangupCallback = hangupCallback_example;  // string | URL that can be requested to receive notification when and how incoming call has ended. (optional) 
            var hangupCallbackMethod = hangupCallbackMethod_example;  // string | The HTTP method Ytel will use when requesting the HangupCallback URL. (optional) 
            var heartbeatUrl = heartbeatUrl_example;  // string | URL that can be used to monitor the phone number. (optional) 
            var heartbeatMethod = heartbeatMethod_example;  // string | The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional) 
            var smsUrl = smsUrl_example;  // string | URL requested when an SMS is received. (optional) 
            var smsMethod = smsMethod_example;  // string | The HTTP method Ytel will use when requesting the SmsUrl. (optional) 
            var smsFallbackUrl = smsFallbackUrl_example;  // string | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional) 
            var smsFallbackMethod = smsFallbackMethod_example;  // string | The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional) 

            try
            {
                // Bulk Update Numbers
                string result = apiInstance.IncomingphoneMassupdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneMassupdatenumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid comma(,) separated Ytel numbers. (E.164 format). | 
 **voiceUrl** | **string**| The URL returning InboundXML incoming calls should execute when connected. | 
 **friendlyName** | **string**| A human-readable value for labeling the number. | [optional] 
 **voiceMethod** | **string**| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | [optional] 
 **voiceFallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | [optional] 
 **voiceFallbackMethod** | **string**| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | [optional] 
 **hangupCallback** | **string**| URL that can be requested to receive notification when and how incoming call has ended. | [optional] 
 **hangupCallbackMethod** | **string**| The HTTP method Ytel will use when requesting the HangupCallback URL. | [optional] 
 **heartbeatUrl** | **string**| URL that can be used to monitor the phone number. | [optional] 
 **heartbeatMethod** | **string**| The HTTP method Ytel will use when requesting the HeartbeatUrl. | [optional] 
 **smsUrl** | **string**| URL requested when an SMS is received. | [optional] 
 **smsMethod** | **string**| The HTTP method Ytel will use when requesting the SmsUrl. | [optional] 
 **smsFallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **smsFallbackMethod** | **string**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphonereleasenumberbyresponsetypepost"></a>
# **IncomingphoneReleasenumberByResponseTypePost**
> string IncomingphoneReleasenumberByResponseTypePost (string phoneNumber, string responseType)

Release Number

Remove a purchased Ytel number from your account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneReleasenumberByResponseTypePostExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phoneNumber = phoneNumber_example;  // string | A valid 10-digit Ytel number (E.164 format).
            var responseType = responseType_example;  // string | Response type format xml or json

            try
            {
                // Release Number
                string result = apiInstance.IncomingphoneReleasenumberByResponseTypePost(phoneNumber, responseType);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneReleasenumberByResponseTypePost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="incomingphonetransferphonenumbers"></a>
# **IncomingphoneTransferphonenumbers**
> string IncomingphoneTransferphonenumbers (string phonenumber, string fromaccountsid, string toaccountsid)

Move Number

Transfer phone number that has been purchased for from one account to another account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneTransferphonenumbersExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phonenumber = phonenumber_example;  // string | A valid 10-digit Ytel number (E.164 format).
            var fromaccountsid = fromaccountsid_example;  // string | A specific Accountsid from where Number is getting transfer.
            var toaccountsid = toaccountsid_example;  // string | A specific Accountsid to which Number is getting transfer.

            try
            {
                // Move Number
                string result = apiInstance.IncomingphoneTransferphonenumbers(phonenumber, fromaccountsid, toaccountsid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneTransferphonenumbers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="incomingphoneupdatenumber"></a>
# **IncomingphoneUpdatenumber**
> string IncomingphoneUpdatenumber (string phoneNumber, string voiceUrl, string friendlyName = null, string voiceMethod = null, string voiceFallbackUrl = null, string voiceFallbackMethod = null, string hangupCallback = null, string hangupCallbackMethod = null, string heartbeatUrl = null, string heartbeatMethod = null, string smsUrl = null, string smsMethod = null, string smsFallbackUrl = null, string smsFallbackMethod = null)

Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneUpdatenumberExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phoneNumber = phoneNumber_example;  // string | A valid Ytel number (E.164 format).
            var voiceUrl = voiceUrl_example;  // string | URL requested once the call connects
            var friendlyName = friendlyName_example;  // string | Phone number friendly name description (optional) 
            var voiceMethod = voiceMethod_example;  // string | Post or Get (optional) 
            var voiceFallbackUrl = voiceFallbackUrl_example;  // string | URL requested if the voice URL is not available (optional) 
            var voiceFallbackMethod = voiceFallbackMethod_example;  // string | Post or Get (optional) 
            var hangupCallback = hangupCallback_example;  // string | callback url after a hangup occurs (optional) 
            var hangupCallbackMethod = hangupCallbackMethod_example;  // string | Post or Get (optional) 
            var heartbeatUrl = heartbeatUrl_example;  // string | URL requested once the call connects (optional) 
            var heartbeatMethod = heartbeatMethod_example;  // string | URL that can be requested every 60 seconds during the call to notify of elapsed time (optional) 
            var smsUrl = smsUrl_example;  // string | URL requested when an SMS is received (optional) 
            var smsMethod = smsMethod_example;  // string | Post or Get (optional) 
            var smsFallbackUrl = smsFallbackUrl_example;  // string | URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional) 
            var smsFallbackMethod = smsFallbackMethod_example;  // string | The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional) 

            try
            {
                // Update Number
                string result = apiInstance.IncomingphoneUpdatenumber(phoneNumber, voiceUrl, friendlyName, voiceMethod, voiceFallbackUrl, voiceFallbackMethod, hangupCallback, hangupCallbackMethod, heartbeatUrl, heartbeatMethod, smsUrl, smsMethod, smsFallbackUrl, smsFallbackMethod);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneUpdatenumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid Ytel number (E.164 format). | 
 **voiceUrl** | **string**| URL requested once the call connects | 
 **friendlyName** | **string**| Phone number friendly name description | [optional] 
 **voiceMethod** | **string**| Post or Get | [optional] 
 **voiceFallbackUrl** | **string**| URL requested if the voice URL is not available | [optional] 
 **voiceFallbackMethod** | **string**| Post or Get | [optional] 
 **hangupCallback** | **string**| callback url after a hangup occurs | [optional] 
 **hangupCallbackMethod** | **string**| Post or Get | [optional] 
 **heartbeatUrl** | **string**| URL requested once the call connects | [optional] 
 **heartbeatMethod** | **string**| URL that can be requested every 60 seconds during the call to notify of elapsed time | [optional] 
 **smsUrl** | **string**| URL requested when an SMS is received | [optional] 
 **smsMethod** | **string**| Post or Get | [optional] 
 **smsFallbackUrl** | **string**| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **smsFallbackMethod** | **string**| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="incomingphoneviewnumber"></a>
# **IncomingphoneViewnumber**
> string IncomingphoneViewnumber (string phoneNumber)

View Details

Retrieve the details for a phone number by its number.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class IncomingphoneViewnumberExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: auth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new PhoneNumberApi();
            var phoneNumber = phoneNumber_example;  // string | A valid Ytel 10-digit phone number (E.164 format).

            try
            {
                // View Details
                string result = apiInstance.IncomingphoneViewnumber(phoneNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PhoneNumberApi.IncomingphoneViewnumber: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **string**| A valid Ytel 10-digit phone number (E.164 format). | 

### Return type

**string**

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

