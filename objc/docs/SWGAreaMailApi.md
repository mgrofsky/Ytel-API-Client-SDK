# SWGAreaMailApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**areamailCreate**](SWGAreaMailApi.md#areamailcreate) | **POST** /areamail/create.json | Create AreaMail
[**areamailDelete**](SWGAreaMailApi.md#areamaildelete) | **POST** /areamail/delete.json | Delete AreaMail
[**areamailLists**](SWGAreaMailApi.md#areamaillists) | **POST** /areamail/lists.json | List AreaMails
[**areamailView**](SWGAreaMailApi.md#areamailview) | **POST** /areamail/view.json | View AreaMail


# **areamailCreate**
```objc
-(NSURLSessionTask*) areamailCreateWithRoutes: (NSString*) routes
    attachbyid: (NSString*) attachbyid
    front: (NSString*) front
    back: (NSString*) back
    _description: (NSString*) _description
    targettype: (NSString*) targettype
    htmldata: (NSString*) htmldata
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Create AreaMail

Create a new AreaMail object.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* routes = @"routes_example"; // List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043
NSString* attachbyid = @"attachbyid_example"; // Set an existing areamail by attaching its AreamailId.
NSString* front = @"front_example"; // The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required
NSString* back = @"back_example"; // The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG.
NSString* _description = @"_description_example"; // A string value to use as a description for this AreaMail item. (optional)
NSString* targettype = @"targettype_example"; // The delivery location type. (optional)
NSString* htmldata = @"htmldata_example"; // A string value that contains HTML markup. (optional)

SWGAreaMailApi*apiInstance = [[SWGAreaMailApi alloc] init];

// Create AreaMail
[apiInstance areamailCreateWithRoutes:routes
              attachbyid:attachbyid
              front:front
              back:back
              _description:_description
              targettype:targettype
              htmldata:htmldata
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAreaMailApi->areamailCreate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routes** | **NSString***| List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route.List of routes that AreaMail should be delivered to.  A single route can be either a zipcode or a carrier route. A carrier route is in the form of 92610-C043 where the carrier route is composed of 5 numbers for zipcode, 1 letter for carrier route type, and 3 numbers for carrier route code. Delivery can be sent to mutliple routes by separating them with a commas. Valid Values: 92656, 92610-C043 | 
 **attachbyid** | **NSString***| Set an existing areamail by attaching its AreamailId. | 
 **front** | **NSString***| The front of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. Back required | 
 **back** | **NSString***| The back of the AreaMail item to be created. This can be a URL, local file, or an HTML string. Supported file types are PDF, PNG, and JPEG. | 
 **_description** | **NSString***| A string value to use as a description for this AreaMail item. | [optional] 
 **targettype** | **NSString***| The delivery location type. | [optional] 
 **htmldata** | **NSString***| A string value that contains HTML markup. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **areamailDelete**
```objc
-(NSURLSessionTask*) areamailDeleteWithAreamailid: (NSString*) areamailid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Delete AreaMail

Remove an AreaMail object by its AreaMailId.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* areamailid = @"areamailid_example"; // The unique identifier for an AreaMail object.

SWGAreaMailApi*apiInstance = [[SWGAreaMailApi alloc] init];

// Delete AreaMail
[apiInstance areamailDeleteWithAreamailid:areamailid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAreaMailApi->areamailDelete: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **NSString***| The unique identifier for an AreaMail object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **areamailLists**
```objc
-(NSURLSessionTask*) areamailListsWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    areamailsid: (NSString*) areamailsid
    dateCreated: (NSString*) dateCreated
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List AreaMails

Retrieve a list of AreaMail objects.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // The count of objects to return per page. (optional) (default to 10)
NSString* areamailsid = @"areamailsid_example"; // The unique identifier for an AreaMail object. (optional)
NSString* dateCreated = @"dateCreated_example"; // The date the AreaMail was created. (optional)

SWGAreaMailApi*apiInstance = [[SWGAreaMailApi alloc] init];

// List AreaMails
[apiInstance areamailListsWithPage:page
              pagesize:pagesize
              areamailsid:areamailsid
              dateCreated:dateCreated
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAreaMailApi->areamailLists: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]
 **areamailsid** | **NSString***| The unique identifier for an AreaMail object. | [optional] 
 **dateCreated** | **NSString***| The date the AreaMail was created. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **areamailView**
```objc
-(NSURLSessionTask*) areamailViewWithAreamailid: (NSString*) areamailid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View AreaMail

Retrieve an AreaMail object by its AreaMailId.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* areamailid = @"areamailid_example"; // The unique identifier for an AreaMail object.

SWGAreaMailApi*apiInstance = [[SWGAreaMailApi alloc] init];

// View AreaMail
[apiInstance areamailViewWithAreamailid:areamailid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAreaMailApi->areamailView: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **areamailid** | **NSString***| The unique identifier for an AreaMail object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

