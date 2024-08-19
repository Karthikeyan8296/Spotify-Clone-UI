package com.example.spotify.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.spotify.R

val CircularSTD = FontFamily(
    listOf(
        Font(resId = R.font.circularstd_black),
        Font(resId = R.font.circularstd_blackitalic),
        Font(resId = R.font.circularstd_bold),
        Font(resId = R.font.circularstd_bolditalic),
        Font(resId = R.font.circularstd_book, weight = FontWeight.Normal),
        Font(resId = R.font.circularstd_bookitalic),
        Font(resId = R.font.circularstd_medium),
        Font(resId = R.font.circularstd_mediumitalic),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = CircularSTD,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),

    bodySmall = TextStyle(
        fontFamily = CircularSTD,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )


    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)