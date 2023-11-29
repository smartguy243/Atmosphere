package com.example.atmosphere_songs.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atmosphere_songs.entity.Song

@Composable
fun SongCard(song: Song, onSongClicked: (Song)-> Unit) {

    Row(
        modifier = Modifier
            .clickable { onSongClicked.invoke(song) }
            .fillMaxWidth()
            .padding(11.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = song.id,
            fontSize = 12.sp,
            fontWeight = FontWeight.W500)
        Text(text = song.name,
            modifier = Modifier
                .padding(start = 15.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight.W500)
    }

    Divider(modifier = Modifier
        .padding(bottom = 9.dp))

}