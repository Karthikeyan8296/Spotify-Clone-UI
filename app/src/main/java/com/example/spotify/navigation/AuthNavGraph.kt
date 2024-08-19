package com.example.spotify.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.spotify.ui.screens.Auth.ChooseArtist
import com.example.spotify.ui.screens.Auth.ChoosePodcasts
import com.example.spotify.ui.screens.Auth.EmailAndPassword
import com.example.spotify.ui.screens.Auth.EmailScreen
import com.example.spotify.ui.screens.Auth.PasswordScreen
import com.example.spotify.ui.screens.Auth.TermsAndConditions
import com.example.spotify.ui.screens.Home.MainScreen
import com.example.spotify.ui.screens.LandingPage

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = Screen.LandingPage.route
    ) {
        composable(route = Screen.Email.route) {
            EmailScreen(navController)
        }
        composable(route = Screen.Password.route) {
            PasswordScreen(navController)
        }
        composable(route = Screen.TermsAndConditions.route) {
            TermsAndConditions(navController)
        }
        composable(route = Screen.ChooseArtist.route) {
            ChooseArtist(navController)
        }
        composable(route = Screen.ChoosePodcasts.route) {
            ChoosePodcasts(navController)
        }
        composable(route = Screen.EmailAndPassword.route) {
            EmailAndPassword(navController)
        }
        composable(route = Screen.LandingPage.route) {
            LandingPage(navController)
        }
        composable(route = Screen.Main.route) {
            MainScreen(navController)
        }
    }
}
