package lol.dap.asgard.extensions

import io.ktor.network.sockets.*

fun SocketAddress.toRegularString(): String {
    return this.toString().replace("/", "")
}