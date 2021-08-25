package com.example.pizzaorderapp_2021_08_25_9_39_home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizzaorderapp_2021_08_25_9_39_home.datas.StoreData

class ViewStoreDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        setupEvents()
        setValues()

    }


    override fun setupEvents() {
    }

    override fun setValues() {
    }

        val StoreData = intent.getSerializableExtra("StoreData")  as StoreData

//        priceTxt.text = roomData.getFormattedPrice()
//        descriptionTxt.text = roomData.description
//
//        addressTxt.text = roomData.address
//        floorTxt.text = roomData.getFormattedFloor()

    }
}