package com.example.viewpager_tablayout_ex.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_tablayout_ex.R
import com.example.viewpager_tablayout_ex.adapter.PagerAdapter
import com.example.viewpager_tablayout_ex.databinding.ActivityMainBinding
import com.example.viewpager_tablayout_ex.fragment.Fragment1
import com.example.viewpager_tablayout_ex.fragment.Fragment2
import com.example.viewpager_tablayout_ex.fragment.Fragment3
import com.example.viewpager_tablayout_ex.fragment.Fragment4
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var pagerAdapter: PagerAdapter
    // 메뉴에 들어갈 이름 (순서대로)
    private val tabTextList = arrayListOf("My뷰", "발견", "코로나19", "잔여백신")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pagerAdapter = PagerAdapter(this)
        binding.apply {
            viewpager.adapter = pagerAdapter

            // 뷰페이저와 탭레이아웃을 붙인다.
            TabLayoutMediator(tabLayout,viewpager){tab, position ->
                tab.text = tabTextList[position]
            }.attach()
        }
    }
}