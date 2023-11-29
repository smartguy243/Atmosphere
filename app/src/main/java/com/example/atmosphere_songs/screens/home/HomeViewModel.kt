package com.example.atmosphere_songs.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.atmosphere_songs.data.getDataFromRemote
import com.example.atmosphere_songs.entity.Song
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel: ViewModel() {

    private val _songs: MutableStateFlow<List<Song>> = MutableStateFlow(listOf())
    val songs: StateFlow<List<Song>>
        get() = _songs.asStateFlow()

    init {

        _songs.value = getDataFromRemote()
    }
}