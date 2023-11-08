package com.example.atmosphere_songs

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.EaseInCirc
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.blue
import com.example.atmosphere_songs.ui.theme.Atmosphere_SongsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Atmosphere_SongsTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    ScaffoldCompose()

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldCompose() {

    Scaffold(topBar = {TopAppBarCompose() },
        bottomBar = {BottomAppBarCompose() })

    { innerPadding ->

        Card(elevation = cardElevation(defaultElevation = 5.dp)) {
            Column(
                modifier = Modifier
                    .padding(start = 1.dp, top = 1.dp, end = 1.dp, bottom = 1.dp)
                    .fillMaxSize()
                    .padding(3.dp)
            ) {

                Spacer(modifier = Modifier
                    .padding(innerPadding)
                    .padding(top = 10.dp)
                    .height(0.dp))

                Card(elevation = cardElevation(defaultElevation = 4.dp)) {
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(45.dp)
                    ) {
                        Row {
                            Image(modifier = Modifier
                                .padding(start = 7.dp, top = 12.dp, end = 5.dp),
                                painter = painterResource(id = R.drawable.icon_search),
                                contentDescription = ""
                            )
                            Text(modifier = Modifier
                                .padding(top = 11.dp),
                                text = "Search songs...",
                                color = Color.DarkGray.copy(alpha = 0.7f))
                        }

                    }

                    Divider(modifier = Modifier
                        .padding(bottom = 10.dp))
                }

                Card(elevation = cardElevation(defaultElevation = 4.dp)) {

                    LazyColumn(
                        modifier = Modifier
                            .padding(bottom = 90.dp)
                            .fillMaxWidth()
                            .weight(0.1f),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        val songs = 10
                        items(songs) { song ->
                            SongsListCard(songs)
                        }
                    }
                    Divider(modifier = Modifier
                        .padding(bottom = 7.dp))
                }
            }

        }

    }

    @Composable
    fun SongsListCard(song: SongsList) {
        Card(elevation = cardElevation(defaultElevation = 2.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(30.dp))
                Text(text = song.id,
                    fontSize = 20.sp)
                Text(text = song.song,
                    fontSize = 20.sp)
            }
        }
        Divider()
    }

}

@Composable
fun AllSongs(str : String) {
    val songs = listOf(SongsList(
        "001",
        "Lubwewe LWA BIKONDO (D)"
    ),
        SongsList(
            "002",
            "MUNGANGA MUNENE (Eb)"
        ),
        SongsList(
            "003",
            "KU NKULUSE (F)"
        ),
        SongsList(
            "004",
            "DITUKU DINENE (C)"
        ),
        SongsList(
            "005",
            "JUKAYI KULU (Bb)"
        ),
        SongsList(
            "006",
            "PABIKILABO DYA MWAMWA (Ab)"
        ),
        SongsList(
            "007",
            "DI MPINGA (Ab)"
        ),
        SongsList(
            "008",
            "KUNDEKEDI TO (Ab)"
        ),
        SongsList(
            "009",
            "TUMUPA BINTU (Bb)"
        ),
        SongsList(
            "010",
            "KUDI MPOKOLO (C)"
        ),
        SongsList(
            "011",
            "DITABUJA DYANYI (Eb)"
        ),
        SongsList(
            "012",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "013",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "014",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "015",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "016",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "017",
            "Lubwewe LWA BIKONDO (D)"
        ),
        SongsList(
            "018",
            "Lubwewe LWA BIKONDO (D)"
        ),
    )
}

@Composable
fun SongsListCard(song: Int) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "id  ",
                fontSize = 20.sp)
            Text(text = "Song",
                fontSize = 20.sp)
        }

    Divider()

}


data class SongsList (
    var id: String,
    var song: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCompose() {
    TopAppBar(
        title = { Text(text = "Alleluia",
            fontSize = 13.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 65.dp))
        },
        navigationIcon = {
            IconButton(onClick = {},
                modifier = Modifier
                    .scale(0.7f)
                    .padding(start = 7.dp)
                    .shadow(
                        elevation = 1.dp,
                        shape = RectangleShape,
                    ),
            ) {           Icon(
                Icons.Default.Menu,
                contentDescription = "icon_menu")
            }
        },
        actions = {
            IconButton(onClick = {},
                modifier = Modifier
                    .scale(0.7f)
                    .shadow(
                        elevation = 1.dp,
                        shape = RectangleShape
                    ),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                    contentDescription = "icon_scanner"
                )
            }
            Spacer(modifier = Modifier.width(0.dp))

            IconButton(onClick = {},
                modifier = Modifier
                    .scale(0.7f)
                    .padding(end = 7.dp)
                    .shadow(
                        elevation = 1.dp,
                        shape = RectangleShape,
                    ),
            )

            {
                Icon(
                    painter = painterResource(id = R.drawable.icon_options),
                    contentDescription = "icon_options"
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color.White,
            scrolledContainerColor = Color.LightGray,
            titleContentColor = Color.Cyan,
            actionIconContentColor = Color.Black),

        )
}

@Composable
fun BottomAppBarCompose() {
    BottomAppBar(
        containerColor = Color.White,
        contentColor = Color.DarkGray.copy(alpha = 0.8f),
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {},
                modifier = Modifier
                    .scale(0.8f)
                    .shadow(elevation = 0.dp, shape = CircleShape)
                    .border(
                        shape = CircleShape,
                        width = 1.7.dp,
                        color = Color.DarkGray.copy(alpha = 0.8f)
                    )) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_radio),
                    contentDescription = "icon_radio"
                )
            }
            IconButton(onClick = {},
                modifier = Modifier
                    .scale(0.8f)
                    .shadow(elevation = 0.dp, shape = CircleShape)
                    .border(
                        shape = CircleShape,
                        width = 1.7.dp,
                        color = Color.DarkGray.copy(alpha = 0.8f)
                    )) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_mail),
                    contentDescription = "icon_options"
                )

            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Atmosphere_SongsTheme {
        Greeting("Android")
    }
}