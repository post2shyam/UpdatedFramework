package com.post2shyam.updatedframework.application.di

import android.content.Context
import com.post2shyam.updatedframework.application.PersistanceStore
import com.post2shyam.updatedframework.application.storage.IPersistanceStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    fun providesPersistanceStore(@ApplicationContext context: Context) : IPersistanceStore{
        return PersistanceStore(context)
    }
}