package com.example.bankingapp.domain.usecases


import com.example.bankingapp.domain.manager.ILocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppLanguage(
    private val localUserManager: ILocalUserManager
) {
    suspend operator fun invoke(): Flow<String>{
        return localUserManager.readAppLanguage()
    }
}