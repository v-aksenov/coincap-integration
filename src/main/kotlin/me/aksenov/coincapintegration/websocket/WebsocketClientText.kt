package me.aksenov.coincapintegration.websocket

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Service
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler


@Service
class WebsocketClientText(private val objectMapper: ObjectMapper) : TextWebSocketHandler() {

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        val coinCapMessage = objectMapper.readValue(message.payload, CoinCapMessage::class.java)
        println(coinCapMessage.toString())
    }
}