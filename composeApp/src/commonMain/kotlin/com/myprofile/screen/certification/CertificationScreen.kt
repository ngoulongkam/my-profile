package com.myprofile.screen.certification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

object CertificationScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        MaterialTheme {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                BackIcon(
                    upPress = { navigator.pop() }
                )

                Card {
                    Column {
                        Text(
                            "Licenses & certifications",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )

                        Text(
                            "This is the licenses & certifications screen",
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun BackIcon(upPress: () -> Unit) {
    IconButton(
        onClick = upPress,
        modifier = Modifier
            .padding(16.dp)
            .size(32.dp)
            .background(color = Color.White)
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
            tint = Color.Black,
            contentDescription = "back"
        )
    }
}