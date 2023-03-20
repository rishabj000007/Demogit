package com.example.githubdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getdata()
        Toast.makeText(this,"happpy",Toast.LENGTH_SHORT).show()

    }
    private fun getdata()
    {
        Toast.makeText(this,"happpy",Toast.LENGTH_SHORT).show()
    }

}