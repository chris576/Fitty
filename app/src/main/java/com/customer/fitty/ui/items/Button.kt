package com.customer.fitty.ui.items

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CButton(textColor: Color, backgroundColor: Color, text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = textColor,
            containerColor = Color.Transparent
        ),
        modifier = Modifier
            .border(
                BorderStroke(
                    width = 2.dp,
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color(0xFF00BCD4), Color(0xFF4CAF50))
                    )
                ),
                shape = RoundedCornerShape(24.dp),
            )
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(24.dp)
            )
    ) {
        Text(
            text = text
        )
    }
}

@Preview
@Composable
private fun PreviewButton() {
    CButton(Color.White, Color.Black, text = "Hello") {
    }
}