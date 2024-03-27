package com.example.myapplication.di

import com.example.myapplication.data.repo.DictionaryRepoImpl
import com.example.myapplication.domain.repo.DictionaryRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {
    @Binds
    @Singleton
    abstract fun bindDictionaryRepo(
        dictionaryRepoImpl: DictionaryRepoImpl
    ): DictionaryRepo


}