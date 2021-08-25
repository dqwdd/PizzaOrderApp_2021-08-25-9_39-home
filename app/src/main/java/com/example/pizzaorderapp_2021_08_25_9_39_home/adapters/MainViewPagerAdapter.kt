package com.example.pizzaorderapp_2021_08_25_9_39_home.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorderapp_2021_08_25_9_39_home.fragments.MyProfileFragment
import com.example.pizzaorderapp_2021_08_25_9_39_home.fragments.PizzaStoreListFragment

class MainViewPagerAdapter  ( fm : FragmentManager) : FragmentPagerAdapter(fm)  {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }
}