package com.jobmatch.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jobs")
data class JobEntity(
    @PrimaryKey val id: String,
    val title: String,
    val skills: String,
    val lat: Double,
    val lng: Double,
    val updatedAt: Long
)
