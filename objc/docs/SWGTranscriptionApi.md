# SWGTranscriptionApi

All URIs are relative to *https://api.message360.com/api/v3/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transcriptionsAudiourltranscription**](SWGTranscriptionApi.md#transcriptionsaudiourltranscription) | **POST** /transcriptions/audiourltranscription.json | Transcribe Audio URL
[**transcriptionsListtranscription**](SWGTranscriptionApi.md#transcriptionslisttranscription) | **POST** /transcriptions/listtranscription.json | List Transcriptions
[**transcriptionsRecordingtranscription**](SWGTranscriptionApi.md#transcriptionsrecordingtranscription) | **POST** /transcriptions/recordingtranscription.json | Transcribe Recording
[**transcriptionsViewtranscription**](SWGTranscriptionApi.md#transcriptionsviewtranscription) | **POST** /transcriptions/viewtranscription.json | View Transcription


# **transcriptionsAudiourltranscription**
```objc
-(NSURLSessionTask*) transcriptionsAudiourltranscriptionWithAudiourl: (NSString*) audiourl
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Transcribe Audio URL

Transcribe an audio recording from a file.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* audiourl = @"audiourl_example"; // URL pointing to the location of the audio file that is to be transcribed.

SWGTranscriptionApi*apiInstance = [[SWGTranscriptionApi alloc] init];

// Transcribe Audio URL
[apiInstance transcriptionsAudiourltranscriptionWithAudiourl:audiourl
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTranscriptionApi->transcriptionsAudiourltranscription: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audiourl** | **NSString***| URL pointing to the location of the audio file that is to be transcribed. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transcriptionsListtranscription**
```objc
-(NSURLSessionTask*) transcriptionsListtranscriptionWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    status: (NSString*) status
    dateTranscribed: (NSString*) dateTranscribed
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

List Transcriptions

Retrieve a list of transcription objects for your Ytel account.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* page = @1; // The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
NSNumber* pagesize = @10; // The count of objects to return per page. (optional) (default to 10)
NSString* status = @"status_example"; // The state of the transcription. (optional)
NSString* dateTranscribed = @"dateTranscribed_example"; // The date the transcription took place. (optional)

SWGTranscriptionApi*apiInstance = [[SWGTranscriptionApi alloc] init];

// List Transcriptions
[apiInstance transcriptionsListtranscriptionWithPage:page
              pagesize:pagesize
              status:status
              dateTranscribed:dateTranscribed
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTranscriptionApi->transcriptionsListtranscription: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **NSNumber***| The page count to retrieve from the total results in the collection. Page indexing starts at 1. | [optional] [default to 1]
 **pagesize** | **NSNumber***| The count of objects to return per page. | [optional] [default to 10]
 **status** | **NSString***| The state of the transcription. | [optional] 
 **dateTranscribed** | **NSString***| The date the transcription took place. | [optional] 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transcriptionsRecordingtranscription**
```objc
-(NSURLSessionTask*) transcriptionsRecordingtranscriptionWithRecordingSid: (NSString*) recordingSid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Transcribe Recording

Transcribe a recording by its RecordingSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* recordingSid = @"recordingSid_example"; // The unique identifier for a recording object.

SWGTranscriptionApi*apiInstance = [[SWGTranscriptionApi alloc] init];

// Transcribe Recording
[apiInstance transcriptionsRecordingtranscriptionWithRecordingSid:recordingSid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTranscriptionApi->transcriptionsRecordingtranscription: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingSid** | **NSString***| The unique identifier for a recording object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transcriptionsViewtranscription**
```objc
-(NSURLSessionTask*) transcriptionsViewtranscriptionWithTranscriptionsid: (NSString*) transcriptionsid
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

View Transcription

Retrieve information about a transaction by its TranscriptionSid.

### Example 
```objc
SWGDefaultConfiguration *apiConfig = [SWGDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: auth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* transcriptionsid = @"transcriptionsid_example"; // The unique identifier for a transcription object.

SWGTranscriptionApi*apiInstance = [[SWGTranscriptionApi alloc] init];

// View Transcription
[apiInstance transcriptionsViewtranscriptionWithTranscriptionsid:transcriptionsid
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTranscriptionApi->transcriptionsViewtranscription: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcriptionsid** | **NSString***| The unique identifier for a transcription object. | 

### Return type

**NSString***

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

