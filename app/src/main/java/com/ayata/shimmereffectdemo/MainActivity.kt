package com.ayata.shimmereffectdemo

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.ayata.shimmereffectdemo.databinding.ActivityMainBinding
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {

    lateinit var shimmerFrameLayout: ShimmerFrameLayout
    lateinit var mainxml: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shimmerFrameLayout = findViewById(R.id.shimmer_view_container)
        shimmerFrameLayout.startShimmerAnimation()

        Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
            override fun run() {
                shimmerFrameLayout.stopShimmerAnimation()
            }
        },200)


    }
}