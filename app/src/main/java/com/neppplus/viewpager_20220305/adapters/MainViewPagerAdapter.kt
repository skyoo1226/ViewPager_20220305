package com.neppplus.viewpager_20220305.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.neppplus.viewpager_20220305.fragments.MyHelloFragment
import com.neppplus.viewpager_20220305.fragments.MyInfoFragment
import com.neppplus.viewpager_20220305.fragments.MyNameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter( fm ) {

    override fun getPageTitle(position: Int): CharSequence? {
        if ( position == 0) {
            return "이름"
        }
        else if ( position == 1) {
            return "정보"
        }
        else {
            return "인사말"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return MyNameFragment()
        }
        else if (position == 1) {
            return MyInfoFragment()
        }
        else {
            return MyHelloFragment()
        }

    }
}