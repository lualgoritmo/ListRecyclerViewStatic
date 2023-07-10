package com.example.listcardstatic.domain

import java.io.Serializable

data class PersonTest(
    val name: String,
    val age: String,
    val imgPerson: Int,
    val description: String,
    val detailGenere: String,
    val detailTextPerson: String
): Serializable
