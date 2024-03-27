package com.example.myapplication.domain.model

data class WordItem(
    val meanings: List<Meaning>? = null,
    val phonetic: String? = null,
    val phonetics: List<Phonetic>? = null,
    val word: String? = null
)