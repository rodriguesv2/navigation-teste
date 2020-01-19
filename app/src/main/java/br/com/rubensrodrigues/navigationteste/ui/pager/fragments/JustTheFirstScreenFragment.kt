package br.com.rubensrodrigues.navigationteste.ui.pager.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import br.com.rubensrodrigues.navigationteste.R
import kotlinx.android.synthetic.main.fragment_just_the_first_screen.*

/**
 * A simple [Fragment] subclass.
 */
class JustTheFirstScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_just_the_first_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListeners()
    }

    private fun setListeners() {
        buttonFirstScreen.setOnClickListener {
            val directions =
                JustTheFirstScreenFragmentDirections.actionFromFirstToSecond()
            findNavController().navigate(directions)
        }
    }

}
