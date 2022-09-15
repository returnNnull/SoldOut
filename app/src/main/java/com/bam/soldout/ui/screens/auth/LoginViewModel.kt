package com.bam.soldout.ui.screens.auth

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bam.soldout.auth.model.AuthUserRepository
import com.bam.soldout.ui.screens.auth.LoginScreenState
import kotlinx.coroutines.launch

class LoginViewModel(val repository: AuthUserRepository) : ViewModel() {

    var state = mutableStateOf(LoginScreenState())
        private set

    fun setLogin(it: String) {
        state.value = state.value.copy(login = it)
    }

    fun setPass(it: String) {
        state.value = state.value.copy(pass =  it)
    }

    fun login(){
        viewModelScope.launch {
            repository.login(state.value.login, state.value.pass)
        }
    }


}