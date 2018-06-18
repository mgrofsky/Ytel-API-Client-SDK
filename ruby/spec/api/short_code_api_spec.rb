=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ShortCodeApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ShortCodeApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ShortCodeApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ShortCodeApi' do
    it 'should create an instance of ShortCodeApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ShortCodeApi)
    end
  end

  # unit tests for dedicatedshortcode_getinboundsms
  # List Inbound SMS
  # Retrive a list of inbound Sms Short Code messages associated with your Ytel account.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  # @option opts [Integer] :pagesize Number of individual resources listed in the response per page
  # @option opts [String] :from Only list SMS messages sent from this number
  # @option opts [String] :shortcode Only list SMS messages sent to Shortcode
  # @option opts [String] :datecreated Only list SMS messages sent in the specified date MAKE REQUEST
  # @return [String]
  describe 'dedicatedshortcode_getinboundsms test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dedicatedshortcode_listshortcode
  # List Shortcodes
  # Retrieve a list of Short Code assignment associated with your Ytel account.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :shortcode Only list Short Code Assignment sent from this Short Code
  # @option opts [String] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  # @option opts [String] :pagesize The count of objects to return per page.
  # @return [String]
  describe 'dedicatedshortcode_listshortcode test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dedicatedshortcode_sendsms
  # Send SMS
  # Send Dedicated Shortcode
  # @param shortcode Your dedicated shortcode
  # @param to The number to send your SMS to
  # @param body The body of your message
  # @param [Hash] opts the optional parameters
  # @option opts [String] :method Specifies the HTTP method used to request the required URL once the Short Code message is sent.GET or POST
  # @option opts [String] :messagestatuscallback URL that can be requested to receive notification when Short Code message was sent.
  # @return [String]
  describe 'dedicatedshortcode_sendsms test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dedicatedshortcode_updateshortcode
  # Update Shortcode
  # Update a dedicated shortcode.
  # @param shortcode List of valid dedicated shortcode to your Ytel account.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :friendly_name User generated name of the dedicated shortcode.
  # @option opts [String] :callback_method Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
  # @option opts [String] :callback_url URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
  # @option opts [String] :fallback_method Specifies the HTTP method used to request the required FallbackUrl once call connects.
  # @option opts [String] :fallback_url URL used if any errors occur during execution of InboundXML or at initial request of the required Url provided with the POST.
  # @return [String]
  describe 'dedicatedshortcode_updateshortcode test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dedicatedshortcode_viewshortcode
  # View SMS
  # Retrieve a single Short Code object by its shortcode assignment.
  # @param shortcode List of valid Dedicated Short Code to your Ytel account
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'dedicatedshortcode_viewshortcode test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for shortcode_listsms
  # List SMS
  # Retrieve a list of Short Code messages.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :shortcode Only list messages sent from this Short Code
  # @option opts [String] :to Only list messages sent to this number
  # @option opts [String] :date_sent Only list messages sent with the specified date
  # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  # @option opts [Integer] :page_size The count of objects to return per page.
  # @return [String]
  describe 'shortcode_listsms test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for shortcode_viewsms
  # View SMS
  # View a single Sms Short Code message.
  # @param message_sid The unique identifier for the sms resource
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'shortcode_viewsms test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end