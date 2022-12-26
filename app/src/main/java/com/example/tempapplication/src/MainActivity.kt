package com.example.tempapplication.src

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tempapplication.R
import com.example.tempapplication.config.BaseActivity
import com.example.tempapplication.databinding.ActivityMainBinding
import com.example.tempapplication.src.main.home.HomeFragment
import com.example.tempapplication.src.main.myPage.MyPageFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment()).commitAllowingStateLoss()

        binding.mainBtmNav.run {
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.menu_main_btm_nav_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.menu_main_btm_nav_my_page -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MyPageFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
            selectedItemId = R.id.menu_main_btm_nav_home
        }
    }
}