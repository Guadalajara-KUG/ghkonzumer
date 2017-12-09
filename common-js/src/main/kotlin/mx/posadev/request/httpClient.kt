package mx.posadev.request

import kotlin.js.Json
import kotlin.js.json

external fun require(module: String): dynamic

fun createClient(resource: Resource) {
    val https = require("https")
    val options = json("host" to "api.github.com",
            "path" to resource.endpoint,
            "port" to 443,
            "headers" to createJsonFromMap())
    https.get(options) { response ->
        var str = ""
        response.on("data") { chunk: String ->
            str += chunk
            Unit
        }

        response.on("end") {
            console.log("User:", str)
        }
    }
}

private fun createJsonFromMap(): Json {
    val list = mutableListOf<Pair<String, String>>()
    for ((key, value) in HTTP_HEADERS) {
        list.add(Pair(key, value))
    }
    return json(*list.toTypedArray())
}