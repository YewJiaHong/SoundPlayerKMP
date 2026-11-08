package org.jiho.soundproj.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import soundsproject.shared.generated.resources.Res
import soundsproject.shared.generated.resources.add
import soundsproject.shared.generated.resources.add_new_sound

@Composable
fun NewSoundBlock(
    onClick: () -> Unit,
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .padding(16.dp)
            .alpha(0.5f),
        contentAlignment = Alignment.Center
    ){
        IconButton(onClick = {
            onClick()
        },
            modifier = Modifier.align(Alignment.Center)
                .size(150.dp)
        ){
            Image(
                painter = painterResource(Res.drawable.add),
                contentDescription = stringResource(Res.string.add_new_sound)
            )
        }
    }
}