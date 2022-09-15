package com.bam.soldout.room;

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(User::class)], version = 1)
abstract class LocalDataBase : RoomDatabase() {
    abstract fun getUserDao(): UserDao

    companion object {

        private var INSTANCE: LocalDataBase? = null

        fun getInstance(context: Context): LocalDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    LocalDataBase::class.java,
                    "app_database"
                )
                    .createFromAsset("database/bus_schedule.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}