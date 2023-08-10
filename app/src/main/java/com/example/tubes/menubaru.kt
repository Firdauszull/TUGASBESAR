package com.example.tubes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class menubaru : AppCompatActivity() {
    private lateinit var  bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menubaru)

        bottomNavigationView = findViewById(R.id.btn_nav)

        bottomNavigationView.setOnItemSelectedListener { menuItem->
            when(menuItem.itemId){
                R.id.homeLayout->{
                    replaceFragment(HomeFragment())
                    true
                }
               R.id.likeLayout->{
                   replaceFragment(LikeFragment())
                   true
               }
                R.id.historyLayout->{
                    replaceFragment(HistoryFragment())
                    true
                }
                R.id.profileLayout->{
                    replaceFragment(ProfileFragment())
                    true
                }
                else->false
            }
        }
        replaceFragment(HomeFragment())

    }


    private fun replaceFragment(fragment: HomeFragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()

    }
    private fun replaceFragment(fragment: LikeFragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()

    }
    private fun replaceFragment(fragment: HistoryFragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()

    }
    private fun replaceFragment(fragment: ProfileFragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()

    }

}









