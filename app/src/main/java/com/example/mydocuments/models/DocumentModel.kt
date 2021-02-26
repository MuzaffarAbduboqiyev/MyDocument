package com.example.mydocuments.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "document_model")
data class DocumentModel(
    @PrimaryKey
    val id: Int
) {
    override fun toString(): String {
        return "Document id = $id"
    }
}
