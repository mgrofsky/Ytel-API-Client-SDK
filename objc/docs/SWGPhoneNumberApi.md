# SWGPhoneNumberApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**incomingphoneAvailablenumber**](SWGPhoneNumberApi.md#incomingphoneavailablenumber) | **POST** /incomingphone/availablenumber.json | Available Numbers
[**incomingphoneBulkbuy**](SWGPhoneNumberApi.md#incomingphonebulkbuy) | **POST** /incomingphone/bulkbuy.json | Bulk Buy Numbers
[**incomingphoneBuynumber**](SWGPhoneNumberApi.md#incomingphonebuynumber) | **POST** /incomingphone/buynumber.json | Purchase Number
[**incomingphoneGetdidscore**](SWGPhoneNumberApi.md#incomingphonegetdidscore) | **POST** /incomingphone/getdidscore.json | Get DID Score
[**incomingphoneListnumber**](SWGPhoneNumberApi.md#incomingphonelistnumber) | **POST** /incomingphone/listnumber.json | List Numbers
[**incomingphoneMassreleasenumber**](SWGPhoneNumberApi.md#incomingphonemassreleasenumber) | **POST** /incomingphone/massreleasenumber.json | Bulk Release
[**incomingphoneMassupdatenumber**](SWGPhoneNumberApi.md#incomingphonemassupdatenumber) | **POST** /incomingphone/massupdatenumber.json | Bulk Update Numbers
[**incomingphoneReleasenumberByResponseTypePost**](SWGPhoneNumberApi.md#incomingphonereleasenumberbyresponsetypepost) | **POST** /incomingphone/releasenumber.json | Release Number
[**incomingphoneTransferphonenumbers**](SWGPhoneNumberApi.md#incomingphonetransferphonenumbers) | **POST** /incomingphone/transferphonenumbers.json | Move Number
[**incomingphoneUpdatenumber**](SWGPhoneNumberApi.md#incomingphoneupdatenumber) | **POST** /incomingphone/updatenumber.json | Update Number
[**incomingphoneViewnumber**](SWGPhoneNumberApi.md#incomingphoneviewnumber) | **POST** /incomingphone/viewnumber.json | View Details


# **incomingphoneAvailablenumber**
```objc
-(NSURLSessionTask*) incomingphoneAvailablenumberWithNumbertype: (NSString*) numbertype
    areacode: (NSString*) areacode
    pagesize: (NSNumber*) pagesize
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Available Numbers

Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* numbertype = @"numbertype_example"; // Number type either SMS,Voice or all
NSString* areacode = @"areacode_example"; // Specifies the area code for the returned list of available numbers. Only available for North American numbers.
NSNumber* pagesize = @10; // The count of objects to return. (optional) (default to 10)

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Available Numbers
[apiInstance incomingphoneAvailablenumberWithNumbertype:numbertype
              areacode:areacode
              pagesize:pagesize
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneAvailablenumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numbertype** | **NSString***| Number type either SMS,Voice or all | 
 **areacode** | **NSString***| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **pagesize** | **NSNumber***| The count of objects to return. | [optional] [default to 10]

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneBulkbuy**
```objc
-(NSURLSessionTask*) incomingphoneBulkbuyWithNumberType: (NSString*) numberType
    areaCode: (NSString*) areaCode
    quantity: (NSString*) quantity
    leftover: (NSString*) leftover
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Bulk Buy Numbers

Purchase a selected number of DID's from specific area codes to be used with your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* numberType = @"numberType_example"; // The capability the number supports.
NSString* areaCode = @"areaCode_example"; // Specifies the area code for the returned list of available numbers. Only available for North American numbers.
NSString* quantity = @"quantity_example"; // A positive integer that tells how many number you want to buy at a time.
NSString* leftover = @"leftover_example"; // If desired quantity is unavailable purchase what is available . (optional)

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Bulk Buy Numbers
[apiInstance incomingphoneBulkbuyWithNumberType:numberType
              areaCode:areaCode
              quantity:quantity
              leftover:leftover
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneBulkbuy: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberType** | **NSString***| The capability the number supports. | 
 **areaCode** | **NSString***| Specifies the area code for the returned list of available numbers. Only available for North American numbers. | 
 **quantity** | **NSString***| A positive integer that tells how many number you want to buy at a time. | 
 **leftover** | **NSString***| If desired quantity is unavailable purchase what is available . | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneBuynumber**
```objc
-(NSURLSessionTask*) incomingphoneBuynumberWithPhoneNumber: (NSString*) phoneNumber
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Purchase Number

Purchase a phone number to be used with your Ytel account

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phoneNumber = @"phoneNumber_example"; // A valid 10-digit Ytel number (E.164 format).

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Purchase Number
[apiInstance incomingphoneBuynumberWithPhoneNumber:phoneNumber
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneBuynumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **NSString***| A valid 10-digit Ytel number (E.164 format). | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneGetdidscore**
```objc
-(NSURLSessionTask*) incomingphoneGetdidscoreWithPhonenumber: (NSString*) phonenumber
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Get DID Score

Get DID Score Number

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phonenumber = @"phonenumber_example"; // Specifies the multiple phone numbers for check updated spamscore .

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Get DID Score
[apiInstance incomingphoneGetdidscoreWithPhonenumber:phonenumber
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneGetdidscore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **NSString***| Specifies the multiple phone numbers for check updated spamscore . | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneListnumber**
```objc
-(NSURLSessionTask*) incomingphoneListnumberWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    numberType: (NSString*) numberType
    friendlyName: (NSString*) friendlyName
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Numbers

Retrieve a list of purchased phones numbers associated with your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // Which page of the overall response will be returned. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pageSize = @10; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 10)
NSString* numberType = @"numberType_example"; // The capability supported by the number.Number type either SMS,Voice or all (optional)
NSString* friendlyName = @"friendlyName_example"; // A human-readable label added to the number object. (optional)

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// List Numbers
[apiInstance incomingphoneListnumberWithPage:page
              pageSize:pageSize
              numberType:numberType
              friendlyName:friendlyName
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneListnumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| Which page of the overall response will be returned. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 10]
 **numberType** | **NSString***| The capability supported by the number.Number type either SMS,Voice or all | [optional] 
 **friendlyName** | **NSString***| A human-readable label added to the number object. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneMassreleasenumber**
```objc
-(NSURLSessionTask*) incomingphoneMassreleasenumberWithPhoneNumber: (NSString*) phoneNumber
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Bulk Release

Remove a purchased Ytel number from your account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phoneNumber = @"phoneNumber_example"; // A valid Ytel comma separated numbers (E.164 format).

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Bulk Release
[apiInstance incomingphoneMassreleasenumberWithPhoneNumber:phoneNumber
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneMassreleasenumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **NSString***| A valid Ytel comma separated numbers (E.164 format). | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneMassupdatenumber**
```objc
-(NSURLSessionTask*) incomingphoneMassupdatenumberWithPhoneNumber: (NSString*) phoneNumber
    voiceUrl: (NSString*) voiceUrl
    friendlyName: (NSString*) friendlyName
    voiceMethod: (NSString*) voiceMethod
    voiceFallbackUrl: (NSString*) voiceFallbackUrl
    voiceFallbackMethod: (NSString*) voiceFallbackMethod
    hangupCallback: (NSString*) hangupCallback
    hangupCallbackMethod: (NSString*) hangupCallbackMethod
    heartbeatUrl: (NSString*) heartbeatUrl
    heartbeatMethod: (NSString*) heartbeatMethod
    smsUrl: (NSString*) smsUrl
    smsMethod: (NSString*) smsMethod
    smsFallbackUrl: (NSString*) smsFallbackUrl
    smsFallbackMethod: (NSString*) smsFallbackMethod
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Bulk Update Numbers

Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phoneNumber = @"phoneNumber_example"; // A valid comma(,) separated Ytel numbers. (E.164 format).
NSString* voiceUrl = @"voiceUrl_example"; // The URL returning InboundXML incoming calls should execute when connected.
NSString* friendlyName = @"friendlyName_example"; // A human-readable value for labeling the number. (optional)
NSString* voiceMethod = @"voiceMethod_example"; // Specifies the HTTP method used to request the VoiceUrl once incoming call connects. (optional)
NSString* voiceFallbackUrl = @"voiceFallbackUrl_example"; // URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url (optional)
NSString* voiceFallbackMethod = @"voiceFallbackMethod_example"; // Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. (optional)
NSString* hangupCallback = @"hangupCallback_example"; // URL that can be requested to receive notification when and how incoming call has ended. (optional)
NSString* hangupCallbackMethod = @"hangupCallbackMethod_example"; // The HTTP method Ytel will use when requesting the HangupCallback URL. (optional)
NSString* heartbeatUrl = @"heartbeatUrl_example"; // URL that can be used to monitor the phone number. (optional)
NSString* heartbeatMethod = @"heartbeatMethod_example"; // The HTTP method Ytel will use when requesting the HeartbeatUrl. (optional)
NSString* smsUrl = @"smsUrl_example"; // URL requested when an SMS is received. (optional)
NSString* smsMethod = @"smsMethod_example"; // The HTTP method Ytel will use when requesting the SmsUrl. (optional)
NSString* smsFallbackUrl = @"smsFallbackUrl_example"; // URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
NSString* smsFallbackMethod = @"smsFallbackMethod_example"; // The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Bulk Update Numbers
[apiInstance incomingphoneMassupdatenumberWithPhoneNumber:phoneNumber
              voiceUrl:voiceUrl
              friendlyName:friendlyName
              voiceMethod:voiceMethod
              voiceFallbackUrl:voiceFallbackUrl
              voiceFallbackMethod:voiceFallbackMethod
              hangupCallback:hangupCallback
              hangupCallbackMethod:hangupCallbackMethod
              heartbeatUrl:heartbeatUrl
              heartbeatMethod:heartbeatMethod
              smsUrl:smsUrl
              smsMethod:smsMethod
              smsFallbackUrl:smsFallbackUrl
              smsFallbackMethod:smsFallbackMethod
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneMassupdatenumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **NSString***| A valid comma(,) separated Ytel numbers. (E.164 format). | 
 **voiceUrl** | **NSString***| The URL returning InboundXML incoming calls should execute when connected. | 
 **friendlyName** | **NSString***| A human-readable value for labeling the number. | [optional] 
 **voiceMethod** | **NSString***| Specifies the HTTP method used to request the VoiceUrl once incoming call connects. | [optional] 
 **voiceFallbackUrl** | **NSString***| URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url | [optional] 
 **voiceFallbackMethod** | **NSString***| Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects. | [optional] 
 **hangupCallback** | **NSString***| URL that can be requested to receive notification when and how incoming call has ended. | [optional] 
 **hangupCallbackMethod** | **NSString***| The HTTP method Ytel will use when requesting the HangupCallback URL. | [optional] 
 **heartbeatUrl** | **NSString***| URL that can be used to monitor the phone number. | [optional] 
 **heartbeatMethod** | **NSString***| The HTTP method Ytel will use when requesting the HeartbeatUrl. | [optional] 
 **smsUrl** | **NSString***| URL requested when an SMS is received. | [optional] 
 **smsMethod** | **NSString***| The HTTP method Ytel will use when requesting the SmsUrl. | [optional] 
 **smsFallbackUrl** | **NSString***| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **smsFallbackMethod** | **NSString***| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneReleasenumberByResponseTypePost**
```objc
-(NSURLSessionTask*) incomingphoneReleasenumberByResponseTypePostWithPhoneNumber: (NSString*) phoneNumber
    responseType: (NSString*) responseType
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Release Number

Remove a purchased Ytel number from your account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phoneNumber = @"phoneNumber_example"; // A valid 10-digit Ytel number (E.164 format).
NSString* responseType = @"responseType_example"; // Response type format xml or json

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Release Number
[apiInstance incomingphoneReleasenumberByResponseTypePostWithPhoneNumber:phoneNumber
              responseType:responseType
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneReleasenumberByResponseTypePost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **NSString***| A valid 10-digit Ytel number (E.164 format). | 
 **responseType** | **NSString***| Response type format xml or json | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneTransferphonenumbers**
```objc
-(NSURLSessionTask*) incomingphoneTransferphonenumbersWithPhonenumber: (NSString*) phonenumber
    fromaccountsid: (NSString*) fromaccountsid
    toaccountsid: (NSString*) toaccountsid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Move Number

Transfer phone number that has been purchased for from one account to another account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phonenumber = @"phonenumber_example"; // A valid 10-digit Ytel number (E.164 format).
NSString* fromaccountsid = @"fromaccountsid_example"; // A specific Accountsid from where Number is getting transfer.
NSString* toaccountsid = @"toaccountsid_example"; // A specific Accountsid to which Number is getting transfer.

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Move Number
[apiInstance incomingphoneTransferphonenumbersWithPhonenumber:phonenumber
              fromaccountsid:fromaccountsid
              toaccountsid:toaccountsid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneTransferphonenumbers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phonenumber** | **NSString***| A valid 10-digit Ytel number (E.164 format). | 
 **fromaccountsid** | **NSString***| A specific Accountsid from where Number is getting transfer. | 
 **toaccountsid** | **NSString***| A specific Accountsid to which Number is getting transfer. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneUpdatenumber**
```objc
-(NSURLSessionTask*) incomingphoneUpdatenumberWithPhoneNumber: (NSString*) phoneNumber
    voiceUrl: (NSString*) voiceUrl
    friendlyName: (NSString*) friendlyName
    voiceMethod: (NSString*) voiceMethod
    voiceFallbackUrl: (NSString*) voiceFallbackUrl
    voiceFallbackMethod: (NSString*) voiceFallbackMethod
    hangupCallback: (NSString*) hangupCallback
    hangupCallbackMethod: (NSString*) hangupCallbackMethod
    heartbeatUrl: (NSString*) heartbeatUrl
    heartbeatMethod: (NSString*) heartbeatMethod
    smsUrl: (NSString*) smsUrl
    smsMethod: (NSString*) smsMethod
    smsFallbackUrl: (NSString*) smsFallbackUrl
    smsFallbackMethod: (NSString*) smsFallbackMethod
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Update Number

Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phoneNumber = @"phoneNumber_example"; // A valid Ytel number (E.164 format).
NSString* voiceUrl = @"voiceUrl_example"; // URL requested once the call connects
NSString* friendlyName = @"friendlyName_example"; // Phone number friendly name description (optional)
NSString* voiceMethod = @"voiceMethod_example"; // Post or Get (optional)
NSString* voiceFallbackUrl = @"voiceFallbackUrl_example"; // URL requested if the voice URL is not available (optional)
NSString* voiceFallbackMethod = @"voiceFallbackMethod_example"; // Post or Get (optional)
NSString* hangupCallback = @"hangupCallback_example"; // callback url after a hangup occurs (optional)
NSString* hangupCallbackMethod = @"hangupCallbackMethod_example"; // Post or Get (optional)
NSString* heartbeatUrl = @"heartbeatUrl_example"; // URL requested once the call connects (optional)
NSString* heartbeatMethod = @"heartbeatMethod_example"; // URL that can be requested every 60 seconds during the call to notify of elapsed time (optional)
NSString* smsUrl = @"smsUrl_example"; // URL requested when an SMS is received (optional)
NSString* smsMethod = @"smsMethod_example"; // Post or Get (optional)
NSString* smsFallbackUrl = @"smsFallbackUrl_example"; // URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. (optional)
NSString* smsFallbackMethod = @"smsFallbackMethod_example"; // The HTTP method Ytel will use when URL requested if the SmsUrl is not available. (optional)

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// Update Number
[apiInstance incomingphoneUpdatenumberWithPhoneNumber:phoneNumber
              voiceUrl:voiceUrl
              friendlyName:friendlyName
              voiceMethod:voiceMethod
              voiceFallbackUrl:voiceFallbackUrl
              voiceFallbackMethod:voiceFallbackMethod
              hangupCallback:hangupCallback
              hangupCallbackMethod:hangupCallbackMethod
              heartbeatUrl:heartbeatUrl
              heartbeatMethod:heartbeatMethod
              smsUrl:smsUrl
              smsMethod:smsMethod
              smsFallbackUrl:smsFallbackUrl
              smsFallbackMethod:smsFallbackMethod
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneUpdatenumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **NSString***| A valid Ytel number (E.164 format). | 
 **voiceUrl** | **NSString***| URL requested once the call connects | 
 **friendlyName** | **NSString***| Phone number friendly name description | [optional] 
 **voiceMethod** | **NSString***| Post or Get | [optional] 
 **voiceFallbackUrl** | **NSString***| URL requested if the voice URL is not available | [optional] 
 **voiceFallbackMethod** | **NSString***| Post or Get | [optional] 
 **hangupCallback** | **NSString***| callback url after a hangup occurs | [optional] 
 **hangupCallbackMethod** | **NSString***| Post or Get | [optional] 
 **heartbeatUrl** | **NSString***| URL requested once the call connects | [optional] 
 **heartbeatMethod** | **NSString***| URL that can be requested every 60 seconds during the call to notify of elapsed time | [optional] 
 **smsUrl** | **NSString***| URL requested when an SMS is received | [optional] 
 **smsMethod** | **NSString***| Post or Get | [optional] 
 **smsFallbackUrl** | **NSString***| URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl. | [optional] 
 **smsFallbackMethod** | **NSString***| The HTTP method Ytel will use when URL requested if the SmsUrl is not available. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **incomingphoneViewnumber**
```objc
-(NSURLSessionTask*) incomingphoneViewnumberWithPhoneNumber: (NSString*) phoneNumber
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Details

Retrieve the details for a phone number by its number.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phoneNumber = @"phoneNumber_example"; // A valid Ytel 10-digit phone number (E.164 format).

SWGPhoneNumberApi*apiInstance = [[SWGPhoneNumberApi alloc] init];

// View Details
[apiInstance incomingphoneViewnumberWithPhoneNumber:phoneNumber
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGPhoneNumberApi->incomingphoneViewnumber: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **NSString***| A valid Ytel 10-digit phone number (E.164 format). | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

