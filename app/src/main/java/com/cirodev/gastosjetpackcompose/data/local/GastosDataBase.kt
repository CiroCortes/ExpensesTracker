package com.cirodev.gastosjetpackcompose.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cirodev.gastosjetpackcompose.data.model.GastosEntity

@Database(entities = [GastosEntity::class], version = 1)
abstract class GastosDataBase : RoomDatabase() {
    abstract fun gastosDao() : GastosDao
}