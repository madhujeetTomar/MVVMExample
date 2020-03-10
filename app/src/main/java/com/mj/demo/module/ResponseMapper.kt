package com.mj.demo.module

import retrofit2.Response
import java.lang.Exception

object ResponseMapper {

    fun <T> transform(response: Response<T>): T {
        if (response.isSuccessful)
            return response.body() ?: error("response is null")
        else
            throw Exception()
    }

    fun transformEmpty(response: Response<Unit>) {
        if (response.isSuccessful)
            return
        else
            throw Exception()
    }
}