package br.com.rubensrodrigues.navigationteste.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.rubensrodrigues.navigationteste.AppInjector
import br.com.rubensrodrigues.navigationteste.R
import br.com.rubensrodrigues.navigationteste.ui.signup.SignupActivity
import kotlinx.android.synthetic.main.activity_home.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class HomeActivity : AppCompatActivity() {

    private val viewModel by lazy {
        val factory = AppInjector.getHomeViewModel()
        ViewModelProvider(this, factory).get(HomeViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setTitle(R.string.home)

        setListeners()
        setObservers()
    }

    private fun setObservers() {
        viewModel.run {
            openSignup.observe(this@HomeActivity, Observer {
                startActivity(intentFor<SignupActivity>())
            })
        }
    }

    private fun setListeners() {
        buttonSignup.setOnClickListener { viewModel.onSigninClicked() }
    }
}
