=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.12

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.3.1

=end

require "uri"

module SwaggerClient
  class SharedShortCodeApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # List Keywords
    # Retrieve a list of keywords associated with your Ytel account.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (default to 1)
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page (default to 10)
    # @option opts [String] :keyword Only list keywords of keyword
    # @option opts [Integer] :shortcode Only list keywords of shortcode
    # @return [String]
    def keyword_lists(opts = {})
      data, _status_code, _headers = keyword_lists_with_http_info(opts)
      return data
    end

    # List Keywords
    # Retrieve a list of keywords associated with your Ytel account.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page
    # @option opts [String] :keyword Only list keywords of keyword
    # @option opts [Integer] :shortcode Only list keywords of shortcode
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def keyword_lists_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.keyword_lists ..."
      end
      # resource path
      local_var_path = "/keyword/lists.json"

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["page"] = opts[:'page'] if !opts[:'page'].nil?
      form_params["pagesize"] = opts[:'pagesize'] if !opts[:'pagesize'].nil?
      form_params["Keyword"] = opts[:'keyword'] if !opts[:'keyword'].nil?
      form_params["Shortcode"] = opts[:'shortcode'] if !opts[:'shortcode'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#keyword_lists\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # View Keyword
    # View a set of properties for a single keyword.
    # @param keywordid The unique identifier of each keyword
    # @param [Hash] opts the optional parameters
    # @return [String]
    def keyword_view(keywordid, opts = {})
      data, _status_code, _headers = keyword_view_with_http_info(keywordid, opts)
      return data
    end

    # View Keyword
    # View a set of properties for a single keyword.
    # @param keywordid The unique identifier of each keyword
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def keyword_view_with_http_info(keywordid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.keyword_view ..."
      end
      # verify the required parameter 'keywordid' is set
      if @api_client.config.client_side_validation && keywordid.nil?
        fail ArgumentError, "Missing the required parameter 'keywordid' when calling SharedShortCodeApi.keyword_view"
      end
      # resource path
      local_var_path = "/keyword/view.json"

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["Keywordid"] = keywordid

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#keyword_view\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Inbound SMS
    # List All Inbound ShortCode
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (default to 1)
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page (default to 10)
    # @option opts [String] :from From Number to Inbound ShortCode
    # @option opts [String] :shortcode Only list messages sent to this Short Code
    # @option opts [String] :datecreated Only list messages sent with the specified date
    # @return [String]
    def shortcode_getinboundsms(opts = {})
      data, _status_code, _headers = shortcode_getinboundsms_with_http_info(opts)
      return data
    end

    # List Inbound SMS
    # List All Inbound ShortCode
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page
    # @option opts [String] :from From Number to Inbound ShortCode
    # @option opts [String] :shortcode Only list messages sent to this Short Code
    # @option opts [String] :datecreated Only list messages sent with the specified date
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def shortcode_getinboundsms_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.shortcode_getinboundsms ..."
      end
      # resource path
      local_var_path = "/shortcode/getinboundsms.json"

      # query parameters
      query_params = {}
      query_params[:'Datecreated'] = opts[:'datecreated'] if !opts[:'datecreated'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["page"] = opts[:'page'] if !opts[:'page'].nil?
      form_params["pagesize"] = opts[:'pagesize'] if !opts[:'pagesize'].nil?
      form_params["from"] = opts[:'from'] if !opts[:'from'].nil?
      form_params["Shortcode"] = opts[:'shortcode'] if !opts[:'shortcode'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#shortcode_getinboundsms\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Shortcodes
    # Retrieve a list of shortcode assignment associated with your Ytel account.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (default to 1)
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page (default to 10)
    # @option opts [String] :shortcode Only list keywords of shortcode
    # @return [String]
    def shortcode_listshortcode(opts = {})
      data, _status_code, _headers = shortcode_listshortcode_with_http_info(opts)
      return data
    end

    # List Shortcodes
    # Retrieve a list of shortcode assignment associated with your Ytel account.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page
    # @option opts [String] :shortcode Only list keywords of shortcode
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def shortcode_listshortcode_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.shortcode_listshortcode ..."
      end
      # resource path
      local_var_path = "/shortcode/listshortcode.json"

      # query parameters
      query_params = {}
      query_params[:'Shortcode'] = opts[:'shortcode'] if !opts[:'shortcode'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["page"] = opts[:'page'] if !opts[:'page'].nil?
      form_params["pagesize"] = opts[:'pagesize'] if !opts[:'pagesize'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#shortcode_listshortcode\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Send SMS
    # Send an SMS from a Ytel ShortCode
    # @param shortcode The Short Code number that is the sender of this message
    # @param to A valid 10-digit number that should receive the message
    # @param templateid The unique identifier for the template used for the message
    # @param data format of your data, example: {companyname}:test,{otpcode}:1234
    # @param [Hash] opts the optional parameters
    # @option opts [String] :method Specifies the HTTP method used to request the required URL once the Short Code message is sent. (default to GET)
    # @option opts [String] :message_status_callback URL that can be requested to receive notification when Short Code message was sent.
    # @return [String]
    def shortcode_sendsms(shortcode, to, templateid, data, opts = {})
      data, _status_code, _headers = shortcode_sendsms_with_http_info(shortcode, to, templateid, data, opts)
      return data
    end

    # Send SMS
    # Send an SMS from a Ytel ShortCode
    # @param shortcode The Short Code number that is the sender of this message
    # @param to A valid 10-digit number that should receive the message
    # @param templateid The unique identifier for the template used for the message
    # @param data format of your data, example: {companyname}:test,{otpcode}:1234
    # @param [Hash] opts the optional parameters
    # @option opts [String] :method Specifies the HTTP method used to request the required URL once the Short Code message is sent.
    # @option opts [String] :message_status_callback URL that can be requested to receive notification when Short Code message was sent.
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def shortcode_sendsms_with_http_info(shortcode, to, templateid, data, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.shortcode_sendsms ..."
      end
      # verify the required parameter 'shortcode' is set
      if @api_client.config.client_side_validation && shortcode.nil?
        fail ArgumentError, "Missing the required parameter 'shortcode' when calling SharedShortCodeApi.shortcode_sendsms"
      end
      # verify the required parameter 'to' is set
      if @api_client.config.client_side_validation && to.nil?
        fail ArgumentError, "Missing the required parameter 'to' when calling SharedShortCodeApi.shortcode_sendsms"
      end
      # verify the required parameter 'templateid' is set
      if @api_client.config.client_side_validation && templateid.nil?
        fail ArgumentError, "Missing the required parameter 'templateid' when calling SharedShortCodeApi.shortcode_sendsms"
      end
      # verify the required parameter 'data' is set
      if @api_client.config.client_side_validation && data.nil?
        fail ArgumentError, "Missing the required parameter 'data' when calling SharedShortCodeApi.shortcode_sendsms"
      end
      # resource path
      local_var_path = "/shortcode/sendsms.json"

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["shortcode"] = shortcode
      form_params["to"] = to
      form_params["templateid"] = templateid
      form_params["data"] = data
      form_params["Method"] = opts[:'method'] if !opts[:'method'].nil?
      form_params["MessageStatusCallback"] = opts[:'message_status_callback'] if !opts[:'message_status_callback'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#shortcode_sendsms\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update Shortcode
    # Update Assignment
    # @param shortcode List of valid shortcode to your Ytel account
    # @param [Hash] opts the optional parameters
    # @option opts [String] :friendly_name User generated name of the shortcode
    # @option opts [String] :callback_url URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
    # @option opts [String] :callback_method Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
    # @option opts [String] :fallback_url URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
    # @option opts [String] :fallback_url_method Specifies the HTTP method used to request the required FallbackUrl once call connects.
    # @return [String]
    def shortcode_updateshortcode(shortcode, opts = {})
      data, _status_code, _headers = shortcode_updateshortcode_with_http_info(shortcode, opts)
      return data
    end

    # Update Shortcode
    # Update Assignment
    # @param shortcode List of valid shortcode to your Ytel account
    # @param [Hash] opts the optional parameters
    # @option opts [String] :friendly_name User generated name of the shortcode
    # @option opts [String] :callback_url URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
    # @option opts [String] :callback_method Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
    # @option opts [String] :fallback_url URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
    # @option opts [String] :fallback_url_method Specifies the HTTP method used to request the required FallbackUrl once call connects.
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def shortcode_updateshortcode_with_http_info(shortcode, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.shortcode_updateshortcode ..."
      end
      # verify the required parameter 'shortcode' is set
      if @api_client.config.client_side_validation && shortcode.nil?
        fail ArgumentError, "Missing the required parameter 'shortcode' when calling SharedShortCodeApi.shortcode_updateshortcode"
      end
      # resource path
      local_var_path = "/shortcode/updateshortcode.json"

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["Shortcode"] = shortcode
      form_params["FriendlyName"] = opts[:'friendly_name'] if !opts[:'friendly_name'].nil?
      form_params["CallbackUrl"] = opts[:'callback_url'] if !opts[:'callback_url'].nil?
      form_params["CallbackMethod"] = opts[:'callback_method'] if !opts[:'callback_method'].nil?
      form_params["FallbackUrl"] = opts[:'fallback_url'] if !opts[:'fallback_url'].nil?
      form_params["FallbackUrlMethod"] = opts[:'fallback_url_method'] if !opts[:'fallback_url_method'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#shortcode_updateshortcode\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # View Shortcode
    # The response returned here contains all resource properties associated with the given Shortcode.
    # @param shortcode List of valid Shortcode to your Ytel account
    # @param [Hash] opts the optional parameters
    # @return [String]
    def shortcode_viewshortcode(shortcode, opts = {})
      data, _status_code, _headers = shortcode_viewshortcode_with_http_info(shortcode, opts)
      return data
    end

    # View Shortcode
    # The response returned here contains all resource properties associated with the given Shortcode.
    # @param shortcode List of valid Shortcode to your Ytel account
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def shortcode_viewshortcode_with_http_info(shortcode, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.shortcode_viewshortcode ..."
      end
      # verify the required parameter 'shortcode' is set
      if @api_client.config.client_side_validation && shortcode.nil?
        fail ArgumentError, "Missing the required parameter 'shortcode' when calling SharedShortCodeApi.shortcode_viewshortcode"
      end
      # resource path
      local_var_path = "/shortcode/viewshortcode.json"

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["Shortcode"] = shortcode

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#shortcode_viewshortcode\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Templates
    # List Shortcode Templates by Type
    # @param [Hash] opts the optional parameters
    # @option opts [String] :type The type (category) of template Valid values: marketing, authorization (default to authorization)
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (default to 1)
    # @option opts [Integer] :pagesize The count of objects to return per page. (default to 10)
    # @option opts [String] :shortcode Only list templates of type
    # @return [String]
    def template_lists(opts = {})
      data, _status_code, _headers = template_lists_with_http_info(opts)
      return data
    end

    # List Templates
    # List Shortcode Templates by Type
    # @param [Hash] opts the optional parameters
    # @option opts [String] :type The type (category) of template Valid values: marketing, authorization
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    # @option opts [Integer] :pagesize The count of objects to return per page.
    # @option opts [String] :shortcode Only list templates of type
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def template_lists_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.template_lists ..."
      end
      # resource path
      local_var_path = "/template/lists.json"

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["type"] = opts[:'type'] if !opts[:'type'].nil?
      form_params["page"] = opts[:'page'] if !opts[:'page'].nil?
      form_params["pagesize"] = opts[:'pagesize'] if !opts[:'pagesize'].nil?
      form_params["Shortcode"] = opts[:'shortcode'] if !opts[:'shortcode'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#template_lists\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # View Template
    # View a Shared ShortCode Template
    # @param template_id The unique identifier for a template object
    # @param [Hash] opts the optional parameters
    # @return [String]
    def template_view(template_id, opts = {})
      data, _status_code, _headers = template_view_with_http_info(template_id, opts)
      return data
    end

    # View Template
    # View a Shared ShortCode Template
    # @param template_id The unique identifier for a template object
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def template_view_with_http_info(template_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SharedShortCodeApi.template_view ..."
      end
      # verify the required parameter 'template_id' is set
      if @api_client.config.client_side_validation && template_id.nil?
        fail ArgumentError, "Missing the required parameter 'template_id' when calling SharedShortCodeApi.template_view"
      end
      # resource path
      local_var_path = "/template/view.json"

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["TemplateId"] = template_id

      # http body (model)
      post_body = nil
      auth_names = ['auth']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SharedShortCodeApi#template_view\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
