package com.geekbrains.myfirsttests

object Repo {
     private val usernameList: MutableList<String> = mutableListOf(
        "name1@email.com",
        "name2@email.com",
        "name3@email.com",
        "name4@email.com",
        "name5@email.com"
    )

    fun addUser(username: String) = usernameList.add(username)

    fun getUsernameList():List<String> = usernameList
}


