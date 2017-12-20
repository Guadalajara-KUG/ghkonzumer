package mx.posadev.parse

import mx.posadev.request.Resource
import mx.posadev.request.User
import mx.posadev.request.Zen
import mx.posadev.response.*

actual fun parseResource(resource: Resource, string: String): Response {
    if (resource is Zen) {
        return ZenResponse(string)
    }

    val jsonAdapter = Parser.createResourceAdapter(resource)

    val response = if (resource is User && resource.fetchRepos) {
        //FIXME: Not very idiomatic
        val listResponse: List<RepoResponse> = jsonAdapter.fromJson(string) as List<RepoResponse>
        UserReposResponse(listResponse.toTypedArray())
    }else{
        jsonAdapter.fromJson(string)
    }

    return response ?: ParsingError("Error parsing: $string")
}