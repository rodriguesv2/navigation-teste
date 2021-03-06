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
import br.com.rubensrodrigues.navigationteste.model.PersonalData
import br.com.rubensrodrigues.navigationteste.ui.signup.SignupActivity
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
        setObservers()
    }

    private fun setObservers() {
        viewModel.run {
            openAddress.observe(this@PersonalDataFragment, Observer {
                val personalData = PersonalData(
                    personalDataNameTextView.text.toString(),
                    personalDataLastNameTextView.text.toString(),
                    personalDataAgeTextView.text.toString().toIntOrNull() ?: 0
                )

                (activity as SignupActivity).personalData = personalData
                goToAddress()
            })
        }
    }

    private fun goToAddress() {
        val direction =
            PersonalDataFragmentDirections.actionFromPersonalDataToAddress()
        navController.navigate(direction)
    }

    private fun setListener() {
        personalButton.setOnClickListener { viewModel.onContinueClicked() }
    }
}
