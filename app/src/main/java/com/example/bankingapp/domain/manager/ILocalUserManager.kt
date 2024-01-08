package com.example.bankingapp.domain.manager

import kotlinx.coroutines.flow.Flow

interface ILocalUserManager {

    suspend fun saveAppEntry()

    fun readAddEntry(): Flow<Boolean>
}