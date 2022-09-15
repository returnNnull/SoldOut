package com.bam.soldout.auth

import kotlin.Result

sealed class ResultOf<T>{
    data class Success<T>(val data: T): ResultOf<T>()
    data class Error(val exception: Throwable) : ResultOf<Nothing>()
}
