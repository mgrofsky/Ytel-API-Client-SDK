/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.ConferenceApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Ytel API version 3
 * Version: 3.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.ConferenceApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.ConferenceApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('ConferenceApiBasePath') ?
                   /** @type {!string} */ ($injector.get('ConferenceApiBasePath')) :
                   'https://api.message360.com/api/v3/';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('ConferenceApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('ConferenceApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.ConferenceApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Add Participant
 * Add Participant in conference 
 * @param {!string} conferenceSid The unique identifier for a conference object.
 * @param {!string} participantNumber The phone number of the participant to be added.
 * @param {!boolean=} opt_muted Specifies if participant should be muted.
 * @param {!boolean=} opt_deaf Specifies if the participant should hear audio in the conference.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesAddParticipant = function(conferenceSid, participantNumber, opt_muted, opt_deaf, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/addParticipant.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'conferenceSid' is set
  if (!conferenceSid) {
    throw new Error('Missing required parameter conferenceSid when calling conferencesAddParticipant');
  }
  // verify required parameter 'participantNumber' is set
  if (!participantNumber) {
    throw new Error('Missing required parameter participantNumber when calling conferencesAddParticipant');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['ConferenceSid'] = conferenceSid;

  formParams['ParticipantNumber'] = participantNumber;

  formParams['Muted'] = opt_muted;

  formParams['Deaf'] = opt_deaf;

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
 * Create Conference
 * Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
 * @param {!string} from A valid 10-digit number (E.164 format) that will be initiating the conference call.
 * @param {!string} to A valid 10-digit number (E.164 format) that is to receive the conference call.
 * @param {!string} url URL requested once the conference connects
 * @param {!string=} opt_method Specifies the HTTP method used to request the required URL once call connects.
 * @param {!string=} opt_statusCallBackUrl URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
 * @param {!string=} opt_statusCallBackMethod Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
 * @param {!string=} opt_fallbackUrl URL requested if the initial Url parameter fails or encounters an error
 * @param {!string=} opt_fallbackMethod Specifies the HTTP method used to request the required FallbackUrl once call connects.
 * @param {!boolean=} opt_record Specifies if the conference should be recorded.
 * @param {!string=} opt_recordCallBackUrl Recording parameters will be sent here upon completion.
 * @param {!string=} opt_recordCallBackMethod Specifies the HTTP method used to request the required URL once conference connects.
 * @param {!string=} opt_scheduleTime Schedule conference in future. Schedule time must be greater than current time
 * @param {!number=} opt_timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesCreateConference = function(from, to, url, opt_method, opt_statusCallBackUrl, opt_statusCallBackMethod, opt_fallbackUrl, opt_fallbackMethod, opt_record, opt_recordCallBackUrl, opt_recordCallBackMethod, opt_scheduleTime, opt_timeout, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/createConference.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'from' is set
  if (!from) {
    throw new Error('Missing required parameter from when calling conferencesCreateConference');
  }
  // verify required parameter 'to' is set
  if (!to) {
    throw new Error('Missing required parameter to when calling conferencesCreateConference');
  }
  // verify required parameter 'url' is set
  if (!url) {
    throw new Error('Missing required parameter url when calling conferencesCreateConference');
  }
  if (url !== undefined) {
    queryParameters['Url'] = url;
  }

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['From'] = from;

  formParams['To'] = to;

  formParams['Method'] = opt_method;

  formParams['StatusCallBackUrl'] = opt_statusCallBackUrl;

  formParams['StatusCallBackMethod'] = opt_statusCallBackMethod;

  formParams['FallbackUrl'] = opt_fallbackUrl;

  formParams['FallbackMethod'] = opt_fallbackMethod;

  formParams['Record'] = opt_record;

  formParams['RecordCallBackUrl'] = opt_recordCallBackUrl;

  formParams['RecordCallBackMethod'] = opt_recordCallBackMethod;

  formParams['ScheduleTime'] = opt_scheduleTime;

  formParams['Timeout'] = opt_timeout;

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
 * Silence Participant
 * Deaf Mute Participant
 * @param {!string} conferenceSid ID of the active conference
 * @param {!string} participantSid ID of an active participant
 * @param {!boolean=} opt_muted Mute a participant
 * @param {!boolean=} opt_deaf Make it so a participant cant hear
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesDeafMuteParticipant = function(conferenceSid, participantSid, opt_muted, opt_deaf, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/deafMuteParticipant.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'conferenceSid' is set
  if (!conferenceSid) {
    throw new Error('Missing required parameter conferenceSid when calling conferencesDeafMuteParticipant');
  }
  // verify required parameter 'participantSid' is set
  if (!participantSid) {
    throw new Error('Missing required parameter participantSid when calling conferencesDeafMuteParticipant');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['conferenceSid'] = conferenceSid;

  formParams['ParticipantSid'] = participantSid;

  formParams['Muted'] = opt_muted;

  formParams['Deaf'] = opt_deaf;

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
 * Hangup Participant
 * Remove a participant from a conference.
 * @param {!string} conferenceSid The unique identifier for a conference object.
 * @param {!string} participantSid The unique identifier for a participant object.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesHangupParticipant = function(conferenceSid, participantSid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/hangupParticipant.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'conferenceSid' is set
  if (!conferenceSid) {
    throw new Error('Missing required parameter conferenceSid when calling conferencesHangupParticipant');
  }
  // verify required parameter 'participantSid' is set
  if (!participantSid) {
    throw new Error('Missing required parameter participantSid when calling conferencesHangupParticipant');
  }
  if (participantSid !== undefined) {
    queryParameters['ParticipantSid'] = participantSid;
  }

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['ConferenceSid'] = conferenceSid;

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
 * List Participants
 * Retrieve a list of participants for an in-progress conference.
 * @param {!string} conferenceSid The unique identifier for a conference.
 * @param {!number=} opt_page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!number=} opt_pagesize The count of objects to return per page.
 * @param {!boolean=} opt_muted Specifies if participant should be muted.
 * @param {!boolean=} opt_deaf Specifies if the participant should hear audio in the conference.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesListParticipant = function(conferenceSid, opt_page, opt_pagesize, opt_muted, opt_deaf, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/listParticipant.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'conferenceSid' is set
  if (!conferenceSid) {
    throw new Error('Missing required parameter conferenceSid when calling conferencesListParticipant');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['ConferenceSid'] = conferenceSid;

  formParams['Page'] = opt_page;

  formParams['Pagesize'] = opt_pagesize;

  formParams['Muted'] = opt_muted;

  formParams['Deaf'] = opt_deaf;

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
 * List Conferences
 * Retrieve a list of conference objects.
 * @param {!number=} opt_page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
 * @param {!number=} opt_pagesize Number of individual resources listed in the response per page
 * @param {!string=} opt_friendlyName Only return conferences with the specified FriendlyName
 * @param {!string=} opt_dateCreated Conference created date
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesListconference = function(opt_page, opt_pagesize, opt_friendlyName, opt_dateCreated, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/listconference.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['page'] = opt_page;

  formParams['pagesize'] = opt_pagesize;

  formParams['FriendlyName'] = opt_friendlyName;

  formParams['DateCreated'] = opt_dateCreated;

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
 * Play Audio
 * Play an audio file during a conference.
 * @param {!string} conferenceSid The unique identifier for a conference object.
 * @param {!string} participantSid The unique identifier for a participant object.
 * @param {!string} audioUrl The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesPlayAudio = function(conferenceSid, participantSid, audioUrl, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/playAudio.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'conferenceSid' is set
  if (!conferenceSid) {
    throw new Error('Missing required parameter conferenceSid when calling conferencesPlayAudio');
  }
  // verify required parameter 'participantSid' is set
  if (!participantSid) {
    throw new Error('Missing required parameter participantSid when calling conferencesPlayAudio');
  }
  // verify required parameter 'audioUrl' is set
  if (!audioUrl) {
    throw new Error('Missing required parameter audioUrl when calling conferencesPlayAudio');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['ConferenceSid'] = conferenceSid;

  formParams['ParticipantSid'] = participantSid;

  formParams['AudioUrl'] = audioUrl;

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
 * View Participant
 * Retrieve information about a participant by its ParticipantSid.
 * @param {!string} conferenceSid The unique identifier for a conference object.
 * @param {!string} participantSid The unique identifier for a participant object.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesViewParticipant = function(conferenceSid, participantSid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/viewParticipant.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'conferenceSid' is set
  if (!conferenceSid) {
    throw new Error('Missing required parameter conferenceSid when calling conferencesViewParticipant');
  }
  // verify required parameter 'participantSid' is set
  if (!participantSid) {
    throw new Error('Missing required parameter participantSid when calling conferencesViewParticipant');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['ConferenceSid'] = conferenceSid;

  formParams['ParticipantSid'] = participantSid;

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
 * View Conference
 * Retrieve information about a conference by its ConferenceSid.
 * @param {!string} conferenceSid The unique identifier of each conference resource
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.ConferenceApi.prototype.conferencesViewconference = function(conferenceSid, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/conferences/viewconference.json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var formParams = {};

  // verify required parameter 'conferenceSid' is set
  if (!conferenceSid) {
    throw new Error('Missing required parameter conferenceSid when calling conferencesViewconference');
  }
  headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

  formParams['ConferenceSid'] = conferenceSid;

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
