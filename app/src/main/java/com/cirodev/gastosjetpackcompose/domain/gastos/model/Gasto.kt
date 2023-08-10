package com.cirodev.gastosjetpackcompose.domain.gastos.model

import com.cirodev.gastosjetpackcompose.data.model.GastosEntity

data class Gasto(
    val id:Int = 0,
    val type:Boolean = false, // true for income, false for expense
    val kind:String = "",
    val title:String = "",
    val description:String = "",
    val amount:Double,
    val date:Long
)
// like always we need a controller a expensive type to be false
fun Gasto.toEntity(): GastosEntity = GastosEntity(
    uid = id,
    type = type,
    kind= kind,
    title = title,
    description = description,
    amount = if(type) amount else -amount,
    date = date
)

fun GastosEntity.toDomainModel():Gasto{
    return Gasto(
        id = uid,
        type = type,
        title = title,
        kind = kind,
        description = description,
        amount = amount,
        date = date
    )
}
