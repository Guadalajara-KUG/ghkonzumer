package mx.posadev.parse

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import mx.posadev.parse.adapters.UserAdapter
import mx.posadev.parse.adapters.ZenAdapter
import mx.posadev.request.Resource
import mx.posadev.request.User
import mx.posadev.request.Zen
import mx.posadev.response.ErrorResponse
import mx.posadev.response.Response
import mx.posadev.response.UserResponse
import mx.posadev.response.ZenResponse

object Parser {
    private val client = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .add(ZenAdapter())
            .add(UserAdapter())
            .build()

    fun createResourceAdapter(resource: Resource): JsonAdapter<out Response> {
        val clazz = when (resource) {
            is Zen -> ZenResponse::class.java
            is User -> UserResponse::class.java
            else -> ErrorResponse::class.java
        }
        return client.adapter(clazz)
    }
}