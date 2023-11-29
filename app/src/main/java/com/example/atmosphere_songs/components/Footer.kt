package com.example.atmosphere_songs.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.atmosphere_songs.R

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