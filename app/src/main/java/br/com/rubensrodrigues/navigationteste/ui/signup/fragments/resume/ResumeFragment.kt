package br.com.rubensrodrigues.navigationteste.ui.signup.fragments.resume

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.rubensrodrigues.navigationteste.R

class ResumeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_resume, container, false)
    }

}
