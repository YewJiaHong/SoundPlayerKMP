package org.jiho.soundproj

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform