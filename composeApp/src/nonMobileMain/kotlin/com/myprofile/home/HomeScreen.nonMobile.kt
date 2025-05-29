package com.myprofile.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale

@Composable
actual fun ProfileImage() {
    Image(
        painter = ColorPainter(Color.Red),
        contentDescription = "Image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}