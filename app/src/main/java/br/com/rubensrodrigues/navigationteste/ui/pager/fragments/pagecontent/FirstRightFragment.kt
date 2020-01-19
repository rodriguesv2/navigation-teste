package br.com.rubensrodrigues.navigationteste.ui.pager.fragments.pagecontent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import br.com.rubensrodrigues.navigationteste.R
import kotlinx.android.synthetic.main.fragment_first_right.*

/**
 * A simple [Fragment] subclass.
 */
class FirstRightFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_right, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonRightSecondScreen.setOnClickListener {
            val directions =
                FirstRightFragmentDirections.actionFromRightFirstToSecond()
            findNavController().navigate(directions)
        }
    }


}
