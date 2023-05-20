package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.tubes.databinding.ActivityMainBinding
import com.example.tubes.databinding.ActivitySignupBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    lateinit var signupBinding: signup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var getStart: Button = findViewById(R.id.getStart)
        getStart.setOnClickListener(this)


    }


    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.getStart -> {
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}



