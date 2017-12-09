package mx.posadev

import mx.posadev.response.Response
import org.junit.Test
import kotlin.test.assertTrue

class GithubKonzumerTest {
    @Test
    fun testApi() {
        println("Checking that we are allowed to call `api` method")
        assertTrue(GithubKonzumer.api() is Response, "Checking that we get a Response after calling the API")
        assertTrue(GithubKonzumer.api() != null, "Checking that we are allowed to get and actual Response")
    }
}