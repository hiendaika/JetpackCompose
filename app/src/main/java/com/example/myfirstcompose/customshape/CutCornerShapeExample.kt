package com.example.myfirstcompose.customshape

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CutCornerShapeExample(cornerSize: Dp) {
    Text(
        text = "Time's up",
        style = typography.h3.copy(color = Color.Red), //mau text
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
            .border(2.dp, color = Color.Red, CutCornerShape(cornerSize))
            .graphicsLayer {
                shadowElevation = 8.dp.toPx()
                shape = CutCornerShape(32.dp)
                clip = true //shadow elevation match outline
            }
            .background(color = Color.Green)
            .padding(32.dp)
    )
}