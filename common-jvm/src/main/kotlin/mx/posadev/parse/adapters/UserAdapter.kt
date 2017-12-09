package mx.posadev.parse.adapters

import com.squareup.moshi.FromJson
import mx.posadev.response.UserResponse

class UserAdapter {
    @FromJson
    fun userResponseFromJson(userJson: UserJson): UserResponse =
            with(userJson) {
                UserResponse(login,
                        id,
                        avatar_url,
                        gravatar_id,
                        url,
                        html_url,
                        followers_url,
                        following_url,
                        gists__url,
                        starred_url,
                        subscriptions_url,
                        organizations_url,
                        repos_url,
                        events_url,
                        received_events_url,
                        type,
                        site_admin,
                        name,
                        company,
                        blog,
                        location,
                        email,
                        hireable,
                        bio,
                        public_repos,
                        public_gists,
                        followers,
                        following,
                        created_at,
                        updated_at)
            }
}

class UserJson {
    lateinit var login: String
    var id: Long = 0
    lateinit var avatar_url: String
    lateinit var gravatar_id: String
    lateinit var url: String
    lateinit var html_url: String
    lateinit var followers_url: String
    lateinit var following_url: String
    lateinit var gists__url: String
    lateinit var starred_url: String
    lateinit var subscriptions_url: String
    lateinit var organizations_url: String
    lateinit var repos_url: String
    lateinit var events_url: String
    lateinit var received_events_url: String
    lateinit var type: String
    var site_admin: Boolean = false
    lateinit var name: String
    lateinit var company: String
    lateinit var blog: String
    lateinit var location: String
    lateinit var email: String
    var hireable: Boolean = false
    lateinit var bio: String
    var public_repos: Long = 0
    var public_gists: Long = 0
    var followers: Long = 0
    var following: Long = 0
    lateinit var created_at: String
    lateinit var updated_at: String
}