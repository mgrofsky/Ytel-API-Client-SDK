<?php
/**
 * Direction
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
use \Swagger\Client\ObjectSerializer;

/**
 * Direction Class Doc Comment
 *
 * @category Class
 * @description Play DTMF Direction &amp; in play audio &amp; sendDigit
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Direction
{
    /**
     * Possible values of this enum
     */
    const IN = 'in';
    const OUT = 'out';
    const BOTH = 'both';
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::IN,
            self::OUT,
            self::BOTH,
        ];
    }
}


