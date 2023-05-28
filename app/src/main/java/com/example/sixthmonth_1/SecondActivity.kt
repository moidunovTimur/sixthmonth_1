package com.example.sixthmonth_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sixthmonth_1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_second)
        setContentView(binding.root)

        binding.etSecondName.setText(intent.getStringExtra(MainActivity.MASATEXT))

        binding.secondBtn.setOnClickListener{
            val intent = Intent()
            intent.putExtra(MainActivity.MASATEXT,binding.etSecondName.text.toString())
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}