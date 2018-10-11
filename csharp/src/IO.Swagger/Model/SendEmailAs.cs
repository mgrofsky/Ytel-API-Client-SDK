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
    /// send email TEXT or HTML format
    /// </summary>
    /// <value>send email TEXT or HTML format</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum SendEmailAs
    {
        
        /// <summary>
        /// Enum Text for value: text
        /// </summary>
        [EnumMember(Value = "text")]
        Text = 1,
        
        /// <summary>
        /// Enum Html for value: html
        /// </summary>
        [EnumMember(Value = "html")]
        Html = 2
    }

}
