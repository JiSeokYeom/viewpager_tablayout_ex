package com.example.viewpager_tablayout_ex.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager_tablayout_ex.fragment.Fragment1
import com.example.viewpager_tablayout_ex.fragment.Fragment2
import com.example.viewpager_tablayout_ex.fragment.Fragment3
import com.example.viewpager_tablayout_ex.fragment.Fragment4

class PagerAdapter(fragment : FragmentActivity) : FragmentStateAdapter(fragment){
    private val NUM_PAGES = 4 // 페이지 수를 정해 놓는다

    override fun getItemCount(): Int = NUM_PAGES // 페이지 수를 리턴한다

    override fun createFragment(position: Int): Fragment {
       // 페이지 포지션에 따라 그에 맞는 프래그먼트 보여줌
        return when(position){
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> Fragment4()
        }
    }
}