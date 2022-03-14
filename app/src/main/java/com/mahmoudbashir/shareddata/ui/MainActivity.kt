package com.mahmoudbashir.shareddata.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.mahmoudbashir.shareddata.R
import com.mahmoudbashir.shareddata.databinding.ActivityMainBinding
import com.mahmoudbashir.shareddata.fragments.FirstFragment
import com.mahmoudbashir.shareddata.fragments.SecondFragment
import com.mahmoudbashir.shareddata.viewModel.sharedViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() ,FirstFragment.senCountInterface{

    lateinit var mainBinding : ActivityMainBinding

    val viewModel by inject<sharedViewModel>()
    lateinit var firstFragment: FirstFragment
    lateinit var secFragment:SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        firstFragment = FirstFragment()
        secFragment = SecondFragment()


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.first_host,firstFragment)
            .replace(R.id.second_host,secFragment)
            .commit()



    }

    override fun attachedCount(c: Int) {
       secFragment.gotResult(c)
       Log.d("err: ","err")
    }

}