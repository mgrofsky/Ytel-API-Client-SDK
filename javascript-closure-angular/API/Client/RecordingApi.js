/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.RecordingApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Ytel API version 3
 * Version: 3.11
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.RecordingApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.RecordingApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('RecordingApiBasePath') ?
                   /** @type {!string} */ ($injector.get('RecordingApiBasePath')) :
                   'https://api.message360.com/api/v3/';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('RecordingApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('RecordingApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.RecordingApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Delete Recording
 * Remove a recording from your Ytel account.
 * @param {!string} recordingsid The unique identifier for a recording.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.RecordingApi.prototype.recordingDeleterecording = function(recordingsid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/recording/deleterecording.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'recordingsid' is set
  if (!recordingsid) {
    throw new Error('Missing required parameter recordingsid when calling recordingDeleterecording');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['recordingsid'] = recordingsid;

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
 * List Recordings
 * Retrieve a list of recording objects.
 * @param {!number=} opt_page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!number=} opt_pagesize The count of objects to return per page.
 * @param {!string=} opt_datecreated Filter results by creation date
 * @param {!string=} opt_callsid The unique identifier for a call.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.RecordingApi.prototype.recordingListrecording = function(opt_page, opt_pagesize, opt_datecreated, opt_callsid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/recording/listrecording.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['page'] = opt_page;

  formParams['pagesize'] = opt_pagesize;

  formParams['Datecreated'] = opt_datecreated;

  formParams['callsid'] = opt_callsid;

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
 * View Recording
 * Retrieve the recording of a call by its RecordingSid. This resource will return information regarding the call such as start time, end time, duration, and so forth.
 * @param {!string} recordingsid The unique identifier for the recording.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.RecordingApi.prototype.recordingViewrecording = function(recordingsid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/recording/viewrecording.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'recordingsid' is set
  if (!recordingsid) {
    throw new Error('Missing required parameter recordingsid when calling recordingViewrecording');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['recordingsid'] = recordingsid;

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
