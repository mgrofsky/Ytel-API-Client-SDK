# SWGShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dedicatedshortcodeGetinboundsms**](SWGShortCodeApi.md#dedicatedshortcodegetinboundsms) | **POST** /dedicatedshortcode/getinboundsms.json | List Inbound SMS
[**dedicatedshortcodeListshortcode**](SWGShortCodeApi.md#dedicatedshortcodelistshortcode) | **POST** /dedicatedshortcode/listshortcode.json | List Shortcodes
[**dedicatedshortcodeSendsms**](SWGShortCodeApi.md#dedicatedshortcodesendsms) | **POST** /dedicatedshortcode/sendsms.json | Send SMS
[**dedicatedshortcodeUpdateshortcode**](SWGShortCodeApi.md#dedicatedshortcodeupdateshortcode) | **POST** /dedicatedshortcode/updateshortcode.json | Update Shortcode
[**dedicatedshortcodeViewshortcode**](SWGShortCodeApi.md#dedicatedshortcodeviewshortcode) | **POST** /dedicatedshortcode/viewshortcode.json | View SMS
[**shortcodeListsms**](SWGShortCodeApi.md#shortcodelistsms) | **POST** /shortcode/listsms.json | List SMS
[**shortcodeViewsms**](SWGShortCodeApi.md#shortcodeviewsms) | **POST** /shortcode/viewsms.json | View SMS


# **dedicatedshortcodeGetinboundsms**
```objc
-(NSURLSessionTask*) dedicatedshortcodeGetinboundsmsWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    from: (NSString*) from
    shortcode: (NSString*) shortcode
    datecreated: (NSString*) datecreated
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Inbound SMS

Retrive a list of inbound Sms Short Code messages associated with your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // Number of individual resources listed in the response per page (optional) (default to 10)
NSString* from = @"from_example"; // Only list SMS messages sent from this number (optional)
NSString* shortcode = @"shortcode_example"; // Only list SMS messages sent to Shortcode (optional)
NSString* datecreated = @"datecreated_example"; // Only list SMS messages sent in the specified date MAKE REQUEST (optional)

SWGShortCodeApi*apiInstance = [[SWGShortCodeApi alloc] init];

// List Inbound SMS
[apiInstance dedicatedshortcodeGetinboundsmsWithPage:page
              pagesize:pagesize
              from:from
              shortcode:shortcode
              datecreated:datecreated
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGShortCodeApi->dedicatedshortcodeGetinboundsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **NSString***| Only list SMS messages sent from this number | [optional] 
 **shortcode** | **NSString***| Only list SMS messages sent to Shortcode | [optional] 
 **datecreated** | **NSString***| Only list SMS messages sent in the specified date MAKE REQUEST | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcodeListshortcode**
```objc
-(NSURLSessionTask*) dedicatedshortcodeListshortcodeWithShortcode: (NSString*) shortcode
    page: (NSString*) page
    pagesize: (NSString*) pagesize
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Shortcodes

Retrieve a list of Short Code assignment associated with your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* shortcode = @"shortcode_example"; // Only list Short Code Assignment sent from this Short Code (optional)
NSString* page = @"page_example"; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional)
NSString* pagesize = @"pagesize_example"; // The count of objects to return per page. (optional)

SWGShortCodeApi*apiInstance = [[SWGShortCodeApi alloc] init];

// List Shortcodes
[apiInstance dedicatedshortcodeListshortcodeWithShortcode:shortcode
              page:page
              pagesize:pagesize
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGShortCodeApi->dedicatedshortcodeListshortcode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSString***| Only list Short Code Assignment sent from this Short Code | [optional] 
 **page** | **NSString***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] 
 **pagesize** | **NSString***| The count of objects to return per page. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcodeSendsms**
```objc
-(NSURLSessionTask*) dedicatedshortcodeSendsmsWithShortcode: (NSNumber*) shortcode
    to: (NSNumber*) to
    body: (NSString*) body
    method: (NSString*) method
    messagestatuscallback: (NSString*) messagestatuscallback
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Send SMS

Send Dedicated Shortcode

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* shortcode = @56; // Your dedicated shortcode
NSNumber* to = @1.2; // The number to send your SMS to
NSString* body = @"body_example"; // The body of your message
NSString* method = @"method_example"; // Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST (optional)
NSString* messagestatuscallback = @"messagestatuscallback_example"; // URL that can be requested to receive notification when Short Code message was sent. (optional)

SWGShortCodeApi*apiInstance = [[SWGShortCodeApi alloc] init];

// Send SMS
[apiInstance dedicatedshortcodeSendsmsWithShortcode:shortcode
              to:to
              body:body
              method:method
              messagestatuscallback:messagestatuscallback
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGShortCodeApi->dedicatedshortcodeSendsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSNumber***| Your dedicated shortcode | 
 **to** | **NSNumber***| The number to send your SMS to | 
 **body** | **NSString***| The body of your message | 
 **method** | **NSString***| Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST | [optional] 
 **messagestatuscallback** | **NSString***| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcodeUpdateshortcode**
```objc
-(NSURLSessionTask*) dedicatedshortcodeUpdateshortcodeWithShortcode: (NSString*) shortcode
    friendlyName: (NSString*) friendlyName
    callbackMethod: (NSString*) callbackMethod
    callbackUrl: (NSString*) callbackUrl
    fallbackMethod: (NSString*) fallbackMethod
    fallbackUrl: (NSString*) fallbackUrl
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Update Shortcode

Update a dedicated shortcode.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* shortcode = @"shortcode_example"; // List of valid dedicated shortcode to your Ytel account.
NSString* friendlyName = @"friendlyName_example"; // User generated name of the dedicated shortcode. (optional)
NSString* callbackMethod = @"callbackMethod_example"; // Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
NSString* callbackUrl = @"callbackUrl_example"; // URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
NSString* fallbackMethod = @"fallbackMethod_example"; // Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)
NSString* fallbackUrl = @"fallbackUrl_example"; // URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)

SWGShortCodeApi*apiInstance = [[SWGShortCodeApi alloc] init];

// Update Shortcode
[apiInstance dedicatedshortcodeUpdateshortcodeWithShortcode:shortcode
              friendlyName:friendlyName
              callbackMethod:callbackMethod
              callbackUrl:callbackUrl
              fallbackMethod:fallbackMethod
              fallbackUrl:fallbackUrl
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGShortCodeApi->dedicatedshortcodeUpdateshortcode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSString***| List of valid dedicated shortcode to your Ytel account. | 
 **friendlyName** | **NSString***| User generated name of the dedicated shortcode. | [optional] 
 **callbackMethod** | **NSString***| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **callbackUrl** | **NSString***| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **fallbackMethod** | **NSString***| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 
 **fallbackUrl** | **NSString***| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **dedicatedshortcodeViewshortcode**
```objc
-(NSURLSessionTask*) dedicatedshortcodeViewshortcodeWithShortcode: (NSString*) shortcode
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View SMS

Retrieve a single Short Code object by its shortcode assignment.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* shortcode = @"shortcode_example"; // List of valid Dedicated Short Code to your Ytel account

SWGShortCodeApi*apiInstance = [[SWGShortCodeApi alloc] init];

// View SMS
[apiInstance dedicatedshortcodeViewshortcodeWithShortcode:shortcode
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGShortCodeApi->dedicatedshortcodeViewshortcode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSString***| List of valid Dedicated Short Code to your Ytel account | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcodeListsms**
```objc
-(NSURLSessionTask*) shortcodeListsmsWithShortcode: (NSString*) shortcode
    to: (NSString*) to
    dateSent: (NSString*) dateSent
    page: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List SMS

Retrieve a list of Short Code messages.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* shortcode = @"shortcode_example"; // Only list messages sent from this Short Code (optional)
NSString* to = @"to_example"; // Only list messages sent to this number (optional)
NSString* dateSent = @"dateSent_example"; // Only list messages sent with the specified date (optional)
NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pageSize = @10; // The count of objects to return per page. (optional) (default to 10)

SWGShortCodeApi*apiInstance = [[SWGShortCodeApi alloc] init];

// List SMS
[apiInstance shortcodeListsmsWithShortcode:shortcode
              to:to
              dateSent:dateSent
              page:page
              pageSize:pageSize
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGShortCodeApi->shortcodeListsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSString***| Only list messages sent from this Short Code | [optional] 
 **to** | **NSString***| Only list messages sent to this number | [optional] 
 **dateSent** | **NSString***| Only list messages sent with the specified date | [optional] 
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pageSize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcodeViewsms**
```objc
-(NSURLSessionTask*) shortcodeViewsmsWithMessageSid: (NSString*) messageSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View SMS

View a single Sms Short Code message.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* messageSid = @"messageSid_example"; // The unique identifier for the sms resource

SWGShortCodeApi*apiInstance = [[SWGShortCodeApi alloc] init];

// View SMS
[apiInstance shortcodeViewsmsWithMessageSid:messageSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGShortCodeApi->shortcodeViewsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageSid** | **NSString***| The unique identifier for the sms resource | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

