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
    /// Play DTMF Direction &amp; in play audio &amp; sendDigit
    /// </summary>
    /// <value>Play DTMF Direction &amp; in play audio &amp; sendDigit</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Direction
    {
        
        /// <summary>
        /// Enum In for "in"
        /// </summary>
        [EnumMember(Value = "in")]
        In = 1,
        
        /// <summary>
        /// Enum Out for "out"
        /// </summary>
        [EnumMember(Value = "out")]
        Out = 2,
        
        /// <summary>
        /// Enum Both for "both"
        /// </summary>
        [EnumMember(Value = "both")]
        Both = 3
    }

}