package com.example.project4

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.project4.ui.theme.Project4Theme
import android.widget.Button
import android.widget.TextView
import com.example.project4.databinding.MainActivityBinding
import org.w3c.dom.Text


class MainActivity : ComponentActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)




        // Set up any listeners and logic here
        binding.button.setOnClickListener {
            val sum = binding.editText1.text.toString().toInt()+binding.editText2.text.toString().toInt();
            binding.sumText.text = sum.toString()
        }
    }
}