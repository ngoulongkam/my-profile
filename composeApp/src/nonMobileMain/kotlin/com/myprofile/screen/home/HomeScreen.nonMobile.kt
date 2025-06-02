package com.myprofile.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import my_profile.composeapp.generated.resources.Res
import my_profile.composeapp.generated.resources.donut
import org.jetbrains.compose.resources.painterResource

@Composable
actual fun ProfileImage() {
    Image(
        painter = painterResource(Res.drawable.donut),
        contentDescription = "Image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}