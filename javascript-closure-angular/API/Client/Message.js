goog.provide('API.Client.Message');

/**
 * @record
 */
API.Client.Message = function() {}

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.apiVersion;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.messageSid;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.from;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.to;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.messagePrice;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.body;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.dateSent;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.status;

/**
 * 
 * @type {!string}
 * @export
 */
API.Client.Message.prototype.templateId;

/**
 * @type {!API.Client.TemplateData}
 * @export
 */
API.Client.Message.prototype.templateData;

