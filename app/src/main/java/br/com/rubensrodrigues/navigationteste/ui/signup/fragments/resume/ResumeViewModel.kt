package br.com.rubensrodrigues.navigationteste.ui.signup.fragments.resume

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.rubensrodrigues.navigationteste.SingleLiveEvent

class ResumeViewModel: ViewModel() {

    val finishSignup = SingleLiveEvent<Void>()

    fun onButtonClicked(){ finishSignup.call() }

    class Factory: ViewModelProvider.NewInstanceFactory(){
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return ResumeViewModel() as T
        }
    }
}