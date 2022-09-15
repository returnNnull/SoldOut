package com.bam.soldout

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.bam.soldout.room.LocalDataBase
import com.bam.soldout.room.User
import com.bam.soldout.room.UserDao
import org.junit.After

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import java.io.IOException

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    private lateinit var db: LocalDataBase
    private  lateinit var dao: UserDao

    @Before
    fun createDb() {

    }

    @After
    @Throws(IOException::class)
    fun closeDb() {

    }

    @Test
    @Throws(Exception::class)
    fun writeUserAndReadInList() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        val user = User("admin", "12345")
        LocalDataBase.getInstance(context).getUserDao().insert(user);
        val byName = LocalDataBase.getInstance(context).getUserDao().getById(0)
        assertEquals(byName.login, user.login)
    }

}