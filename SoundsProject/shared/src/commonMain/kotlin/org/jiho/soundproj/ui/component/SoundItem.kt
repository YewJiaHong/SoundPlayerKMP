package org.jiho.soundproj.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import soundsproject.shared.generated.resources.*

@Composable
fun SoundItem(){
    var volume by remember { mutableFloatStateOf(50f) }
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
            Text(stringResource(Res.string.sound_name), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic, color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 16.sp)
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

        Text(modifier = Modifier.padding(0.dp), text = stringResource(Res.string.volume), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic, color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 12.sp)
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