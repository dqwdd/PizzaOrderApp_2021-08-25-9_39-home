package com.example.pizzaorderapp_2021_08_25_9_39_home.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.pizzaorderapp_2021_08_25_9_39_home.R
import com.example.pizzaorderapp_2021_08_25_9_39_home.datas.StoreData

class PizzaStoreAdapter(
    val mContext : Context,
    resId : Int,
    val mList : List<StoreData>) : ArrayAdapter<StoreData>(mContext, resId, mList) {

        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temRow = convertView
        if (temRow==null) {
            temRow = mInflater.inflate(R.layout.store_list_item, null)
        }

        var row = temRow!!

        return row
    }

}