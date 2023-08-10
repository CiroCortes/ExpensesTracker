package com.cirodev.gastosjetpackcompose.domain.gastos.model.infodetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.cirodev.gastosjetpackcompose.data.GastoRepository
import javax.inject.Inject

class GetTotalGastos @Inject constructor(private val gastoRepository: GastoRepository){
    operator fun invoke(): LiveData<Double>{
        val gastosLiveData = gastoRepository.getAllGastos()
        return gastosLiveData.map { gastos ->
            gastos.filter { !it.type }
        }.map { filteredGastos ->
            filteredGastos.sumOf { it.amount }
        }
    }
}