package mx.posadev

import mx.posadev.request.User
import mx.posadev.request.Zen
import mx.posadev.response.Response
import mx.posadev.response.UserResponse
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
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

    @Test
    fun testApiForUser(){
        println("Checking that we are allowed to call `api` method")
        val response = GithubKonzumer.api(User("sierisimo"))
        println(response)
        assertTrue(response is UserResponse, "Checking that we get a Response after calling the API")
        if(response is UserResponse) {
            assertNotNull(response.login)
            assertEquals("sierisimo", response.login)
            assertEquals("http://about.me/sierisimo", response.blog)
        }
    }
}