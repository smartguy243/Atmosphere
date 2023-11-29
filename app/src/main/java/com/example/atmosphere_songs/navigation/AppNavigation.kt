package com.example.atmosphere_songs.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.atmosphere_songs.screens.home.HomeScreen
import com.example.atmosphere_songs.screens.detail.DetailScreen
import com.example.atmosphere_songs.screens.home.HomeViewModel
import com.example.atmosphere_songs.screens.settings.SettingScreen

@SuppressLint("SuspiciousIndentation")
@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("home") {
            val homeViewModel = viewModel<HomeViewModel>()
            HomeScreen(
                homeViewModel=homeViewModel,
                navController=navController
            )
        }
        composable("detail/{songId}") {it->
        val songId = it.arguments?.getString("songId")!!
            DetailScreen( navController=navController,songId=songId)
        }

        composable("setting"){
            SettingScreen()
        }
    }
}

