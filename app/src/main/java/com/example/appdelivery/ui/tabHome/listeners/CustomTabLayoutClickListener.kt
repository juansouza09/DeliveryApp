package com.example.appdelivery.ui.tabHome.listeners

import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class CustomTabLayoutClickListener(
    private val viewPager: ViewPager2): TabLayout.OnTabSelectedListener {

    override fun onTabSelected(tab: TabLayout.Tab?) {
        tab?.let {
            viewPager.currentItem = tab.position
        }
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {}

    override fun onTabReselected(tab: TabLayout.Tab?) {}
}