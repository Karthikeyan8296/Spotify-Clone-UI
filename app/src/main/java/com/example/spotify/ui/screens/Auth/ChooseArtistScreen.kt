package com.example.spotify.ui.screens.Auth

import android.service.chooser.ChooserAction
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import com.example.spotify.ui.theme.SpotifyTheme

@Composable
fun ChooseArtist(navController: NavHostController) {

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable { navController.navigate(Screen.ChoosePodcasts.route) },
            text = "Choose Artist Screen", style = TextStyle(fontSize = 30.sp)
        )
    }


}