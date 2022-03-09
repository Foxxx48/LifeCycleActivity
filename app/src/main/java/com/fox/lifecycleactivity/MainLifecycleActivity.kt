package com.fox.lifecycleactivity

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.fox.lifecycleactivity.databinding.ActivityMainLifecycleBinding

class MainLifecycleActivity : AppCompatActivity() {



        lateinit var binding : ActivityMainLifecycleBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "OnCreate, savedState = $savedInstanceState")

//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_lifecycle)

        binding = ActivityMainLifecycleBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.showAnotherActivityButton.setOnClickListener() {
//            supportFragmentManager.findFragmentById(R.layout.fragment_secondary_activity)
//                supportFragmentManager.beginTransaction().replace(R.layout.fragment_secondary_activity, SecondaryActivity()).commit()
//            startActivity(Intent(this, SecondaryActivity::class.java))
//            supportFragmentManager.beginTransaction().show(SecondaryActivity())
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        binding.showTransparentActivityButton.setOnClickListener {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 1)
        }

        binding.minimizeTheAppButton.setOnClickListener {
            moveTaskToBack(false)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "OnSaveInstanceState")
    }

    companion object {
        @JvmStatic val TAG = MainLifecycleActivity::class.simpleName
    }
}