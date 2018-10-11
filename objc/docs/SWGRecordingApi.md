# SWGRecordingApi

All URIs are relative to *https://api.ytel.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recordingDeleterecording**](SWGRecordingApi.md#recordingdeleterecording) | **POST** /recording/deleterecording.json | Delete Recording
[**recordingListrecording**](SWGRecordingApi.md#recordinglistrecording) | **POST** /recording/listrecording.json | List Recordings
[**recordingViewrecording**](SWGRecordingApi.md#recordingviewrecording) | **POST** /recording/viewrecording.json | View Recording


# **recordingDeleterecording**
```objc
-(NSURLSessionTask*) recordingDeleterecordingWithRecordingsid: (NSString*) recordingsid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Delete Recording

Remove a recording from your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* recordingsid = @"recordingsid_example"; // The unique identifier for a recording.

SWGRecordingApi*apiInstance = [[SWGRecordingApi alloc] init];

// Delete Recording
[apiInstance recordingDeleterecordingWithRecordingsid:recordingsid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRecordingApi->recordingDeleterecording: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **NSString***| The unique identifier for a recording. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recordingListrecording**
```objc
-(NSURLSessionTask*) recordingListrecordingWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    datecreated: (NSString*) datecreated
    callsid: (NSString*) callsid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Recordings

Retrieve a list of recording objects.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // The count of objects to return per page. (optional) (default to 10)
NSString* datecreated = @"datecreated_example"; // Filter results by creation date (optional)
NSString* callsid = @"callsid_example"; // The unique identifier for a call. (optional)

SWGRecordingApi*apiInstance = [[SWGRecordingApi alloc] init];

// List Recordings
[apiInstance recordingListrecordingWithPage:page
              pagesize:pagesize
              datecreated:datecreated
              callsid:callsid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRecordingApi->recordingListrecording: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]
 **datecreated** | **NSString***| Filter results by creation date | [optional] 
 **callsid** | **NSString***| The unique identifier for a call. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **recordingViewrecording**
```objc
-(NSURLSessionTask*) recordingViewrecordingWithRecordingsid: (NSString*) recordingsid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Recording

Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* recordingsid = @"recordingsid_example"; // The unique identifier for the recording.

SWGRecordingApi*apiInstance = [[SWGRecordingApi alloc] init];

// View Recording
[apiInstance recordingViewrecordingWithRecordingsid:recordingsid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGRecordingApi->recordingViewrecording: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingsid** | **NSString***| The unique identifier for the recording. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

