package me.aksenov.coincapintegration.websocket

import java.math.BigDecimal

data class CoinCapMessage(val bitcoin: BigDecimal? = null, val ethereum: BigDecimal? = null)
