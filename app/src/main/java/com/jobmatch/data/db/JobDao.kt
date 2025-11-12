package com.jobmatch.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface JobDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(job: JobEntity)

    @Query("SELECT * FROM jobs WHERE id = :id")
    suspend fun getById(id: String): JobEntity?
}
