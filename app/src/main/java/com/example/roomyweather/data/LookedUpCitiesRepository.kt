package com.example.roomyweather.data

class LookedUpCitiesRepository(
    private val dao: LookUpCityDao
) {
    suspend fun insertLookedUpCity(city: LookUpCity) = dao.insert(city)
}