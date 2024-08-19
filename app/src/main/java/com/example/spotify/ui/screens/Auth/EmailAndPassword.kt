package com.example.spotify.ui.screens.Auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.spotify.navigation.Graph
import com.example.spotify.navigation.Screen

@Composable
fun EmailAndPassword(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier.clickable { navController.navigate(Screen.Main.route){
                popUpTo(Graph.AUTHENTICATION){inclusive = true}
            } },
            text = "Email and Password Screen", style = TextStyle(fontSize = 30.sp)
        )
    }

}