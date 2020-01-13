package br.com.rubensrodrigues.navigationteste.ui.signup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.rubensrodrigues.navigationteste.R
import br.com.rubensrodrigues.navigationteste.model.Address
import br.com.rubensrodrigues.navigationteste.model.PersonalData

class SignupActivity : AppCompatActivity() {

    lateinit var personalData: PersonalData
    lateinit var address: Address

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        setTitle(R.string.signup)
    }
}
