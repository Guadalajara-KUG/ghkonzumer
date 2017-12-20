package mx.posadev.parse.adapters

import com.squareup.moshi.FromJson
import mx.posadev.response.LicenseResponse

class LicenseAdapter {
    @FromJson
    fun licenseResponseFromJson(json: LicenseJson): LicenseResponse = with(json) {
        LicenseResponse(
                key,
                name,
                spdx_id,
                url,
                html_url,
                description,
                implementation,
                permissions,
                conditions,
                limitations,
                body,
                featured)
    }
}

class LicenseJson {
    lateinit var key: String
    lateinit var name: String
    lateinit var spdx_id: String
    lateinit var url: String
    var html_url: String? = null
    var description: String? = null
    var implementation: String? = null
    var permissions: Array<String>? = null
    var conditions: Array<String>? = null
    var limitations: Array<String>? = null
    var body: String? = null
    var featured: Boolean = false
}