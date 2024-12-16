package com.fakhrulasa.muslimsnote

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform