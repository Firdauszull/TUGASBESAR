package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.tubes.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnmenuLogin.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }


}

