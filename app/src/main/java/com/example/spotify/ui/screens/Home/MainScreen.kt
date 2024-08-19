package com.example.spotify.ui.screens.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.spotify.data.navItemsList
import com.example.spotify.ui.components.BottomNavigationComponent
import com.example.spotify.ui.theme.SpotifyDark
import com.example.spotify.ui.theme.SpotifyTheme

@Composable
fun MainScreen(navController: NavHostController) {
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    Scaffold(
        modifier = Modifier.background(SpotifyDark),
        bottomBar = {
            NavigationBar {
                Row(Modifier.background(SpotifyDark)) {
                    navItemsList.forEachIndexed { index, navItems ->
                        NavigationBarItem(
                            selected = selectedIndex == index,
                            onClick = { selectedIndex = index },
                            icon = {
                                Icon(
                                    imageVector = navItems.icon,
                                    contentDescription = null
                                )
                            },
                            label = { Text(text = navItems.title) },
                            alwaysShowLabel = true,
                            colors = NavigationBarItemDefaults.colors(
                                indicatorColor = Color.Transparent,
                                selectedIconColor = Color.White,
                                selectedTextColor = Color.White,
                                unselectedIconColor = Color.Gray,
                                unselectedTextColor = Color.Gray
                            )
                        )
                    }
                }
            }
        }
    )
    {
        it
        when (selectedIndex) {
            0 -> HomeScreen()
            1 -> SearchScreen(navController)
            2 -> YourLibraryScreen()
            3 -> PremiumScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SpotifyTheme {
        Surface {
            MainScreen(navController = NavHostController(LocalContext.current))
        }
    }
}
