package org.jiho.soundproj.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jiho.soundproj.core.model.Sound
import soundsproject.shared.generated.resources.Res
import soundsproject.shared.generated.resources.delete
import soundsproject.shared.generated.resources.deletewhite
import soundsproject.shared.generated.resources.volume

@Composable
fun SoundItem(
    sound: Sound
){
    var volume by remember { mutableFloatStateOf(sound.volume) }
    val sliderColor = SliderDefaults.colors(
        thumbColor = MaterialTheme.colorScheme.secondary,
        activeTrackColor = MaterialTheme.colorScheme.primary,
        inactiveTrackColor = MaterialTheme.colorScheme.surfaceVariant
    )

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            GetBoldItalicText(sound.soundName,16)
            IconButton(
                onClick = {
                    //todo logic
                },
                modifier = Modifier.size(46.dp)
            ){
                Image(painter = painterResource(Res.drawable.deletewhite),
                    contentDescription = stringResource(Res.string.delete))
            }
        }

        GetBoldItalicText(stringResource(Res.string.volume),12,modifier = Modifier.padding(0.dp))
        Slider(
            value = volume,
            onValueChange = { volume = it },
            valueRange = 0f..100f,
            colors = sliderColor,
            thumb = {
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .background(
                            color = MaterialTheme.colorScheme.secondary,
                            shape = CircleShape
                        )
                        .border(1.dp, MaterialTheme.colorScheme.outline,
                            shape = CircleShape)
                )
            },
            track = { sliderState ->
                SliderDefaults.Track(
                    sliderState = sliderState,
                    thumbTrackGapSize = 0.dp,
                )
            }
        )
    }
}