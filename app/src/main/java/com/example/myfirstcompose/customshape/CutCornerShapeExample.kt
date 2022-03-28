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
            .border(2.dp, color = Color.Red, CutCornerShape(cornerSize)) //Ve duong bao xung quanh composable vs do rong, shape, color
            .graphicsLayer {
                shadowElevation = 8.dp.toPx()
                shape = CutCornerShape(32.dp)
                clip = true //shadow elevation match outline
            }
                //Co the ket hop nhieu phuong thuc cua Modifier de lay duoc shape theo yeu cau
                //Can chu y den van de thu tu cua chung, can chac chan rang luon goi background() sau
                //graphiclayer{} de dam bao mau duoc ve 1 cach chinh xac
            .background(color = Color.Green) //background cua text
            .padding(32.dp)
    )
}