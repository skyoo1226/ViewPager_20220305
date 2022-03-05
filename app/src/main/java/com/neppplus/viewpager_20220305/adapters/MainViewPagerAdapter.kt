package com.neppplus.viewpager_20220305.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.neppplus.viewpager_20220305.fragments.MyHelloFragment
import com.neppplus.viewpager_20220305.fragments.MyInfoFragment
import com.neppplus.viewpager_20220305.fragments.MyNameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter( fm ) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "이름"
            1 -> "정보"
            else -> "인사말"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> MyNameFragment()
            1 -> MyInfoFragment()
            else -> MyHelloFragment()
        }

    }
}