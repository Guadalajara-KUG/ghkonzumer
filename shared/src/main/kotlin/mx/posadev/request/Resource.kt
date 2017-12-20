package mx.posadev.request

const val BASE_URL = "https://api.github.com"

sealed class Resource(val endpoint: String) {
    override fun toString() = BASE_URL + endpoint
}

object Zen : Resource("/$zen")

class User(username: String, val fetchRepos: Boolean = false) : Resource("/$users/$username${if (fetchRepos) "/$repos" else ""}")

class License(licenseName: String) : Resource("/$licenses/$licenseName")

class Organization(organizationName: String, fetchRepos: Boolean = false) : Resource("/$organizations/$organizationName${if (fetchRepos) "/$repos" else ""}")

class Repo(ownername: String, repoName: String) : Resource("/$repos/$ownername/$repoName")

private val zen = "zen"
private val users = "users"
private val repos = "repos"
private val licenses = "licenses"
private val organizations = "orgs"

