package com.example.bankingapp.presentation.ui.onBoardingScrean.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bankingapp.presentation.ui.onBoardingScrean.Page
import com.example.bankingapp.presentation.ui.onBoardingScrean.page
import com.example.bankingapp.ui.theme.Dimens.BigPadding
import com.example.bankingapp.ui.theme.Dimens.MediumPadding
import com.example.bankingapp.ui.theme.Typography

@Composable
fun OnBoardingPage(
    page: Page, modifier: Modifier = Modifier.background(color = MaterialTheme.colorScheme.primary)
) {
    val color = MaterialTheme.colorScheme.primary
    Column(modifier = modifier
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.8f),
            painter = painterResource(id = page.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding))

        Text(
            text = stringResource(id = page.title),
            modifier = Modifier.padding(horizontal = BigPadding),
            style = Typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = stringResource(id = page.description),
            modifier = Modifier.padding(horizontal = BigPadding),
            style = Typography.labelSmall,
            color = MaterialTheme.colorScheme.secondary
        )
    }
}

@Preview
@Composable
fun Preview() {
    OnBoardingPage(page = page[1])
}