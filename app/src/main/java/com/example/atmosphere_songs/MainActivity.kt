package com.example.atmosphere_songs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.atmosphere_songs.navigation.AppNavigation
import com.example.atmosphere_songs.ui.theme.Atmosphere_SongsTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Atmosphere_SongsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color.White
                ) {
                    AppNavigation()
                }
            }
        }
    }
}