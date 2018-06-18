#import <Foundation/Foundation.h>
#import "SWGApi.h"

/**
* Ytel API V3
* Ytel API version 3
*
* OpenAPI spec version: 3.11
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


@interface SWGSubAccountApi: NSObject <SWGApi>

extern NSString* kSWGSubAccountApiErrorDomain;
extern NSInteger kSWGSubAccountApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Create Subaccount
/// Create a sub user account under the parent account
///
/// @param firstName Sub account user first name
/// @param lastName sub account user last name
/// @param email Sub account email address
/// @param friendlyName Descriptive name of the sub account
/// @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) userCreatesubaccountWithFirstName: (NSString*) firstName
    lastName: (NSString*) lastName
    email: (NSString*) email
    friendlyName: (NSString*) friendlyName
    password: (NSString*) password
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Delete Subaccount
/// Delete sub account or merge numbers into parent
///
/// @param subAccountSID The SubaccountSid to be deleted
/// @param mergeNumber 0 to delete or 1 to merge numbers to parent account.
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) userDeletesubaccountWithSubAccountSID: (NSString*) subAccountSID
    mergeNumber: (NSString*) mergeNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// Toggle Subaccount Status
/// Suspend or unsuspend
///
/// @param subAccountSID The SubaccountSid to be activated or suspended
/// @param activate 0 to suspend or 1 to activate
/// 
///  code:200 message:""
///
/// @return NSString*
-(NSURLSessionTask*) userSubaccountactivationWithSubAccountSID: (NSString*) subAccountSID
    activate: (NSString*) activate
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end
