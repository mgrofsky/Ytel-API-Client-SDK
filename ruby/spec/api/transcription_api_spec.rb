=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::TranscriptionApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'TranscriptionApi' do
  before do
    # run before each test
    @instance = SwaggerClient::TranscriptionApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TranscriptionApi' do
    it 'should create an instance of TranscriptionApi' do
      expect(@instance).to be_instance_of(SwaggerClient::TranscriptionApi)
    end
  end

  # unit tests for transcriptions_audiourltranscription
  # Transcribe Audio URL
  # Transcribe an audio recording from a file.
  # @param audiourl URL pointing to the location of the audio file that is to be transcribed.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'transcriptions_audiourltranscription test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for transcriptions_listtranscription
  # List Transcriptions
  # Retrieve a list of transcription objects for your Ytel account.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page The page count to retrieve from the total results in the collection. Page indexing starts at 1.
  # @option opts [Integer] :pagesize The count of objects to return per page.
  # @option opts [String] :status The state of the transcription.
  # @option opts [String] :date_transcribed The date the transcription took place.
  # @return [String]
  describe 'transcriptions_listtranscription test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for transcriptions_recordingtranscription
  # Transcribe Recording
  # Transcribe a recording by its RecordingSid.
  # @param recording_sid The unique identifier for a recording object.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'transcriptions_recordingtranscription test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for transcriptions_viewtranscription
  # View Transcription
  # Retrieve information about a transaction by its TranscriptionSid.
  # @param transcriptionsid The unique identifier for a transcription object.
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'transcriptions_viewtranscription test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end