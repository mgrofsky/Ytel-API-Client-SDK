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


@interface SWGCarrierApi: NSObject <SWGApi>

extern NSString* kSWGCarrierApiErrorDomain;
extern NSInteger kSWGCarrierApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Lookup Carrier
/// Get the Carrier Lookup
///
/// @param phoneNumber A valid 10-digit number (E.164 format).
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) carrierLookupWithPhoneNumber: (NSString*) phoneNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Carrier Results
/// Retrieve a list of carrier lookup objects.
///
/// @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional) (default to 1)
/// @param pageSize The count of objects to return per page. (optional) (default to 10)
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) carrierLookuplistWithPage: (NSNumber*) page
    pageSize: (NSNumber*) pageSize
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end