package br.com.rubensrodrigues.navigationteste

import br.com.rubensrodrigues.navigationteste.ui.home.HomeViewModel
import br.com.rubensrodrigues.navigationteste.ui.signup.fragments.address.AddressViewModel
import br.com.rubensrodrigues.navigationteste.ui.signup.fragments.personaldata.PersonalDataViewModel

object AppInjector {

    fun getHomeViewModel() = HomeViewModel.Factory()
    fun getPersonalDataViewModel() = PersonalDataViewModel.Factory()
    fun getAddressViewModel() = AddressViewModel.Factory()
}