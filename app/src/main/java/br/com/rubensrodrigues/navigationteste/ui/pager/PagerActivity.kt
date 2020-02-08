package br.com.rubensrodrigues.navigationteste.ui.pager

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.viewpager.widget.ViewPager
import br.com.rubensrodrigues.navigationteste.R

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)

    }

    override fun onBackPressed() {
        val viewPagerSecondScreen = getViewPager(R.id.viewpager)

        viewPagerSecondScreen?.let {
            val navController =
                if (it.currentItem == 0) getPageNavigation(R.id.leftnavigation)
                else getPageNavigation(R.id.rightnavigation)

            navController?.let { nav -> if (!nav.popBackStack()) popMainNavigation() } ?: run { popMainNavigation() }
        } ?: kotlin.run { super.onBackPressed() }
    }

    private fun popMainNavigation() {
        if (!findNavController(R.id.viewpagernavigation).popBackStack())
            super.onBackPressed()
    }

    private fun getViewPager(@IdRes id: Int): ViewPager?{
        return try {
            findViewById<ViewPager>(id)
        } catch (ex: IllegalArgumentException){
            null
        }
    }

    private fun getPageNavigation(@IdRes id: Int): NavController?{
        return try {
            findNavController(id)
        } catch (ex: IllegalArgumentException){
            null
        }
    }
}
