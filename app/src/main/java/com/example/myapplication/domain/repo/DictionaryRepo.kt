package com.example.myapplication.domain.repo

import com.example.myapplication.domain.model.WordItem
import com.example.myapplication.util.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepo {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}