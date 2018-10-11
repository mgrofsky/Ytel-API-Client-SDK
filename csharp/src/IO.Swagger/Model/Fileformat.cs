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
    /// Defines Fileformat
    /// </summary>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum Fileformat
    {
        
        /// <summary>
        /// Enum Mp3 for value: mp3
        /// </summary>
        [EnumMember(Value = "mp3")]
        Mp3 = 1,
        
        /// <summary>
        /// Enum Wav for value: wav
        /// </summary>
        [EnumMember(Value = "wav")]
        Wav = 2
    }

}
