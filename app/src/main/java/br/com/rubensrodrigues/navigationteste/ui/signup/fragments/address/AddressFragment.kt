package br.com.rubensrodrigues.navigationteste.ui.signup.fragments.address


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
import br.com.rubensrodrigues.navigationteste.model.Address
import br.com.rubensrodrigues.navigationteste.ui.signup.SignupActivity
import kotlinx.android.synthetic.main.fragment_address.*

/**
 * A simple [Fragment] subclass.
 */
class AddressFragment : Fragment() {

    val viewModel by lazy {
        val factory = AppInjector.getAddressViewModel()
        ViewModelProvider(this, factory).get(AddressViewModel::class.java)
    }

    val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_address, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListener()
        setObservers()
    }

    private fun setObservers() {
        viewModel.run {
            openResume.observe(this@AddressFragment, Observer {
                val address = Address(
                    addressTextView.text.toString(),
                    addressNeighborhoodTextView.text.toString(),
                    addressCityTextView.text.toString(),
                    addressUfTextView.text.toString()
                )
                (activity as SignupActivity).address = address

                goToResume()
            })
        }
    }

    private fun goToResume() {
        val direction = AddressFragmentDirections.actionFromAddressToResume()
        navController.navigate(direction)
    }

    private fun setListener() {
        addressButton.setOnClickListener { viewModel.onButtonClicked() }
    }
}
