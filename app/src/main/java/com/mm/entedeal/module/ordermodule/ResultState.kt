package com.mm.entedeal.module.ordermodule

sealed class ResultState {

    object Loading : ResultState()
    data class Successful(val result: Any) : ResultState()

    data class Error(val error: String) : ResultState()

}