package mx.posadev

import org.junit.Test
import kotlin.test.assertTrue

class GithubKonzumerTest {
    @Test
    fun testApi() {
        println("Checking that we are allowed to call `api` method")
        assertTrue(GithubKonzumer.api() is Unit, "Checking that we are allowed to call `api` method")
    }
}