package com.example.mydocuments.utils

import android.content.Context
import com.example.mydocuments.room.dao.DocumentDao
import com.example.mydocuments.room.db.DocumentDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun documentDatabase(@ApplicationContext ctx: Context): DocumentDatabase {
        return DocumentDatabase.buildDatabase(ctx)
    }

    @Provides
    @Singleton
    fun documentDao(db: DocumentDatabase): DocumentDao {
        return db.documentDao()
    }

}