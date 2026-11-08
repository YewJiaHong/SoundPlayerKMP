package org.jiho.soundproj.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import soundsproject.shared.generated.resources.Res
import soundsproject.shared.generated.resources.play_sound
import soundsproject.shared.generated.resources.whiteplaybutton

@Composable
fun SoundSingleLineItem(
    text: String,
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
            Text(text,fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic, color = MaterialTheme.colorScheme.onPrimaryContainer, fontSize = 20.sp)
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