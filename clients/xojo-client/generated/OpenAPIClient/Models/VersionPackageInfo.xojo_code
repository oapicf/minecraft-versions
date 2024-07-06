#tag Class
Protected Class VersionPackageInfo

	#tag Property, Flags = &h0
		version As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		assetIndex As OpenAPIClient.Models.VersionPackageInfoAssetIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		assets As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		complianceLevel As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		downloads As OpenAPIClient.Models.VersionPackageInfoDownloads
	#tag EndProperty


	#tag Property, Flags = &h0
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		javaVersion As OpenAPIClient.Models.VersionPackageInfoJavaVersion
	#tag EndProperty


	#tag Property, Flags = &h0
		mainClass As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		minimumLauncherVersion As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		time As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		releaseTime As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		type As Xoson.O.OptionalString
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
			Name="version"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="assetIndex"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionPackageInfoAssetIndex"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="assets"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="complianceLevel"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="downloads"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionPackageInfoDownloads"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="javaVersion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionPackageInfoJavaVersion"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="mainClass"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="minimumLauncherVersion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="releaseTime"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


