package mx.posadev

import mx.posadev.request.Zen
import mx.posadev.response.Response
import org.junit.Test
import kotlin.test.assertTrue

class GithubKonzumerTest {
    @Test
    fun testApi() {
        println("Checking that we are allowed to call `api` method")
        val response = GithubKonzumer.api(Zen)
        println(response)
        assertTrue(response is Response, "Checking that we get a Response after calling the API")
        assertTrue(response != null, "Checking that we are allowed to get and actual Response")
    }
}