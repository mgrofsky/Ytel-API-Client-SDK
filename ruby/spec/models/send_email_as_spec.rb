=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::SendEmailAs
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'SendEmailAs' do
  before do
    # run before each test
    @instance = SwaggerClient::SendEmailAs.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of SendEmailAs' do
    it 'should create an instance of SendEmailAs' do
      expect(@instance).to be_instance_of(SwaggerClient::SendEmailAs)
    end
  end
end

