package mx.posadev.parse

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import mx.posadev.parse.adapters.LicenseAdapter
import mx.posadev.parse.adapters.RepoAdapter
import mx.posadev.parse.adapters.UserAdapter
import mx.posadev.parse.adapters.ZenAdapter
import mx.posadev.request.*
import mx.posadev.response.*

object Parser {
    private val client = Moshi.Builder()
            .add(ZenAdapter())
            .add(UserAdapter())
            .add(RepoAdapter())
            .add(LicenseAdapter())
            .add(KotlinJsonAdapterFactory())
            .build()

    fun createResourceAdapter(resource: Resource): JsonAdapter<out Response> {
        val clazz = when (resource) {
            is Zen -> ZenResponse::class.java
            is User -> if (resource.fetchRepos) Types.newParameterizedType(List::class.java, RepoResponse::class.java) else UserResponse::class.java
            is Repo -> RepoResponse::class.java
            is License -> LicenseResponse::class.java
            else -> ErrorResponse::class.java
        }
        return client.adapter(clazz)
    }
}