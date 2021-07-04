package com.post2shyam.updatedframework.system.di

import com.post2shyam.updatedframework.BuildConfig
import com.post2shyam.updatedframework.system.logger.AnalyticsLogTree
import com.post2shyam.updatedframework.system.logger.DebugLogTree
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import timber.log.Timber

@Module
@InstallIn(SingletonComponent::class)
class SystemModule {
    @Provides
    fun provideLoggingTree(): Timber.Tree {
        return if (BuildConfig.DEBUG) {
            //DebugLogTree()
            AnalyticsLogTree()
        } else {
            AnalyticsLogTree()
        }
    }
}