package com.myprofile

import androidx.compose.ui.window.ComposeUIViewController
import com.myprofile.di.initKoin

fun MainViewController() = ComposeUIViewController {
    initKoin()
    App()
}