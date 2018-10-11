=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.12

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.3.1

=end

require "uri"

module SwaggerClient
  class ConferenceApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Add Participant
    # Add Participant in conference 
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_number The phone number of the participant to be added.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :muted Specifies if participant should be muted.
    # @option opts [BOOLEAN] :deaf Specifies if the participant should hear audio in the conference.
    # @return [String]
    def conferences_add_participant(conference_sid, participant_number, opts = {})
      data, _status_code, _headers = conferences_add_participant_with_http_info(conference_sid, participant_number, opts)
      return data
    end

    # Add Participant
    # Add Participant in conference 
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_number The phone number of the participant to be added.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :muted Specifies if participant should be muted.
    # @option opts [BOOLEAN] :deaf Specifies if the participant should hear audio in the conference.
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_add_participant_with_http_info(conference_sid, participant_number, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_add_participant ..."
      end
      # verify the required parameter 'conference_sid' is set
      if @api_client.config.client_side_validation && conference_sid.nil?
        fail ArgumentError, "Missing the required parameter 'conference_sid' when calling ConferenceApi.conferences_add_participant"
      end
      # verify the required parameter 'participant_number' is set
      if @api_client.config.client_side_validation && participant_number.nil?
        fail ArgumentError, "Missing the required parameter 'participant_number' when calling ConferenceApi.conferences_add_participant"
      end
      # resource path
      local_var_path = "/conferences/addParticipant.json"

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
      form_params["ConferenceSid"] = conference_sid
      form_params["ParticipantNumber"] = participant_number
      form_params["Muted"] = opts[:'muted'] if !opts[:'muted'].nil?
      form_params["Deaf"] = opts[:'deaf'] if !opts[:'deaf'].nil?

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_add_participant\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Create Conference
    # Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
    # @param from A valid 10-digit number (E.164 format) that will be initiating the conference call.
    # @param to A valid 10-digit number (E.164 format) that is to receive the conference call.
    # @param url URL requested once the conference connects
    # @param [Hash] opts the optional parameters
    # @option opts [String] :method Specifies the HTTP method used to request the required URL once call connects. (default to POST)
    # @option opts [String] :status_call_back_url URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
    # @option opts [String] :status_call_back_method Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
    # @option opts [String] :fallback_url URL requested if the initial Url parameter fails or encounters an error
    # @option opts [String] :fallback_method Specifies the HTTP method used to request the required FallbackUrl once call connects.
    # @option opts [BOOLEAN] :record Specifies if the conference should be recorded.
    # @option opts [String] :record_call_back_url Recording parameters will be sent here upon completion.
    # @option opts [String] :record_call_back_method Specifies the HTTP method used to request the required URL once conference connects.
    # @option opts [String] :schedule_time Schedule conference in future. Schedule time must be greater than current time
    # @option opts [Integer] :timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
    # @return [String]
    def conferences_create_conference(from, to, url, opts = {})
      data, _status_code, _headers = conferences_create_conference_with_http_info(from, to, url, opts)
      return data
    end

    # Create Conference
    # Here you can experiment with initiating a conference call through Ytel and view the request response generated when doing so.
    # @param from A valid 10-digit number (E.164 format) that will be initiating the conference call.
    # @param to A valid 10-digit number (E.164 format) that is to receive the conference call.
    # @param url URL requested once the conference connects
    # @param [Hash] opts the optional parameters
    # @option opts [String] :method Specifies the HTTP method used to request the required URL once call connects.
    # @option opts [String] :status_call_back_url URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the conference is finished.
    # @option opts [String] :status_call_back_method Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
    # @option opts [String] :fallback_url URL requested if the initial Url parameter fails or encounters an error
    # @option opts [String] :fallback_method Specifies the HTTP method used to request the required FallbackUrl once call connects.
    # @option opts [BOOLEAN] :record Specifies if the conference should be recorded.
    # @option opts [String] :record_call_back_url Recording parameters will be sent here upon completion.
    # @option opts [String] :record_call_back_method Specifies the HTTP method used to request the required URL once conference connects.
    # @option opts [String] :schedule_time Schedule conference in future. Schedule time must be greater than current time
    # @option opts [Integer] :timeout The number of seconds the call stays on the line while waiting for an answer. The max time limit is 999 and the default limit is 60 seconds but lower times can be set.
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_create_conference_with_http_info(from, to, url, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_create_conference ..."
      end
      # verify the required parameter 'from' is set
      if @api_client.config.client_side_validation && from.nil?
        fail ArgumentError, "Missing the required parameter 'from' when calling ConferenceApi.conferences_create_conference"
      end
      # verify the required parameter 'to' is set
      if @api_client.config.client_side_validation && to.nil?
        fail ArgumentError, "Missing the required parameter 'to' when calling ConferenceApi.conferences_create_conference"
      end
      # verify the required parameter 'url' is set
      if @api_client.config.client_side_validation && url.nil?
        fail ArgumentError, "Missing the required parameter 'url' when calling ConferenceApi.conferences_create_conference"
      end
      # resource path
      local_var_path = "/conferences/createConference.json"

      # query parameters
      query_params = {}
      query_params[:'Url'] = url

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["From"] = from
      form_params["To"] = to
      form_params["Method"] = opts[:'method'] if !opts[:'method'].nil?
      form_params["StatusCallBackUrl"] = opts[:'status_call_back_url'] if !opts[:'status_call_back_url'].nil?
      form_params["StatusCallBackMethod"] = opts[:'status_call_back_method'] if !opts[:'status_call_back_method'].nil?
      form_params["FallbackUrl"] = opts[:'fallback_url'] if !opts[:'fallback_url'].nil?
      form_params["FallbackMethod"] = opts[:'fallback_method'] if !opts[:'fallback_method'].nil?
      form_params["Record"] = opts[:'record'] if !opts[:'record'].nil?
      form_params["RecordCallBackUrl"] = opts[:'record_call_back_url'] if !opts[:'record_call_back_url'].nil?
      form_params["RecordCallBackMethod"] = opts[:'record_call_back_method'] if !opts[:'record_call_back_method'].nil?
      form_params["ScheduleTime"] = opts[:'schedule_time'] if !opts[:'schedule_time'].nil?
      form_params["Timeout"] = opts[:'timeout'] if !opts[:'timeout'].nil?

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_create_conference\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Silence Participant
    # Deaf Mute Participant
    # @param conference_sid ID of the active conference
    # @param participant_sid ID of an active participant
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :muted Mute a participant
    # @option opts [BOOLEAN] :deaf Make it so a participant cant hear
    # @return [String]
    def conferences_deaf_mute_participant(conference_sid, participant_sid, opts = {})
      data, _status_code, _headers = conferences_deaf_mute_participant_with_http_info(conference_sid, participant_sid, opts)
      return data
    end

    # Silence Participant
    # Deaf Mute Participant
    # @param conference_sid ID of the active conference
    # @param participant_sid ID of an active participant
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :muted Mute a participant
    # @option opts [BOOLEAN] :deaf Make it so a participant cant hear
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_deaf_mute_participant_with_http_info(conference_sid, participant_sid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_deaf_mute_participant ..."
      end
      # verify the required parameter 'conference_sid' is set
      if @api_client.config.client_side_validation && conference_sid.nil?
        fail ArgumentError, "Missing the required parameter 'conference_sid' when calling ConferenceApi.conferences_deaf_mute_participant"
      end
      # verify the required parameter 'participant_sid' is set
      if @api_client.config.client_side_validation && participant_sid.nil?
        fail ArgumentError, "Missing the required parameter 'participant_sid' when calling ConferenceApi.conferences_deaf_mute_participant"
      end
      # resource path
      local_var_path = "/conferences/deafMuteParticipant.json"

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
      form_params["conferenceSid"] = conference_sid
      form_params["ParticipantSid"] = participant_sid
      form_params["Muted"] = opts[:'muted'] if !opts[:'muted'].nil?
      form_params["Deaf"] = opts[:'deaf'] if !opts[:'deaf'].nil?

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_deaf_mute_participant\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Hangup Participant
    # Remove a participant from a conference.
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_sid The unique identifier for a participant object.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def conferences_hangup_participant(conference_sid, participant_sid, opts = {})
      data, _status_code, _headers = conferences_hangup_participant_with_http_info(conference_sid, participant_sid, opts)
      return data
    end

    # Hangup Participant
    # Remove a participant from a conference.
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_sid The unique identifier for a participant object.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_hangup_participant_with_http_info(conference_sid, participant_sid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_hangup_participant ..."
      end
      # verify the required parameter 'conference_sid' is set
      if @api_client.config.client_side_validation && conference_sid.nil?
        fail ArgumentError, "Missing the required parameter 'conference_sid' when calling ConferenceApi.conferences_hangup_participant"
      end
      # verify the required parameter 'participant_sid' is set
      if @api_client.config.client_side_validation && participant_sid.nil?
        fail ArgumentError, "Missing the required parameter 'participant_sid' when calling ConferenceApi.conferences_hangup_participant"
      end
      # resource path
      local_var_path = "/conferences/hangupParticipant.json"

      # query parameters
      query_params = {}
      query_params[:'ParticipantSid'] = participant_sid

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params["ConferenceSid"] = conference_sid

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_hangup_participant\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Participants
    # Retrieve a list of participants for an in-progress conference.
    # @param conference_sid The unique identifier for a conference.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (default to 1)
    # @option opts [Integer] :pagesize The count of objects to return per page. (default to 10)
    # @option opts [BOOLEAN] :muted Specifies if participant should be muted.
    # @option opts [BOOLEAN] :deaf Specifies if the participant should hear audio in the conference.
    # @return [String]
    def conferences_list_participant(conference_sid, opts = {})
      data, _status_code, _headers = conferences_list_participant_with_http_info(conference_sid, opts)
      return data
    end

    # List Participants
    # Retrieve a list of participants for an in-progress conference.
    # @param conference_sid The unique identifier for a conference.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    # @option opts [Integer] :pagesize The count of objects to return per page.
    # @option opts [BOOLEAN] :muted Specifies if participant should be muted.
    # @option opts [BOOLEAN] :deaf Specifies if the participant should hear audio in the conference.
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_list_participant_with_http_info(conference_sid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_list_participant ..."
      end
      # verify the required parameter 'conference_sid' is set
      if @api_client.config.client_side_validation && conference_sid.nil?
        fail ArgumentError, "Missing the required parameter 'conference_sid' when calling ConferenceApi.conferences_list_participant"
      end
      # resource path
      local_var_path = "/conferences/listParticipant.json"

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
      form_params["ConferenceSid"] = conference_sid
      form_params["Page"] = opts[:'page'] if !opts[:'page'].nil?
      form_params["Pagesize"] = opts[:'pagesize'] if !opts[:'pagesize'].nil?
      form_params["Muted"] = opts[:'muted'] if !opts[:'muted'].nil?
      form_params["Deaf"] = opts[:'deaf'] if !opts[:'deaf'].nil?

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_list_participant\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # List Conferences
    # Retrieve a list of conference objects.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1. (default to 1)
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page (default to 10)
    # @option opts [String] :friendly_name Only return conferences with the specified FriendlyName
    # @option opts [String] :date_created Conference created date
    # @return [String]
    def conferences_listconference(opts = {})
      data, _status_code, _headers = conferences_listconference_with_http_info(opts)
      return data
    end

    # List Conferences
    # Retrieve a list of conference objects.
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
    # @option opts [Integer] :pagesize Number of individual resources listed in the response per page
    # @option opts [String] :friendly_name Only return conferences with the specified FriendlyName
    # @option opts [String] :date_created Conference created date
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_listconference_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_listconference ..."
      end
      # resource path
      local_var_path = "/conferences/listconference.json"

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
      form_params["FriendlyName"] = opts[:'friendly_name'] if !opts[:'friendly_name'].nil?
      form_params["DateCreated"] = opts[:'date_created'] if !opts[:'date_created'].nil?

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_listconference\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Play Audio
    # Play an audio file during a conference.
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_sid The unique identifier for a participant object.
    # @param audio_url The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def conferences_play_audio(conference_sid, participant_sid, audio_url, opts = {})
      data, _status_code, _headers = conferences_play_audio_with_http_info(conference_sid, participant_sid, audio_url, opts)
      return data
    end

    # Play Audio
    # Play an audio file during a conference.
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_sid The unique identifier for a participant object.
    # @param audio_url The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_play_audio_with_http_info(conference_sid, participant_sid, audio_url, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_play_audio ..."
      end
      # verify the required parameter 'conference_sid' is set
      if @api_client.config.client_side_validation && conference_sid.nil?
        fail ArgumentError, "Missing the required parameter 'conference_sid' when calling ConferenceApi.conferences_play_audio"
      end
      # verify the required parameter 'participant_sid' is set
      if @api_client.config.client_side_validation && participant_sid.nil?
        fail ArgumentError, "Missing the required parameter 'participant_sid' when calling ConferenceApi.conferences_play_audio"
      end
      # verify the required parameter 'audio_url' is set
      if @api_client.config.client_side_validation && audio_url.nil?
        fail ArgumentError, "Missing the required parameter 'audio_url' when calling ConferenceApi.conferences_play_audio"
      end
      # verify enum value
      if @api_client.config.client_side_validation && !['mp3', 'wav'].include?(audio_url)
        fail ArgumentError, "invalid value for 'audio_url', must be one of mp3, wav"
      end
      # resource path
      local_var_path = "/conferences/playAudio.json"

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
      form_params["ConferenceSid"] = conference_sid
      form_params["ParticipantSid"] = participant_sid
      form_params["AudioUrl"] = audio_url

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_play_audio\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # View Participant
    # Retrieve information about a participant by its ParticipantSid.
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_sid The unique identifier for a participant object.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def conferences_view_participant(conference_sid, participant_sid, opts = {})
      data, _status_code, _headers = conferences_view_participant_with_http_info(conference_sid, participant_sid, opts)
      return data
    end

    # View Participant
    # Retrieve information about a participant by its ParticipantSid.
    # @param conference_sid The unique identifier for a conference object.
    # @param participant_sid The unique identifier for a participant object.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_view_participant_with_http_info(conference_sid, participant_sid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_view_participant ..."
      end
      # verify the required parameter 'conference_sid' is set
      if @api_client.config.client_side_validation && conference_sid.nil?
        fail ArgumentError, "Missing the required parameter 'conference_sid' when calling ConferenceApi.conferences_view_participant"
      end
      # verify the required parameter 'participant_sid' is set
      if @api_client.config.client_side_validation && participant_sid.nil?
        fail ArgumentError, "Missing the required parameter 'participant_sid' when calling ConferenceApi.conferences_view_participant"
      end
      # resource path
      local_var_path = "/conferences/viewParticipant.json"

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
      form_params["ConferenceSid"] = conference_sid
      form_params["ParticipantSid"] = participant_sid

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_view_participant\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # View Conference
    # Retrieve information about a conference by its ConferenceSid.
    # @param conference_sid The unique identifier of each conference resource
    # @param [Hash] opts the optional parameters
    # @return [String]
    def conferences_viewconference(conference_sid, opts = {})
      data, _status_code, _headers = conferences_viewconference_with_http_info(conference_sid, opts)
      return data
    end

    # View Conference
    # Retrieve information about a conference by its ConferenceSid.
    # @param conference_sid The unique identifier of each conference resource
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def conferences_viewconference_with_http_info(conference_sid, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: ConferenceApi.conferences_viewconference ..."
      end
      # verify the required parameter 'conference_sid' is set
      if @api_client.config.client_side_validation && conference_sid.nil?
        fail ArgumentError, "Missing the required parameter 'conference_sid' when calling ConferenceApi.conferences_viewconference"
      end
      # resource path
      local_var_path = "/conferences/viewconference.json"

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
      form_params["ConferenceSid"] = conference_sid

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
        @api_client.config.logger.debug "API called: ConferenceApi#conferences_viewconference\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
