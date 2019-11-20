package com.example.praktikumpbm7.fauzanfregment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.praktikumpbm7.fauzanfregment.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //Fungsi yang pertama kali di jalankan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager.adapter = ViewPagerAdapter(
            this, supportFragmentManager)
        tabs.setupWithViewPager(view_pager)
    }
}
