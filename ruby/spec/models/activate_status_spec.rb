=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.11

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::ActivateStatus
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ActivateStatus' do
  before do
    # run before each test
    @instance = SwaggerClient::ActivateStatus.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ActivateStatus' do
    it 'should create an instance of ActivateStatus' do
      expect(@instance).to be_instance_of(SwaggerClient::ActivateStatus)
    end
  end
end

