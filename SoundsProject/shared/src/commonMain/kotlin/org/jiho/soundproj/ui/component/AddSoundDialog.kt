package org.jiho.soundproj.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import org.jetbrains.compose.resources.stringResource
import org.jiho.soundproj.core.model.Sound
import soundsproject.shared.generated.resources.*

@Composable
fun AddSoundDialog(
    onDismiss: () -> Unit,
){
    var selectedItem by remember { mutableIntStateOf(0) }
    val snackBarHostState = remember { SnackbarHostState() }
    val options = listOf(stringResource(Res.string.preset), stringResource(Res.string.custom))
    var textFieldValue by remember {mutableStateOf("")}
    //todo replace with real data
    val soundList = listOf(
        Sound(soundId = "12345", volume = 12f, soundName = "Fire"),
        Sound(soundId = "12346", volume = 80f, soundName = "Water"),
        Sound(soundId = "12347", volume = 60f, soundName = "Forest")
    )

    Dialog(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .padding(bottom = 10.dp, start = 20.dp, end = 20.dp)
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding((16.dp))
        ) {
            GetBoldItalicText(stringResource(Res.string.add_new_sound), 20)

            TextField(
                value = textFieldValue,
                onValueChange = {
                    textFieldValue = it
                    //todo logic
                },
                label = {
                    GetItalicText(stringResource(Res.string.sound_name), 12)
                },
                placeholder = {
                    GetItalicText(stringResource(Res.string.enter_sound_name), 14)
                },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .fillMaxWidth()
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                SingleChoiceSegmentedButtonRow {
                    options.forEachIndexed { index, option ->
                        SegmentedButton(
                            shape = SegmentedButtonDefaults.itemShape(
                                index = index,
                                count = options.size
                            ),
                            onClick = {
                                selectedItem = index
                            },
                            selected = selectedItem == index,
                            label = { GetBoldItalicText(option,16) },
                            modifier = Modifier
                                .background(MaterialTheme.colorScheme.primaryContainer)
                                .padding(top = 10.dp)
                        )
                    }
                }
            }

            when (selectedItem) {
                0 -> {
                    LazyColumn {
                        items(soundList){ sound ->
                            SoundSingleLineItem(sound)
                        }
                    }
                }

                1 -> {
                    LaunchedEffect(selectedItem) {
                        snackBarHostState.showSnackbar("Not Implemented")
                    }
                    //todo write custom sound screen
                }
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                PrimaryButton(stringResource(Res.string.create_sound), {
                    //todo logic
                    onDismiss()
                }, Modifier.padding(16.dp))
            }
        }

    }
}