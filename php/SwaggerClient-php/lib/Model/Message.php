<?php
/**
 * Message
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Ytel API V3
 *
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * Message Class Doc Comment
 *
 * @category Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Message implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Message';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'api_version' => 'string',
        'message_sid' => 'string',
        'from' => 'string',
        'to' => 'string',
        'message_price' => 'string',
        'body' => 'string',
        'date_sent' => 'string',
        'status' => 'string',
        'template_id' => 'string',
        'template_data' => '\Swagger\Client\Model\TemplateData'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'api_version' => null,
        'message_sid' => null,
        'from' => null,
        'to' => null,
        'message_price' => null,
        'body' => null,
        'date_sent' => null,
        'status' => null,
        'template_id' => null,
        'template_data' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'api_version' => 'ApiVersion',
        'message_sid' => 'MessageSid',
        'from' => 'From',
        'to' => 'To',
        'message_price' => 'MessagePrice',
        'body' => 'Body',
        'date_sent' => 'DateSent',
        'status' => 'Status',
        'template_id' => 'TemplateId',
        'template_data' => 'TemplateData'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'api_version' => 'setApiVersion',
        'message_sid' => 'setMessageSid',
        'from' => 'setFrom',
        'to' => 'setTo',
        'message_price' => 'setMessagePrice',
        'body' => 'setBody',
        'date_sent' => 'setDateSent',
        'status' => 'setStatus',
        'template_id' => 'setTemplateId',
        'template_data' => 'setTemplateData'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'api_version' => 'getApiVersion',
        'message_sid' => 'getMessageSid',
        'from' => 'getFrom',
        'to' => 'getTo',
        'message_price' => 'getMessagePrice',
        'body' => 'getBody',
        'date_sent' => 'getDateSent',
        'status' => 'getStatus',
        'template_id' => 'getTemplateId',
        'template_data' => 'getTemplateData'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['api_version'] = isset($data['api_version']) ? $data['api_version'] : null;
        $this->container['message_sid'] = isset($data['message_sid']) ? $data['message_sid'] : null;
        $this->container['from'] = isset($data['from']) ? $data['from'] : null;
        $this->container['to'] = isset($data['to']) ? $data['to'] : null;
        $this->container['message_price'] = isset($data['message_price']) ? $data['message_price'] : null;
        $this->container['body'] = isset($data['body']) ? $data['body'] : null;
        $this->container['date_sent'] = isset($data['date_sent']) ? $data['date_sent'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
        $this->container['template_id'] = isset($data['template_id']) ? $data['template_id'] : null;
        $this->container['template_data'] = isset($data['template_data']) ? $data['template_data'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['api_version'] === null) {
            $invalidProperties[] = "'api_version' can't be null";
        }
        if ($this->container['message_sid'] === null) {
            $invalidProperties[] = "'message_sid' can't be null";
        }
        if ($this->container['from'] === null) {
            $invalidProperties[] = "'from' can't be null";
        }
        if ($this->container['to'] === null) {
            $invalidProperties[] = "'to' can't be null";
        }
        if ($this->container['message_price'] === null) {
            $invalidProperties[] = "'message_price' can't be null";
        }
        if ($this->container['body'] === null) {
            $invalidProperties[] = "'body' can't be null";
        }
        if ($this->container['date_sent'] === null) {
            $invalidProperties[] = "'date_sent' can't be null";
        }
        if ($this->container['status'] === null) {
            $invalidProperties[] = "'status' can't be null";
        }
        if ($this->container['template_id'] === null) {
            $invalidProperties[] = "'template_id' can't be null";
        }
        if ($this->container['template_data'] === null) {
            $invalidProperties[] = "'template_data' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        if ($this->container['api_version'] === null) {
            return false;
        }
        if ($this->container['message_sid'] === null) {
            return false;
        }
        if ($this->container['from'] === null) {
            return false;
        }
        if ($this->container['to'] === null) {
            return false;
        }
        if ($this->container['message_price'] === null) {
            return false;
        }
        if ($this->container['body'] === null) {
            return false;
        }
        if ($this->container['date_sent'] === null) {
            return false;
        }
        if ($this->container['status'] === null) {
            return false;
        }
        if ($this->container['template_id'] === null) {
            return false;
        }
        if ($this->container['template_data'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets api_version
     *
     * @return string
     */
    public function getApiVersion()
    {
        return $this->container['api_version'];
    }

    /**
     * Sets api_version
     *
     * @param string $api_version 
     *
     * @return $this
     */
    public function setApiVersion($api_version)
    {
        $this->container['api_version'] = $api_version;

        return $this;
    }

    /**
     * Gets message_sid
     *
     * @return string
     */
    public function getMessageSid()
    {
        return $this->container['message_sid'];
    }

    /**
     * Sets message_sid
     *
     * @param string $message_sid 
     *
     * @return $this
     */
    public function setMessageSid($message_sid)
    {
        $this->container['message_sid'] = $message_sid;

        return $this;
    }

    /**
     * Gets from
     *
     * @return string
     */
    public function getFrom()
    {
        return $this->container['from'];
    }

    /**
     * Sets from
     *
     * @param string $from 
     *
     * @return $this
     */
    public function setFrom($from)
    {
        $this->container['from'] = $from;

        return $this;
    }

    /**
     * Gets to
     *
     * @return string
     */
    public function getTo()
    {
        return $this->container['to'];
    }

    /**
     * Sets to
     *
     * @param string $to 
     *
     * @return $this
     */
    public function setTo($to)
    {
        $this->container['to'] = $to;

        return $this;
    }

    /**
     * Gets message_price
     *
     * @return string
     */
    public function getMessagePrice()
    {
        return $this->container['message_price'];
    }

    /**
     * Sets message_price
     *
     * @param string $message_price 
     *
     * @return $this
     */
    public function setMessagePrice($message_price)
    {
        $this->container['message_price'] = $message_price;

        return $this;
    }

    /**
     * Gets body
     *
     * @return string
     */
    public function getBody()
    {
        return $this->container['body'];
    }

    /**
     * Sets body
     *
     * @param string $body 
     *
     * @return $this
     */
    public function setBody($body)
    {
        $this->container['body'] = $body;

        return $this;
    }

    /**
     * Gets date_sent
     *
     * @return string
     */
    public function getDateSent()
    {
        return $this->container['date_sent'];
    }

    /**
     * Sets date_sent
     *
     * @param string $date_sent 
     *
     * @return $this
     */
    public function setDateSent($date_sent)
    {
        $this->container['date_sent'] = $date_sent;

        return $this;
    }

    /**
     * Gets status
     *
     * @return string
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string $status 
     *
     * @return $this
     */
    public function setStatus($status)
    {
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets template_id
     *
     * @return string
     */
    public function getTemplateId()
    {
        return $this->container['template_id'];
    }

    /**
     * Sets template_id
     *
     * @param string $template_id 
     *
     * @return $this
     */
    public function setTemplateId($template_id)
    {
        $this->container['template_id'] = $template_id;

        return $this;
    }

    /**
     * Gets template_data
     *
     * @return \Swagger\Client\Model\TemplateData
     */
    public function getTemplateData()
    {
        return $this->container['template_data'];
    }

    /**
     * Sets template_data
     *
     * @param \Swagger\Client\Model\TemplateData $template_data template_data
     *
     * @return $this
     */
    public function setTemplateData($template_data)
    {
        $this->container['template_data'] = $template_data;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param  integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param  integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param  integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}

