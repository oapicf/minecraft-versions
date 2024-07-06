#tag Interface
Protected Interface DefaultApiCallbackHandler
	#tag Method, Flags = &h0
		Sub GetMinecraftVersionManifestCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VersionManifest)
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h0
		Sub GetMinecraftVersionPackageInfoCallback(status As OpenAPIClient.OpenAPIClientException, Optional data As OpenAPIClient.Models.VersionPackageInfo)
		  
		End Sub
	#tag EndMethod




	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			Type="String"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
		#tag EndViewProperty
	#tag EndViewBehavior
End Interface
#tag EndInterface
