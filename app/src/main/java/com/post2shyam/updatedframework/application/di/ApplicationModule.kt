package com.post2shyam.updatedframework.application.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

//    @Provides
//    fun providesPersistanceStore(@ApplicationContext context: Context) : IPersistanceStore{
//        return PersistanceStore(context)
//    }
}