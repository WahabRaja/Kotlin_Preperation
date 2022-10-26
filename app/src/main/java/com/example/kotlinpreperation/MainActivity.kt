package com.example.kotlinpreperation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.kotlinpreperation.retrofit.NetworkCallsInterface
import com.example.kotlinpreperation.retrofit.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    lateinit var showresponse: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showresponse=findViewById(R.id.text)
        findViewById<Button>(R.id.button).setOnClickListener( View.OnClickListener {
            serverCall()
        })
    }

    private fun serverCall() {
        val getUsersdata= RetrofitHelper.getInstance()
        val apiInstance=getUsersdata.create(NetworkCallsInterface::class.java)
        GlobalScope.launch {
            val result = apiInstance.getAllUserResponse()
            if (result != null)
            // Checking the results

                Log.d("RetrofitResponse: ", result.body().toString())
            /*this@MainActivity.runOnUiThread(java.lang.Runnable {
              showresponse.text = "Response: ${result.body().toString()}"
            })*/

        }
    }
}