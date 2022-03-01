package com.fox.lifecycleactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.fox.lifecycleactivity.databinding.ActivitySecondaryBinding

class SecondaryLifecycleActivity : AppCompatActivity() {

    lateinit var binding : ActivitySecondaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "OnCreate, savedState = $savedInstanceState")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_secondary)

//        binding = ActivitySecondaryBinding.inflate(layoutInflater).also { setContentView(it.root) }


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
        @JvmStatic val TAG = SecondaryLifecycleActivity::class.simpleName
    }
}