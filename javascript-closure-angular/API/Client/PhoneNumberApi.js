/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.PhoneNumberApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Ytel API version 3
 * Version: 3.12
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.PhoneNumberApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.PhoneNumberApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('PhoneNumberApiBasePath') ?
                   /** @type {!string} */ ($injector.get('PhoneNumberApiBasePath')) :
                   'https://api.ytel.com/api/v3';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('PhoneNumberApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('PhoneNumberApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.PhoneNumberApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Available Numbers
 * Retrieve a list of available phone numbers that can be purchased and used for your Ytel account.
 * @param {!string} numbertype Number type either SMS,Voice or all
 * @param {!string} areacode Specifies the area code for the returned list of available numbers. Only available for North American numbers.
 * @param {!number=} opt_pagesize The count of objects to return.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneAvailablenumber = function(numbertype, areacode, opt_pagesize, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/availablenumber.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'numbertype' is set
  if (!numbertype) {
    throw new Error('Missing required parameter numbertype when calling incomingphoneAvailablenumber');
  }
  // verify required parameter 'areacode' is set
  if (!areacode) {
    throw new Error('Missing required parameter areacode when calling incomingphoneAvailablenumber');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['numbertype'] = numbertype;

  formParams['areacode'] = areacode;

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
 * Bulk Buy Numbers
 * Purchase a selected number of DID&#39;s from specific area codes to be used with your Ytel account.
 * @param {!string} numberType The capability the number supports.
 * @param {!string} areaCode Specifies the area code for the returned list of available numbers. Only available for North American numbers.
 * @param {!string} quantity A positive integer that tells how many number you want to buy at a time.
 * @param {!string=} opt_leftover If desired quantity is unavailable purchase what is available .
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneBulkbuy = function(numberType, areaCode, quantity, opt_leftover, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/bulkbuy.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'numberType' is set
  if (!numberType) {
    throw new Error('Missing required parameter numberType when calling incomingphoneBulkbuy');
  }
  // verify required parameter 'areaCode' is set
  if (!areaCode) {
    throw new Error('Missing required parameter areaCode when calling incomingphoneBulkbuy');
  }
  // verify required parameter 'quantity' is set
  if (!quantity) {
    throw new Error('Missing required parameter quantity when calling incomingphoneBulkbuy');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['NumberType'] = numberType;

  formParams['AreaCode'] = areaCode;

  formParams['Quantity'] = quantity;

  formParams['Leftover'] = opt_leftover;

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
 * Purchase Number
 * Purchase a phone number to be used with your Ytel account
 * @param {!string} phoneNumber A valid 10-digit Ytel number (E.164 format).
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneBuynumber = function(phoneNumber, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/buynumber.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phoneNumber' is set
  if (!phoneNumber) {
    throw new Error('Missing required parameter phoneNumber when calling incomingphoneBuynumber');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['PhoneNumber'] = phoneNumber;

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
 * Get DID Score
 * Get DID Score Number
 * @param {!string} phonenumber Specifies the multiple phone numbers for check updated spamscore .
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneGetdidscore = function(phonenumber, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/getdidscore.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phonenumber' is set
  if (!phonenumber) {
    throw new Error('Missing required parameter phonenumber when calling incomingphoneGetdidscore');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['Phonenumber'] = phonenumber;

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
 * List Numbers
 * Retrieve a list of purchased phones numbers associated with your Ytel account.
 * @param {!number=} opt_page Which page of the overall response will be returned. Page indexing starts at 1.
 * @param {!number=} opt_pageSize The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!string=} opt_numberType The capability supported by the number.Number type either SMS,Voice or all
 * @param {!string=} opt_friendlyName A human-readable label added to the number object.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneListnumber = function(opt_page, opt_pageSize, opt_numberType, opt_friendlyName, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/listnumber.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['Page'] = opt_page;

  formParams['PageSize'] = opt_pageSize;

  formParams['NumberType'] = opt_numberType;

  formParams['FriendlyName'] = opt_friendlyName;

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
 * Bulk Release
 * Remove a purchased Ytel number from your account.
 * @param {!string} phoneNumber A valid Ytel comma separated numbers (E.164 format).
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneMassreleasenumber = function(phoneNumber, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/massreleasenumber.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phoneNumber' is set
  if (!phoneNumber) {
    throw new Error('Missing required parameter phoneNumber when calling incomingphoneMassreleasenumber');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['PhoneNumber'] = phoneNumber;

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
 * Bulk Update Numbers
 * Update properties for a Ytel numbers that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
 * @param {!string} phoneNumber A valid comma(,) separated Ytel numbers. (E.164 format).
 * @param {!string} voiceUrl The URL returning InboundXML incoming calls should execute when connected.
 * @param {!string=} opt_friendlyName A human-readable value for labeling the number.
 * @param {!string=} opt_voiceMethod Specifies the HTTP method used to request the VoiceUrl once incoming call connects.
 * @param {!string=} opt_voiceFallbackUrl URL used if any errors occur during execution of InboundXML on a call or at initial request of the voice url
 * @param {!string=} opt_voiceFallbackMethod Specifies the HTTP method used to request the VoiceFallbackUrl once incoming call connects.
 * @param {!string=} opt_hangupCallback URL that can be requested to receive notification when and how incoming call has ended.
 * @param {!string=} opt_hangupCallbackMethod The HTTP method Ytel will use when requesting the HangupCallback URL.
 * @param {!string=} opt_heartbeatUrl URL that can be used to monitor the phone number.
 * @param {!string=} opt_heartbeatMethod The HTTP method Ytel will use when requesting the HeartbeatUrl.
 * @param {!string=} opt_smsUrl URL requested when an SMS is received.
 * @param {!string=} opt_smsMethod The HTTP method Ytel will use when requesting the SmsUrl.
 * @param {!string=} opt_smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
 * @param {!string=} opt_smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneMassupdatenumber = function(phoneNumber, voiceUrl, opt_friendlyName, opt_voiceMethod, opt_voiceFallbackUrl, opt_voiceFallbackMethod, opt_hangupCallback, opt_hangupCallbackMethod, opt_heartbeatUrl, opt_heartbeatMethod, opt_smsUrl, opt_smsMethod, opt_smsFallbackUrl, opt_smsFallbackMethod, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/massupdatenumber.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phoneNumber' is set
  if (!phoneNumber) {
    throw new Error('Missing required parameter phoneNumber when calling incomingphoneMassupdatenumber');
  }
  // verify required parameter 'voiceUrl' is set
  if (!voiceUrl) {
    throw new Error('Missing required parameter voiceUrl when calling incomingphoneMassupdatenumber');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['PhoneNumber'] = phoneNumber;

  formParams['VoiceUrl'] = voiceUrl;

  formParams['FriendlyName'] = opt_friendlyName;

  formParams['VoiceMethod'] = opt_voiceMethod;

  formParams['VoiceFallbackUrl'] = opt_voiceFallbackUrl;

  formParams['VoiceFallbackMethod'] = opt_voiceFallbackMethod;

  formParams['HangupCallback'] = opt_hangupCallback;

  formParams['HangupCallbackMethod'] = opt_hangupCallbackMethod;

  formParams['HeartbeatUrl'] = opt_heartbeatUrl;

  formParams['HeartbeatMethod'] = opt_heartbeatMethod;

  formParams['SmsUrl'] = opt_smsUrl;

  formParams['SmsMethod'] = opt_smsMethod;

  formParams['SmsFallbackUrl'] = opt_smsFallbackUrl;

  formParams['SmsFallbackMethod'] = opt_smsFallbackMethod;

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
 * Release Number
 * Remove a purchased Ytel number from your account.
 * @param {!string} phoneNumber A valid 10-digit Ytel number (E.164 format).
 * @param {!string} responseType Response type format xml or json
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneReleasenumberByResponseTypePost = function(phoneNumber, responseType, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/releasenumber.{ResponseType}'
      .replace('{' + 'ResponseType' + '}', String(responseType));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phoneNumber' is set
  if (!phoneNumber) {
    throw new Error('Missing required parameter phoneNumber when calling incomingphoneReleasenumberByResponseTypePost');
  }
  // verify required parameter 'responseType' is set
  if (!responseType) {
    throw new Error('Missing required parameter responseType when calling incomingphoneReleasenumberByResponseTypePost');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['PhoneNumber'] = phoneNumber;

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
 * Move Number
 * Transfer phone number that has been purchased for from one account to another account.
 * @param {!string} phonenumber A valid 10-digit Ytel number (E.164 format).
 * @param {!string} fromaccountsid A specific Accountsid from where Number is getting transfer.
 * @param {!string} toaccountsid A specific Accountsid to which Number is getting transfer.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneTransferphonenumbers = function(phonenumber, fromaccountsid, toaccountsid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/transferphonenumbers.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phonenumber' is set
  if (!phonenumber) {
    throw new Error('Missing required parameter phonenumber when calling incomingphoneTransferphonenumbers');
  }
  // verify required parameter 'fromaccountsid' is set
  if (!fromaccountsid) {
    throw new Error('Missing required parameter fromaccountsid when calling incomingphoneTransferphonenumbers');
  }
  // verify required parameter 'toaccountsid' is set
  if (!toaccountsid) {
    throw new Error('Missing required parameter toaccountsid when calling incomingphoneTransferphonenumbers');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['phonenumber'] = phonenumber;

  formParams['fromaccountsid'] = fromaccountsid;

  formParams['toaccountsid'] = toaccountsid;

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
 * Update Number
 * Update properties for a Ytel number that has been purchased for your account. Refer to the parameters list for the list of properties that can be updated.
 * @param {!string} phoneNumber A valid Ytel number (E.164 format).
 * @param {!string} voiceUrl URL requested once the call connects
 * @param {!string=} opt_friendlyName Phone number friendly name description
 * @param {!string=} opt_voiceMethod Post or Get
 * @param {!string=} opt_voiceFallbackUrl URL requested if the voice URL is not available
 * @param {!string=} opt_voiceFallbackMethod Post or Get
 * @param {!string=} opt_hangupCallback callback url after a hangup occurs
 * @param {!string=} opt_hangupCallbackMethod Post or Get
 * @param {!string=} opt_heartbeatUrl URL requested once the call connects
 * @param {!string=} opt_heartbeatMethod URL that can be requested every 60 seconds during the call to notify of elapsed time
 * @param {!string=} opt_smsUrl URL requested when an SMS is received
 * @param {!string=} opt_smsMethod Post or Get
 * @param {!string=} opt_smsFallbackUrl URL used if any errors occur during execution of InboundXML from an SMS or at initial request of the SmsUrl.
 * @param {!string=} opt_smsFallbackMethod The HTTP method Ytel will use when URL requested if the SmsUrl is not available.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneUpdatenumber = function(phoneNumber, voiceUrl, opt_friendlyName, opt_voiceMethod, opt_voiceFallbackUrl, opt_voiceFallbackMethod, opt_hangupCallback, opt_hangupCallbackMethod, opt_heartbeatUrl, opt_heartbeatMethod, opt_smsUrl, opt_smsMethod, opt_smsFallbackUrl, opt_smsFallbackMethod, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/updatenumber.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phoneNumber' is set
  if (!phoneNumber) {
    throw new Error('Missing required parameter phoneNumber when calling incomingphoneUpdatenumber');
  }
  // verify required parameter 'voiceUrl' is set
  if (!voiceUrl) {
    throw new Error('Missing required parameter voiceUrl when calling incomingphoneUpdatenumber');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['PhoneNumber'] = phoneNumber;

  formParams['VoiceUrl'] = voiceUrl;

  formParams['FriendlyName'] = opt_friendlyName;

  formParams['VoiceMethod'] = opt_voiceMethod;

  formParams['VoiceFallbackUrl'] = opt_voiceFallbackUrl;

  formParams['VoiceFallbackMethod'] = opt_voiceFallbackMethod;

  formParams['HangupCallback'] = opt_hangupCallback;

  formParams['HangupCallbackMethod'] = opt_hangupCallbackMethod;

  formParams['HeartbeatUrl'] = opt_heartbeatUrl;

  formParams['HeartbeatMethod'] = opt_heartbeatMethod;

  formParams['SmsUrl'] = opt_smsUrl;

  formParams['SmsMethod'] = opt_smsMethod;

  formParams['SmsFallbackUrl'] = opt_smsFallbackUrl;

  formParams['SmsFallbackMethod'] = opt_smsFallbackMethod;

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
 * View Details
 * Retrieve the details for a phone number by its number.
 * @param {!string} phoneNumber A valid Ytel 10-digit phone number (E.164 format).
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.PhoneNumberApi.prototype.incomingphoneViewnumber = function(phoneNumber, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/incomingphone/viewnumber.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'phoneNumber' is set
  if (!phoneNumber) {
    throw new Error('Missing required parameter phoneNumber when calling incomingphoneViewnumber');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['PhoneNumber'] = phoneNumber;

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
