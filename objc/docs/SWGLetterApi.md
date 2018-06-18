# SWGLetterApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**letterCreate**](SWGLetterApi.md#lettercreate) | **POST** /letter/create.json | Create Letter
[**letterDelete**](SWGLetterApi.md#letterdelete) | **POST** /letter/delete.json | Delete Letter
[**letterListsletter**](SWGLetterApi.md#letterlistsletter) | **POST** /letter/listsletter.json | List Letters
[**letterViewletter**](SWGLetterApi.md#letterviewletter) | **POST** /letter/viewletter.json | View Letter


# **letterCreate**
```objc
-(NSURLSessionTask*) letterCreateWithTo: (NSString*) to
    from: (NSString*) from
    attachbyid: (NSString*) attachbyid
    file: (NSString*) file
    color: (NSString*) color
    _description: (NSString*) _description
    extraservice: (NSString*) extraservice
    doublesided: (NSString*) doublesided
    template: (NSString*) template
    htmldata: (NSString*) htmldata
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Create Letter

Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* to = @"to_example"; // The AddressId or an object structured when creating an address by addresses/Create.
NSString* from = @"from_example"; // The AddressId or an object structured when creating an address by addresses/Create.
NSString* attachbyid = @"attachbyid_example"; // Set an existing letter by attaching its LetterId.
NSString* file = @"file_example"; // File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file.
NSString* color = @"color_example"; // Specify if letter should be printed in color.
NSString* _description = @"_description_example"; // A description for the letter. (optional)
NSString* extraservice = @"extraservice_example"; // Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
NSString* doublesided = @"doublesided_example"; // Specify if letter should be printed on both sides. (optional)
NSString* template = @"template_example"; // Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
NSString* htmldata = @"htmldata_example"; // A string value that contains HTML markup. (optional)

SWGLetterApi*apiInstance = [[SWGLetterApi alloc] init];

// Create Letter
[apiInstance letterCreateWithTo:to
              from:from
              attachbyid:attachbyid
              file:file
              color:color
              _description:_description
              extraservice:extraservice
              doublesided:doublesided
              template:template
              htmldata:htmldata
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLetterApi->letterCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **to** | **NSString***| The AddressId or an object structured when creating an address by addresses/Create. | 
 **from** | **NSString***| The AddressId or an object structured when creating an address by addresses/Create. | 
 **attachbyid** | **NSString***| Set an existing letter by attaching its LetterId. | 
 **file** | **NSString***| File can be a 8.5\&quot;x11\&quot; PDF uploaded file or URL that links to a file. | 
 **color** | **NSString***| Specify if letter should be printed in color. | 
 **_description** | **NSString***| A description for the letter. | [optional] 
 **extraservice** | **NSString***| Add an extra service to your letter. Options are \&quot;certified\&quot; or \&quot;registered\&quot;. Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. | [optional] 
 **doublesided** | **NSString***| Specify if letter should be printed on both sides. | [optional] 
 **template** | **NSString***| Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. | [optional] 
 **htmldata** | **NSString***| A string value that contains HTML markup. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **letterDelete**
```objc
-(NSURLSessionTask*) letterDeleteWithLettersid: (NSString*) lettersid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Delete Letter

Remove a letter object by its LetterId.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* lettersid = @"lettersid_example"; // The unique identifier for a letter object.

SWGLetterApi*apiInstance = [[SWGLetterApi alloc] init];

// Delete Letter
[apiInstance letterDeleteWithLettersid:lettersid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLetterApi->letterDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **NSString***| The unique identifier for a letter object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **letterListsletter**
```objc
-(NSURLSessionTask*) letterListsletterWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    lettersid: (NSString*) lettersid
    dateCreated: (NSString*) dateCreated
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Letters

Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // The count of objects to return per page. (optional) (default to 10)
NSString* lettersid = @"lettersid_example"; // The unique identifier for a letter object. (optional)
NSString* dateCreated = @"dateCreated_example"; // The date the letter was created. (optional)

SWGLetterApi*apiInstance = [[SWGLetterApi alloc] init];

// List Letters
[apiInstance letterListsletterWithPage:page
              pagesize:pagesize
              lettersid:lettersid
              dateCreated:dateCreated
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLetterApi->letterListsletter: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]
 **lettersid** | **NSString***| The unique identifier for a letter object. | [optional] 
 **dateCreated** | **NSString***| The date the letter was created. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **letterViewletter**
```objc
-(NSURLSessionTask*) letterViewletterWithLettersid: (NSString*) lettersid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Letter

Retrieve a letter object by its LetterSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* lettersid = @"lettersid_example"; // The unique identifier for a letter object.

SWGLetterApi*apiInstance = [[SWGLetterApi alloc] init];

// View Letter
[apiInstance letterViewletterWithLettersid:lettersid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGLetterApi->letterViewletter: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lettersid** | **NSString***| The unique identifier for a letter object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

