/* 
 * Ytel API V3
 *
 * Ytel API version 3
 *
 * OpenAPI spec version: 3.12
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
    /// Transcription Status
    /// </summary>
    /// <value>Transcription Status</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum Status
    {
        
        /// <summary>
        /// Enum Inprogress for value: inprogress
        /// </summary>
        [EnumMember(Value = "inprogress")]
        Inprogress = 1,
        
        /// <summary>
        /// Enum Success for value: success
        /// </summary>
        [EnumMember(Value = "success")]
        Success = 2,
        
        /// <summary>
        /// Enum Failure for value: failure
        /// </summary>
        [EnumMember(Value = "failure")]
        Failure = 3
    }

}
