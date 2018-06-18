/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.SharedShortCodeApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Ytel API version 3
 * Version: 3.11
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.SharedShortCodeApi');

goog.require('API.Client.UUID');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.SharedShortCodeApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('SharedShortCodeApiBasePath') ?
                   /** @type {!string} */ ($injector.get('SharedShortCodeApiBasePath')) :
                   'https://api.message360.com/api/v3/';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('SharedShortCodeApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('SharedShortCodeApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.SharedShortCodeApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * List Keywords
 * Retrieve a list of keywords associated with your Ytel account.
 * @param {!number=} opt_page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!number=} opt_pagesize Number of individual resources listed in the response per page
 * @param {!string=} opt_keyword Only list keywords of keyword
 * @param {!number=} opt_shortcode Only list keywords of shortcode
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.keywordLists = function(opt_page, opt_pagesize, opt_keyword, opt_shortcode, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/keyword/lists.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['page'] = opt_page;

  formParams['pagesize'] = opt_pagesize;

  formParams['Keyword'] = opt_keyword;

  formParams['Shortcode'] = opt_shortcode;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * View Keyword
 * View a set of properties for a single keyword.
 * @param {!string} keywordid The unique identifier of each keyword
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.keywordView = function(keywordid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/keyword/view.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'keywordid' is set
  if (!keywordid) {
    throw new Error('Missing required parameter keywordid when calling keywordView');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['Keywordid'] = keywordid;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * List Inbound SMS
 * List All Inbound ShortCode
 * @param {!number=} opt_page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!number=} opt_pagesize Number of individual resources listed in the response per page
 * @param {!string=} opt_from From Number to Inbound ShortCode
 * @param {!string=} opt_shortcode Only list messages sent to this Short Code
 * @param {!string=} opt_datecreated Only list messages sent with the specified date
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.shortcodeGetinboundsms = function(opt_page, opt_pagesize, opt_from, opt_shortcode, opt_datecreated, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/shortcode/getinboundsms.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  if (opt_datecreated !== undefined) {
    queryParameters['Datecreated'] = opt_datecreated;
  }

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['page'] = opt_page;

  formParams['pagesize'] = opt_pagesize;

  formParams['from'] = opt_from;

  formParams['Shortcode'] = opt_shortcode;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * List Shortcodes
 * Retrieve a list of shortcode assignment associated with your Ytel account.
 * @param {!number=} opt_page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!number=} opt_pagesize Number of individual resources listed in the response per page
 * @param {!string=} opt_shortcode Only list keywords of shortcode
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.shortcodeListshortcode = function(opt_page, opt_pagesize, opt_shortcode, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/shortcode/listshortcode.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  if (opt_shortcode !== undefined) {
    queryParameters['Shortcode'] = opt_shortcode;
  }

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['page'] = opt_page;

  formParams['pagesize'] = opt_pagesize;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Send SMS
 * Send an SMS from a Ytel ShortCode
 * @param {!string} shortcode The Short Code number that is the sender of this message
 * @param {!string} to A valid 10-digit number that should receive the message
 * @param {!API.Client.UUID} templateid The unique identifier for the template used for the message
 * @param {!string} data format of your data, example: {companyname}:test,{otpcode}:1234
 * @param {!string=} opt_method Specifies the HTTP method used to request the required URL once the Short Code message is sent.
 * @param {!string=} opt_messageStatusCallback URL that can be requested to receive notification when Short Code message was sent.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.shortcodeSendsms = function(shortcode, to, templateid, data, opt_method, opt_messageStatusCallback, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/shortcode/sendsms.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'shortcode' is set
  if (!shortcode) {
    throw new Error('Missing required parameter shortcode when calling shortcodeSendsms');
  }
  // verify required parameter 'to' is set
  if (!to) {
    throw new Error('Missing required parameter to when calling shortcodeSendsms');
  }
  // verify required parameter 'templateid' is set
  if (!templateid) {
    throw new Error('Missing required parameter templateid when calling shortcodeSendsms');
  }
  // verify required parameter 'data' is set
  if (!data) {
    throw new Error('Missing required parameter data when calling shortcodeSendsms');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['shortcode'] = shortcode;

  formParams['to'] = to;

  formParams['templateid'] = templateid;

  formParams['data'] = data;

  formParams['Method'] = opt_method;

  formParams['MessageStatusCallback'] = opt_messageStatusCallback;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Update Shortcode
 * Update Assignment
 * @param {!string} shortcode List of valid shortcode to your Ytel account
 * @param {!string=} opt_friendlyName User generated name of the shortcode
 * @param {!string=} opt_callbackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
 * @param {!string=} opt_callbackMethod Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
 * @param {!string=} opt_fallbackUrl URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
 * @param {!string=} opt_fallbackUrlMethod Specifies the HTTP method used to request the required FallbackUrl once call connects.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.shortcodeUpdateshortcode = function(shortcode, opt_friendlyName, opt_callbackUrl, opt_callbackMethod, opt_fallbackUrl, opt_fallbackUrlMethod, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/shortcode/updateshortcode.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'shortcode' is set
  if (!shortcode) {
    throw new Error('Missing required parameter shortcode when calling shortcodeUpdateshortcode');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['Shortcode'] = shortcode;

  formParams['FriendlyName'] = opt_friendlyName;

  formParams['CallbackUrl'] = opt_callbackUrl;

  formParams['CallbackMethod'] = opt_callbackMethod;

  formParams['FallbackUrl'] = opt_fallbackUrl;

  formParams['FallbackUrlMethod'] = opt_fallbackUrlMethod;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * View Shortcode
 * The response returned here contains all resource properties associated with the given Shortcode.
 * @param {!string} shortcode List of valid Shortcode to your Ytel account
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.shortcodeViewshortcode = function(shortcode, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/shortcode/viewshortcode.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'shortcode' is set
  if (!shortcode) {
    throw new Error('Missing required parameter shortcode when calling shortcodeViewshortcode');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['Shortcode'] = shortcode;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * List Templates
 * List Shortcode Templates by Type
 * @param {!string=} opt_type The type (category) of template Valid values: marketing, authorization
 * @param {!number=} opt_page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!number=} opt_pagesize The count of objects to return per page.
 * @param {!string=} opt_shortcode Only list templates of type
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.templateLists = function(opt_type, opt_page, opt_pagesize, opt_shortcode, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/template/lists.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['type'] = opt_type;

  formParams['page'] = opt_page;

  formParams['pagesize'] = opt_pagesize;

  formParams['Shortcode'] = opt_shortcode;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * View Template
 * View a Shared ShortCode Template
 * @param {!API.Client.UUID} templateId The unique identifier for a template object
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SharedShortCodeApi.prototype.templateView = function(templateId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/template/view.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'templateId' is set
  if (!templateId) {
    throw new Error('Missing required parameter templateId when calling templateView');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['TemplateId'] = templateId;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: false,
        data: this.httpParamSerializer(formParams),
    params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
