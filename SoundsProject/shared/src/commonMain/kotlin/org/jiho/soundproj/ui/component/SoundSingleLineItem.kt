package org.jiho.soundproj.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jiho.soundproj.core.model.Sound
import soundsproject.shared.generated.resources.Res
import soundsproject.shared.generated.resources.play_sound
import soundsproject.shared.generated.resources.whiteplaybutton

@Composable
fun SoundSingleLineItem(
    sound: Sound
){
    Box(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.primaryContainer)
                .clickable(onClick = {
                    //todo logic
                })
                .border(color = MaterialTheme.colorScheme.outline, width = 1.dp, shape = RoundedCornerShape(8.dp))
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            GetBoldItalicText(sound.soundName, 20)
            IconButton(
                onClick = {
                    //todo logic
                },
                modifier = Modifier
                    .size(24.dp)
            ) {
                Image(
                    painter = painterResource(Res.drawable.whiteplaybutton),
                    contentDescription = stringResource(Res.string.play_sound)
                )
            }
        }
    }
}