package org.jiho.soundproj.core.model

data class SoundDO(
    val soundId: String,
    var volume: Float,
    val SoundName: String,
    val audioPath: String,
    val isCustom: Boolean = false,
    val audioData: String,
)
