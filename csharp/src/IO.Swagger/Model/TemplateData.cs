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
    /// TemplateData
    /// </summary>
    [DataContract]
    public partial class TemplateData :  IEquatable<TemplateData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TemplateData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class.
        /// </summary>
        /// <param name="Companyname">Companyname (required).</param>
        /// <param name="Otpcode">Otpcode (required).</param>
        public TemplateData(string Companyname = default(string), string Otpcode = default(string))
        {
            // to ensure "Companyname" is required (not null)
            if (Companyname == null)
            {
                throw new InvalidDataException("Companyname is a required property for TemplateData and cannot be null");
            }
            else
            {
                this.Companyname = Companyname;
            }
            // to ensure "Otpcode" is required (not null)
            if (Otpcode == null)
            {
                throw new InvalidDataException("Otpcode is a required property for TemplateData and cannot be null");
            }
            else
            {
                this.Otpcode = Otpcode;
            }
        }
        
        /// <summary>
        /// Gets or Sets Companyname
        /// </summary>
        [DataMember(Name="companyname", EmitDefaultValue=false)]
        public string Companyname { get; set; }

        /// <summary>
        /// Gets or Sets Otpcode
        /// </summary>
        [DataMember(Name="otpcode", EmitDefaultValue=false)]
        public string Otpcode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TemplateData {\n");
            sb.Append("  Companyname: ").Append(Companyname).Append("\n");
            sb.Append("  Otpcode: ").Append(Otpcode).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TemplateData);
        }

        /// <summary>
        /// Returns true if TemplateData instances are equal
        /// </summary>
        /// <param name="input">Instance of TemplateData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TemplateData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Companyname == input.Companyname ||
                    (this.Companyname != null &&
                    this.Companyname.Equals(input.Companyname))
                ) && 
                (
                    this.Otpcode == input.Otpcode ||
                    (this.Otpcode != null &&
                    this.Otpcode.Equals(input.Otpcode))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Companyname != null)
                    hashCode = hashCode * 59 + this.Companyname.GetHashCode();
                if (this.Otpcode != null)
                    hashCode = hashCode * 59 + this.Otpcode.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
