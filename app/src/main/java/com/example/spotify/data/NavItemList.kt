package com.example.spotify.data

import com.example.spotify.R
import com.example.spotify.domain.NavItems


val navItemsList = listOf(
    NavItems(
        title = "Home",
        icon = R.drawable.ic_home,
        route = "Home_Screen"
    ),
    NavItems(
        title = "Search",
        icon = R.drawable.ic_search,
        route = "Search_Screen"
    ),
    NavItems(
        title = "Your Library",
        icon = R.drawable.ic_library,
        route = "YourLibrary_Screen"
    ),
    NavItems(
        title = "Premium",
        icon = R.drawable.ic_spotify,
        route = "Premium_Screen"
    )
)