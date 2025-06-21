package com.example.ongc_logger_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ongc_logger_app.ui.theme.OngcloggerappTheme
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mycoolapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Use ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set toolbar as ActionBar
        setSupportActionBar(binding.topAppBar)

        // Button click listener
        binding.btnStart.setOnClickListener {
            Toast.makeText(this, "Starting your journey!", Toast.LENGTH_SHORT).show()
            // You can start a new activity here
            // startActivity(Intent(this, NextActivity::class.java))
        }

        // FAB click listener
        binding.fab.setOnClickListener {
            Toast.makeText(this, "FAB clicked!", Toast.LENGTH_SHORT).show()
        }

        // Top AppBar navigation click
        binding.topAppBar.setNavigationOnClickListener {
            Toast.makeText(this, "Navigation menu clicked!", Toast.LENGTH_SHORT).show()
        }

        // Optional: App bar menu item clicks
        binding.topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_settings -> {
                    Toast.makeText(this, "Settings clicked!", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OngcloggerappTheme {
        Greeting("Android")
    }
}