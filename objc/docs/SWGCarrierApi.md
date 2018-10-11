# SWGCarrierApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carrierLookup**](SWGCarrierApi.md#carrierlookup) | **POST** /carrier/lookup.json | Lookup Carrier
[**carrierLookuplist**](SWGCarrierApi.md#carrierlookuplist) | **POST** /carrier/lookuplist.json | Carrier Results


# **carrierLookup**
```objc
-(NSURLSessionTask*) carrierLookupWithPhoneNumber: (NSString*) phoneNumber
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Lookup Carrier

Get the Carrier Lookup

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* phoneNumber = @"phoneNumber_example"; // A valid 10-digit number (E.164 format).

SWGCarrierApi*apiInstance = [[SWGCarrierApi alloc] init];

// Lookup Carrier
[apiInstance carrierLookupWithPhoneNumber:phoneNumber
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCarrierApi->carrierLookup: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **NSString***| A valid 10-digit number (E.164 format). | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **carrierLookuplist**
```objc
-(NSURLSessionTask*) carrierLookuplistWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Carrier Results

Retrieve a list of carrier lookup objects.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pageSize = @10; // The count of objects to return per page. (optional) (default to 10)

SWGCarrierApi*apiInstance = [[SWGCarrierApi alloc] init];

// Carrier Results
[apiInstance carrierLookuplistWithPage:page
              pageSize:pageSize
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGCarrierApi->carrierLookuplist: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

