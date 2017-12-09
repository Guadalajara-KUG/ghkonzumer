package mx.posadev.parse.adapters

import com.squareup.moshi.FromJson
import mx.posadev.response.ZenResponse
import mx.posadev.response.Response

class ZenAdapter {
    @FromJson
    fun zenFromString(string: String): Response = ZenResponse(string)
}