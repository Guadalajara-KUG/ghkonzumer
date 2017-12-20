package mx.posadev.response

data class LicenseResponse(val key: String,
                           val name: String,
                           val spdxId: String,
                           val url: String,
                           val htmlUrl: String?,
                           val description: String?,
                           val implementation: String?,
                           val permissions: Array<String>?,
                           val conditions: Array<String>?,
                           val limitations: Array<String>?,
                           val body: String?,
                           val featured: Boolean = false) : Response