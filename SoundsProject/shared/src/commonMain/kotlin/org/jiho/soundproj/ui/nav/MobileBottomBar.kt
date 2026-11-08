package org.jiho.soundproj.ui.nav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jiho.soundproj.core.enums.ActionScreen

@Composable
fun MobileBottomBar(
    currentScreen: ActionScreen,
    onNavigateTo: (ActionScreen) -> Unit,
){
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        tonalElevation = 2.dp
    ) {
        ActionScreen.entries.forEach{actionScreen ->
            val selected = currentScreen == actionScreen

            NavigationBarItem(
                selected = selected,
                onClick = { onNavigateTo(actionScreen) },
                icon = {
                    Image(
                        painter= painterResource(actionScreen.icon),
                        contentDescription = actionScreen.title,
                        modifier = Modifier.size(56.dp),
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = MaterialTheme.colorScheme.secondary,
                )
            )
        }
    }
}