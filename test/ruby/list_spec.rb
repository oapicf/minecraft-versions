require 'minecraft_versions'

describe 'MinecraftVersionsClient' do
  before do
  end

  after do
  end

  describe 'test minecraft versions' do
    it 'should get version manifest' do
      api_instance = MinecraftVersionsClient::DefaultApi.new
      begin
        result = api_instance.get_minecraft_version_manifest
        versions = result.versions
        expect(versions).not_to be_nil
        versions.each do |version|
          puts "version: #{version.id}"
          puts "type: #{version.type}"
          puts "url: #{version.url}"
        end
      rescue MinecraftVersionsClient::ApiError => e
        puts "Error when calling DefaultApi->get_minecraft_version_manifest: #{e}"
        fail
      end
    end
    it 'should get version package info' do
      api_instance = MinecraftVersionsClient::DefaultApi.new
      begin
        version_package_info = api_instance.get_minecraft_version_package_info('177e49d3233cb6eac42f0495c0a48e719870c2ae', '1.21')
        expect(version_package_info.id).not_to be_nil
        expect(version_package_info.id).to be_a(String)
        expect(version_package_info.type).not_to be_nil
        expect(version_package_info.type).to be_a(String)
        downloads = version_package_info.downloads
        puts downloads
        puts downloads.class
        expect(downloads).not_to be_nil

        client_download = downloads.client
        expect(client_download).not_to be_nil
        expect(client_download).to be_a(MinecraftVersionsClient::Download)
        puts "Client Download:"
        puts "  sha1: #{client_download.sha1}"
        puts "  size: #{client_download.size}"
        puts "  url: #{client_download.url}"

        client_mappings_download = downloads.client_mappings
        expect(client_mappings_download).not_to be_nil
        expect(client_mappings_download).to be_a(MinecraftVersionsClient::Download)
        puts "Client Mappings Download:"
        puts "  sha1: #{client_mappings_download.sha1}"
        puts "  size: #{client_mappings_download.size}"
        puts "  url: #{client_mappings_download.url}"

        server_download = downloads.server
        expect(server_download).not_to be_nil
        expect(server_download).to be_a(MinecraftVersionsClient::Download)
        puts "Server Download:"
        puts "  sha1: #{server_download.sha1}"
        puts "  size: #{server_download.size}"
        puts "  url: #{server_download.url}"

        server_mappings_download = downloads.server_mappings
        expect(server_mappings_download).not_to be_nil
        expect(server_mappings_download).to be_a(MinecraftVersionsClient::Download)
        puts "Server Mappings Download:"
        puts "  sha1: #{server_mappings_download.sha1}"
        puts "  size: #{server_mappings_download.size}"
        puts "  url: #{server_mappings_download.url}"

      rescue MinecraftVersionsClient::ApiError => e
        puts "Error when calling DefaultApi->get_minecraft_version_manifest: #{e}"
        fail
      end
    end
  end

end
