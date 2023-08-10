package com.cirodev.gastosjetpackcompose.domain.gastos.model

import com.cirodev.gastosjetpackcompose.data.GastoRepository
import javax.inject.Inject

class DeleteGasto @Inject constructor(private val gastoRepository: GastoRepository){
    operator fun invoke(gasto: Gasto){
        gastoRepository.deleteGastos(gastosEntity = gasto.toEntity())
    }
}