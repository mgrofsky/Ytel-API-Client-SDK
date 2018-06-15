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
    /// Defines Activate
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Activate
    {
        
        /// <summary>
        /// Enum NUMBER_1 for 1
        /// </summary>
        [EnumMember(Value = 1)]
        NUMBER_1 = 1,
        
        /// <summary>
        /// Enum NUMBER_0 for 0
        /// </summary>
        [EnumMember(Value = 0)]
        NUMBER_0 = 2
    }

}
