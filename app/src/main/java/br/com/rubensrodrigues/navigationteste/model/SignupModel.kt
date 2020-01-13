package br.com.rubensrodrigues.navigationteste.model

import java.io.Serializable


class PersonalData(
    var name: String,
    var lastName: String,
    var age: Int
) : Serializable

class Address(
    var address: String,
    var neighborhood: String,
    var city: String,
    var uf: String
) : Serializable

