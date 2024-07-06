#tag Class
Protected Class VersionPackageInfoDownloads

	#tag Property, Flags = &h0
		client As OpenAPIClient.Models.Download
	#tag EndProperty


	#tag Property, Flags = &h0
		client_mappings As OpenAPIClient.Models.Download
	#tag EndProperty


	#tag Property, Flags = &h0
		server As OpenAPIClient.Models.Download
	#tag EndProperty


	#tag Property, Flags = &h0
		server_mappings As OpenAPIClient.Models.Download
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
			Name="client"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Download"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="client_mappings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Download"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="server"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Download"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="server_mappings"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Download"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


