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
                        gists_url,
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
    lateinit var gists_url: String
    lateinit var starred_url: String
    lateinit var subscriptions_url: String
    lateinit var organizations_url: String
    lateinit var repos_url: String
    lateinit var events_url: String
    lateinit var received_events_url: String
    lateinit var type: String
    var site_admin: Boolean = false
    var name: String? = null
    var company: String? = null
    var blog: String? = null
    var location: String? = null
    var email: String? = null
    var hireable: Boolean = false
    var bio: String? = null
    var public_repos: Long = 0
    var public_gists: Long = 0
    var followers: Long = 0
    var following: Long = 0
    var created_at: String? = null
    var updated_at: String? = null
}