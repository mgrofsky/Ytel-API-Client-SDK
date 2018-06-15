/* 
 * Ytel API V3
 *
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Types Of Method
    /// </summary>
    /// <value>Types Of Method</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum HttpAction
    {
        
        /// <summary>
        /// Enum GET for "GET"
        /// </summary>
        [EnumMember(Value = "GET")]
        GET = 1,
        
        /// <summary>
        /// Enum POST for "POST"
        /// </summary>
        [EnumMember(Value = "POST")]
        POST = 2
    }

}
