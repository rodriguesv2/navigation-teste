package br.com.rubensrodrigues.navigationteste.ui.pager.fragments.pagecontent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.rubensrodrigues.navigationteste.R

/**
 * A simple [Fragment] subclass.
 */
class SecondLeftFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_left, container, false)
    }


}
