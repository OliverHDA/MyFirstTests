package com.geekbrains.myfirsttests

import org.junit.Assert.*
import org.junit.Test

class HomeWorkTest {

    @Test
    fun notNullTest() {
        assertNotNull(Repo.getUsernameList())
    }

    @Test
    fun equalsTest() {
        assertEquals(Repo.getUsernameList()[0], "name1@email.com")
    }
    @Test
    fun notEqualsTest() {
        assertNotEquals(Repo.getUsernameList()[0], "name1@email.ru")
    }
}