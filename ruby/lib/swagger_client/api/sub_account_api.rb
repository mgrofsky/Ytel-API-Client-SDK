=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require "uri"

module SwaggerClient
  class SubAccountApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Create Subaccount
    # Create a sub user account under the parent account
    # @param first_name Sub account user first name
    # @param last_name sub account user last name
    # @param email Sub account email address
    # @param friendly_name Descriptive name of the sub account
    # @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def user_createsubaccount(first_name, last_name, email, friendly_name, password, opts = {})
      data, _status_code, _headers = user_createsubaccount_with_http_info(first_name, last_name, email, friendly_name, password, opts)
      return data
    end

    # Create Subaccount
    # Create a sub user account under the parent account
    # @param first_name Sub account user first name
    # @param last_name sub account user last name
    # @param email Sub account email address
    # @param friendly_name Descriptive name of the sub account
    # @param password The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def user_createsubaccount_with_http_info(first_name, last_name, email, friendly_name, password, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SubAccountApi.user_createsubaccount ..."
      end
      # verify the required parameter 'first_name' is set
      if @api_client.config.client_side_validation && first_name.nil?
        fail ArgumentError, "Missing the required parameter 'first_name' when calling SubAccountApi.user_createsubaccount"
      end
      # verify the required parameter 'last_name' is set
      if @api_client.config.client_side_validation && last_name.nil?
        fail ArgumentError, "Missing the required parameter 'last_name' when calling SubAccountApi.user_createsubaccount"
      end
      # verify the required parameter 'email' is set
      if @api_client.config.client_side_validation && email.nil?
        fail ArgumentError, "Missing the required parameter 'email' when calling SubAccountApi.user_createsubaccount"
      end
      # verify the required parameter 'friendly_name' is set
      if @api_client.config.client_side_validation && friendly_name.nil?
        fail ArgumentError, "Missing the required parameter 'friendly_name' when calling SubAccountApi.user_createsubaccount"
      end
      # verify the required parameter 'password' is set
      if @api_client.config.client_side_validation && password.nil?
        fail ArgumentError, "Missing the required parameter 'password' when calling SubAccountApi.user_createsubaccount"
      end
      # resource path
      local_var_path = "/user/createsubaccount.json"

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
      form_params["FirstName"] = first_name
      form_params["LastName"] = last_name
      form_params["Email"] = email
      form_params["FriendlyName"] = friendly_name
      form_params["Password"] = password

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
        @api_client.config.logger.debug "API called: SubAccountApi#user_createsubaccount\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete Subaccount
    # Delete sub account or merge numbers into parent
    # @param sub_account_sid The SubaccountSid to be deleted
    # @param merge_number 0 to delete or 1 to merge numbers to parent account.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def user_deletesubaccount(sub_account_sid, merge_number, opts = {})
      data, _status_code, _headers = user_deletesubaccount_with_http_info(sub_account_sid, merge_number, opts)
      return data
    end

    # Delete Subaccount
    # Delete sub account or merge numbers into parent
    # @param sub_account_sid The SubaccountSid to be deleted
    # @param merge_number 0 to delete or 1 to merge numbers to parent account.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def user_deletesubaccount_with_http_info(sub_account_sid, merge_number, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SubAccountApi.user_deletesubaccount ..."
      end
      # verify the required parameter 'sub_account_sid' is set
      if @api_client.config.client_side_validation && sub_account_sid.nil?
        fail ArgumentError, "Missing the required parameter 'sub_account_sid' when calling SubAccountApi.user_deletesubaccount"
      end
      # verify the required parameter 'merge_number' is set
      if @api_client.config.client_side_validation && merge_number.nil?
        fail ArgumentError, "Missing the required parameter 'merge_number' when calling SubAccountApi.user_deletesubaccount"
      end
      # verify enum value
      if @api_client.config.client_side_validation && !['0', '1'].include?(merge_number)
        fail ArgumentError, "invalid value for 'merge_number', must be one of 0, 1"
      end
      # resource path
      local_var_path = "/user/deletesubaccount.json"

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
      form_params["SubAccountSID"] = sub_account_sid
      form_params["MergeNumber"] = merge_number

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
        @api_client.config.logger.debug "API called: SubAccountApi#user_deletesubaccount\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Toggle Subaccount Status
    # Suspend or unsuspend
    # @param sub_account_sid The SubaccountSid to be activated or suspended
    # @param activate 0 to suspend or 1 to activate
    # @param [Hash] opts the optional parameters
    # @return [String]
    def user_subaccountactivation(sub_account_sid, activate, opts = {})
      data, _status_code, _headers = user_subaccountactivation_with_http_info(sub_account_sid, activate, opts)
      return data
    end

    # Toggle Subaccount Status
    # Suspend or unsuspend
    # @param sub_account_sid The SubaccountSid to be activated or suspended
    # @param activate 0 to suspend or 1 to activate
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def user_subaccountactivation_with_http_info(sub_account_sid, activate, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: SubAccountApi.user_subaccountactivation ..."
      end
      # verify the required parameter 'sub_account_sid' is set
      if @api_client.config.client_side_validation && sub_account_sid.nil?
        fail ArgumentError, "Missing the required parameter 'sub_account_sid' when calling SubAccountApi.user_subaccountactivation"
      end
      # verify the required parameter 'activate' is set
      if @api_client.config.client_side_validation && activate.nil?
        fail ArgumentError, "Missing the required parameter 'activate' when calling SubAccountApi.user_subaccountactivation"
      end
      # verify enum value
      if @api_client.config.client_side_validation && !['1', '0'].include?(activate)
        fail ArgumentError, "invalid value for 'activate', must be one of 1, 0"
      end
      # resource path
      local_var_path = "/user/subaccountactivation.json"

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
      form_params["SubAccountSID"] = sub_account_sid
      form_params["Activate"] = activate

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
        @api_client.config.logger.debug "API called: SubAccountApi#user_subaccountactivation\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end