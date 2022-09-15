package com.bam.soldout.room

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow

interface IRepository<T> {
    fun insert(vararg entity: T)
    fun delete(entity: T)
    fun getById(id: Int) : T
    fun getAll(): Flow<List<T>>
}