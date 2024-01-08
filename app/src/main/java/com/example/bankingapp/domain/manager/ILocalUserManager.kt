package com.example.bankingapp.domain.manager

import kotlinx.coroutines.flow.Flow

interface ILocalUserManager {

    suspend fun saveAppEntry()
    suspend fun saveAppLanguage(language: String)
    fun readAddEntry(): Flow<Boolean>
    fun readAppLanguage(): Flow<String>
}