package br.com.rubensrodrigues.navigationteste.ui.signup.fragments.personaldata

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.rubensrodrigues.navigationteste.SingleLiveEvent

class PersonalDataViewModel: ViewModel() {

    val openAddress = SingleLiveEvent<Void>()

    fun onContinueClicked(){
        openAddress.call()
    }

    class Factory: ViewModelProvider.NewInstanceFactory(){
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return PersonalDataViewModel() as T
        }
    }
}