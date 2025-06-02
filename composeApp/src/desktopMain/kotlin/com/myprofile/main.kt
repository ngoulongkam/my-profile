package com.myprofile

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.myprofile.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "My Profile",
        ) {
            App()
        }
    }
}