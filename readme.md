grpcurl -d '{"name": "FOO"}' -plaintext -import-path /home/mauro/Development/Spikes/Prueba/src/main/protobuf -proto ticker.proto localhost:8080 ticker.TickerService/MonitorSymbol
