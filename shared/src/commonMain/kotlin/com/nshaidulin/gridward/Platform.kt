package com.nshaidulin.gridward

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform