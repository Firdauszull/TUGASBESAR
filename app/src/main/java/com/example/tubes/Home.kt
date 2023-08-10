package com.example.tubes

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.tubes.databinding.ActivityHomeBinding
import com.example.tubes.fragment.OrdersFragment
import com.google.android.material.navigation.NavigationView

class Home : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var toolbar: Toolbar
    private lateinit var drawerLayout: DrawerLayout
    lateinit var binding: ActivityHomeBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        

        drawerLayout = findViewById<DrawerLayout>(R.id.drawerBtn)


        val toolbarLayout = findViewById<Toolbar>(R.id.tollbar)
        setActionBar(toolbarLayout)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.frame_container, HomeFragment())
                .commit()
            navigationView.setCheckedItem(R.id.btn_nav)
        }

    }




    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            //R.id.menuBar -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container,HomeFragment()).commit()
            R.id.nav_order -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container,OrdersFragment()).commit()
            R.id.nav_like -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container,LikeFragment()).commit()
            R.id.nav_signOut-> Toast.makeText(this,"Logout", Toast.LENGTH_SHORT).show()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)

        }else{
            onBackPressedDispatcher.onBackPressed()
        }
    }
}

