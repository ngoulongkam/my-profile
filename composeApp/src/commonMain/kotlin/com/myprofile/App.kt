package com.myprofile

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.myprofile.screen.home.HomeScreen

@Composable
fun App() {
    Navigator(HomeScreen)
}