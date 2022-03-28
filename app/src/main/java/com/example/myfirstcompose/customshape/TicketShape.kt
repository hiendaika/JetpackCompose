package com.example.myfirstcompose.customshape

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class TicketShape(val cornerRadius: Float) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            //Draw custom Path
            path = drawTicketPath(size = size, cornerRadius = cornerRadius)
        )
    }

    fun drawTicketPath(size: Size, cornerRadius: Float): Path{

    }
}