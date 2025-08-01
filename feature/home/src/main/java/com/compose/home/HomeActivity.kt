package com.compose.home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.setContent
import androidx.activity.ComponentActivity
import androidx.compose.material3.Surface
import com.compose.home.ui.MainScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      com.compose.ui.theme.JelloTheme {
        Surface {
          MainScreen()
        }
      }
    }
  }
}
