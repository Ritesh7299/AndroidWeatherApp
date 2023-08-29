package com.example.roomyweather.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomyweather.data.AppDatabase
import com.example.roomyweather.data.LookUpCity
import com.example.roomyweather.data.LookedUpCitiesRepository
import kotlinx.coroutines.launch

class LookedUpCitiesViewModel(application: Application): AndroidViewModel(application) {
    private val repository = LookedUpCitiesRepository(
        AppDatabase.getInstance(application).lookUpCityDao()
    )

    fun addLookedUpCity(city: LookUpCity) {
        viewModelScope.launch {
            repository.insertLookedUpCity(city)
        }
    }
}