package com.cirodev.gastosjetpackcompose.domain.gastos.model

import com.cirodev.gastosjetpackcompose.data.GastoRepository
import javax.inject.Inject

class AddGasto @Inject constructor(private val gastoRepository: GastoRepository){
    operator fun invoke(gasto: Gasto){
        gastoRepository.insertGastos(gastosEntity = gasto.toEntity())
    }
}