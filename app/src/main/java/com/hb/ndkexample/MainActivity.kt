package com.hb.ndkexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.hb.ndkexample.ndk.NdkManager
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text_view)

        val numb = 30
        lifecycleScope.launch {
            textView.text = "Fibonacci ($numb) = ${NdkManager().computeFibonacci(numb)}"
        }
    }
}
