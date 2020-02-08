package br.com.rubensrodrigues.navigationteste.ui.pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import br.com.rubensrodrigues.navigationteste.R

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)

    }

    override fun onBackPressed() {
        if(!findNavController(R.id.viewpagernavigation).popBackStack())
            super.onBackPressed()
    }
}
