package com.jobmatch.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class UploadWorker(context: Context, params: WorkerParameters) : CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        // TODO: read queued items from Room and push to server
        return Result.success()
    }
}
