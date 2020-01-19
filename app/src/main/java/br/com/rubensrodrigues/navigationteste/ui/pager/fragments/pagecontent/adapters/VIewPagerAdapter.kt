package br.com.rubensrodrigues.navigationteste.ui.pager.fragments.pagecontent.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class VIewPagerAdapter(
    fragmentManager: FragmentManager,
    private val leftFragment: Fragment,
    private val rightFragment: Fragment
) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val fragments = listOf(leftFragment, rightFragment)
    val titles = listOf("Esquerda", "Direita")

    override fun getItem(position: Int) = fragments[position]

    override fun getCount() = fragments.size

    override fun getPageTitle(position: Int) = titles[position]
}