package com.example.pizzaorderapp_2021_08_25_9_39_home

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pizzaorderapp_2021_08_25_9_39_home.adapters.MainViewPagerAdapter
import com.example.pizzaorderapp_2021_08_25_9_39_home.datas.StoreData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.store_list_item.*
import kotlinx.android.synthetic.main.store_list_item.nameTxt

class MainActivity : BaseActivity() {

    lateinit var mStoreData: StoreData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()

    }


    override fun setupEvents() {

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as StoreData
//        as StoreData 안붙이면 에러남
//        데이터 형식이(아님 방식) 달라서 그런듯

        nameTxt.text = mStoreData.name
        phoneNumTxt.text = mStoreData.PhoneNum
        Glide.with(mContext).load(mStoreData.LogoURL).into(logoImg_in_DetailView)


}
}