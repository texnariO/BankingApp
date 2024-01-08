package com.example.bankingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.bankingapp.presentation.ui.onBoardingScrean.components.OnBoardingPage
import com.example.bankingapp.presentation.ui.onBoardingScrean.page
import com.example.bankingapp.ui.theme.BankingAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.awaitAll

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        setContent {
            BankingAppTheme (
                isSystemInDarkTheme()
            ){
                SetBarColor(color = MaterialTheme.colorScheme.background)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OnBoardingPage(page = page[0])
                }

            }
        }
    }

    @Composable
    private fun SetBarColor(color: Color) {
        val systemUiControler = rememberSystemUiController()
        SideEffect {
            systemUiControler.setStatusBarColor(
                color = color
            )
        }
    }
}
