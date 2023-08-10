package com.cirodev.gastosjetpackcompose.di

import android.content.Context
import androidx.room.Room
import com.cirodev.gastosjetpackcompose.data.local.GastosDao
import com.cirodev.gastosjetpackcompose.data.local.GastosDataBase
import com.cirodev.gastosjetpackcompose.utils.Constans
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn
@Module
object AppModule {
    @Provides
    @Singleton
    fun providesGastosRoomDtabase( @ApplicationContext app : Context) : GastosDataBase {
        val  db= Room.databaseBuilder(
            app,
            GastosDataBase::class.java,
            Constans.gastos_database
        ).build()
        return db
    }
    @Provides
    @Singleton
    fun providesGastosDao(gastosDataBase: GastosDataBase):GastosDao = gastosDataBase.gastosDao()
}