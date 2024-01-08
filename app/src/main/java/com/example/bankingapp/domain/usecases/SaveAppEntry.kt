package com.example.bankingapp.domain.usecases

import com.example.bankingapp.domain.manager.ILocalUserManager

class SaveAppEntry(
    private val localUserManager: ILocalUserManager
) {
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}