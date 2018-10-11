=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.12

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.3.1

=end

require 'date'

module SwaggerClient
  class Status
    
    INPROGRESS = "inprogress".freeze
    SUCCESS = "success".freeze
    FAILURE = "failure".freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = Status.constants.select{|c| Status::const_get(c) == value}
      raise "Invalid ENUM value #{value} for class #Status" if constantValues.empty?
      value
    end
  end

end
