package com.zeynelerdi.cryptocurrencyapp.data.repository

import com.zeynelerdi.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.zeynelerdi.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.zeynelerdi.cryptocurrencyapp.data.remote.dto.CoinDto
import com.zeynelerdi.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}