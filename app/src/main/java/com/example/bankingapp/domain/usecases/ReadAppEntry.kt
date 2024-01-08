package com.example.bankingapp.domain.usecases


import com.example.bankingapp.domain.manager.ILocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: ILocalUserManager
) {
    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAddEntry()
    }
}