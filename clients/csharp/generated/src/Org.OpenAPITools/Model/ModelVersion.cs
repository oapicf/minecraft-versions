/*
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
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
    /// ModelVersion
    /// </summary>
    [DataContract(Name = "varVersion")]
    public partial class ModelVersion : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelVersion" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="type">type.</param>
        /// <param name="url">url.</param>
        /// <param name="time">time.</param>
        /// <param name="releaseTime">releaseTime.</param>
        public ModelVersion(string id = default(string), string type = default(string), string url = default(string), DateTime time = default(DateTime), DateTime releaseTime = default(DateTime))
        {
            this.Id = id;
            this.Type = type;
            this.Url = url;
            this.Time = time;
            this.ReleaseTime = releaseTime;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        /*
        <example>24w14potato</example>
        */
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        /*
        <example>snapshot</example>
        */
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Url
        /// </summary>
        /*
        <example>https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json</example>
        */
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Gets or Sets Time
        /// </summary>
        /*
        <example>2024-04-01T11:14:41.000Z</example>
        */
        [DataMember(Name = "time", EmitDefaultValue = false)]
        public DateTime Time { get; set; }

        /// <summary>
        /// Gets or Sets ReleaseTime
        /// </summary>
        /*
        <example>2024-04-01T11:07:19.000Z</example>
        */
        [DataMember(Name = "releaseTime", EmitDefaultValue = false)]
        public DateTime ReleaseTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModelVersion {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  ReleaseTime: ").Append(ReleaseTime).Append("\n");
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
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
