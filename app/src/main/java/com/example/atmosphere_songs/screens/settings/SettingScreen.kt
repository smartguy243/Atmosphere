package com.example.atmosphere_songs.screens.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atmosphere_songs.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen() {
    Scaffold(topBar = { TopAppBarCompose() },
        bottomBar = { BottomAppBarCompose() }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ) {

            Text(
                text = "Réglages",
                modifier = Modifier
                    .padding(start = 20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.W700
            )
            Spacer(
                modifier = Modifier
                    .padding(bottom = 5.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            ) {

                Column(
                    modifier = Modifier
                        .background(Color.White.copy(alpha = 0.3f))
                        .fillMaxWidth()
                        .requiredHeight(35.dp)
                ) {

                    Row {
                        Image(
                            modifier = Modifier
                                .padding(start = 7.dp, top = 7.dp, end = 5.dp),
                            painter = painterResource(id = R.drawable.icon_search),
                            contentDescription = "icon_search",
                            colorFilter = ColorFilter.tint(color = Color.DarkGray.copy(alpha = 0.4f))
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 6.dp),
                            text = "Rechercher",
                            color = Color.DarkGray.copy(alpha = 0.6f)
                        )
                    }
                }

            }

            Spacer(
                modifier = Modifier
                    .padding(bottom = 15.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {

                    Row(
                        modifier = Modifier
                            .padding(top = 6.dp, bottom = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(id = R.mipmap.img),
                            contentDescription = "profil",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(CircleShape)
                                .padding(top = 5.dp)
                                .size(48.dp),
                            alignment = Alignment.CenterStart
                        )

                        Column(verticalArrangement = Arrangement.Center) {
                            Text(
                                text = "Éraste_Kadiayi",
                                fontWeight = FontWeight.W500,
                                modifier = Modifier
                                    .padding(top = 5.dp, start = 12.dp),
                                fontSize = 20.sp
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 11.dp),
                                text = "«À tes résolutions répon...",
                                color = Color.DarkGray.copy(alpha = 0.6f)
                            )
                        }
                        Image(
                            modifier = Modifier
                                .padding(top = 3.dp)
                                .size(50.dp),
                            painter = painterResource(id = R.drawable.icon_qr_code_scanner),
                            contentDescription = "icon_scanner",
                            colorFilter = ColorFilter.tint(Color.Blue.copy(alpha = 0.6f)),
                            alignment = Alignment.Center
                        )

                    }

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.avatar),
                                contentDescription = "avatar",
                                modifier = Modifier
                                    .background(Color.Blue.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Avatar",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 172.dp)
                        )
                    }
                }

            }

// first Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 30.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.star),
                                contentDescription = "star",
                                modifier = Modifier
                                    .background(Color.Yellow.copy(alpha = 1f))
                            )
                        }
                        Text(
                            text = "Messages importants",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 56.dp)
                        )

                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.computer),
                                contentDescription = "computer",
                                modifier = Modifier
                                    .background(Color.Green.copy(alpha = 0.9f))
                            )
                        }
                        Text(
                            text = "Appareils connectés",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 65.dp)
                        )

                    }
                }
            }

// Second Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 30.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.key_24),
                                contentDescription = "key",
                                modifier = Modifier
                                    .rotate(90f)
                                    .background(Color.Blue.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Compte",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 161.dp)
                        )


                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.lock),
                                contentDescription = "lock",
                                modifier = Modifier
                                    .background(Color.Blue.copy(alpha = 0.5f))
                            )
                        }
                        Text(
                            text = "Confidentialité",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 108.dp)
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.discussions),
                                contentDescription = "discussions",
                                modifier = Modifier
                                    .background(Color.Green.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Discussions",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 125.dp)
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.notifications),
                                contentDescription = "notificqtions",
                                modifier = Modifier
                                    .background(Color.Red.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Notificqtions",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 121.dp)
                        )
                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.stockage),
                                contentDescription = "stockage",
                                modifier = Modifier
                                    .background(Color.Green.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Stockage et données",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 61.dp)
                        )
                    }

                }
            }

// Third Column

            Spacer(
                modifier = Modifier
                    .padding(bottom = 30.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, bottom = 9.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.info),
                                contentDescription = "aide",
                                modifier = Modifier
                                    .background(Color.Blue.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Aide",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 185.dp)
                        )

                    }

                    Spacer(
                        modifier = Modifier
                            .padding(bottom = 10.dp)
                    )

                    Divider(thickness = 1.dp)

                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp, end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Card(
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.heart),
                                contentDescription = "inviter",
                                modifier = Modifier
                                    .background(Color.Red.copy(alpha = 0.7f))
                            )
                        }
                        Text(
                            text = "Inviter un contact",
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.arrow),
                            contentDescription = "arrow",
                            colorFilter = ColorFilter.tint(Color.Gray.copy(alpha = 0.7f)),
                            modifier = Modifier
                                .padding(top = 6.dp, start = 86.dp)
                        )

                    }

                }

            }

            Spacer(
                modifier = Modifier
                    .padding(bottom = 10.dp)
            )
            Column {
                Text(text = "")
            }

        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCompose() {
    TopAppBar(title = {
        Text(
            text = "Réglages",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 119.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.W600
        )
    })
}

@Composable
fun BottomAppBarCompose() {
    BottomAppBar(
        containerColor = Color.White.copy(alpha = 0.988f),
        contentColor = Color.DarkGray.copy(alpha = 0.1f)
    ) {
        Row {}
        Column {
            Image(
                modifier = Modifier
                    .padding(start = 17.dp),
                painter = painterResource(id = R.drawable.round_data_saver_off_24),
                contentDescription = "statut"
            )
            Text(
                modifier = Modifier
                    .padding(start = 13.dp),
                text = "Statut",
                fontSize = 10.sp,
                color = Color.Gray.copy(alpha = 0.7f)
            )
        }

        Column {
            Image(
                modifier = Modifier
                    .padding(start = 40.dp),
                painter = painterResource(id = R.drawable.appel),
                contentDescription = "appels"
            )
            Text(
                modifier = Modifier
                    .padding(start = 35.dp),
                text = "Appels",
                fontSize = 10.sp,
                color = Color.Gray.copy(alpha = 0.7f)
            )
        }

        Column {
            Image(
                modifier = Modifier
                    .padding(start = 48.dp),
                painter = painterResource(id = R.drawable.community),
                contentDescription = "community"
            )
            Text(
                modifier = Modifier
                    .padding(start = 25.dp),
                text = "Communautés",
                fontSize = 10.sp,
                color = Color.Gray.copy(alpha = 0.7f)
            )
        }

        Column {
            Image(
                modifier = Modifier
                    .padding(start = 33.dp),
                painter = painterResource(id = R.drawable.chat),
                contentDescription = "discussions"
            )
            Text(
                modifier = Modifier
                    .padding(start = 14.dp),
                text = "Discussions",
                fontSize = 10.sp,
                color = Color.Gray.copy(alpha = 0.7f)
            )
        }

        Column {
            Image(
                modifier = Modifier
                    .padding(start = 23.dp),
                painter = painterResource(id = R.drawable.baseline_settings_suggest_24),
                contentDescription = "settings"
            )
            Text(
                modifier = Modifier
                    .padding(start = 10.dp),
                text = "Réglages",
                fontSize = 10.sp,
                color = Color.Blue.copy(alpha = 0.7f)
            )
        }
    }
}
