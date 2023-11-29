package com.example.atmosphere_songs.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.atmosphere_songs.R

@Composable
fun SearchBar() {
    Card(elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .requiredHeight(40.dp)
        ) {
            Row {
                Image(
                    modifier = Modifier
                        .padding(start = 7.dp, top = 8.dp, end = 5.dp),
                    painter = painterResource(id = R.drawable.icon_search),
                    contentDescription = "icon_search",
                    colorFilter = ColorFilter.tint(color = Color.DarkGray.copy(alpha = 0.4f))
                )
                Text(
                    modifier = Modifier
                        .padding(top = 7.dp),
                    text = "Search songs...",
                    fontWeight = FontWeight.W600,
                    color = Color.DarkGray.copy(alpha = 0.5f)
                )
            }

        }

    }
}
