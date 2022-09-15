package com.bam.soldout.auth

import kotlinx.coroutines.flow.Flow
import java.net.CacheRequest

interface IAuthService {
    fun <T> register(data: T): Flow<Result<T>>
    fun <T> login(data: T): Flow<Result<T>>
    fun <T> logout(): Flow<Result<T>>
}