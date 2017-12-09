package mx.posadev.request

import okhttp3.OkHttpClient
import okhttp3.Request

object Client {
    private val client = OkHttpClient()

    fun get(url: String) = client.newCall(createGetRequest(url))
            .execute()
            .body()
            ?.string() ?: ""

    private fun createGetRequest(url: String): Request = Request.Builder()
            .url(url)
            .get()
            .addHeaders(HTTP_HEADERS)
            .build()
}

private fun Request.Builder.addHeaders(map: Map<String, String>): Request.Builder {
    for ((header, value) in map) {
        addHeader(header, value)
    }
    return this
}
