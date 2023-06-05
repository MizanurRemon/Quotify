package com.cheezycode.quotify.Utils

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class HelperTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun validatePassword() {
        var helper = Helper()
        var result = helper.validatePassword("12345")
        assertEquals(false, result)
    }
}