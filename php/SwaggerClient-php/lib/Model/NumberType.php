<?php
/**
 * NumberType
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
 * OpenAPI spec version: 3.11
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
 * NumberType Class Doc Comment
 *
 * @category Class
 * @description Phone Number Type All,SMS or Voice
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NumberType
{
    /**
     * Possible values of this enum
     */
    const ALL = 'all';
    const VOICE = 'voice';
    const SMS = 'sms';
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ALL,
            self::VOICE,
            self::SMS,
        ];
    }
}


