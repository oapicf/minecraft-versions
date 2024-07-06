#tag Class
Protected Class McGameVersionManifestGet200Response

	#tag Property, Flags = &h0
		latest As OpenAPIClient.Models.McGameVersionManifestGet200ResponseLatest
	#tag EndProperty


	#tag Property, Flags = &h0
		versions() As OpenAPIClient.Models.McGameVersionManifestGet200ResponseVersionsInner
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="latest"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="McGameVersionManifestGet200ResponseLatest"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="versions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="McGameVersionManifestGet200ResponseVersionsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


