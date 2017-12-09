package mx.posadev.parse

import mx.posadev.request.Resource
import mx.posadev.request.Zen
import mx.posadev.response.ParsingError
import mx.posadev.response.Response
import mx.posadev.response.ZenResponse

actual fun parseResource(resource: Resource, string: String): Response {
    if (resource is Zen) {
        return ZenResponse(string)
    }

    val jsonAdapter = Parser.createResourceAdapter(resource)
    return jsonAdapter.fromJson(string) ?: ParsingError("Error parsing: $string")
}