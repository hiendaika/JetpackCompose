package com.example.myfirstcompose.puppies.data

import java.io.Serializable

data class Puppy(
    val id: Int,
    val name: String,
    val gender: String,
    val age: Int,
    val description: String,
    val image: Int = 0
) : Serializable
