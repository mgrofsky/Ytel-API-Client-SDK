# SWGSharedShortCodeApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keywordLists**](SWGSharedShortCodeApi.md#keywordlists) | **POST** /keyword/lists.json | List Keywords
[**keywordView**](SWGSharedShortCodeApi.md#keywordview) | **POST** /keyword/view.json | View Keyword
[**shortcodeGetinboundsms**](SWGSharedShortCodeApi.md#shortcodegetinboundsms) | **POST** /shortcode/getinboundsms.json | List Inbound SMS
[**shortcodeListshortcode**](SWGSharedShortCodeApi.md#shortcodelistshortcode) | **POST** /shortcode/listshortcode.json | List Shortcodes
[**shortcodeSendsms**](SWGSharedShortCodeApi.md#shortcodesendsms) | **POST** /shortcode/sendsms.json | Send SMS
[**shortcodeUpdateshortcode**](SWGSharedShortCodeApi.md#shortcodeupdateshortcode) | **POST** /shortcode/updateshortcode.json | Update Shortcode
[**shortcodeViewshortcode**](SWGSharedShortCodeApi.md#shortcodeviewshortcode) | **POST** /shortcode/viewshortcode.json | View Shortcode
[**templateLists**](SWGSharedShortCodeApi.md#templatelists) | **POST** /template/lists.json | List Templates
[**templateView**](SWGSharedShortCodeApi.md#templateview) | **POST** /template/view.json | View Template


# **keywordLists**
```objc
-(NSURLSessionTask*) keywordListsWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    keyword: (NSString*) keyword
    shortcode: (NSNumber*) shortcode
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Keywords

Retrieve a list of keywords associated with your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // Number of individual resources listed in the response per page (optional) (default to 10)
NSString* keyword = @"keyword_example"; // Only list keywords of keyword (optional)
NSNumber* shortcode = @56; // Only list keywords of shortcode (optional)

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// List Keywords
[apiInstance keywordListsWithPage:page
              pagesize:pagesize
              keyword:keyword
              shortcode:shortcode
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->keywordLists: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| Number of individual resources listed in the response per page | [optional] [default to 10]
 **keyword** | **NSString***| Only list keywords of keyword | [optional] 
 **shortcode** | **NSNumber***| Only list keywords of shortcode | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keywordView**
```objc
-(NSURLSessionTask*) keywordViewWithKeywordid: (NSString*) keywordid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Keyword

View a set of properties for a single keyword.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* keywordid = @"keywordid_example"; // The unique identifier of each keyword

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// View Keyword
[apiInstance keywordViewWithKeywordid:keywordid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->keywordView: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keywordid** | **NSString***| The unique identifier of each keyword | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcodeGetinboundsms**
```objc
-(NSURLSessionTask*) shortcodeGetinboundsmsWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    from: (NSString*) from
    shortcode: (NSString*) shortcode
    datecreated: (NSString*) datecreated
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Inbound SMS

List All Inbound ShortCode

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // Number of individual resources listed in the response per page (optional) (default to 10)
NSString* from = @"from_example"; // From Number to Inbound ShortCode (optional)
NSString* shortcode = @"shortcode_example"; // Only list messages sent to this Short Code (optional)
NSString* datecreated = @"datecreated_example"; // Only list messages sent with the specified date (optional)

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// List Inbound SMS
[apiInstance shortcodeGetinboundsmsWithPage:page
              pagesize:pagesize
              from:from
              shortcode:shortcode
              datecreated:datecreated
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->shortcodeGetinboundsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| Number of individual resources listed in the response per page | [optional] [default to 10]
 **from** | **NSString***| From Number to Inbound ShortCode | [optional] 
 **shortcode** | **NSString***| Only list messages sent to this Short Code | [optional] 
 **datecreated** | **NSString***| Only list messages sent with the specified date | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcodeListshortcode**
```objc
-(NSURLSessionTask*) shortcodeListshortcodeWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    shortcode: (NSString*) shortcode
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Shortcodes

Retrieve a list of shortcode assignment associated with your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // Number of individual resources listed in the response per page (optional) (default to 10)
NSString* shortcode = @"shortcode_example"; // Only list keywords of shortcode (optional)

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// List Shortcodes
[apiInstance shortcodeListshortcodeWithPage:page
              pagesize:pagesize
              shortcode:shortcode
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->shortcodeListshortcode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| Number of individual resources listed in the response per page | [optional] [default to 10]
 **shortcode** | **NSString***| Only list keywords of shortcode | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcodeSendsms**
```objc
-(NSURLSessionTask*) shortcodeSendsmsWithShortcode: (NSString*) shortcode
    to: (NSString*) to
    templateid: (NSString*) templateid
    data: (NSString*) data
    method: (NSString*) method
    messageStatusCallback: (NSString*) messageStatusCallback
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Send SMS

Send an SMS from a Ytel ShortCode

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* shortcode = @"shortcode_example"; // The Short Code number that is the sender of this message
NSString* to = @"to_example"; // A valid 10-digit number that should receive the message
NSString* templateid = @"templateid_example"; // The unique identifier for the template used for the message
NSString* data = @"data_example"; // format of your data, example: {companyname}:test,{otpcode}:1234
NSString* method = @"GET"; // Specifies the HTTP method used to request the required URL once the Short Code message is sent. (optional) (default to GET)
NSString* messageStatusCallback = @"messageStatusCallback_example"; // URL that can be requested to receive notification when Short Code message was sent. (optional)

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// Send SMS
[apiInstance shortcodeSendsmsWithShortcode:shortcode
              to:to
              templateid:templateid
              data:data
              method:method
              messageStatusCallback:messageStatusCallback
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->shortcodeSendsms: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSString***| The Short Code number that is the sender of this message | 
 **to** | **NSString***| A valid 10-digit number that should receive the message | 
 **templateid** | **NSString***| The unique identifier for the template used for the message | 
 **data** | **NSString***| format of your data, example: {companyname}:test,{otpcode}:1234 | 
 **method** | **NSString***| Specifies the HTTP method used to request the required URL once the Short Code message is sent. | [optional] [default to GET]
 **messageStatusCallback** | **NSString***| URL that can be requested to receive notification when Short Code message was sent. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcodeUpdateshortcode**
```objc
-(NSURLSessionTask*) shortcodeUpdateshortcodeWithShortcode: (NSString*) shortcode
    friendlyName: (NSString*) friendlyName
    callbackUrl: (NSString*) callbackUrl
    callbackMethod: (NSString*) callbackMethod
    fallbackUrl: (NSString*) fallbackUrl
    fallbackUrlMethod: (NSString*) fallbackUrlMethod
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Update Shortcode

Update Assignment

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* shortcode = @"shortcode_example"; // List of valid shortcode to your Ytel account
NSString* friendlyName = @"friendlyName_example"; // User generated name of the shortcode (optional)
NSString* callbackUrl = @"callbackUrl_example"; // URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. (optional)
NSString* callbackMethod = @"callbackMethod_example"; // Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. (optional)
NSString* fallbackUrl = @"fallbackUrl_example"; // URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. (optional)
NSString* fallbackUrlMethod = @"fallbackUrlMethod_example"; // Specifies the HTTP method used to request the required FallbackUrl once call connects. (optional)

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// Update Shortcode
[apiInstance shortcodeUpdateshortcodeWithShortcode:shortcode
              friendlyName:friendlyName
              callbackUrl:callbackUrl
              callbackMethod:callbackMethod
              fallbackUrl:fallbackUrl
              fallbackUrlMethod:fallbackUrlMethod
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->shortcodeUpdateshortcode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSString***| List of valid shortcode to your Ytel account | 
 **friendlyName** | **NSString***| User generated name of the shortcode | [optional] 
 **callbackUrl** | **NSString***| URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished. | [optional] 
 **callbackMethod** | **NSString***| Specifies the HTTP method used to request the required StatusCallBackUrl once call connects. | [optional] 
 **fallbackUrl** | **NSString***| URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST. | [optional] 
 **fallbackUrlMethod** | **NSString***| Specifies the HTTP method used to request the required FallbackUrl once call connects. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **shortcodeViewshortcode**
```objc
-(NSURLSessionTask*) shortcodeViewshortcodeWithShortcode: (NSString*) shortcode
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Shortcode

The response returned here contains all resource properties associated with the given Shortcode.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* shortcode = @"shortcode_example"; // List of valid Shortcode to your Ytel account

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// View Shortcode
[apiInstance shortcodeViewshortcodeWithShortcode:shortcode
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->shortcodeViewshortcode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortcode** | **NSString***| List of valid Shortcode to your Ytel account | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **templateLists**
```objc
-(NSURLSessionTask*) templateListsWithType: (NSString*) type
    page: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    shortcode: (NSString*) shortcode
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Templates

List Shortcode Templates by Type

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* type = @"authorization"; // The type (category) of template Valid values: marketing, authorization (optional) (default to authorization)
NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // The count of objects to return per page. (optional) (default to 10)
NSString* shortcode = @"shortcode_example"; // Only list templates of type (optional)

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// List Templates
[apiInstance templateListsWithType:type
              page:page
              pagesize:pagesize
              shortcode:shortcode
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->templateLists: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **NSString***| The type (category) of template Valid values: marketing, authorization | [optional] [default to authorization]
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]
 **shortcode** | **NSString***| Only list templates of type | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **templateView**
```objc
-(NSURLSessionTask*) templateViewWithTemplateId: (NSString*) templateId
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Template

View a Shared ShortCode Template

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* templateId = @"templateId_example"; // The unique identifier for a template object

SWGSharedShortCodeApi*apiInstance = [[SWGSharedShortCodeApi alloc] init];

// View Template
[apiInstance templateViewWithTemplateId:templateId
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGSharedShortCodeApi->templateView: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **NSString***| The unique identifier for a template object | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

