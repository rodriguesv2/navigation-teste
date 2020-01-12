package br.com.rubensrodrigues.navigationteste.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.rubensrodrigues.navigationteste.SingleLiveEvent

class HomeViewModel: ViewModel() {

    val openSignup = SingleLiveEvent<Void>()

    fun onSigninClicked(){
        openSignup.call()
    }

    class Factory: ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return HomeViewModel() as T
        }
    }
}

