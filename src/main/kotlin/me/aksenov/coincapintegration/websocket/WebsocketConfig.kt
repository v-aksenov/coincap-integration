package me.aksenov.coincapintegration.websocket

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.client.WebSocketConnectionManager
import org.springframework.web.socket.client.standard.StandardWebSocketClient

@Configuration
class WebsocketConfig {

    @Bean
    fun wsConnectionManager(websocketClientText: WebsocketClientText): WebSocketConnectionManager =
        WebSocketConnectionManager(
            StandardWebSocketClient(),
            websocketClientText,
            "wss://ws.coincap.io/prices?assets=bitcoin,ethereum,monero"
        ).apply {
            isAutoStartup = true
        }
}