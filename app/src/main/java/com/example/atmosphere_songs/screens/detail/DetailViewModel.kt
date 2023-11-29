package com.example.atmosphere_songs.screens.detail

import androidx.lifecycle.ViewModel
import com.example.atmosphere_songs.data.getDataFromRemote
import com.example.atmosphere_songs.entity.Song
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel: ViewModel() {

    private val _song: MutableStateFlow<Song> = MutableStateFlow(Song())
    val songs: StateFlow<Song>
        get() = _song.asStateFlow()

    init {

//        _song.value = getDataFromRemote()
    }
}