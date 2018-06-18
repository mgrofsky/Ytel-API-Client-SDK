=begin
#Ytel API V3

#Ytel API version 3

OpenAPI spec version: 3.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 1.0.12-1

=end

require 'date'

module SwaggerClient

  class Message
    # 
    attr_accessor :api_version

    # 
    attr_accessor :message_sid

    # 
    attr_accessor :from

    # 
    attr_accessor :to

    # 
    attr_accessor :message_price

    # 
    attr_accessor :body

    # 
    attr_accessor :date_sent

    # 
    attr_accessor :status

    # 
    attr_accessor :template_id

    attr_accessor :template_data


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'api_version' => :'ApiVersion',
        :'message_sid' => :'MessageSid',
        :'from' => :'From',
        :'to' => :'To',
        :'message_price' => :'MessagePrice',
        :'body' => :'Body',
        :'date_sent' => :'DateSent',
        :'status' => :'Status',
        :'template_id' => :'TemplateId',
        :'template_data' => :'TemplateData'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'api_version' => :'String',
        :'message_sid' => :'String',
        :'from' => :'String',
        :'to' => :'String',
        :'message_price' => :'String',
        :'body' => :'String',
        :'date_sent' => :'String',
        :'status' => :'String',
        :'template_id' => :'String',
        :'template_data' => :'TemplateData'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'ApiVersion')
        self.api_version = attributes[:'ApiVersion']
      end

      if attributes.has_key?(:'MessageSid')
        self.message_sid = attributes[:'MessageSid']
      end

      if attributes.has_key?(:'From')
        self.from = attributes[:'From']
      end

      if attributes.has_key?(:'To')
        self.to = attributes[:'To']
      end

      if attributes.has_key?(:'MessagePrice')
        self.message_price = attributes[:'MessagePrice']
      end

      if attributes.has_key?(:'Body')
        self.body = attributes[:'Body']
      end

      if attributes.has_key?(:'DateSent')
        self.date_sent = attributes[:'DateSent']
      end

      if attributes.has_key?(:'Status')
        self.status = attributes[:'Status']
      end

      if attributes.has_key?(:'TemplateId')
        self.template_id = attributes[:'TemplateId']
      end

      if attributes.has_key?(:'TemplateData')
        self.template_data = attributes[:'TemplateData']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @api_version.nil?
        invalid_properties.push("invalid value for 'api_version', api_version cannot be nil.")
      end

      if @message_sid.nil?
        invalid_properties.push("invalid value for 'message_sid', message_sid cannot be nil.")
      end

      if @from.nil?
        invalid_properties.push("invalid value for 'from', from cannot be nil.")
      end

      if @to.nil?
        invalid_properties.push("invalid value for 'to', to cannot be nil.")
      end

      if @message_price.nil?
        invalid_properties.push("invalid value for 'message_price', message_price cannot be nil.")
      end

      if @body.nil?
        invalid_properties.push("invalid value for 'body', body cannot be nil.")
      end

      if @date_sent.nil?
        invalid_properties.push("invalid value for 'date_sent', date_sent cannot be nil.")
      end

      if @status.nil?
        invalid_properties.push("invalid value for 'status', status cannot be nil.")
      end

      if @template_id.nil?
        invalid_properties.push("invalid value for 'template_id', template_id cannot be nil.")
      end

      if @template_data.nil?
        invalid_properties.push("invalid value for 'template_data', template_data cannot be nil.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @api_version.nil?
      return false if @message_sid.nil?
      return false if @from.nil?
      return false if @to.nil?
      return false if @message_price.nil?
      return false if @body.nil?
      return false if @date_sent.nil?
      return false if @status.nil?
      return false if @template_id.nil?
      return false if @template_data.nil?
      return true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          api_version == o.api_version &&
          message_sid == o.message_sid &&
          from == o.from &&
          to == o.to &&
          message_price == o.message_price &&
          body == o.body &&
          date_sent == o.date_sent &&
          status == o.status &&
          template_id == o.template_id &&
          template_data == o.template_data
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [api_version, message_sid, from, to, message_price, body, date_sent, status, template_id, template_data].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map{ |v| _deserialize($1, v) } )
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map{ |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
