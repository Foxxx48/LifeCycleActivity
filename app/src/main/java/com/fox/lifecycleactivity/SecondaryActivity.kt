package com.fox.lifecycleactivity

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.fox.lifecycleactivity.databinding.ActivitySecondaryBinding


class SecondaryActivity : Fragment(), View.OnClickListener {

    lateinit var binding : ActivitySecondaryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(SecondaryActivity.TAG, "OnCreate, savedState = $savedInstanceState")

        binding = DataBindingUtil.inflate(inflater, R.layout.activity_secondary, container, false)

        return binding?.root
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
        @JvmStatic val TAG = SecondaryActivity::class.simpleName
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


}