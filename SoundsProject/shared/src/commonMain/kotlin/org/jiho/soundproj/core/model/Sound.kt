package org.jiho.soundproj.core.model

data class Sound(
    val soundId: String,
    var volume: Float,
    val soundName: String,
    val audioPath: String,
) {     
}