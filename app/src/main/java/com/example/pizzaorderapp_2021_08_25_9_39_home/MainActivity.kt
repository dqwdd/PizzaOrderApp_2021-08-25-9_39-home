package com.example.pizzaorderapp_2021_08_25_9_39_home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizzaorderapp_2021_08_25_9_39_home.adapters.MainViewPagerAdapter
import com.example.pizzaorderapp_2021_08_25_9_39_home.datas.StoreData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mainViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()

    }


    override fun setupEvents() {
    }

    override fun setValues() {
        mainViewPagerAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mainViewPagerAdapter


//        탭 레이아웃과 뷰페이저 연동하는 기능 추가!
        mainTabLayout.setupWithViewPager(mainViewPager)

    }


}