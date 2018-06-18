#import "SWGSubAccountApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGSubAccountApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGSubAccountApi

NSString* kSWGSubAccountApiErrorDomain = @"SWGSubAccountApiErrorDomain";
NSInteger kSWGSubAccountApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[SWGApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(SWGApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Create Subaccount
/// Create a sub user account under the parent account
///  @param firstName Sub account user first name 
///
///  @param lastName sub account user last name 
///
///  @param email Sub account email address 
///
///  @param friendlyName Descriptive name of the sub account 
///
///  @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) userCreatesubaccountWithFirstName: (NSString*) firstName
    lastName: (NSString*) lastName
    email: (NSString*) email
    friendlyName: (NSString*) friendlyName
    password: (NSString*) password
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'firstName' is set
    if (firstName == nil) {
        NSParameterAssert(firstName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"firstName"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'lastName' is set
    if (lastName == nil) {
        NSParameterAssert(lastName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"lastName"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'email' is set
    if (email == nil) {
        NSParameterAssert(email);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"email"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'friendlyName' is set
    if (friendlyName == nil) {
        NSParameterAssert(friendlyName);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"friendlyName"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'password' is set
    if (password == nil) {
        NSParameterAssert(password);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"password"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/createsubaccount.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"auth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (firstName) {
        formParams[@"FirstName"] = firstName;
    }
    if (lastName) {
        formParams[@"LastName"] = lastName;
    }
    if (email) {
        formParams[@"Email"] = email;
    }
    if (friendlyName) {
        formParams[@"FriendlyName"] = friendlyName;
    }
    if (password) {
        formParams[@"Password"] = password;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Delete Subaccount
/// Delete sub account or merge numbers into parent
///  @param subAccountSID The SubaccountSid to be deleted 
///
///  @param mergeNumber 0 to delete or 1 to merge numbers to parent account. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) userDeletesubaccountWithSubAccountSID: (NSString*) subAccountSID
    mergeNumber: (NSString*) mergeNumber
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'subAccountSID' is set
    if (subAccountSID == nil) {
        NSParameterAssert(subAccountSID);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"subAccountSID"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'mergeNumber' is set
    if (mergeNumber == nil) {
        NSParameterAssert(mergeNumber);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"mergeNumber"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/deletesubaccount.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"auth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (subAccountSID) {
        formParams[@"SubAccountSID"] = subAccountSID;
    }
    if (mergeNumber) {
        formParams[@"MergeNumber"] = mergeNumber;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Toggle Subaccount Status
/// Suspend or unsuspend
///  @param subAccountSID The SubaccountSid to be activated or suspended 
///
///  @param activate 0 to suspend or 1 to activate 
///
///  @returns NSString*
///
-(NSURLSessionTask*) userSubaccountactivationWithSubAccountSID: (NSString*) subAccountSID
    activate: (NSString*) activate
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'subAccountSID' is set
    if (subAccountSID == nil) {
        NSParameterAssert(subAccountSID);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"subAccountSID"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'activate' is set
    if (activate == nil) {
        NSParameterAssert(activate);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"activate"] };
            NSError* error = [NSError errorWithDomain:kSWGSubAccountApiErrorDomain code:kSWGSubAccountApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/subaccountactivation.json"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"auth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (subAccountSID) {
        formParams[@"SubAccountSID"] = subAccountSID;
    }
    if (activate) {
        formParams[@"Activate"] = activate;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}



@end
