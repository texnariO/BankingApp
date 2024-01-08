package com.example.bankingapp.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.bankingapp.domain.manager.ILocalUserManager
import com.example.bankingapp.util.Constatns
import com.example.bankingapp.util.Constatns.USER_SETTING
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class LocalUserManager(
    private val context: Context
): ILocalUserManager{
    override suspend fun saveAppEntry() {
        context.datastore.edit{ settings ->
            settings[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override fun readAddEntry(): Flow<Boolean> {
        return context.datastore.data.map{ preferences ->
            preferences[PreferencesKeys.APP_ENTRY]?:false
        }
    }

}

private val Context.datastore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTING)

private object PreferencesKeys{
    val APP_ENTRY = booleanPreferencesKey(name = Constatns.APP_ENTRY)
}