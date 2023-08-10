package com.cirodev.gastosjetpackcompose.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cirodev.gastosjetpackcompose.utils.Constans

@Entity(tableName = Constans.table_name_expences_intro)
data class GastosEntity(

    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "type") val type: Boolean,
    @ColumnInfo(name = "kind") val kind: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "amount") val amount: Double,
    @ColumnInfo(name = "date") val date: Long

)
