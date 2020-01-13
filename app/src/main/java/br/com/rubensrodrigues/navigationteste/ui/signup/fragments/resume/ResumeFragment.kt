package br.com.rubensrodrigues.navigationteste.ui.signup.fragments.resume

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.rubensrodrigues.navigationteste.AppInjector
import br.com.rubensrodrigues.navigationteste.R
import br.com.rubensrodrigues.navigationteste.ui.signup.SignupActivity
import kotlinx.android.synthetic.main.fragment_resume.*

class ResumeFragment : Fragment() {

    private val viewModel by lazy {
        val factory = AppInjector.getResumeViewModel()
        ViewModelProvider(this, factory).get(ResumeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_resume, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fillLabels()
        setListener()
        setObservers()
    }

    private fun setObservers() {
        viewModel.run {
            finishSignup.observe(this@ResumeFragment, Observer {
                activity?.finish()
            })
        }
    }

    private fun setListener() {
        resumeButton.setOnClickListener { viewModel.onButtonClicked() }
    }

    private fun fillLabels() {
        (activity as SignupActivity).run {
            resumeName.text =
                Html.fromHtml(getString(R.string.resumeName, "${personalData.name} ${personalData.lastName}"))
            resumeAge.text =
                Html.fromHtml(getString(R.string.resumeAge, personalData.age.toString()))
            resumeAddress.text =
                Html.fromHtml(getString(R.string.resumeAddress, address.address))
            resumeNeighborhood.text =
                Html.fromHtml(getString(R.string.resumeNeighborhood, address.neighborhood))
            resumeCity.text =
                Html.fromHtml(getString(R.string.resumeCity, "${address.city} - ${address.uf}"))
        }
    }

}
