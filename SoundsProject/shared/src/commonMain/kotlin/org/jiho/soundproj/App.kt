package org.jiho.soundproj

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import org.jiho.soundproj.core.enums.ActionScreen
import org.jiho.soundproj.ui.AppScaffold
import org.jiho.soundproj.ui.screens.VolumeScreen
import org.jiho.soundproj.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    AppTheme{
        var currentScreen by remember {mutableStateOf(ActionScreen.VOLUME)}

        AppScaffold(
            currentScreen = currentScreen,
            onNavigateTo = {currentScreen = it}
        ) {
            when (currentScreen) {
                ActionScreen.VOLUME -> VolumeScreen()
                ActionScreen.PRESET -> {
                    //todo screen
                }
                ActionScreen.SETTINGS -> {
                    //todo screen
                }
            }
        }
    }
}