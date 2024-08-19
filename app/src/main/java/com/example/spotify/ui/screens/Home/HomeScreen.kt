package com.example.spotify.ui.screens.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.spotify.R
import com.example.spotify.navigation.Screen
import com.example.spotify.ui.theme.CircularSTD
import com.example.spotify.ui.theme.SpotifyDark
import com.example.spotify.ui.theme.SpotifyTheme

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize().background(SpotifyDark),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.clickable { },
            text = "Home Screen", style = TextStyle(fontSize = 30.sp)
        )
    }

}