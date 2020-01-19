package br.com.rubensrodrigues.navigationteste.ui.pager.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.rubensrodrigues.navigationteste.R
import br.com.rubensrodrigues.navigationteste.ui.pager.fragments.pagecontent.LeftFragment
import br.com.rubensrodrigues.navigationteste.ui.pager.fragments.pagecontent.RightFragment
import br.com.rubensrodrigues.navigationteste.ui.pager.fragments.pagecontent.adapters.VIewPagerAdapter
import kotlinx.android.synthetic.main.fragment_the_pager_screen.*

/**
 * A simple [Fragment] subclass.
 */
class ThePagerScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_the_pager_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.supportFragmentManager?.let {
            viewpager.adapter = VIewPagerAdapter(
                it,
                LeftFragment.newInstance(),
                RightFragment.newInstance()
            )

            tablayout.setupWithViewPager(viewpager)
        }

    }

}
