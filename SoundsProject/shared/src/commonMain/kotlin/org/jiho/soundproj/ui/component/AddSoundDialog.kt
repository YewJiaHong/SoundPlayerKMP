package org.jiho.soundproj.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import org.jetbrains.compose.resources.stringResource
import soundsproject.shared.generated.resources.*

@Composable
fun AddSoundDialog(
    onDismiss: () -> Unit,
){
    var selectedItem by remember { mutableStateOf(0) }
    val snackBarHostState = remember { SnackbarHostState() }
    val options = listOf(stringResource(Res.string.preset), stringResource(Res.string.custom))
    var textFieldValue by remember {mutableStateOf("")}

    Dialog(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .padding(bottom = 10.dp, start = 20.dp, end = 20.dp)
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding((16.dp))
        ) {
            Text(
                stringResource(Res.string.add_new_sound),
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp
            )

            TextField(
                value = textFieldValue,
                onValueChange = {
                    textFieldValue = it
                    //todo logic
                },
                label = {
                    Text(
                        stringResource(Res.string.sound_name),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        fontStyle = FontStyle.Italic,
                        fontSize = 12.sp
                    )
                },
                placeholder = {
                    Text(
                        stringResource(Res.string.enter_sound_name),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        fontStyle = FontStyle.Italic,
                        fontSize = 14.sp
                    )
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
                            label = { Text(option) },
                            modifier = Modifier
                                .background(MaterialTheme.colorScheme.primaryContainer)
                                .padding(top = 10.dp)
                        )
                    }
                }
            }

            when (selectedItem) {
                0 -> {
                    //todo make recycler view
                    SoundSingleLineItem("Haha")
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