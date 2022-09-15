package com.bam.soldout.ui.screens.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bam.soldout.ui.items.EditText
import com.bam.soldout.ui.items.PrimaryButton
import com.bam.soldout.ui.theme.AppPaddings.Companion.parentContainer


@Composable
@Preview(showBackground = true)
fun Show() {
    LoginScreen(viewModel = LoginViewModel())
}


@Composable
fun LoginScreen(viewModel: LoginViewModel) {

    Column(
        Modifier
            .fillMaxSize()
            .padding(parentContainer),
        horizontalAlignment = CenterHorizontally
    ) {
        EditText(
            value = viewModel.state.value.login,
            label = "Email",
            icon = Icons.Filled.Email,
            listener = viewModel::setLogin
        )
        EditText(
            value = viewModel.state.value.pass,
            label = "Password",
            icon = Icons.Filled.VisibilityOff,
            listener = viewModel::setPass
        )
        PrimaryButton(text = "Log in", listener = viewModel::login)

    }
}


