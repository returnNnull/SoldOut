package com.bam.soldout.auth.model

import com.bam.soldout.auth.IAuthService
import com.bam.soldout.auth.ResultOf
import kotlinx.coroutines.flow.Flow

class AuthUserRepository(var service: IAuthService) {

    var user: User? = null


    fun login(login: String, pass: String): Flow<Result<User>> {

        return service.login(User(login = login, pass = pass, displayName = ""))
    }

    fun logout() = service.logout<Nothing>()
    fun register(user: User) = service.register(user)
}