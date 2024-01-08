package com.example.bankingapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import com.example.bankingapp.R


val MontserratFamily = FontFamily(
        Font(R.font.montserrat_regular),
        Font(R.font.montserrat_bold),
        Font(R.font.montserrat_semibold)
)
// Set of Material typography styles to start with
val Typography = Typography(

        bodyLarge = TextStyle(
                fontFamily = MontserratFamily,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.5.sp,
                fontSize = 30.sp
        ),
        bodyMedium = TextStyle(
                fontFamily = MontserratFamily,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 0.5.sp,
                fontSize = 24.sp
                ),
        bodySmall = TextStyle(
                fontFamily = MontserratFamily,
                fontWeight =  FontWeight.Normal,
                letterSpacing = 0.5.sp,
                fontSize = 15.sp
        ),
        titleMedium = TextStyle(
                fontFamily = MontserratFamily,
                fontWeight =  FontWeight.SemiBold,
                letterSpacing = 0.3.sp,
                fontSize = 20.sp
        ),
        labelSmall = TextStyle(
                fontFamily = MontserratFamily,
                fontWeight = FontWeight.Normal,
                letterSpacing = 0.3.sp,
                fontSize = 15.sp
        )

        /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)