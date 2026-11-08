package org.jiho.soundproj.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import org.jiho.soundproj.core.typography.IosevkaFontFamily

private val darkColors = darkColorScheme(
    primary = PrimaryGreen,
    primaryContainer = BoxBlack,
    onPrimaryContainer = WordWhite,
    secondary = LighterGreen,
    background = BackgroundColor,
    onBackground = DarkerBackgroundColor,
    surface = PrimaryGreen,
    surfaceVariant = GeneralGrey,
    outline = GreyBorder,
    outlineVariant = SelectedBorder,
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val fontFamily = IosevkaFontFamily()
    val typography = Typography().run {
        copy(
            displayLarge = displayLarge.copy(fontFamily = fontFamily),
            headlineLarge = headlineLarge.copy(fontFamily = fontFamily),
            titleLarge = titleLarge.copy(fontFamily = fontFamily),
            bodyLarge = bodyLarge.copy(fontFamily = fontFamily),
            bodyMedium = bodyMedium.copy(fontFamily = fontFamily),
            labelLarge = labelLarge.copy(fontFamily = fontFamily)
        )
    }

    MaterialTheme(
        colorScheme = if (darkTheme) {
            darkColors
        } else {
            darkColors
//            TODO LightColors
        },
        typography = typography,
        content = content
    )
}