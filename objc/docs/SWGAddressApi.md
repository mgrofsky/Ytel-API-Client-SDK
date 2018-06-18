# SWGAddressApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressCreateaddress**](SWGAddressApi.md#addresscreateaddress) | **POST** /address/createaddress.json | Create Address
[**addressDeleteaddress**](SWGAddressApi.md#addressdeleteaddress) | **POST** /address/deleteaddress.json | Delete Address
[**addressListaddress**](SWGAddressApi.md#addresslistaddress) | **POST** /address/listaddress.json | List Addresses
[**addressVerifyaddress**](SWGAddressApi.md#addressverifyaddress) | **POST** /address/verifyaddress.json | Verify Address
[**addressViewaddress**](SWGAddressApi.md#addressviewaddress) | **POST** /address/viewaddress.json | View Address


# **addressCreateaddress**
```objc
-(NSURLSessionTask*) addressCreateaddressWithName: (NSString*) name
    address: (NSString*) address
    country: (NSString*) country
    state: (NSString*) state
    city: (NSString*) city
    zip: (NSString*) zip
    _description: (NSString*) _description
    email: (NSString*) email
    phone: (NSString*) phone
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Create Address

To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* name = @"name_example"; // Name of user
NSString* address = @"address_example"; // Address of user.
NSString* country = @"country_example"; // Must be a 2 letter country short-name code (ISO 3166)
NSString* state = @"state_example"; // Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
NSString* city = @"city_example"; // City Name.
NSString* zip = @"zip_example"; // Zip code of city.
NSString* _description = @"_description_example"; // Description of addresses. (optional)
NSString* email = @"email_example"; // Email Id of user. (optional)
NSString* phone = @"phone_example"; // Phone number of user. (optional)

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

// Create Address
[apiInstance addressCreateaddressWithName:name
              address:address
              country:country
              state:state
              city:city
              zip:zip
              _description:_description
              email:email
              phone:phone
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->addressCreateaddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***| Name of user | 
 **address** | **NSString***| Address of user. | 
 **country** | **NSString***| Must be a 2 letter country short-name code (ISO 3166) | 
 **state** | **NSString***| Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. | 
 **city** | **NSString***| City Name. | 
 **zip** | **NSString***| Zip code of city. | 
 **_description** | **NSString***| Description of addresses. | [optional] 
 **email** | **NSString***| Email Id of user. | [optional] 
 **phone** | **NSString***| Phone number of user. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addressDeleteaddress**
```objc
-(NSURLSessionTask*) addressDeleteaddressWithAddressid: (NSString*) addressid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Delete Address

To delete Address to your address book

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* addressid = @"addressid_example"; // The identifier of the address to be deleted.

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

// Delete Address
[apiInstance addressDeleteaddressWithAddressid:addressid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->addressDeleteaddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **NSString***| The identifier of the address to be deleted. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addressListaddress**
```objc
-(NSURLSessionTask*) addressListaddressWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    addressid: (NSString*) addressid
    dateCreated: (NSString*) dateCreated
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Addresses

List All Address 

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // How many results to return, default is 10, max is 100, must be an integer (optional) (default to 10)
NSString* addressid = @"addressid_example"; // addresses Sid (optional)
NSString* dateCreated = @"dateCreated_example"; // date created address. (optional)

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

// List Addresses
[apiInstance addressListaddressWithPage:page
              pagesize:pagesize
              addressid:addressid
              dateCreated:dateCreated
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->addressListaddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| How many results to return, default is 10, max is 100, must be an integer | [optional] [default to 10]
 **addressid** | **NSString***| addresses Sid | [optional] 
 **dateCreated** | **NSString***| date created address. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addressVerifyaddress**
```objc
-(NSURLSessionTask*) addressVerifyaddressWithAddressid: (NSString*) addressid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Verify Address

Validates an address given.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* addressid = @"addressid_example"; // The identifier of the address to be verified.

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

// Verify Address
[apiInstance addressVerifyaddressWithAddressid:addressid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->addressVerifyaddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **NSString***| The identifier of the address to be verified. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addressViewaddress**
```objc
-(NSURLSessionTask*) addressViewaddressWithAddressid: (NSString*) addressid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Address

View Address Specific address Book by providing the address id

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* addressid = @"addressid_example"; // The identifier of the address to be retrieved.

SWGAddressApi*apiInstance = [[SWGAddressApi alloc] init];

// View Address
[apiInstance addressViewaddressWithAddressid:addressid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAddressApi->addressViewaddress: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressid** | **NSString***| The identifier of the address to be retrieved. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

