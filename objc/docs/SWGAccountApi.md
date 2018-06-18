# SWGAccountApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsViewaccount**](SWGAccountApi.md#accountsviewaccount) | **POST** /accounts/viewaccount.json | View Account


# **accountsViewaccount**
```objc
-(NSURLSessionTask*) accountsViewaccountWithDate: (NSString*) date
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Account

Retrieve information regarding your Ytel account by a specific date. The response object will contain data such as account status, balance, and account usage totals.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* date = @"date_example"; // Filter account information based on date.

SWGAccountApi*apiInstance = [[SWGAccountApi alloc] init];

// View Account
[apiInstance accountsViewaccountWithDate:date
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAccountApi->accountsViewaccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **NSString***| Filter account information based on date. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

