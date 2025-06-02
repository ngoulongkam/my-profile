package com.myprofile.data

import com.myprofile.remote.CatFactApi

class CatFactRepository(
    private val catFactApi: CatFactApi
) {
    suspend fun fetchFact(): String {
        return catFactApi.getFact().fact
    }
}