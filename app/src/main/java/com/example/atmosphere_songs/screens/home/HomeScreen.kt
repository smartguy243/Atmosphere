package com.example.atmosphere_songs.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.atmosphere_songs.components.BottomAppBarCompose
import com.example.atmosphere_songs.components.SearchBar
import com.example.atmosphere_songs.components.SongCard
import com.example.atmosphere_songs.components.TopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController, homeViewModel: HomeViewModel) {
    val songs = homeViewModel.songs.collectAsState().value
    Scaffold(
        topBar = { TopAppBar { navController.navigate("setting") } },
        bottomBar = { BottomAppBarCompose() }
    )

    { innerPadding ->

        Card(elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(start = 1.dp, top = 1.dp, end = 1.dp, bottom = 1.dp)
                    .fillMaxSize()
                    .padding(3.dp)
            ) {

                Spacer(
                    modifier = Modifier
                        .padding()
                        .padding(top = 0.dp)
                        .height(0.dp)
                )

                SearchBar()

                Spacer(
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                )

                Card(elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)) {

                    LazyColumn(
                        modifier = Modifier
                            .background(Color.White)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        items(songs) { song ->
                            SongCard(song) { songItem ->
                                navController.navigate("detail/${songItem.id}")
                            }

                        }
                    }
                    Divider(
                        modifier = Modifier
                            .padding(bottom = 7.dp)
                    )
                }
            }

        }

    }

}