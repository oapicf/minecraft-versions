/*
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// VersionPackageInfoJavaVersion
    /// </summary>
    [DataContract(Name = "VersionPackageInfo_javaVersion")]
    public partial class VersionPackageInfoJavaVersion : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VersionPackageInfoJavaVersion" /> class.
        /// </summary>
        /// <param name="component">component.</param>
        /// <param name="majorVersion">majorVersion.</param>
        public VersionPackageInfoJavaVersion(string component = default(string), int majorVersion = default(int))
        {
            this.Component = component;
            this.MajorVersion = majorVersion;
        }

        /// <summary>
        /// Gets or Sets Component
        /// </summary>
        [DataMember(Name = "component", EmitDefaultValue = false)]
        public string Component { get; set; }

        /// <summary>
        /// Gets or Sets MajorVersion
        /// </summary>
        [DataMember(Name = "majorVersion", EmitDefaultValue = false)]
        public int MajorVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VersionPackageInfoJavaVersion {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  MajorVersion: ").Append(MajorVersion).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
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