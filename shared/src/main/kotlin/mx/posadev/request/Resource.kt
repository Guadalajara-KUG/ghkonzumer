package mx.posadev.request

const val BASE_URL = "https://api.github.com"

sealed class Resource(val endpoint: String) {
    override fun toString() = BASE_URL + endpoint
}

object Zen : Resource("/$zen")

private val zen = "zen"
