=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'date'

module SwaggerClient
  class Activate
    
    1 = 1.freeze
    0 = 0.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = Activate.constants.select{|c| Activate::const_get(c) == value}
      raise "Invalid ENUM value #{value} for class #Activate" if constantValues.empty?
      value
    end
  end

end
