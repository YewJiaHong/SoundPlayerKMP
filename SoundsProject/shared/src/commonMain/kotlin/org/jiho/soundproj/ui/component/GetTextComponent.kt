package org.jiho.soundproj.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun GetBoldItalicText(
    text: String,
    size: Int,
    modifier: Modifier = Modifier,
){
    Text(text = text,
        fontSize = size.sp,
        color = MaterialTheme.colorScheme.onPrimaryContainer,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        modifier = modifier,)
}

@Composable
fun GetItalicText(
    text: String,
    size: Int,
    modifier: Modifier = Modifier,
){
    Text(text = text,
        fontSize = size.sp,
        color = MaterialTheme.colorScheme.onPrimaryContainer,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Italic,
        modifier = modifier,)
}