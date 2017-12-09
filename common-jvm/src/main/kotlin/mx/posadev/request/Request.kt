package mx.posadev.request

import mx.posadev.response.Response

actual class Request {
    actual fun call(): Response {
        return object : Response {}
    }
}