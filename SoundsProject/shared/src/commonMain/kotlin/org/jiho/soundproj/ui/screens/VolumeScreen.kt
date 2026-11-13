package org.jiho.soundproj.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.stringResource
import org.jiho.soundproj.core.model.Sound
import org.jiho.soundproj.ui.component.AddSoundDialog
import org.jiho.soundproj.ui.component.NewSoundBlock
import org.jiho.soundproj.ui.component.PrimaryButton
import org.jiho.soundproj.ui.component.SoundItem
import soundsproject.shared.generated.resources.Res
import soundsproject.shared.generated.resources.save_preset

@Composable
fun VolumeScreen(){
    //todo replace with real data
    val soundList = listOf(
        Sound(soundId = "12345", volume = 12f, soundName = "Fire"),
        Sound(soundId = "12346", volume = 80f, soundName = "Water"),
        Sound(soundId = "12347", volume = 60f, soundName = "Forest")
    )

    val showAddSoundDialog = remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        Column {
            Box(
                modifier = Modifier.padding(top = 20.dp)
            ) {
                LazyColumn {
                    items (soundList){soundItem->
                        SoundItem(soundItem)
                    }
                }
            }
            NewSoundBlock(onClick = {showAddSoundDialog.value = true})

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                PrimaryButton(stringResource(Res.string.save_preset), {
                    //todo logic
                }, Modifier.padding(16.dp))
            }
        }
    }

    if (showAddSoundDialog.value) {
        Box (modifier = Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            AddSoundDialog(onDismiss = { showAddSoundDialog.value = false })
        }
    }
}