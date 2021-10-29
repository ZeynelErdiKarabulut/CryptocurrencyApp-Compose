package com.zeynelerdi.cryptocurrencyapp.presentation.coin_detail

import com.zeynelerdi.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
