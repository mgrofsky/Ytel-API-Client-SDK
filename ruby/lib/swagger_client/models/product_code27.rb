=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'date'

module SwaggerClient
  class ProductCode27
    
    0 = 0.freeze
    1 = 1.freeze
    2 = 2.freeze
    3 = 3.freeze
    4 = 4.freeze
    5 = 5.freeze
    6 = 6.freeze
    7 = 7.freeze
    8 = 8.freeze
    9 = 9.freeze
    10 = 10.freeze
    11 = 11.freeze
    12 = 12.freeze
    13 = 13.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = ProductCode27.constants.select{|c| ProductCode27::const_get(c) == value}
      raise "Invalid ENUM value #{value} for class #ProductCode27" if constantValues.empty?
      value
    end
  end

end
