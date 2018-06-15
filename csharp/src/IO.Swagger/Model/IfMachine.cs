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
    /// How Message360 should handle the receiving numbers voicemail machine
    /// </summary>
    /// <value>How Message360 should handle the receiving numbers voicemail machine</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum IfMachine
    {
        
        /// <summary>
        /// Enum Continue for "continue"
        /// </summary>
        [EnumMember(Value = "continue")]
        Continue = 1,
        
        /// <summary>
        /// Enum Hangup for "hangup"
        /// </summary>
        [EnumMember(Value = "hangup")]
        Hangup = 2
    }

}
