package br.com.rubensrodrigues.navigationteste.model

data class Signup(
    var personalData: PersonalData? = null,
    var address: Address? = null
)

data class PersonalData(
    val name: String,
    val lastName: String,
    val age: Int
)

data class Address(
    val address: String,
    val neighborhood: String,
    val city: String,
    val uf: String
)

