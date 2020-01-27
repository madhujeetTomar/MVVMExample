package com.mm.entedeal.core.di

import com.squareup.moshi.Moshi

class JsonDefaults {

    companion object {
        private val MOSHI = Moshi.Builder()
            .build()
        fun moshi(): Moshi {
            return MOSHI
        }
    }
}
