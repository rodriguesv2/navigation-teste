package br.com.rubensrodrigues.navigationteste.ui.signup.fragments.address

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.rubensrodrigues.navigationteste.SingleLiveEvent

class AddressViewModel : ViewModel() {

    val openResume = SingleLiveEvent<Void>()

    fun onButtonClicked(){ openResume.call() }

    class Factory: ViewModelProvider.NewInstanceFactory(){
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return AddressViewModel() as T
        }
    }
}