package mx.posadev.parse

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import mx.posadev.parse.adapters.ZenAdapter
import mx.posadev.request.Resource
import mx.posadev.request.Zen
import mx.posadev.response.ErrorResponse
import mx.posadev.response.Response
import mx.posadev.response.ZenResponse

object Parser {
    private val client = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .add(ZenAdapter())
            .build()

    fun createResourceAdapter(resource: Resource): JsonAdapter<out Response> = when (resource) {
        is Zen -> client.adapter(ZenResponse::class.java)
        else -> client.adapter(ErrorResponse::class.java)
    }
}