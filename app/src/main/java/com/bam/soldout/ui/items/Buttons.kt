package com.bam.soldout.ui.items

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun PrimaryButton(text: String, listener: ()-> Unit){
    Button(onClick = listener) {
        Text(text = text)
    }
}