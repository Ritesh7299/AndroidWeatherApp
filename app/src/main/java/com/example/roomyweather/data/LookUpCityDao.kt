package com.example.roomyweather.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface LookUpCityDao {
    @Insert
    suspend fun insert(city: LookUpCity)
}