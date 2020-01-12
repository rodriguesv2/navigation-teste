package br.com.rubensrodrigues.navigationteste.ui.signup.fragments.personaldata


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import br.com.rubensrodrigues.navigationteste.AppInjector

import br.com.rubensrodrigues.navigationteste.R
import kotlinx.android.synthetic.main.fragment_personal_data.*

/**
 * A simple [Fragment] subclass.
 */
class PersonalDataFragment : Fragment() {

    private val viewModel by lazy {
        val factory = AppInjector.getPersonalDataViewModel()
        ViewModelProvider(this, factory).get(PersonalDataViewModel::class.java)
    }

    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personal_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListener()
        viewModel.run {
            openAddress.observe(this@PersonalDataFragment, Observer {
                navController.navigate(R.id.actionFromPersonalDataToAddress)
            })
        }
    }

    private fun setListener() {
        personalButton.setOnClickListener { viewModel.onContinueClicked() }
    }
}
