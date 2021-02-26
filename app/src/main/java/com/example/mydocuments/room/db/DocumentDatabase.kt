package com.example.mydocuments.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mydocuments.models.DocumentModel
import com.example.mydocuments.room.dao.DocumentDao

@Database(
    entities = [DocumentModel::class],
    version = 0,
    exportSchema = false
)
abstract class DocumentDatabase : RoomDatabase() {

    abstract fun documentDao(): DocumentDao

    companion object {
        fun buildDatabase(ctx: Context): DocumentDatabase {
            return Room.databaseBuilder(ctx, DocumentDatabase::class.java, "database.db")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }
    }

}