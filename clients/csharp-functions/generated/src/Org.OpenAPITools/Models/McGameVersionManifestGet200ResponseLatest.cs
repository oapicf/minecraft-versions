/*
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class McGameVersionManifestGet200ResponseLatest : IEquatable<McGameVersionManifestGet200ResponseLatest>
    {
        /// <summary>
        /// Gets or Sets Release
        /// </summary>
        [DataMember(Name="release", EmitDefaultValue=false)]
        public string Release { get; set; }

        /// <summary>
        /// Gets or Sets Snapshot
        /// </summary>
        [DataMember(Name="snapshot", EmitDefaultValue=false)]
        public string Snapshot { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class McGameVersionManifestGet200ResponseLatest {\n");
            sb.Append("  Release: ").Append(Release).Append("\n");
            sb.Append("  Snapshot: ").Append(Snapshot).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((McGameVersionManifestGet200ResponseLatest)obj);
        }

        /// <summary>
        /// Returns true if McGameVersionManifestGet200ResponseLatest instances are equal
        /// </summary>
        /// <param name="other">Instance of McGameVersionManifestGet200ResponseLatest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(McGameVersionManifestGet200ResponseLatest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Release == other.Release ||
                    Release != null &&
                    Release.Equals(other.Release)
                ) && 
                (
                    Snapshot == other.Snapshot ||
                    Snapshot != null &&
                    Snapshot.Equals(other.Snapshot)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Release != null)
                    hashCode = hashCode * 59 + Release.GetHashCode();
                    if (Snapshot != null)
                    hashCode = hashCode * 59 + Snapshot.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(McGameVersionManifestGet200ResponseLatest left, McGameVersionManifestGet200ResponseLatest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(McGameVersionManifestGet200ResponseLatest left, McGameVersionManifestGet200ResponseLatest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}