package com.example.projectbp2688

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp2688.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookKidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // event btton untuk fairy fragment
        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
    }
        //event saat button fable diklik
        binding.buttonFable.setOnClickListener {
            replaceFragment(FableFragment())
    }
        //event saat button science diklik
        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())

        }
    }
        fun replaceFragment(frg: Fragment){
            val fragmentManager = supportFragmentManager
            val fragmenTrx = fragmentManager.beginTransaction()
            fragmenTrx.replace(R.id.fragmentKidBook, frg)
            fragmenTrx.commit()
        }
    }
}