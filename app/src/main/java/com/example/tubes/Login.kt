package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.tubes.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnmenuSignup.setOnClickListener{
        val intent = Intent(this, signup::class.java)
        startActivity(intent)
        }
        binding.btnmenuLogin.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)

        }
    }


}
