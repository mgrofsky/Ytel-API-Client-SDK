=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require "uri"

module SwaggerClient
  class AddressApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Create Address
    # To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
    # @param name Name of user
    # @param address Address of user.
    # @param country Must be a 2 letter country short-name code (ISO 3166)
    # @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
    # @param city City Name.
    # @param zip Zip code of city.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :description Description of addresses.
    # @option opts [String] :email Email Id of user.
    # @option opts [String] :phone Phone number of user.
    # @return [String]
    def address_createaddress(name, address, country, state, city, zip, opts = {})
      data, _status_code, _headers = address_createaddress_with_http_info(name, address, country, state, city, zip, opts)
      return data
    end

    # Create Address
    # To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
    # @param name Name of user
    # @param address Address of user.
    # @param country Must be a 2 letter country short-name code (ISO 3166)
    # @param state Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
    # @param city City Name.
    # @param zip Zip code of city.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :description Description of addresses.
    # @option opts [String] :email Email Id of user.
    # @option opts [String] :phone Phone number of user.
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def address_createaddress_with_http_info(name, address, country, state, city, zip, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AddressApi.address_createaddress ..."
      end
      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling AddressApi.address_createaddress"
      end
      # verify the required parameter 'address' is set
      if @api_client.config.client_side_validation && address.nil?
        fail ArgumentError, "Missing the required parameter 'address' when calling AddressApi.address_createaddress"
      end
      # verify the required parameter 'country' is set
      if @api_client.config.client_side_validation && country.nil?
        fail ArgumentError, "Missing the required parameter 'country' when calling AddressApi.address_createaddress"
      end
      # verify the required parameter 'state' is set
      if @api_client.config.client_side_validation && state.nil?
        fail ArgumentError, "Missing the required parameter 'state' when calling AddressApi.address_createaddress"
      end
      # verify the required parameter 'city' is set
      if @api_client.config.client_side_validation && city.nil?
        fail ArgumentError, "Missing the required parameter 'city' when calling AddressApi.address_createaddress"
      end
      # verify the required parameter 'zip' is set
      if @api_client.config.client_side_validation && zip.nil?
        fail ArgumentError, "Missing the required parameter 'zip' when calling AddressApi.address_createaddress"
      end
      # resource path
      local_var_path = "/address/createaddress.json"

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
      form_params["Name"] = name
      form_params["Address"] = address
      form_params["Country"] = country
      form_params["State"] = state
      form_params["City"] = city
      form_params["Zip"] = zip
      form_params["Description"] = opts[:'description'] if !opts[:'description'].nil?
      form_params["email"] = opts[:'email'] if !opts[:'email'].nil?
      form_params["Phone"] = opts[:'phone'] if !opts[:'phone'].nil?

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
        @api_client.config.logger.debug "API called: AddressApi#address_createaddress\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete Address
    # To delete Address to your address book
    # @param addressid The identifier of the address to be deleted.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def address_deleteaddress(addressid, opts = {})
      data, _status_code, _headers = address_deleteaddress_with_http_info(addressid, opts)
      return data
    end

    # Delete Address
    # To delete Address to your address book
    # @param addressid The identifier of the address to be deleted.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def address_deleteaddress_with_http_info(addressid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AddressApi.address_deleteaddress ..."
      end
      # verify the required parameter 'addressid' is set
      if @api_client.config.client_side_validation && addressid.nil?
        fail ArgumentError, "Missing the required parameter 'addressid' when calling AddressApi.address_deleteaddress"
      end
      # resource path
      local_var_path = "/address/deleteaddress.json"

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
      form_params["addressid"] = addressid

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
        @api_client.config.logger.debug "API called: AddressApi#address_deleteaddress\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Addresses
    # List All Address 
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (default to 1)
    # @option opts [Integer] :pagesize How many results to return, default is 10, max is 100, must be an integer (default to 10)
    # @option opts [String] :addressid addresses Sid
    # @option opts [String] :date_created date created address.
    # @return [String]
    def address_listaddress(opts = {})
      data, _status_code, _headers = address_listaddress_with_http_info(opts)
      return data
    end

    # List Addresses
    # List All Address 
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    # @option opts [Integer] :pagesize How many results to return, default is 10, max is 100, must be an integer
    # @option opts [String] :addressid addresses Sid
    # @option opts [String] :date_created date created address.
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def address_listaddress_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AddressApi.address_listaddress ..."
      end
      # resource path
      local_var_path = "/address/listaddress.json"

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
      form_params["addressid"] = opts[:'addressid'] if !opts[:'addressid'].nil?
      form_params["dateCreated"] = opts[:'date_created'] if !opts[:'date_created'].nil?

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
        @api_client.config.logger.debug "API called: AddressApi#address_listaddress\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Verify Address
    # Validates an address given.
    # @param addressid The identifier of the address to be verified.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def address_verifyaddress(addressid, opts = {})
      data, _status_code, _headers = address_verifyaddress_with_http_info(addressid, opts)
      return data
    end

    # Verify Address
    # Validates an address given.
    # @param addressid The identifier of the address to be verified.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def address_verifyaddress_with_http_info(addressid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AddressApi.address_verifyaddress ..."
      end
      # verify the required parameter 'addressid' is set
      if @api_client.config.client_side_validation && addressid.nil?
        fail ArgumentError, "Missing the required parameter 'addressid' when calling AddressApi.address_verifyaddress"
      end
      # resource path
      local_var_path = "/address/verifyaddress.json"

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
      form_params["addressid"] = addressid

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
        @api_client.config.logger.debug "API called: AddressApi#address_verifyaddress\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # View Address
    # View Address Specific address Book by providing the address id
    # @param addressid The identifier of the address to be retrieved.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def address_viewaddress(addressid, opts = {})
      data, _status_code, _headers = address_viewaddress_with_http_info(addressid, opts)
      return data
    end

    # View Address
    # View Address Specific address Book by providing the address id
    # @param addressid The identifier of the address to be retrieved.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def address_viewaddress_with_http_info(addressid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AddressApi.address_viewaddress ..."
      end
      # verify the required parameter 'addressid' is set
      if @api_client.config.client_side_validation && addressid.nil?
        fail ArgumentError, "Missing the required parameter 'addressid' when calling AddressApi.address_viewaddress"
      end
      # resource path
      local_var_path = "/address/viewaddress.json"

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
      form_params["addressid"] = addressid

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
        @api_client.config.logger.debug "API called: AddressApi#address_viewaddress\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end