package com.example.spotify.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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

@Composable
fun LandingPage(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.clickable { navController.navigate(Screen.Email.route) },
            text = "Sign Up", style = TextStyle(fontSize = 30.sp)
        )
        Text(
            modifier = Modifier.clickable { navController.navigate(Screen.EmailAndPassword.route) },
            text = "Sign In", style = TextStyle(fontSize = 30.sp)
        )
    }

}