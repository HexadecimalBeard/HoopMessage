package com.hexadecimal.hoopmessage.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.hexadecimal.hoopmessage.ui.CallsFragment
import com.hexadecimal.hoopmessage.ui.CameraFragment
import com.hexadecimal.hoopmessage.ui.ChatsFragment
import com.hexadecimal.hoopmessage.ui.StatusFragment


// Created by Melih KOK
// kokmelih@gmail.com
// 14.04.2019 - 13:34

// FragmentStatePagerAdapter da var
class HoopViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {

    private val chatsFragment by lazy { ChatsFragment.newInstance() }
    private val callsFragment by lazy { CallsFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }
    private val cameraFragment by lazy { CameraFragment.newInstance() }

    val fragmentList = ArrayList<Fragment>()

    // fragmentlerin eklendigi sıra önemli

    val fragmentTitleList = ArrayList<String>()

    init {

        fragmentList.add(cameraFragment)
        fragmentList.add(chatsFragment)
        fragmentList.add(statusFragment)
        fragmentList.add(callsFragment)


        fragmentTitleList.add("Camera")
        fragmentTitleList.add("Chats")
        fragmentTitleList.add("Status")
        fragmentTitleList.add("Calls")

    }

    override fun getItem(position: Int): Fragment = fragmentList[position]

    // istenirse titleList.size da verilebilir , sayilar ayni oldugu icin
    override fun getCount(): Int = fragmentList.size

    // TabLayout daki basligi verir, disaridan title alıp position a gore kullanmak gerekir
    override fun getPageTitle(position: Int): CharSequence? = fragmentTitleList[position]


}