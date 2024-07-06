=begin
SDK for Minecraft versions info

The version of the OpenAPI document: 0.9.0-pre.0
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end

class InitTables < ActiveRecord::Migration
  def change
    create_table "get_minecraft_version_manifest_200_response".pluralize.to_sym, id: false do |t|
      t.string :latest
      t.string :versions

      t.timestamps
    end

    create_table "get_minecraft_version_manifest_200_response_latest".pluralize.to_sym, id: false do |t|
      t.string :release
      t.string :snapshot

      t.timestamps
    end

    create_table "get_minecraft_version_manifest_200_response_versions_inner".pluralize.to_sym, id: false do |t|
      t.string :id
      t.string :type
      t.string :url
      t.datetime :time
      t.datetime :release_time

      t.timestamps
    end

    create_table "_v1_packages__package_id___version_id__json_get_200_response".pluralize.to_sym, id: false do |t|
      t.string :version
      t.string :asset_index
      t.integer :assets
      t.integer :compliance_level
      t.string :downloads
      t.string :id
      t.string :java_version
      t.string :main_class
      t.integer :minimum_launcher_version
      t.datetime :time
      t.datetime :release_time
      t.string :type

      t.timestamps
    end

    create_table "_v1_packages__package_id___version_id__json_get_200_response_asset_index".pluralize.to_sym, id: false do |t|
      t.string :id
      t.string :sha1
      t.integer :size
      t.integer :total_size
      t.string :url

      t.timestamps
    end

    create_table "_v1_packages__package_id___version_id__json_get_200_response_downloads".pluralize.to_sym, id: false do |t|
      t.string :client
      t.string :client_mappings
      t.string :server
      t.string :server_mappings

      t.timestamps
    end

    create_table "_v1_packages__package_id___version_id__json_get_200_response_downloads_client".pluralize.to_sym, id: false do |t|
      t.string :sha1
      t.integer :size
      t.string :url

      t.timestamps
    end

    create_table "_v1_packages__package_id___version_id__json_get_200_response_java_version".pluralize.to_sym, id: false do |t|
      t.string :component
      t.integer :major_version

      t.timestamps
    end

  end
end
