#import "SWGAddressApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGAddressApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGAddressApi

NSString* kSWGAddressApiErrorDomain = @"SWGAddressApiErrorDomain";
NSInteger kSWGAddressApiMissingParamErrorCode = 234513;

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
/// Create Address
/// To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
///  @param name Name of user 
///
///  @param address Address of user. 
///
///  @param country Must be a 2 letter country short-name code (ISO 3166) 
///
///  @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. 
///
///  @param city City Name. 
///
///  @param zip Zip code of city. 
///
///  @param _description Description of addresses. (optional)
///
///  @param email Email Id of user. (optional)
///
///  @param phone Phone number of user. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) addressCreateaddressWithName: (NSString*) name
    address: (NSString*) address
    country: (NSString*) country
    state: (NSString*) state
    city: (NSString*) city
    zip: (NSString*) zip
    _description: (NSString*) _description
    email: (NSString*) email
    phone: (NSString*) phone
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'name' is set
    if (name == nil) {
        NSParameterAssert(name);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"name"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'address' is set
    if (address == nil) {
        NSParameterAssert(address);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"address"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'country' is set
    if (country == nil) {
        NSParameterAssert(country);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"country"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'state' is set
    if (state == nil) {
        NSParameterAssert(state);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"state"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'city' is set
    if (city == nil) {
        NSParameterAssert(city);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"city"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'zip' is set
    if (zip == nil) {
        NSParameterAssert(zip);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"zip"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/address/createaddress.json"];

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
    if (name) {
        formParams[@"Name"] = name;
    }
    if (address) {
        formParams[@"Address"] = address;
    }
    if (country) {
        formParams[@"Country"] = country;
    }
    if (state) {
        formParams[@"State"] = state;
    }
    if (city) {
        formParams[@"City"] = city;
    }
    if (zip) {
        formParams[@"Zip"] = zip;
    }
    if (_description) {
        formParams[@"Description"] = _description;
    }
    if (email) {
        formParams[@"email"] = email;
    }
    if (phone) {
        formParams[@"Phone"] = phone;
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
/// Delete Address
/// To delete Address to your address book
///  @param addressid The identifier of the address to be deleted. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) addressDeleteaddressWithAddressid: (NSString*) addressid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'addressid' is set
    if (addressid == nil) {
        NSParameterAssert(addressid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addressid"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/address/deleteaddress.json"];

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
    if (addressid) {
        formParams[@"addressid"] = addressid;
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
/// List Addresses
/// List All Address 
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize How many results to return, default is 10, max is 100, must be an integer (optional, default to 10)
///
///  @param addressid addresses Sid (optional)
///
///  @param dateCreated date created address. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) addressListaddressWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    addressid: (NSString*) addressid
    dateCreated: (NSString*) dateCreated
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/address/listaddress.json"];

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
    if (page) {
        formParams[@"page"] = page;
    }
    if (pagesize) {
        formParams[@"pagesize"] = pagesize;
    }
    if (addressid) {
        formParams[@"addressid"] = addressid;
    }
    if (dateCreated) {
        formParams[@"dateCreated"] = dateCreated;
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
/// Verify Address
/// Validates an address given.
///  @param addressid The identifier of the address to be verified. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) addressVerifyaddressWithAddressid: (NSString*) addressid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'addressid' is set
    if (addressid == nil) {
        NSParameterAssert(addressid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addressid"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/address/verifyaddress.json"];

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
    if (addressid) {
        formParams[@"addressid"] = addressid;
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
/// View Address
/// View Address Specific address Book by providing the address id
///  @param addressid The identifier of the address to be retrieved. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) addressViewaddressWithAddressid: (NSString*) addressid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'addressid' is set
    if (addressid == nil) {
        NSParameterAssert(addressid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addressid"] };
            NSError* error = [NSError errorWithDomain:kSWGAddressApiErrorDomain code:kSWGAddressApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/address/viewaddress.json"];

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
    if (addressid) {
        formParams[@"addressid"] = addressid;
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
