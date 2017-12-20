package mx.posadev.parse.adapters

import com.squareup.moshi.FromJson
import mx.posadev.response.LicenseResponse
import mx.posadev.response.OrganizationResponse
import mx.posadev.response.RepoResponse
import mx.posadev.response.UserResponse

class RepoAdapter {
    @FromJson
    fun repoResponseFromJson(json: RepoJson): RepoResponse =
            with(json) {
                RepoResponse(
                        id,
                        name,
                        full_name,
                        owner,
                        private,
                        html_url,
                        description,
                        fork,
                        url,
                        forks_url,
                        keys_url,
                        collaborators_url,
                        teams_url,
                        hooks_url,
                        issue_events_url,
                        events_url,
                        assignees_url,
                        branches_url,
                        tags_url,
                        blobs_url,
                        git_tags_url,
                        git_refs_url,
                        trees_url,
                        statuses_url,
                        languages_url,
                        stargazers_url,
                        contributors_url,
                        subscribers_url,
                        subscription_url,
                        commits_url,
                        git_commits_url,
                        comments_url,
                        issue_comment_url,
                        contents_url,
                        compare_url,
                        merges_url,
                        archive_url,
                        downloads_url,
                        issues_url,
                        pulls_url,
                        milestones_url,
                        notifications_url,
                        labels_url,
                        releases_url,
                        deployments_url,
                        created_at,
                        updated_at,
                        pushed_at,
                        git_url,
                        ssh_url,
                        clone_url,
                        svn_url,
                        homepage,
                        size,
                        stargazers_count,
                        watchers_count,
                        language,
                        has_issues,
                        has_projects,
                        has_downloads,
                        has_wiki,
                        has_pages,
                        forks_count,
                        mirror_url,
                        archived,
                        open_issues_count,
                        license,
                        forks,
                        open_issues,
                        watchers,
                        default_branch,
                        organization,
                        network_count,
                        subscribers_count
                )
            }
}


class RepoJson {
    var id: Long = 0
    lateinit var name: String
    lateinit var full_name: String
    lateinit var owner: UserResponse
    var private: Boolean = false
    lateinit var html_url: String
    var description: String? = null
    var fork: Boolean = false
    lateinit var url: String
    lateinit var forks_url: String
    lateinit var keys_url: String
    lateinit var collaborators_url: String
    lateinit var teams_url: String
    lateinit var hooks_url: String
    lateinit var issue_events_url: String
    lateinit var events_url: String
    lateinit var assignees_url: String
    lateinit var branches_url: String
    lateinit var tags_url: String
    lateinit var blobs_url: String
    lateinit var git_tags_url: String
    lateinit var git_refs_url: String
    lateinit var trees_url: String
    lateinit var statuses_url: String
    lateinit var languages_url: String
    lateinit var stargazers_url: String
    lateinit var contributors_url: String
    lateinit var subscribers_url: String
    lateinit var subscription_url: String
    lateinit var commits_url: String
    lateinit var git_commits_url: String
    lateinit var comments_url: String
    lateinit var issue_comment_url: String
    lateinit var contents_url: String
    lateinit var compare_url: String
    lateinit var merges_url: String
    lateinit var archive_url: String
    lateinit var downloads_url: String
    lateinit var issues_url: String
    lateinit var pulls_url: String
    lateinit var milestones_url: String
    lateinit var notifications_url: String
    lateinit var labels_url: String
    lateinit var releases_url: String
    lateinit var deployments_url: String
    lateinit var created_at: String
    lateinit var updated_at: String
    lateinit var pushed_at: String
    lateinit var git_url: String
    lateinit var ssh_url: String
    lateinit var clone_url: String
    lateinit var svn_url: String
    var homepage: String? = null
    var size: Long = 0
    var stargazers_count: Long = 0
    var watchers_count: Long = 0
    var language: String? = null
    var has_issues: Boolean = false
    var has_projects: Boolean = false
    var has_downloads: Boolean = false
    var has_wiki: Boolean = false
    var has_pages: Boolean = false
    var forks_count: Long = 0
    var mirror_url: String? = null
    var archived: Boolean = false
    var open_issues_count: Long = 0
    var license: LicenseResponse? = null
    var forks: Long = 0
    var open_issues: Long = 0
    var watchers: Long = 0
    lateinit var default_branch: String
    var organization: OrganizationResponse? = null
    var network_count: Long = 0
    var subscribers_count: Long = 0
}