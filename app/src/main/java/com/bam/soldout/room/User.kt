package com.bam.soldout.room;

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val login: String,
    val pass: String,
    var displayName: String = ""
)
