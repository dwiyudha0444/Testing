package com.dwiyu.testing

import org.junit.Assert
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun validUsernameAndCorrectlyRepeatedPassword_return_true() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Ariya",
            "12345",
            "12345"
        )
        Assert.assertEquals("oke", result, true)
    }

    @Test
    fun usernameEmpty(){
        val user = "qwerty"
        val result = RegistrationUtil.validateRegistrationInput(user,"1234","1234")
        Assert.assertEquals("oke", result, true)
    }

    @Test
    fun existingUsername(){
        val user= "Bah"
        val result = RegistrationUtil.validateRegistrationInput(user,"1234","1234")
        Assert.assertEquals("usernameexist", result, true)
    }



}