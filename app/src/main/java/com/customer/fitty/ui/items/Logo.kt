package com.customer.fitty.ui.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.customer.fitty.R


@Preview
@Composable
private fun LogoPreview() {
    Logo(background = Color.Black)
}

@Composable
fun Logo(background: Color) {
    Box(
        modifier = Modifier.background(Color.Black)
    ) {
        Image(
            painter = painterResource(id = R.drawable.fitty_logo),
            contentDescription = "",
            Modifier.background(background)
        )
    }
}