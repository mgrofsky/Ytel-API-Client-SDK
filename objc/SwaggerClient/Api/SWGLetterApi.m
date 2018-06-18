#import "SWGLetterApi.h"
#import "SWGQueryParamCollection.h"
#import "SWGApiClient.h"


@interface SWGLetterApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation SWGLetterApi

NSString* kSWGLetterApiErrorDomain = @"SWGLetterApiErrorDomain";
NSInteger kSWGLetterApiMissingParamErrorCode = 234513;

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
/// Create Letter
/// Create, print, and mail a letter to an address. The letter file must be supplied as a PDF or an HTML string.
///  @param to The AddressId or an object structured when creating an address by addresses/Create. 
///
///  @param from The AddressId or an object structured when creating an address by addresses/Create. 
///
///  @param attachbyid Set an existing letter by attaching its LetterId. 
///
///  @param file File can be a 8.5\"x11\" PDF uploaded file or URL that links to a file. 
///
///  @param color Specify if letter should be printed in color. 
///
///  @param _description A description for the letter. (optional)
///
///  @param extraservice Add an extra service to your letter. Options are \"certified\" or \"registered\". Certified provides tracking and delivery confirmation for domestic destinations and is an additional $5.00. Registered provides tracking and confirmation for international addresses and is an additional $16.50. (optional)
///
///  @param doublesided Specify if letter should be printed on both sides. (optional)
///
///  @param template Boolean that defaults to true. When set to false, this specifies that your letter does not follow the m360 address template. In this case, a blank address page will be inserted at the beginning of your file and you will be charged for the extra page. (optional)
///
///  @param htmldata A string value that contains HTML markup. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) letterCreateWithTo: (NSString*) to
    from: (NSString*) from
    attachbyid: (NSString*) attachbyid
    file: (NSString*) file
    color: (NSString*) color
    _description: (NSString*) _description
    extraservice: (NSString*) extraservice
    doublesided: (NSString*) doublesided
    template: (NSString*) template
    htmldata: (NSString*) htmldata
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'to' is set
    if (to == nil) {
        NSParameterAssert(to);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"to"] };
            NSError* error = [NSError errorWithDomain:kSWGLetterApiErrorDomain code:kSWGLetterApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'from' is set
    if (from == nil) {
        NSParameterAssert(from);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"from"] };
            NSError* error = [NSError errorWithDomain:kSWGLetterApiErrorDomain code:kSWGLetterApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'attachbyid' is set
    if (attachbyid == nil) {
        NSParameterAssert(attachbyid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"attachbyid"] };
            NSError* error = [NSError errorWithDomain:kSWGLetterApiErrorDomain code:kSWGLetterApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kSWGLetterApiErrorDomain code:kSWGLetterApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'color' is set
    if (color == nil) {
        NSParameterAssert(color);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"color"] };
            NSError* error = [NSError errorWithDomain:kSWGLetterApiErrorDomain code:kSWGLetterApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/letter/create.json"];

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
    if (to) {
        formParams[@"to"] = to;
    }
    if (from) {
        formParams[@"from"] = from;
    }
    if (attachbyid) {
        formParams[@"attachbyid"] = attachbyid;
    }
    if (file) {
        formParams[@"file"] = file;
    }
    if (color) {
        formParams[@"color"] = color;
    }
    if (_description) {
        formParams[@"description"] = _description;
    }
    if (extraservice) {
        formParams[@"extraservice"] = extraservice;
    }
    if (doublesided) {
        formParams[@"doublesided"] = doublesided;
    }
    if (template) {
        formParams[@"template"] = template;
    }
    if (htmldata) {
        formParams[@"htmldata"] = htmldata;
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
/// Delete Letter
/// Remove a letter object by its LetterId.
///  @param lettersid The unique identifier for a letter object. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) letterDeleteWithLettersid: (NSString*) lettersid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'lettersid' is set
    if (lettersid == nil) {
        NSParameterAssert(lettersid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"lettersid"] };
            NSError* error = [NSError errorWithDomain:kSWGLetterApiErrorDomain code:kSWGLetterApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/letter/delete.json"];

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
    if (lettersid) {
        formParams[@"lettersid"] = lettersid;
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
/// List Letters
/// Retrieve a list of letter objects. The letter objects are sorted by creation date, with the most recently created letters appearing first.
///  @param page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (optional, default to 1)
///
///  @param pagesize The count of objects to return per page. (optional, default to 10)
///
///  @param lettersid The unique identifier for a letter object. (optional)
///
///  @param dateCreated The date the letter was created. (optional)
///
///  @returns NSString*
///
-(NSURLSessionTask*) letterListsletterWithPage: (NSNumber*) page
    pagesize: (NSNumber*) pagesize
    lettersid: (NSString*) lettersid
    dateCreated: (NSString*) dateCreated
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/letter/listsletter.json"];

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
    if (lettersid) {
        formParams[@"lettersid"] = lettersid;
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
/// View Letter
/// Retrieve a letter object by its LetterSid.
///  @param lettersid The unique identifier for a letter object. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) letterViewletterWithLettersid: (NSString*) lettersid
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'lettersid' is set
    if (lettersid == nil) {
        NSParameterAssert(lettersid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"lettersid"] };
            NSError* error = [NSError errorWithDomain:kSWGLetterApiErrorDomain code:kSWGLetterApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/letter/viewletter.json"];

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
    if (lettersid) {
        formParams[@"lettersid"] = lettersid;
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
