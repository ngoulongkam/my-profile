package com.myprofile

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.myprofile.home.HomeScreen

@Composable
fun App() {
    Navigator(HomeScreen)
}