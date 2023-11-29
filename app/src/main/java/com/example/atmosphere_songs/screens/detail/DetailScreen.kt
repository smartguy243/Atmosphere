package com.example.atmosphere_songs.screens.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.atmosphere_songs.R
import com.example.atmosphere_songs.components.TopAppBar
import com.example.atmosphere_songs.data.getDataFromRemote

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavHostController, songId: String) {
    val song = getDataFromRemote().first { song -> song.id == songId }
    Scaffold(topBar = {
        TopAppBar(
            title = "Detail",
            isHome = false,
            navIcon = Icons.Default.ArrowBack,
            actionTwoIcon = R.drawable.baseline_settings_suggest_24,
            onNavigationIconClicked = { navController.popBackStack() }
        ) { navController.navigate("setting") }
    }) { it ->
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "${song.id} ${song.name}")


        }

    }
}