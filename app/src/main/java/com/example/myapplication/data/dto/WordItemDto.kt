package com.example.myapplication.data.dto

data class WordItemDto(
    val meanings: List<MeaningDto>? = null,
    val phonetic: String? = null,
    val phonetics: List<PhoneticDto>? = null,
    val word: String? = null
)