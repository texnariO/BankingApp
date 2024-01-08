package com.example.bankingapp.presentation.ui.onBoardingScrean

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.example.bankingapp.R

data class Page(
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)


val page = listOf(
    Page(
        title = R.string.onBoardScreenTitle1,
        description = R.string.onBoardScreenDescription1,
        image = R.drawable.onboardscreen1
    ),
    Page(
        title = R.string.onBoardScreenTitle2,
        description = R.string.onBoardScreenDescription2,
        image = R.drawable.onboardscreen2
    ),
    Page(
        title = R.string.onBoardScreenTitle3,
        description = R.string.onBoardScreenDescription3,
        image = R.drawable.onboardscreen3
    )
)