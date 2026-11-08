package org.jiho.soundproj.audio

interface AudioEngine{
    fun loadAudio(id: String)
    fun playAudio(id: String)
    fun pauseAudio(id: String)
    fun resumeAudio(id: String)
    fun stopAudio(id: String)
    fun stopAll()
    fun setVolume(id: String, volume: Float)
}