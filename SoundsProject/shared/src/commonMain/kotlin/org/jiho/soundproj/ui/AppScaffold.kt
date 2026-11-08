package org.jiho.soundproj.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jiho.soundproj.core.enums.ActionScreen
import org.jiho.soundproj.ui.nav.MobileBottomBar

@Composable
fun AppScaffold (
    currentScreen: ActionScreen,
    onNavigateTo: (ActionScreen) -> Unit,
    content: @Composable () -> Unit
){
    BoxWithConstraints(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        val isWideScreen = maxWidth >= 840.dp

        if (isWideScreen) {
//            Row {
//                DesktopSidebar(
//                    currentScreen = currentScreen,
//                    onNavigate = onNavigate
//                )
//
//                Box(
//                    modifier = Modifier.weight(1f)
//                ) {
//                    content()
//                }
//            }
        } else{
            Scaffold (
                bottomBar = {
                    MobileBottomBar(
                        currentScreen = currentScreen,
                        onNavigateTo = onNavigateTo
                    )
                }
            ) {innerPadding->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                ) {
                    content()
                }
            }
        }
    }
}