package com.example.myapplication.presentation

import com.example.myapplication.domain.model.WordItem

data class MainState (
    val isLoading: Boolean = false,
    val searchWord: String = "",
    val wordItem: WordItem? = null
)

