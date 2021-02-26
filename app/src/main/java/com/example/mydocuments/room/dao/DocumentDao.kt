package com.example.mydocuments.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.mydocuments.models.DocumentModel

@Dao
interface DocumentDao {
    @Insert(entity = DocumentModel::class, onConflict = OnConflictStrategy.IGNORE)
    fun insertDocument(documentModel: DocumentModel)
}