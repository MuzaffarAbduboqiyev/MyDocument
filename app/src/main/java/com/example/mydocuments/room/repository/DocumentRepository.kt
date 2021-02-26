package com.example.mydocuments.room.repository

import com.example.mydocuments.room.dao.DocumentDao
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class DocumentRepository @Inject constructor(
    private val dao: DocumentDao
) {
}