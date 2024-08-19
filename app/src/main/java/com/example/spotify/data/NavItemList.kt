package com.example.spotify.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LocalLibrary
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.SportsVolleyball
import com.example.spotify.domain.NavItems


val navItemsList = listOf(
    NavItems(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = "Home_Screen"
    ),
    NavItems(
        title = "Search",
        icon = Icons.Rounded.Search,
        route = "Search_Screen"
    ),
    NavItems(
        title = "Your Library",
        icon = Icons.Rounded.LocalLibrary,
        route = "YourLibrary_Screen"
    ),
    NavItems(
        title = "Premium",
        icon = Icons.Rounded.SportsVolleyball,
        route = "Premium_Screen"
    )
)