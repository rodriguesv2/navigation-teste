package br.com.rubensrodrigues.navigationteste.ui.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.rubensrodrigues.navigationteste.R

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        setTitle(R.string.signup)
    }
}
