package org.jiho.soundproj.core.enums

import org.jetbrains.compose.resources.DrawableResource
import soundsproject.shared.generated.resources.Res
import soundsproject.shared.generated.resources.option
import soundsproject.shared.generated.resources.savefloppy
import soundsproject.shared.generated.resources.volume

enum class ActionScreen(
    val title: String,
    val icon: DrawableResource
) {
    SETTINGS("Settings Screen",Res.drawable.option),
    VOLUME("Home Screen", Res.drawable.volume),
    PRESET("Preset Screen",Res.drawable.savefloppy),
}