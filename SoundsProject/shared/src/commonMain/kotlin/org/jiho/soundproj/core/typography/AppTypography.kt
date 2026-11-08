package org.jiho.soundproj.core.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import soundsproject.shared.generated.resources.IosevkaCharon_Bold
import soundsproject.shared.generated.resources.IosevkaCharon_BoldItalic
import soundsproject.shared.generated.resources.IosevkaCharon_Italic
import soundsproject.shared.generated.resources.IosevkaCharon_Medium
import soundsproject.shared.generated.resources.IosevkaCharon_Regular
import soundsproject.shared.generated.resources.Res

@Composable
fun IosevkaFontFamily() = FontFamily(
    Font(
        Res.font.IosevkaCharon_Regular,
        FontWeight.Normal
 )  ,
    Font(
        Res.font.IosevkaCharon_Bold,
        FontWeight.Bold
    ),
    Font(
        Res.font.IosevkaCharon_BoldItalic,
        FontWeight.Bold,
        FontStyle.Italic
    ),
    Font(
        Res.font.IosevkaCharon_Italic,
        FontWeight.Normal,
        FontStyle.Italic
    ),
    Font(
        Res.font.IosevkaCharon_Medium,
        FontWeight.Medium
    )
)