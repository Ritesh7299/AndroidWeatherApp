package com.example.roomyweather.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LookUpCity(
    @PrimaryKey val name: String,
    var timeStamp: Long
)
