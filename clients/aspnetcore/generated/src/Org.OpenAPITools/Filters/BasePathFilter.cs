/*
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System.Linq;
using System.Text.RegularExpressions;
using Microsoft.OpenApi.Models;
using Swashbuckle.AspNetCore.SwaggerGen;

namespace Org.OpenAPITools.Filters
{
    /// <summary>
    /// BasePath Document Filter sets BasePath property of OpenAPI and removes it from the individual URL paths
    /// </summary>
    public class BasePathFilter : IDocumentFilter
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="basePath">BasePath to remove from Operations</param>
        public BasePathFilter(string basePath)
        {
            BasePath = basePath;
        }

        /// <summary>
        /// Gets the BasePath of the OpenAPI Doc
        /// </summary>
        /// <returns>The BasePath of the OpenAPI Doc</returns>
        public string BasePath { get; }

        /// <summary>
        /// Apply the filter
        /// </summary>
        /// <param name="openapiDoc">OpenApiDocument</param>
        /// <param name="context">FilterContext</param>
        public void Apply(OpenApiDocument openapiDoc, DocumentFilterContext context)
        {
            //openapiDoc.BasePath = BasePath;

            var pathsToModify = openapiDoc.Paths.Where(p => p.Key.StartsWith(BasePath)).ToList();

            foreach (var (key, value) in pathsToModify)
            {
                if (key.StartsWith(BasePath))
                {
                    var newKey = Regex.Replace(key, $"^{BasePath}", string.Empty);
                    openapiDoc.Paths.Remove(key);
                    openapiDoc.Paths.Add(newKey, value);
                }
            }
        }
    }
}
