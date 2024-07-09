note
 description:"[
		
 		SDK for Minecraft versions info
  		The version of the OpenAPI document: 0.9.0-pre.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class VERSION




feature --Access

    id: detachable STRING_32
      
    type: detachable STRING_32
      
    url: detachable STRING_32
      
    time: detachable DATE_TIME
      
    release_time: detachable DATE_TIME
      

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_url (a_name: like url)
        -- Set 'url' with 'a_name'.
      do
        url := a_name
      ensure
        url_set: url = a_name
      end

    set_time (a_name: like time)
        -- Set 'time' with 'a_name'.
      do
        time := a_name
      ensure
        time_set: time = a_name
      end

    set_release_time (a_name: like release_time)
        -- Set 'release_time' with 'a_name'.
      do
        release_time := a_name
      ensure
        release_time_set: release_time = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass VERSION%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached url as l_url then
          Result.append ("%Nurl:")
          Result.append (l_url.out)
          Result.append ("%N")
        end
        if attached time as l_time then
          Result.append ("%Ntime:")
          Result.append (l_time.out)
          Result.append ("%N")
        end
        if attached release_time as l_release_time then
          Result.append ("%Nrelease_time:")
          Result.append (l_release_time.out)
          Result.append ("%N")
        end
      end
end
