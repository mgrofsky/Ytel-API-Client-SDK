# SWGUsageApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageListusage**](SWGUsageApi.md#usagelistusage) | **POST** /usage/listusage.json | List Usage


# **usageListusage**
```objc
-(NSURLSessionTask*) usageListusageWithProductCode: (NSString*) productCode
    startDate: (NSString*) startDate
    endDate: (NSString*) endDate
    includeSubAccounts: (NSString*) includeSubAccounts
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Usage

Retrieve usage metrics regarding your Ytel account. The results includes inbound/outbound voice calls and inbound/outbound SMS messages as well as carrier lookup requests.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* productCode = @"0"; // Filter usage results by product type. (optional) (default to 0)
NSString* startDate = @"2016-09-06"; // Filter usage objects by start date. (optional) (default to 2016-09-06)
NSString* endDate = @"2016-09-06"; // Filter usage objects by end date. (optional) (default to 2016-09-06)
NSString* includeSubAccounts = @"includeSubAccounts_example"; // Will include all subaccount usage data (optional)

SWGUsageApi*apiInstance = [[SWGUsageApi alloc] init];

// List Usage
[apiInstance usageListusageWithProductCode:productCode
              startDate:startDate
              endDate:endDate
              includeSubAccounts:includeSubAccounts
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUsageApi->usageListusage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCode** | **NSString***| Filter usage results by product type. | [optional] [default to 0]
 **startDate** | **NSString***| Filter usage objects by start date. | [optional] [default to 2016-09-06]
 **endDate** | **NSString***| Filter usage objects by end date. | [optional] [default to 2016-09-06]
 **includeSubAccounts** | **NSString***| Will include all subaccount usage data | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

