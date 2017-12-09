package mx.posadev.parse

import mx.posadev.request.Resource
import mx.posadev.response.Response
import mx.posadev.response.ZenResponse

actual fun parseResource(resource: Resource, string: String): Response {
    return ZenResponse(string)
}