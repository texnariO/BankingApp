package com.example.bankingapp.domain.usecases


import com.example.bankingapp.domain.manager.ILocalUserManager

class SaveAppLanguage(
    private val localUserManager: ILocalUserManager
) {
    suspend operator fun invoke(language: String){
        localUserManager.saveAppLanguage(language)
    }
}