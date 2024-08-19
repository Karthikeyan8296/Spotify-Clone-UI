package com.example.spotify.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.spotify.data.navItemsList

@Composable
fun RowScope.BottomNavigationComponent(selectedIndex: Int) {
    var selectedIndex1 = selectedIndex

    navItemsList.forEachIndexed { index, navItems ->
        NavigationBarItem(
            selected = selectedIndex1 == index,
            onClick = { selectedIndex1 = index },
            icon = {
                Icon(
                    imageVector = navItems.icon,
                    contentDescription = null
                )
            },
            label = { Text(text = navItems.title) },
            alwaysShowLabel = false,
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = Color.Transparent,
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                unselectedIconColor = Color.Gray,
                unselectedTextColor = Color.Gray,
            )

        )
    }
}
