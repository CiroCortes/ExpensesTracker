package com.cirodev.gastosjetpackcompose.data

import androidx.lifecycle.LiveData
import com.cirodev.gastosjetpackcompose.data.local.GastosDao
import com.cirodev.gastosjetpackcompose.data.model.GastosEntity
import javax.inject.Inject

class GastoRepository @Inject constructor(
    private val gastoDao : GastosDao
) {
    fun getAllGastos(): LiveData<List<GastosEntity>>{
        return gastoDao.getAll()
    }
    fun insertGastos( gastosEntity: GastosEntity){
        gastoDao.insert(gastosEntity = gastosEntity)
    }
    fun upDateGastos( gastosEntity: GastosEntity){
        gastoDao.update(gastosEntity = gastosEntity)
    }
    fun deleteGastos( gastosEntity: GastosEntity){
        gastoDao.delete(gastosEntity = gastosEntity)
    }
}

