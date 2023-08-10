package com.cirodev.gastosjetpackcompose.domain.gastos.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.cirodev.gastosjetpackcompose.data.GastoRepository
import javax.inject.Inject

class GetGasto @Inject constructor(private val gastoRepository: GastoRepository) {
    operator fun invoke(): LiveData<List<Gasto>>{
        return gastoRepository.getAllGastos().map { list->
            list.map { it.toDomainModel() }
        }
    }

}