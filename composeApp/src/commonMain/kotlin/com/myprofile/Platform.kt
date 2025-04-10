package com.myprofile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform