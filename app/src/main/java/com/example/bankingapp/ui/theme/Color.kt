package com.example.bankingapp.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val MainColorBlue = Color(0xFF3e8ce6)
val MainColorGray = Color(0xFF6e6868)

val LightColorPalette = lightColorScheme(
    primary = Color(0xFF3e8ce6),
    secondary = Color(0xFF6e6868),
    background = Color(0xFFEFEFEF),
    surface = Color.White,
    onPrimary =  Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

val DarkColorPalette = darkColorScheme(
    primary = Color(0xFF3e8ce6),
    secondary = Color(0xFF6e6868),
    background = Color(0xFF000018),
    surface = Color(0xFF1E1E1E),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)