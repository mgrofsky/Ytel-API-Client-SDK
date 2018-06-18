=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.11

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::CarrierApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CarrierApi' do
  before do
    # run before each test
    @instance = SwaggerClient::CarrierApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CarrierApi' do
    it 'should create an instance of CarrierApi' do
      expect(@instance).to be_instance_of(SwaggerClient::CarrierApi)
    end
  end

  # unit tests for carrier_lookup
  # Lookup Carrier
  # Get the Carrier Lookup
  # @param phone_number A valid 10-digit number (E.164 format).
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'carrier_lookup test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for carrier_lookuplist
  # Carrier Results
  # Retrieve a list of carrier lookup objects.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  # @option opts [Integer] :page_size The count of objects to return per page.
  # @return [String]
  describe 'carrier_lookuplist test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
