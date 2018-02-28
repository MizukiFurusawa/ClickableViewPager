package com.fmzk.dev.clickableviewpager

/**
 * Created by fmzk on 2018/03/01.
 */
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
/**
 * Created by fmzk on 2018/02/13.
 */
class CustomPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var list = mutableListOf<Fragment>()

    fun initialize(){
        list.add(blank01.newInstance("debug01","debug02"))
        list.add(blank02.newInstance("debug01","debug02"))
        notifyDataSetChanged()
    }

    override fun getItem(position: Int): Fragment? {
        if(list.isEmpty()){
            return null
        }
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }
}