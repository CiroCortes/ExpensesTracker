package com.cirodev.gastosjetpackcompose.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.cirodev.gastosjetpackcompose.data.model.GastosEntity
import com.cirodev.gastosjetpackcompose.utils.Constans

@Dao
interface GastosDao {
    // show all expenses, USING LIVEDATA FOR BIG DATA IN THE VIEWMODEL
    @Query("SELECT * FROM ${Constans.table_name_expences_intro}")
    fun getAll(): LiveData<List<GastosEntity>>

    // create a expense or a intro
    @Insert
    fun insert(gastosEntity: GastosEntity)

    //update
    @Update
    fun update(gastosEntity: GastosEntity)

    // erase a expense
    @Delete
    fun delete(gastosEntity: GastosEntity)
}