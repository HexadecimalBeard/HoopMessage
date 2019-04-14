package com.hexadecimal.hoopmessage.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.hexadecimal.hoopmessage.R
import com.hexadecimal.hoopmessage.adapter.HoopViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TabLayout.BaseOnTabSelectedListener<TabLayout.Tab>,
    ViewPager.OnPageChangeListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpHoopContainer.adapter =
            HoopViewPagerAdapter(supportFragmentManager)

        tblLayHoopContainer.setupWithViewPager(vpHoopContainer)

        // secili gelen tab i degistirmek icin
        vpHoopContainer.currentItem = 1

        // tablara tiklandiginda calisir
        tblLayHoopContainer.addOnTabSelectedListener(this)

        // sayfa swipe ile degistiginde calisir
        vpHoopContainer.addOnPageChangeListener(this)

    }

    // secilen tab lara gore islem yapmak icin?
    override fun onTabReselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabReSelected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabUnSelected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabSelected", Toast.LENGTH_SHORT).show()
    }

    // tab a basilip gecilmesiyle swipe yaparak gecilmesi arasinda metodlarin calisma
    // sirasinda fark var, eger bir metod digerinden veriye ihtiyac duyuyorsa
    // bu farktan dolayı hata ( null pointer ) olabilir

    // view pager da saga ve sola slide yapildiginde
    override fun onPageScrollStateChanged(state: Int) {
        Toast.makeText(this, "onPageScrollStateChanged", Toast.LENGTH_SHORT).show()
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Toast.makeText(this, "onPageScrolled", Toast.LENGTH_SHORT).show()
    }

    override fun onPageSelected(position: Int) {
        Toast.makeText(this, "onPageSelected", Toast.LENGTH_SHORT).show()
    }

}


