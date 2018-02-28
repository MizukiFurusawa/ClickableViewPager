package com.fmzk.dev.clickableviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.databinding.DataBindingUtil
import android.net.Uri
import android.util.Log
import com.fmzk.dev.clickableviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() ,
        blank01.OnFragmentInteractionListener,
        blank02.OnFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private lateinit var binding: ActivityMainBinding
    private val adapter = CustomPagerAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.pager.adapter = adapter
        adapter.initialize()
        binding.pager.setOnItemClickListener {
            Log.d("debug", "page = " + it)
        }
    }
}
