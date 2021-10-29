package com.zeynelerdi.cryptocurrencyapp.domain.repository

import com.zeynelerdi.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.zeynelerdi.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}