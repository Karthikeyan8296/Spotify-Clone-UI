package com.example.spotify.navigation

sealed class Screen(val route: String) {
    object LandingPage: Screen("LandingPage_Screen")

    object Email : Screen("Email_Screen")
    object Password : Screen("Password_Screen")
    object TermsAndConditions : Screen("TermsAndConditions_Screen")
    object ChoosePodcasts : Screen("ChoosePodcasts_Screen")
    object ChooseArtist : Screen("ChooseArtist_Screen")

    object EmailAndPassword : Screen("EmailAndPassword_Screen")

    object Main : Screen("Main_Screen")
    object Home : Screen("Home_Screen")
    object Search : Screen("Search_Screen")
    object YourLibrary : Screen("YourLibrary_Screen")
    object Premium : Screen("Premium_Screen")

    object PlayList : Screen("PlayList_Screen")
    object Music : Screen("Music Screen")
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
}
