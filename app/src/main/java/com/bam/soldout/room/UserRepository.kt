package com.bam.soldout.room

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class UserRepository(private var dao: UserDao) : IRepository<User> {

    override fun insert(vararg entity: User)  = dao.insert(*entity)


    override fun delete(entity: User) = dao.delete(entity)


    override fun getById(id: Int)  =  dao.getById(id);



    override fun getAll() = dao.getAll()

}