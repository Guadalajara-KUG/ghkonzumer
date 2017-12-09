package mx.posadev.request

const val BASE_URL = "https://api.github.com"

sealed class Resource(val endpoint: String) {
    override fun toString() = BASE_URL + endpoint
}

object Zen : Resource("/$zen")

class User(username: String, fetchRepos: Boolean = false) : Resource("/$users/$username${if (fetchRepos) "/$repos" else ""}")

private val zen = "zen"
private val users = "users"
private val repos = "repos"