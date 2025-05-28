package com.myprofile.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter

@Composable
actual fun painterResource(): Painter {
    return ColorPainter(Color.Red)
}