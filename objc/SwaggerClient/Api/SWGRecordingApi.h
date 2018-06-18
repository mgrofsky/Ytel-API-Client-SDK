#import <Foundation/Foundation.h>
#import "SWGApi.h"

/**
* Ytel API V3
* Ytel API version 3
*
* OpenAPI spec version: 3.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


@interface SWGRecordingApi: NSObject <SWGApi>

extern NSString* kSWGRecordingApiErrorDomain;
extern NSInteger kSWGRecordingApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Delete Recording
/// Remove a recording from your Ytel account.
///
/// @param recordingsid The unique identifier for a recording.
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) recordingDeleterecordingWithRecordingsid: (NSString*) recordingsid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// List Recordings
/// Retrieve a list of recording objects.
///
/// @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
/// @param pagesize The count of objects to return per page. (optional) (default to 10)
/// @param datecreated Filter results by creation date (optional)
/// @param callsid The unique identifier for a call. (optional)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) recordingListrecordingWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    datecreated: (NSString*) datecreated
    callsid: (NSString*) callsid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// View Recording
/// Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.
///
/// @param recordingsid The unique identifier for the recording.
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) recordingViewrecordingWithRecordingsid: (NSString*) recordingsid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end