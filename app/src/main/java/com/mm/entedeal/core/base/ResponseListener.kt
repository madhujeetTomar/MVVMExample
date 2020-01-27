package com.mm.entedeal.core.base

 interface ResponseListener<T> {

    fun onError(error: ErrorResponse)
    fun onSuccess(response: T)
}