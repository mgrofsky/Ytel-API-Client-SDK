# SWGSMSApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smsGetinboundsms**](SWGSMSApi.md#smsgetinboundsms) | **POST** /sms/getinboundsms.json | List Inbound SMS
[**smsListsms**](SWGSMSApi.md#smslistsms) | **POST** /sms/listsms.json | List SMS
[**smsSendsms**](SWGSMSApi.md#smssendsms) | **POST** /sms/sendsms.json | Send SMS
[**smsViewdetailsms**](SWGSMSApi.md#smsviewdetailsms) | **POST** /sms/viewdetailsms.json | View SMS
[**smsViewsms**](SWGSMSApi.md#smsviewsms) | **POST** /sms/viewsms.json | View SMS


# **smsGetinboundsms**
```objc
-(NSURLSessionTask*) smsGetinboundsmsWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    from: (NSString*) from
    to: (NSString*) to
    dateSent: (NSString*) dateSent
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Inbound SMS

Retrieve a list of Inbound SMS message objects.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pageSize = @10; // The count of objects to return per page. (optional) (default to 10)
NSString* from = @"from_example"; // Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
NSString* to = @"to_example"; // Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
NSString* dateSent = @"dateSent_example"; // Filter sms message objects by this date. (optional)

SWGSMSApi*apiInstance = [[SWGSMSApi alloc] init];

// List Inbound SMS
[apiInstance smsGetinboundsmsWithPage:page
              pageSize:pageSize
              from:from
              to:to
              dateSent:dateSent
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSMSApi->smsGetinboundsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]
 **from** | **NSString***| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **NSString***| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **dateSent** | **NSString***| Filter sms message objects by this date. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smsListsms**
```objc
-(NSURLSessionTask*) smsListsmsWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    from: (NSString*) from
    to: (NSString*) to
    dateSent: (NSString*) dateSent
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List SMS

Retrieve a list of Outbound SMS message objects.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pageSize = @10; // Number of individual resources listed in the response per page (optional) (default to 10)
NSString* from = @"from_example"; // Filter SMS message objects from this valid 10-digit phone number (E.164 format). (optional)
NSString* to = @"to_example"; // Filter SMS message objects to this valid 10-digit phone number (E.164 format). (optional)
NSString* dateSent = @"dateSent_example"; // Only list SMS messages sent in the specified date range (optional)

SWGSMSApi*apiInstance = [[SWGSMSApi alloc] init];

// List SMS
[apiInstance smsListsmsWithPage:page
              pageSize:pageSize
              from:from
              to:to
              dateSent:dateSent
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSMSApi->smsListsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **NSNumber***| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **NSString***| Filter SMS message objects from this valid 10-digit phone number (E.164 format). | [optional] 
 **to** | **NSString***| Filter SMS message objects to this valid 10-digit phone number (E.164 format). | [optional] 
 **dateSent** | **NSString***| Only list SMS messages sent in the specified date range | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smsSendsms**
```objc
-(NSURLSessionTask*) smsSendsmsWithFrom: (NSString*) from
    to: (NSString*) to
    body: (NSString*) body
    method: (NSString*) method
    messageStatusCallback: (NSString*) messageStatusCallback
    smartsms: (NSNumber*) smartsms
    deliveryStatus: (NSNumber*) deliveryStatus
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Send SMS

Send an SMS from a Ytel number

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* from = @"from_example"; // The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent.
NSString* to = @"to_example"; // The 10-digit phone number (E.164 format) that will receive the message.
NSString* body = @"body_example"; // The body message that is to be sent in the text.
NSString* method = @"method_example"; // Specifies the HTTP method used to request the required URL once SMS sent. (optional)
NSString* messageStatusCallback = @"messageStatusCallback_example"; // URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. (optional)
NSNumber* smartsms = @false; // Check's 'to' number can receive sms or not using Carrier API, if wireless = true then text sms is sent, else wireless = false then call is recieved to end user with audible message. (optional) (default to false)
NSNumber* deliveryStatus = @false; // Delivery reports are a method to tell your system if the message has arrived on the destination phone. (optional) (default to false)

SWGSMSApi*apiInstance = [[SWGSMSApi alloc] init];

// Send SMS
[apiInstance smsSendsmsWithFrom:from
              to:to
              body:body
              method:method
              messageStatusCallback:messageStatusCallback
              smartsms:smartsms
              deliveryStatus:deliveryStatus
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSMSApi->smsSendsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **NSString***| The 10-digit SMS-enabled Ytel number (E.164 format) in which the message is sent. | 
 **to** | **NSString***| The 10-digit phone number (E.164 format) that will receive the message. | 
 **body** | **NSString***| The body message that is to be sent in the text. | 
 **method** | **NSString***| Specifies the HTTP method used to request the required URL once SMS sent. | [optional] 
 **messageStatusCallback** | **NSString***| URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. | [optional] 
 **smartsms** | **NSNumber***| Check&#39;s &#39;to&#39; number can receive sms or not using Carrier API, if wireless &#x3D; true then text sms is sent, else wireless &#x3D; false then call is recieved to end user with audible message. | [optional] [default to false]
 **deliveryStatus** | **NSNumber***| Delivery reports are a method to tell your system if the message has arrived on the destination phone. | [optional] [default to false]

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smsViewdetailsms**
```objc
-(NSURLSessionTask*) smsViewdetailsmsWithMessageSid: (NSString*) messageSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View SMS

Retrieve a single SMS message object with details by its SmsSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* messageSid = @"messageSid_example"; // The unique identifier for a sms message.

SWGSMSApi*apiInstance = [[SWGSMSApi alloc] init];

// View SMS
[apiInstance smsViewdetailsmsWithMessageSid:messageSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSMSApi->smsViewdetailsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **NSString***| The unique identifier for a sms message. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **smsViewsms**
```objc
-(NSURLSessionTask*) smsViewsmsWithMessageSid: (NSString*) messageSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View SMS

Retrieve a single SMS message object by its SmsSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* messageSid = @"messageSid_example"; // The unique identifier for a sms message.

SWGSMSApi*apiInstance = [[SWGSMSApi alloc] init];

// View SMS
[apiInstance smsViewsmsWithMessageSid:messageSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSMSApi->smsViewsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **NSString***| The unique identifier for a sms message. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

