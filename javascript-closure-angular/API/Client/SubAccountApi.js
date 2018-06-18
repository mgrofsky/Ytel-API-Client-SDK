/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.SubAccountApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Ytel API version 3
 * Version: 3.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.SubAccountApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.SubAccountApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('SubAccountApiBasePath') ?
                   /** @type {!string} */ ($injector.get('SubAccountApiBasePath')) :
                   'https://api.message360.com/api/v3/';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('SubAccountApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('SubAccountApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.SubAccountApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Create Subaccount
 * Create a sub user account under the parent account
 * @param {!string} firstName Sub account user first name
 * @param {!string} lastName sub account user last name
 * @param {!string} email Sub account email address
 * @param {!string} friendlyName Descriptive name of the sub account
 * @param {!string} password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SubAccountApi.prototype.userCreatesubaccount = function(firstName, lastName, email, friendlyName, password, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/user/createsubaccount.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'firstName' is set
  if (!firstName) {
    throw new Error('Missing required parameter firstName when calling userCreatesubaccount');
  }
  // verify required parameter 'lastName' is set
  if (!lastName) {
    throw new Error('Missing required parameter lastName when calling userCreatesubaccount');
  }
  // verify required parameter 'email' is set
  if (!email) {
    throw new Error('Missing required parameter email when calling userCreatesubaccount');
  }
  // verify required parameter 'friendlyName' is set
  if (!friendlyName) {
    throw new Error('Missing required parameter friendlyName when calling userCreatesubaccount');
  }
  // verify required parameter 'password' is set
  if (!password) {
    throw new Error('Missing required parameter password when calling userCreatesubaccount');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['FirstName'] = firstName;

  formParams['LastName'] = lastName;

  formParams['Email'] = email;

  formParams['FriendlyName'] = friendlyName;

  formParams['Password'] = password;

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
 * Delete Subaccount
 * Delete sub account or merge numbers into parent
 * @param {!string} subAccountSID The SubaccountSid to be deleted
 * @param {!string} mergeNumber 0 to delete or 1 to merge numbers to parent account.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SubAccountApi.prototype.userDeletesubaccount = function(subAccountSID, mergeNumber, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/user/deletesubaccount.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'subAccountSID' is set
  if (!subAccountSID) {
    throw new Error('Missing required parameter subAccountSID when calling userDeletesubaccount');
  }
  // verify required parameter 'mergeNumber' is set
  if (!mergeNumber) {
    throw new Error('Missing required parameter mergeNumber when calling userDeletesubaccount');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['SubAccountSID'] = subAccountSID;

  formParams['MergeNumber'] = mergeNumber;

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
 * Toggle Subaccount Status
 * Suspend or unsuspend
 * @param {!string} subAccountSID The SubaccountSid to be activated or suspended
 * @param {!string} activate 0 to suspend or 1 to activate
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.SubAccountApi.prototype.userSubaccountactivation = function(subAccountSID, activate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/user/subaccountactivation.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'subAccountSID' is set
  if (!subAccountSID) {
    throw new Error('Missing required parameter subAccountSID when calling userSubaccountactivation');
  }
  // verify required parameter 'activate' is set
  if (!activate) {
    throw new Error('Missing required parameter activate when calling userSubaccountactivation');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['SubAccountSID'] = subAccountSID;

  formParams['Activate'] = activate;

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
