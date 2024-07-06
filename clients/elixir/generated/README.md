# OpenAPI.Client

SDK for Minecraft versions info

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `open_api/client` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:"open_api/client", "~> 0.9.0-pre.0"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/open_api/client][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :open_api/client, base_url: "https://launchermeta.mojang.com"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`OpenAPI.Client.Connection.new/1`:

```elixir
client = OpenAPI.Client.Connection.new(base_url: "https://launchermeta.mojang.com")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/open_api/client
