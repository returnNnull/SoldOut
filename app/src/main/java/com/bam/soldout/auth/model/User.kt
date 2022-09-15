package com.bam.soldout.auth.model

data class User(
    var id: Int = 0,
    var login: String,
    var pass: String,
    var displayName: String
)