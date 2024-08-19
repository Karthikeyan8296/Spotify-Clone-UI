package com.example.spotify.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.spotify.ui.screens.Home.HomeScreen
import com.example.spotify.ui.screens.Home.MusicScreen
import com.example.spotify.ui.screens.Home.PlayListScreen
import com.example.spotify.ui.screens.Home.PremiumScreen
import com.example.spotify.ui.screens.Home.SearchScreen
import com.example.spotify.ui.screens.Home.YourLibraryScreen


fun NavGraphBuilder.HomeNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.HOME,
        startDestination = Screen.Main.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.Search.route) {
            SearchScreen(navController)
        }
        composable(route = Screen.YourLibrary.route) {
            YourLibraryScreen()
        }
        composable(route = Screen.Premium.route) {
            PremiumScreen()
        }
        composable(route = Screen.PlayList.route) {
            PlayListScreen(navController)
        }
        composable(route = Screen.Music.route) {
            MusicScreen(navController)
        }
    }
}